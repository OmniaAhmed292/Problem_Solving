Select R.contest_id,Round((Count(DISTINCT(R.user_id))*100/(select count(*) from Users)),2) as percentage
From Register R
Group by R.contest_id
Order by percentage DESC, R.contest_id ASC