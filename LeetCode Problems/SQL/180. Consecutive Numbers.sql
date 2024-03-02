//https://leetcode.com/problems/consecutive-numbers
select distinct l1.num as ConsecutiveNums 
from logs l1,logs l2,logs l3
where l1.id = l2.id+1 and l2.Id=l3.Id+1
and l1.Num=l2.Num and l2.Num=l3.Num
