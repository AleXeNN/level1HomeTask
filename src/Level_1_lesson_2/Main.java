public class Main {
    public static void main(String[] args) {

//      ♦️МАССИВЫ МНОГОМЕРНЫЕ ♦️

        int[] arr = {1, 2, 3};
        test(arr);

        for (int s = 0; s < arr.length; s++) {
            System.out.println(arr[s]);
        }


        // Прописываем оба индекса массива
        /**
         *
         */
        float [][] map2 = new float[5][4];

        for (int i2 = 0; i2 < map2.length; i2 ++) {
            for (int j2 = 0; j2 < map2[i2].length; j2++) {
                map2[i2][j2] = i2*j2;
            }
        }
        System.out.println(map2[2][3]);



        // Прописываем сначала первый индекс массива
        float [][] map = new float[5][];
        map [0] = new float[4];




//      ♦️МАССИВЫ♦️
        int[] a = new int[6];
        a[0] = 5;
        a[1] = 4;
        a[2] = 5;

//      Ручная инициализация массива
//        {
//            int[] a = {0, 2, 4, 6, 8};
//        }

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;
        }

        System.out.println(a[1]);



        //       ♦️СВИЧ-КЕЙСЫ♦️
/*         int h = 'h' + 'c';
        System.out.println(h);

        int a = 5;
        printIsFive (a);

  */

//          ♦️ЦИКЛЫ♦️
/*        while (a < 4)
        {
            System.out.println(a);
            a++;
        }

        int i = 0;
        for (i = 0; i < 1000000; i++)
        {
            System.out.println(a);
            a++;

            if (a == 44)
            {
                break;
            }
        }

        do {
            System.out.println(a);
        } while (a <5);

 */








    }

    static void test(int[] arr) {
        arr [0] = 2;
        arr [1] = 3;
        arr [2] = 4;
    }

    static void printIsFive (int number) {
        switch (number) {
            default:
                System.out.println("Это не пять и не шесть");
            case 5:
                System.out.println("Это пять");
                break;
            case 6:
                System.out.println("Это шесть");
                break;



        }

    }

}

