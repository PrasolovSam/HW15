import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printInfo();


    }

    public static String fullName(){
        System.out.println("Введите ваше полное имя");
        return new Scanner(System.in).nextLine().trim();
    }

    public static String firstName(){
        String firstName = fullName().substring(0, ' ');
        return firstName;
    }
    public static String lastName() {
        String lastName = fullName().substring(fullName().lastIndexOf(' '));
        return lastName;
    }
    public static String fatherName() {
        String fatherName = fullName().substring(fullName().indexOf(' '), fullName().lastIndexOf(' '));
        return fatherName;
    }
    public static void printInfo(){
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + fatherName);
    }
}
