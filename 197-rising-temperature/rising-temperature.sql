# Write your MySQL query statement below
SELECT w1.id as Id FROM Weather w1
join Weather w2
on DATEDIFF(w1.recordDate,w2.recordDate)=1
WHERE w1.temperature > w2.temperature;
