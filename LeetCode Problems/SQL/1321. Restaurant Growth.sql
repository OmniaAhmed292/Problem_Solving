/*https://leetcode.com/problems/restaurant-growth/description */
Select c.visited_on, sum(t.amount) as amount , ROUND((sum(t.amount)/7),2)as average_amount
from (Select visited_on, sum(amount) as amount
from Customer group by visited_on ) as c, (Select visited_on, sum(amount) as amount
from Customer group by visited_on ) as t
where c.visited_on>=t.visited_on and DATEDIFF(c.visited_on,t.visited_on)<=6
group by c.visited_on having count(distinct t.visited_on)=7
