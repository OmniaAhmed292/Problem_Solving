select E.name, B.bonus
From Employee E left join Bonus B
On E.empId=B.empId
Where B.bonus<1000 or B.bonus is null
