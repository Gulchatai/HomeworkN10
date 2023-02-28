import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя сотрудника");
        String firstName = sc.nextLine();
        System.out.println("Введите отчество сотрудника");
        String middleName = sc.nextLine();
        System.out.println("Введите фамилию сотрудника");
        String lastName = sc.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Задача 2");
        String fullName2 = lastName.toUpperCase() + " " + firstName.toUpperCase() + " " + middleName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);
        sc.close();
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника  — " + fullName);
    }
}
