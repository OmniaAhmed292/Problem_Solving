SELECT P.project_id, Round(SUM(experience_years)/COUNT(E.employee_id ),2) As average_years 
FROM Project P, Employee E 
WHERE P.employee_id=E.employee_id AND experience_years is not null
GROUP BY project_id