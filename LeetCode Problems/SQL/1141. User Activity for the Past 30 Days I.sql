SELECT activity_date  as day, Count(DISTINCT user_id) as active_users
FROM  Activity 
WHERE datediff('2019-07-27',activity_date)<30 
AND activity_date <= '2019-07-27' 
Group by activity_date
