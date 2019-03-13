package learningProgramming;

public class Person {

    String firstName;
    String lastName;
    int age;


    public void setFirstName(String firstNameString){

        firstName=firstNameString;
    }

    public void setLasstName(String lastNameString) {

        lastName=lastNameString;

    }

    public void setAge(int ageInt){

        age=ageInt;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
