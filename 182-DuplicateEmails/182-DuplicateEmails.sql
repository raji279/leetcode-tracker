-- Last updated: 7/9/2026, 10:08:21 AM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;