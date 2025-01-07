import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(22,22));
        System.out.println(permission(44,66));
        System.out.println(permission(32,12));
        System.out.println(permission(72,34));
        System.out.println(permission(65,22));
        System.out.println(permission( generateRandomAge(),10));
    }

    public static String permission(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temp >= 0 && temp <= 28) {
            return "можно идти гулять";
        } else if (age >= 45 && temp >= -10 && temp < 25) {
            return "можно идти гулять";
        } else
            return "оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.print("age:"+rand);
        return rand;

    }
}

//dfsfsdgsdfsafdaf