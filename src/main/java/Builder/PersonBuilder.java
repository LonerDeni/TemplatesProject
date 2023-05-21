package Builder;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected String city;
    protected int age = -1;

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Возраст не может быть меньше 0");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty())
            throw new IllegalStateException("Имя не задано");
        if (surname == null || surname.isEmpty())
            throw new IllegalStateException("Фамилия не задана");
        return new Person(name, surname, age, city);
    }
}