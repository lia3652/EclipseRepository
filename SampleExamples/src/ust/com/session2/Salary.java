package ust.com.session2;

import java.util.Objects;

class Salary {
    int salary_id;
    double amount;
    String currency;

    Salary(int salary_id, double amount, String currency) {
        this.salary_id = salary_id;
        this.amount = amount;
        this.currency = currency;
    }

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency, salary_id);
	}

	@Override
	public String toString() {
		return "Salary [salary_id=" + salary_id + ", amount=" + amount + ", currency=" + currency + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(currency, other.currency) && salary_id == other.salary_id;
	}
}
