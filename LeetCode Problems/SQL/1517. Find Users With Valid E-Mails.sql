/* https://leetcode.com/problems/find-users-with-valid-e-mails */
select * from Users where right(mail, 13) like "@leetcode.com" and left(mail, length(mail)-13) rlike '^[A-Za-z][A-Za-z0-9._-]*$'
