package ust.com.session2;

import java.util.Objects;

class Person {
	    int person_id;
	    int salary_id;
	    String contact;
	    String email;
	    String name;

	    @Override
		public int hashCode() {
			return Objects.hash(contact, email, name, person_id, salary_id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return Objects.equals(contact, other.contact) && Objects.equals(email, other.email)
					&& Objects.equals(name, other.name) && person_id == other.person_id && salary_id == other.salary_id;
		}

		@Override
		public String toString() {
			return "Person [person_id=" + person_id + ", salary_id=" + salary_id + ", contact=" + contact + ", email="
					+ email + ", name=" + name + "]";
		}

		Person(int person_id, int salary_id, String contact, String email, String name) {
	        this.person_id = person_id;
	        this.salary_id = salary_id;
	        this.contact = contact;
	        this.email = email;
	        this.name = name;
	    }
	}



