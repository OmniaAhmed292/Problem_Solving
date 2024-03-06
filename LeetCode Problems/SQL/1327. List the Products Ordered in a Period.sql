/* https://leetcode.com/problems/list-the-products-ordered-in-a-period */
SELECT P.product_name, sum(O.unit) as unit
FROM Products P, Orders O
WHERE year(order_date) = 2020 and month(order_date) = 02 
and P.product_id = O.product_id       
group by P.product_name
Having sum(O.unit)>=100
