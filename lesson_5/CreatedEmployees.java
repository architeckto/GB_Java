package lesson_5;

public class CreatedEmployees {

    public static void main(String[] args) {

        EmployeeBlank Engeener = new EmployeeBlank("Vasya", "Engeener", "vasya@mail.ru", 99999999, 50000, 27);

        EmployeeBlank Engeener2 = new EmployeeBlank("Petya", "Engeener", "petya@mail.ru", 99979999, 30000, 20);

        EmployeeBlank Engeener3 = new EmployeeBlank("Grisha", "Engeener", "Grisha@mail.ru", 99977999, 77000, 47);

        EmployeeBlank Engeener4 = new EmployeeBlank("Anya", "Engeener", "Anya@mail.ru", 99977999, 55000, 20);

        EmployeeBlank Engeener5 = new EmployeeBlank("Irina", "Engeener", "Irina@mail.ru", 99965599, 30000, 40);

        EmployeeBlank[] allEmployees = {Engeener, Engeener2, Engeener3, Engeener4, Engeener5};

        System.out.println("\nСотрудники старше 40 лет: ");
        System.out.println("Должность " + "Имя     " + "Возраст");
        for (EmployeeBlank allEmployee : allEmployees) {
            if (allEmployee.age >= 40) {
                System.out.println(allEmployee.position + "  " + allEmployee.name + "   " + allEmployee.age);
            }
        }
    }
}