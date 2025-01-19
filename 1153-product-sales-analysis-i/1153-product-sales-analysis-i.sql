# Write your MySQL query statement below
select 
    product_name,year,price
from 
    Sales
Join 
    product
ON
    sales.product_id = Product.product_id
