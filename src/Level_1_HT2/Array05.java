package Level_1_HT2;
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public class Array05 {
    public static void main(String[] args) {
        int[] a = { 4, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        int amax = a[0];
        int amin = a[0];

        for (int i=1; i<a.length; i++) {
            if (a[i] > amax) {
                amax = a[i];
            }
            if (a[i] < amin) {
                amin = a[i];
            }
        }
        printMass(a);

        System.out.println(amax + " это максимум в приведенном массиве");
        System.out.println(amin + " это минимум в приведенном массиве");

    }

    public static void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

}
