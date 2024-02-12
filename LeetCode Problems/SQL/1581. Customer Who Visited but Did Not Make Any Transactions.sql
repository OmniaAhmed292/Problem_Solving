#https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions

#No join

SELECT V.customer_id, Count(visit_id) as count_no_trans
FROM Visits V
WHERE V.visit_id NOT IN (SELECT visit_id FROM Transactions)
GROUP BY V.customer_id

#Join

SELECT v.customer_id, COUNT(v.visit_id) as count_no_trans 
from Visits v 
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id  
WHERE t.amount IS NULL 
GROUP BY v.customer_id; 