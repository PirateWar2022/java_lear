public class People {
    private String firstname;
    private String lastname;
    private int age;

    public People(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    public int getAge() {
        return age;
    }

    public String getAll() {
        return this.firstname + " " + this.lastname + " " + this.age;
    }


}
