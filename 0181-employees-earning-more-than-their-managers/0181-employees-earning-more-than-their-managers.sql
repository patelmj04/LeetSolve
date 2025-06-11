# Write your MySQL query statement below
Select worker.name as Employee
from employee as worker 
inner join Employee as Manager
    on(Worker.managerId = Manager.id)
Where Worker.salary > Manager.salary;
