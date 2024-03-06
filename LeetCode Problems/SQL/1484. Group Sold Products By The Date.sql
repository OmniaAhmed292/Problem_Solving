/* https://leetcode.com/problems/group-sold-products-by-the-date/description */
SELECT sell_date, COUNT(DISTINCT product) as num_sold, group_concat(distinct product) products 
FROM Activities
GROUP BY sell_date
ORDER BY sell_date
