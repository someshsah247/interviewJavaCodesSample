package com.learn.basics.interview;

public class Nielsen2 {
    // round 2
}

/*

Order table:
Columns:
order id bigint
item name varchar,
item prize int,
customer id int

Question:
Find average cost of orders placed
Find customers who ordered an item multiple times


select o.order_id,sum(item_prize)/count(order_id)  from order o
group by o.order_id,;


select customer_id, count(name) from order
group by  customer_id
having name>1;


Find 3 numbers in an array which can sum up to 7.

// arr= [2,3,4,6,1,2,7,8,5,1,1,4]
 arr = []
//
1. sorting
2. remove all elements x>7
3. for loop from i=0 to i<=new size
4. in for loop j=0 ,k=1,l=2 till end
5. j ++ , k++ ,l++;
6. repeat step 4 & 5;
7. if found


 */