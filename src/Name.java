import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя\n");
        String a = sc.nextLine();
        String name = "Вячеслав";
        if(name.equals(a)) {
            System.out.println("Привет, " + a);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
