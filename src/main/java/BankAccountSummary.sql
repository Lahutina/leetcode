-- https://leetcode.com/problems/bank-account-summary-ii/

SELECT name,
       SUM(amount) balance
FROM Users u
INNER JOIN Transactions t
ON u.account = t.account
GROUP BY t.account
HAVING balance > 10000