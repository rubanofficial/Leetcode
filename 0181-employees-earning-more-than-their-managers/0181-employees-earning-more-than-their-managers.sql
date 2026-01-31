# Write your MySQL query statement below
select m.name as Employee FROM Employee e INNER JOIN Employee m on e.id = m.managerId where e.salary<m.salary;