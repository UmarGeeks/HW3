public class Main {
    public static void main(String[] args) {
        double[] num = {1.0, 2.0, -37,89, 12.34, 76.23, -44.55, 0.12, -98.76, 55.43, 33.33, -11.11, 88.88, 22.22,
        -66.66, 5.69,};
        double sum = 0.0;
        int counter = 0;
        boolean flag = false;
        for (double positiv: num) {
            if (positiv < 0) {
                flag = true;
            }
            if (positiv > 0 && flag) {
                sum += positiv;
                counter += 1;
            }
            if (flag == false)
                System.out.println("Отрицательных чисел нет");
            else {
                System.out.println("Сумма чисел" + sum);
                System.out.println("Количество положительных чисел" + counter);
                System.out.println("Средное арфиметичское" + (sum / counter));
            }
        }


    }
}