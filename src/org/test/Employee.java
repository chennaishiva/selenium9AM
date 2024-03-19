package org.test;

public class Employee {
	
	static Employee object;
	
	private Employee() {
	}
	
	public static Employee getObject() {
		
		if (object == null) {
			
		System.out.println("Before Object Creation :"+System.identityHashCode(object));
		
		object = new Employee();
		
		System.out.println("After Object Creation :"+System.identityHashCode(object));
		
		}
		return object;
	}
	
	public void details() {
		System.out.println("Employee name is ram");
	}
	
	public static void main(String[] args) {
		Employee obj1 = getObject();
		System.out.println(System.identityHashCode(obj1));
		obj1.details();
		
		Employee obj2 = getObject();
		System.out.println(System.identityHashCode(obj2));
		
		Employee obj3 = getObject();
		System.out.println(System.identityHashCode(obj3));
	}
}
