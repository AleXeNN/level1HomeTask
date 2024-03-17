package Level_1_HT2;
//4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//   заполнить его диагональные элементы единицами;
public class Array04 {
    public static void main(String[] args) {
        int [][] m = new int[5][5];

        for (int i = 0; i < m.length; i ++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == i) {
                    m[i][j] = 1;
                }
                else {
                    m[i][j] = 0;
                }

            }
        }
        System.out.println(m[0][0]);
        printMass(m);
    }

    public static void printMass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
