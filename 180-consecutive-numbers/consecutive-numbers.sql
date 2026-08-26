# Write your MySQL query statement below

select distinct num as ConsecutiveNums
from
(
select 
    *,
    lead(num, 1) over(order by id) next,
    lag(num, 1) over(order by id) prev
from Logs
) ab
where num = prev and num = next;