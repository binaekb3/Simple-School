package com.oopproject;

public class Teacher {
	private int id;
	private int salary;
	private String name;

	public Teacher(int id, int salary, String name) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {

		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}
