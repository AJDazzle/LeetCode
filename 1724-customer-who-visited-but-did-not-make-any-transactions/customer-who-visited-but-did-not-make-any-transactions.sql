SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id
WHERE t.visit_id IS NULL  -- This ensures we only count visits with no transactions
GROUP BY v.customer_id;
