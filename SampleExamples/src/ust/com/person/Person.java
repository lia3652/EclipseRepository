package ust.com.person;

public class Person {
	
	  private int personId;
	    private Salary salary;
	    private String contact;
	    private String email;
	    private String name;

	    // Constructor
	    public Person(int personId, Salary salary, String contact, String email, String name) {
	        this.personId = personId;
	        this.salary = salary;
	        this.contact = contact;
	        this.email = email;
	        this.name = name;
	    }

	    // Getters and setters
	    public int getPersonId() {
	        return personId;
	    }

	    public void setPersonId(int personId) {
	        this.personId = personId;
	    }

	    public Salary getSalary() {
	        return salary;
	    }

	    public void setSalary(Salary salary) {
	        this.salary = salary;
	    }

	    public String getContact() {
	        return contact;
	    }

	    public void setContact(String contact) {
	        this.contact = contact;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}




