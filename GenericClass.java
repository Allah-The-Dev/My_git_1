package com.generics.classes;

public class GenericClass<T extends Number,T2> {
	private T t;
	private T2 name;
	
	void set(T t,T2 name) {this.t = t;this.name = name;}
	
	String get() {return this.t.toString()+this.name;}

	public static void main(String[] args) {
		GenericClass<Double,String> g1 = new GenericClass<>();
		g1.set(5.3,"Neelesh");
		System.out.println(g1.get());
		g1.set(10.20,"Lalji");
		System.out.println(g1.get());
	}
}


