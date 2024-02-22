//https://leetcode.com/problems/product-sales-analysis-iii/description
SELECT S.product_id, S.year as first_year , S.quantity, S.price
FROM Sales S
WHERE(S.product_id,year) in (
SELECT S.product_id,MIN(year)
FROM Sales S
GROUP BY S.product_id
)
