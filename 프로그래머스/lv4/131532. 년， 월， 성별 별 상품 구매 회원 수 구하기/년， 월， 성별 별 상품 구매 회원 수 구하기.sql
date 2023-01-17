-- 코드를 입력하세요
SELECT 
year(sales_date) as year, month(sales_date) as month, gender AS GENDER, count(distinct A.user_id) as users 
from online_sale A
join user_info B on A.user_id = B.user_id
where gender is not null
group by year(sales_date), month(sales_date), gender
order by year(sales_date), month(sales_date), gender
