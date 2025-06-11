# Write your MySQL query statement below
select email
from person
group by 1
having COUNT(*) > 1;