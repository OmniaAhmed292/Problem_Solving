/*https://leetcode.com/problems/second-highest-salary/*/
/*This works only with the second highest, to get all ranks I will use rank over function */
SELECT max(salary) AS SecondHighestSalary
FROM Employee 
WHERE Salary not in (SELECT max(salary) FROM Employee)
