/* https://leetcode.com/problems/patients-with-a-condition*/
SELECT patient_id, patient_name, conditions   
FROM Patients 
WHERE  conditions like "% DIAB1%" or conditions like "DIAB1%" ;
