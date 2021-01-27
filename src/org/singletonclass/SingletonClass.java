package org.singletonclass;

public class SingletonClass {
	public static int a;
public static SingletonClass s;
private SingletonClass() {
	// TODO Auto-generated constructor stub
}
public static SingletonClass getMethod() {
	if(s== null) {
		s= new SingletonClass();
	}
	return s;
}
public void methodOne() {
	System.out.println("Anand pakka mass in API");
	}
public static void main(String[] args) {
	getMethod();
	s.methodOne();
}
}
