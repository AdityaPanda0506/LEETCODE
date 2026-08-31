# Write your MySQL query statement below
with cte as(
select customer_number, count(*) as c
from Orders
group by customer_number
)
select customer_number
from cte 
order by c desc
limit 1