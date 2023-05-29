-- https://leetcode.com/problems/capital-gainloss/

SELECT stock_name,
       SUM(CASE WHEN operation = 'sell' THEN price
                WHEN operation = 'buy' THEN -price
                ELSE -price END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name