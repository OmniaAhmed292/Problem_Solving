# Write your MySQL query statement below
Select P.product_id, IFNULL(ROUND(SUM(Price * Units ) / SUM( Units ),2),0)  as average_price 
FROM Prices P LEFT JOIN UnitsSold U
ON P.product_id = U.product_id 
AND purchase_date BETWEEN start_date AND end_date   
GROUP BY P.product_id 