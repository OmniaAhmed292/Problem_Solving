/* https://leetcode.com/problems/investments-in-2016/description */
/* USing concat to group lat and lon together as they represent the location */
select round(sum(TIV_2016),2) as TIV_2016 from insurance
where TIV_2015 in
(select TIV_2015 from insurance group by TIV_2015 having count(TIV_2015) >1)
and concat(LAT, LON) not in
(select concat(LAT, LON) from insurance group by LAT, LON having count(concat(LAT, LON)) >1)
