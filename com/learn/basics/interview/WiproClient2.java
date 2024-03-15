package com.learn.basics.interview;


import java.util.List;

public class WiproClient2 {

}

/*
@RequestMapping("/v1/shop/now")
@RestController
public class WiproClient2 {


    @PostMapping("/add/product")
    public List<Product> addProduct(@Athentica String token, @RequestBody(List<Product> productList) ){
        // validate input
        // service call
        // return response
    }

    @GetMapping("/view/all")
    public List<Product> viewProduct(){
        // validate input
        // service call
        // return response with list of products
    }


    @GetMapping("/view/{id}")
    public List<Product> viewSpecificProduct(@PathVariable String id){
        // validate input
        // service call
        // return response with 1 product
    }

    @PostMapping("/check/out")
    public Cart viewSpecificProduct(List<products> incardList){
        // validate input
        // service call
        // return response with 1 product
    }

    Cart{
        long cardId;
        String prodId;
        String prodName;
        Long Qntity;
        double priceForeach;


    }

    @PostMapping("/check/out")
    public checkOutDetails viewSpecificProduct(@RequestBody Cart cart){
        // validate input
        // service call
        // return response with 1 product
    }
}


Consider the following three tables in a database:
Orders table with columns OrderID, CustomerID, ProductID, OrderDate
Customers table with columns CustomerID, FirstName, LastName, Email
Products table with columns ProductID, ProductName, Price
Write a SQL query to find out the total spending of each customer on our products. The result should include the FirstName, LastName, and TotalSpending of each customer.


select
(select FirstName from Customers where CustomerID = c.CustomerID  ),
(select LastName from Customers where CustomerID = c.CustomerID  ),
sum(p.Price) as TotalSpending
from customers c
JOIN Orders o ON o.CustomerID = c.CustomerID
JOIN Products p ON p.ProductID = c.ProductID
group by c.CustomerID;


 */
