/* https://leetcode.com/problems/managers-with-at-least-5-direct-reports/ */

SELECT R.name
FROM Employee R, Employee E
where R.id = E.managerId
Group by R.id
Having Count(E.managerId)>=5
Order by R.id ASC
