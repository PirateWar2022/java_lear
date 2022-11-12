public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    String greeting() {
        return "Hello I'am a person and my name is " + this.firstname +  " " + this.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age < 0) {
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getFullName(){
        return "Name: " + this.firstname + this.lastname + "Age: " + this.age;
    }
}

class Employee extends Person {

    private int inn;
    private int number;
    private int snils;


    public Employee(String firstname, String lastname, int age, int inn, int number, int snils) {
        super(firstname, lastname, age);
        this.inn = inn;
        this.number = number;
        this.snils = snils;
    }
    String greeting(){
        return "Hello I'm employee and my name is " + this.getFirstname() + " " + this.getLastname();
    }


}

class Developer extends Employee {
    private String level;
    private String language;

    public Developer(String firstname, String lastname, int age, int inn, int number, int snils, String level, String language) {
        super(firstname, lastname, age, inn, number, snils);
        this.level = level;
        this.language = language;
    }
    String greeting(){
        return "Hello I'm developer and my name is " + this.getFirstname() + " " + this.getLastname();
    }
}
