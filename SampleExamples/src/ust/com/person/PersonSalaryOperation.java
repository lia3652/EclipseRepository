package ust.com.person;

public class PersonSalaryOperation {
	
	// Search by contact
    public static Person searchByContact(Person[] persons, String contact) {
        for (Person person : persons) {
            if (person.getContact().equals(contact)) {
                return person;
            }
        }
        return null;
    }

    // Show average salary for a specific currency
    public static double averageSalaryByCurrency(Person[] persons, String targetCurrency) {
        double total = 0;
        int count = 0;

        for (Person person : persons) {
            Salary salary = person.getSalary();
            if (salary.getCurrency().equals(targetCurrency)) {
                total += salary.getAmount();
                count++;
            }
        }

        if (count == 0) {
            return 0; // Or you could throw an exception here
        }

        return total / count;
    }

    // Show person with highest salary amount
    public static Person personWithHighestSalary(Person[] persons) {
        if (persons.length == 0) {
            return null;
        }

        Person highestPaidPerson = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].getSalary().getAmount() > highestPaidPerson.getSalary().getAmount()) {
                highestPaidPerson = persons[i];
            }
        }
        return highestPaidPerson;
    }

    // Show person with lowest salary amount
    public static Person personWithLowestSalary(Person[] persons) {
        if (persons.length == 0) {
            return null;
        }

        Person lowestPaidPerson = persons[0];
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].getSalary().getAmount() < lowestPaidPerson.getSalary().getAmount()) {
                lowestPaidPerson = persons[i];
            }
        }
        return lowestPaidPerson;
    }

    // Show salary_id for a person_id
    public static Integer getSalaryIdForPersonId(Person[] persons, int personId) {
        for (Person person : persons) {
            if (person.getPersonId() == personId) {
                return person.getSalary().getSalaryId();
            }
        }
        return null;
    }
}


