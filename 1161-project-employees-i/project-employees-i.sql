# Write your MySQL query statement below
select project_id, ifnull(round(sum(experience_years)/count(project_id),2),0) as average_years
from Project a
left join Employee b
on a.employee_id = b.employee_id
group by project_id;