/*https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/description */
SELECT R.employee_id , R.name, count(E.reports_to) as reports_count, round(avg(E.age),0) as average_age 
FROM Employees R, Employees E
where R.employee_id = E.reports_to
Group by R.employee_id
Order by R.employee_id ASC


