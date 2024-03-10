package Level_1_HT2;

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Array01ChangeVariableOnOpposite {
    public static void main(String[] args) {

        int[] ar010 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

//        Другой способ задания массива
//        int[] ar01 = new int [10];
//        ar01[0] = 1;
//        ar01[1] = 1;
//        ar01[2] = 0;
//        ar01[3] = 0;
//        ar01[4] = 1;
//        ar01[5] = 0;
//        ar01[6] = 1;
//        ar01[7] = 1;
//        ar01[8] = 0;
//        ar01[9] = 0;
//        System.out.println(ar01[0] + ar01[1]);

        System.out.println(ar010[0] + ar010[1] + " - это сумма первых двух элементов массива");

//        for (int i = 0; i < ar010.length; i++) {
//            System.out.println(ar010[i]  + " - это i-й элемент массива");
//        }

        for (int i = 0; i < ar010.length; i++) {
            System.out.println(ar010[i]  + " - это " + (i + 1) + "-й элемент массива");
            if (ar010[i] == 0) {
                ar010[i] = 1;
            }
            else {
                ar010[i] = 0;
            }
            System.out.println(ar010[i]  + " - это " + (i + 1) + "-й инвертированный элемент массива");
        }
    }




}
