SELECT p.PRODUCT_CODE, (price * sum(SALES_AMOUNT)) as SALES from PRODUCT p 
join OFFLINE_SALE o 
on p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_CODE
order by SALES desc, PRODUCT_CODE