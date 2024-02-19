SELECT S.student_id, S.student_name, sub.subject_name, COUNT(E.subject_name) AS attended_exams
FROM Students S JOIN Subjects sub LEFT JOIN Examinations E
ON S.student_id = E.student_id
AND sub.subject_name = E.subject_name
GROUP BY S.student_id, sub.subject_name
ORDER BY S.student_id ASC, sub.subject_name ASC