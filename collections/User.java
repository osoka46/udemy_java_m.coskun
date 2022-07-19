package collections;

public class User {
    private String username;
    private String lastname;
    private int age;

    User(String username, String lastname, int age)
        {
            this.username = username;
            this.lastname = lastname;
            this.age = age;
        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        this.age = age;
    }
}
