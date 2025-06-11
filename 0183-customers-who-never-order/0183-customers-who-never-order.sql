# Write your MySQL query statement below
select customers.name as Customers
From customers
left join Orders
    on (Customers.id  =  Orders.customerID)
Where Orders.id IS NULL;
