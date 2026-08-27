# Write your MySQL query statement below
with cte as(
    select a.name as Employee, salary, b.name as Department, dense_rank() over(partition by b.name order by salary desc) as rnk
from Employee a
left join Department b
on a.departmentId = b.id
)
select Department, Employee, salary as Salary
from cte
where rnk <= 3
order by Department, Salary desc, Employee

