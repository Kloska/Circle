public class Student extends Person {

    public Student(String name, int age, String address, int phoneNumber, int securityNumber) {
        super(name, age, address, phoneNumber, securityNumber);
    }

    public int Year;

    public String School;

    public String setSchool(String school) {
        School = school;
       return School;
     }

    public void setYear(int year) {
        Year = year;
    }
}
