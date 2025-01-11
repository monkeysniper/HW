public class HW3 {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        numbers[0] = 1.5;
        numbers[1] = 2.3;
        numbers[2] = -4.6;
        numbers[3] = 5.0;
        numbers[4] = -3.7;
        numbers[5] = 6.8;
        numbers[6] = -1.2;
        numbers[7] = 7.9;
        numbers[8] = -2.4;
        numbers[9] = 8.6;
        numbers[10] = -9.0;
        numbers[11] = 3.3;
        numbers[12] = -6.5;
        numbers[13] = 4.7;
        numbers[14] = -8.2;
        double sum = 0;
        double amount = 0;
        boolean flag = false;
        for (double n : numbers) {
            if (n > 0) {
                if (flag) {
                    sum += n;
                    amount += 1;
                }
            } else {
                flag = true;
            }
        }
        System.out.println(sum / amount);
    }
}


//1 Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами, первые 2 числа в массиве должны быть положительными;
//Затем через 1 цикл “for each” посчитать среднее арифметическое положительных чисел, расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6, -7) =  11/3