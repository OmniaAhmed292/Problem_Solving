/* https://leetcode.com/problems/game-play-analysis-iv/description */
with P as (SELECT min(event_date) as first, player_id FROM Activity GROUP BY player_id)

SELECT round(SUM(IF(datediff(event_date, P.first)=1,1,0))/Count(DISTINCT Activity.player_id),2) as fraction  
FROM Activity, P
WHERE P.player_id=Activity.player_id


