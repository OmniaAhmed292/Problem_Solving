SELECT round(SUM(IF(datediff(order_date,customer_pref_delivery_date)=0,1,0))*100/COUNT(order_date),2) as immediate_percentage 
FROM Delivery 
where (order_date, customer_id) IN (SELECT min(order_date) as order_date, customer_id FROM Delivery group by customer_id )
