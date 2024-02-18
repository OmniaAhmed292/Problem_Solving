SELECT query_name ,round(AVG(rating/position ),2) as quality,
round(SUM(rating<3)/Count(rating)*100,2) as poor_query_percentage 
From Queries 
Where query_name is not null
Group by query_name 