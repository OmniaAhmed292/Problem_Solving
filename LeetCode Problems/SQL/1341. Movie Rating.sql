/* https://leetcode.com/problems/movie-rating/description*/
(SELECT u.name as results
FROM Users u LEFT JOIN MovieRating m
on u.user_id = m.user_id
GROUP BY u.user_id 
order by count(m.user_id) DESC, 1 ASC
Limit 1 )
union all
(SELECT i.title as results
FROM Movies i LEFT JOIN MovieRating m
on i.movie_id = m.movie_id 
where month(created_at) = 2 and year(created_at)=2020
group by m.movie_id 
order by avg(rating) DESC, 1 ASC
limit 1)
