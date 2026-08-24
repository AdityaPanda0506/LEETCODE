# Write your MySQL query statement below
select s.unique_id, a.name
from Employees as a
left join EmployeeUNI as s
on a.id = s.id;