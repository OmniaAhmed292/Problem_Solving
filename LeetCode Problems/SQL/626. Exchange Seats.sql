/*https://leetcode.com/problems/exchange-seats/description */
select id,
    case 
    when row_number() over (order by id) % 2 = 1
    then ifnull(lead(student) over (order by id),student)
    when row_number() over (order by id) % 2 = 0
    then ifnull(lag(student) over (order by id),student) end as student
from Seat
