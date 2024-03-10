package Level_1_HT2;
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
public class Array02CreateEmpty {
    public static void main(String[] args) {
        int[] a = new int [8];

        int j = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = j;
            j += 3;

            System.out.println(a[i]  + " - это " + (i + 1) + "-й элемент массива");
        }
    }
}
