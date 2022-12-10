package week11_review;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()||name.isEmpty()){
            System.err.println("Name can not be blank or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age <=0){
            System.err.println("Invalid age :"+ age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender;
    }
}
