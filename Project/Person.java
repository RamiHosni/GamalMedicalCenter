public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String n, int a) {

        name = n;
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

}
