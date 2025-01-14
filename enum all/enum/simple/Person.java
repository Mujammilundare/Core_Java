
 class Person 
	  {
  private String firstName;
  private String lastName;
   private Gender gender;

  public Person(String fName, String lName) 
	  {
      this.firstName = fName;
      this.lastName = lName;
     }

/*  public void setFirstName(String firstName) 
	  {
        this.firstname = firstName; 
     }

  public String getFirstName() 
	  {
        return firstName;
     }
*/
  public void setGender(Gender gender) 
	  {
			this.gender = gender;
	}

  public Gender  getGender() 
	  {
		return gender;
	}
}


