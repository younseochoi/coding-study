-- 상품 별 오프라인 매출 구하기
SELECT p.product_code, a.sum_sales_amount*p.price as SALES
from product p 
join (select product_id, SUM(sales_amount) as sum_sales_amount
from offline_sale
group by product_id) a
on p.product_id = a.product_id
order by sales desc, p.PRODUCT_CODE
;