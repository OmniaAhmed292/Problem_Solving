/*only works if there's only one product table */

SELECT C.customer_id 
FROM Customer C
GROUP by  C.customer_id 
Having COUNT(DISTINCT C.product_key)= (SELECT COUNT(product_key) FROM Product)
