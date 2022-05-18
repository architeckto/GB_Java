package lesson_5;

public class EmployeeBlank{
    String name;
    String position;
    String email;
    long phone;
    double salary;
    int age;

    public EmployeeBlank(String name, String position, String email, long phone, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Employee created!");
        System.out.println(EmployeeBlank.this.name + " " + EmployeeBlank.this.position);
    }

    //public double gerBonus(){}

}
