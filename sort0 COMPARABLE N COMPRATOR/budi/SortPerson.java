import java.util.Arrays;

class  SortPerson
{
	public static void main(String[] args) 
	{
  
  Person[] persons = new Person[4];
  
  persons[0] = new Person();
  persons[0].setFirstName("Elvis");
  persons[0].setLastName("Goodyear");
  persons[0].setAge(56);

  persons[1] = new Person();
  persons[1].setFirstName("Stanley");
  persons[1].setLastName("Clark");
  persons[1].setAge(8);

  persons[2] = new Person();
  persons[2].setFirstName("Jane");
  persons[2].setLastName("Graff");
  persons[2].setAge(16);

  persons[3] = new Person();
  persons[3].setFirstName("Nancy");
  persons[3].setLastName("Goodyear");
  persons[3].setAge(69);

Arrays.sort(persons);

	}
}
