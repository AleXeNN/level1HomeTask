package Level_1_HT2;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
public class Array03 {
    public static void main(String[] args) {
        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 6) {
                a[i] = a[i] * 2;
                System.out.println(a[i]  + " - это значение " + (i + 1) + "-го элемента массива умноженного на 2");
            }
            else {
                System.out.println(a[i]  + " - это значение " + (i + 1) + "-го элемента массива");
            }

        }
    }
}
