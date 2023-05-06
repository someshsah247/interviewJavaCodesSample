package com.learn.basics.lamda;

import java.time.LocalDate;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Supplier<T>
Represents a supplier of results.
There is no requirement that a new or distinct result be returned each time the supplier is invoked.

This is a functional interface whose functional method is get().
 */

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier< LocalDate> supplier = ()-> LocalDate.now();
		System.out.println(supplier.get());
	}

}
