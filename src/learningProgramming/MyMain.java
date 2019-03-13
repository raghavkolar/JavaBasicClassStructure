package learningProgramming;

public class MyMain {

    public static void main(String[] args) {

        Person myPerson1= new Person();
        Person myPerson2= new Person();

        myPerson1.setFirstName("Raghavendra");
        myPerson1.setLasstName("Kolar Venkatesh");
        myPerson1.setAge(18);

        myPerson2.setFirstName("Sandhya Rani");
        myPerson2.setLasstName("Lakkakula");
        myPerson2.setAge(18);

        System.out.println("My name is  " +myPerson1.getFirstName() +" "+myPerson1.getLastName() + " and My Age is " +myPerson1.getAge());

        System.out.println("My  Wife name is  " +myPerson2.getFirstName() +" "+myPerson2.getLastName() + " and  her Age is " +myPerson2.getAge());



    }
}
