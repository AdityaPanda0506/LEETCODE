with cte as(
select num as ConsecutiveNums,
lead(num) over(order by id) next,
lag(num) over(order by id) prev
from Logs
)

select distinct ConsecutiveNums
from cte
where ConsecutiveNums = next and next = prev
