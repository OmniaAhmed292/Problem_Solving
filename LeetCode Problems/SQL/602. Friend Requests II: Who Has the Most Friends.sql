//https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/
with ct as
(select requester_id as id from RequestAccepted 
union all
select accepter_id as id from RequestAccepted )

SELECT id as id, count(id) as num
from ct
group by id
order by count(id) DESC
limit 1
