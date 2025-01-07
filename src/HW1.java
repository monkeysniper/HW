import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        String loveIsFood;
        final int NUM = 15;
        String word = "letter";
        loveIsFood = NUM + word;
        System.out.println(NUM);
        System.out.println(word);
        System.out.println(loveIsFood);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет, " + name + "!");


    }
}
