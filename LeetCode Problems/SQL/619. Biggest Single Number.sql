//https://leetcode.com/problems/biggest-single-number/

SELECT MAX(num) as num 
FROM (
    SELECT num 
    FROM MyNumbers 
    Group by num
    Having COUNT(num)=1
) AS single
