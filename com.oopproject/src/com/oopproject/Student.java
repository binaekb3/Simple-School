package com.oopproject;

public class Student {
	private int id;
	private int grade;
	private String name;
	private int feesPaid;
	private int feesTotal;

	public Student(int id, int grade, String name) {
		this.feesPaid = 0;
		this.feesTotal = 30000;

		this.id = id;
		this.grade = grade;
		this.name = name;
		
	}

	public void setGrade(int grade) {
		this.grade = grade;

	}

	public int getMoneyEarned() {
		return feesPaid;
	}



	public void updateFeesPaid(int fees) {
		this.feesPaid = feesPaid + fees;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;

	}

	public int getGrade() {
		return grade;
	}

	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + ", name=" + name + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}

}
