package builder;

import java.util.ArrayList;
import java.util.List;

public class DemoBuilder {
	
	public static void main(String[] args)
	{
		List<Person> people = new ArrayList<>();
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Bob")
	            .surName("Baker")
	            .age(21)
	            .email("bob.baker@example.com")
	            .phoneNumber("201-121-4678")
	            .address("44 4th St, Smallville, KS 12333")
	            .build() 
	      );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Jane")
	            .surName("Doe")
	            .age(25)
	            .email("jane.doe@example.com")
	            .phoneNumber("202-123-4678")
	            .address("33 3rd St, Smallville, KS 12333")
	            .build() 
	      );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("John")
	            .surName("Doe")
	            .age(25)
	            .email("john.doe@example.com")
	            .phoneNumber("202-123-4678")
	            .address("33 3rd St, Smallville, KS 12333")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("James")
	            .surName("Johnson")
	            .age(45)
	            .email("james.johnson@example.com")
	            .phoneNumber("333-456-1233")
	            .address("201 2nd St, New York, NY 12111")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Joe")
	            .surName("Bailey")
	            .age(67)
	            .email("joebob.bailey@example.com")
	            .phoneNumber("112-111-1111")
	            .address("111 1st St, Town, CA 11111")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Phil")
	            .surName("Smith")
	            .age(55)
	            .email("phil.smith@examp;e.com")
	            .phoneNumber("222-33-1234")
	            .address("22 2nd St, New Park, CO 222333")
	            .build()
	    );
	    
	    people.add(
	      new Person.Builder()
	            .givenName("Betty")
	            .surName("Jones")
	            .age(85)
	            .email("betty.jones@example.com")
	            .phoneNumber("211-33-1234")
	            .address("22 4th St, New Park, CO 222333")
	            .build()
	    );
	    
	    System.out.println(people);
	}

}
