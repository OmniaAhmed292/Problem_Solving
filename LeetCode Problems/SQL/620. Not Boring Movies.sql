Select id, movie, description, rating 
from Cinema
Where id % 2 != 0
and description != "boring"
order by rating DESC