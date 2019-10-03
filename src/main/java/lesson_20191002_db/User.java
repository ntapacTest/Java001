package lesson_20191002_db;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String locale;

    public User(String id, String firstName, String lastName, String locale) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.locale = locale;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
