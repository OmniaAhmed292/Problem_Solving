SELECT C.class
from Courses C
Group by class
having count(distinct student)>=5;
