package ust.com.person;

public class Salary {
	
	   private int salaryId;
	    private double amount;
	    private String currency;

	    // Constructor
	    public Salary(int salaryId, double amount, String currency) {
	        this.salaryId = salaryId;
	        this.amount = amount;
	        this.currency = currency;
	    }

	    // Getters and setters
	    public int getSalaryId() {
	        return salaryId;
	    }

	    public void setSalaryId(int salaryId) {
	        this.salaryId = salaryId;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public String getCurrency() {
	        return currency;
	    }

	    public void setCurrency(String currency) {
	        this.currency = currency;
	   

}
}
