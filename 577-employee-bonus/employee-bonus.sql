# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT E.NAME,B.BONUS FROM EMPLOYEE AS E LEFT JOIN BONUS AS B ON B.EMPID=E.EMPID WHERE B.BONUS IS NULL OR B.BONUS < 1000;