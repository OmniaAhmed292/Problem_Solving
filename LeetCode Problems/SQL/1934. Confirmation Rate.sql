//https://leetcode.com/problems/confirmation-rate/
SELECT S.user_id,round(ifnull(SUM(C.action="confirmed")/count(C.action),0),2) as confirmation_rate 
FROM Signups S LEFT JOIN Confirmations C
ON S.user_id= C.user_id
GROUP BY S.user_id
