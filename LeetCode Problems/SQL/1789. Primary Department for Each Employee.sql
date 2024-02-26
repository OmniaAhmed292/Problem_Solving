/*https://leetcode.com/problems/primary-department-for-each-employee*/

SELECT employee_id ,department_id 
FROM Employee 
WHERE primary_flag ="Y" or employee_id in (
    SELECT employee_id from employee group by employee_id having count(department_id) = 1
)
