# Write your MySQL query statement below
select a.product_id, ifnull(round(sum(price*units)/sum(units),2),0) as average_price 
from Prices a
left join UnitsSold b
on a.product_id = b.product_id and purchase_date between start_date and end_date
group by product_id;