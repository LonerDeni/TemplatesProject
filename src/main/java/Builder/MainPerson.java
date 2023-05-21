package Builder;

public class MainPerson {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(4)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        mom.happyBirthday();
        System.out.println(mom);
        son.happyBirthday();
        System.out.println(son);

        Person grandFather = new PersonBuilder()
                .setName("Семен")
                .setSurname("Вольф")
                .setAge(0)
                .setAddress("Токио")
                .build();
        grandFather.happyBirthday();
        System.out.println(grandFather);

        Person father = new PersonBuilder()
                .setName("Семен")
                .setSurname("Вольф")
                .setAge(-100)
                .setAddress("Сидней")
                .build();

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}