// 1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package seminar1.homework2.task;

import java.util.logging.Level;
import java.util.logging.Logger;

public class task1 {

    private static final Logger LOG = Log.log(task1.class.getName());


    public static void run() {

        int[] wrkArray = new int[13];

        wrkArray = fillArray(wrkArray);
        System.out.print("Unsorted ");
        System.out.println(arrayToString(wrkArray));

        wrkArray = sortBubbleOptimized(wrkArray);

 //       System.out.println(arrayToString(wrkArray));
    }
//  fill integer array with random values
    public static int[] fillArray(int[] myArray) {

        int borders = myArray.length;

        for (int i = 0; i < borders; i++) {
            myArray[i] = (int) (Math.random() * borders * 2);
        }
        return myArray;

    }

//  sort array 
    public static int[] sortBubbleOptimized(int[] myArray) {

        int border = myArray.length;

        for (int step = 0; step < border - 1; step++) {

            for (int i = 0; i < border - 1 - step; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
 //           System.out.print("\nStep = " + step);
 //           System.out.println(arrayToString(myArray));

            LOG.log(Level.INFO,"\nStep = " + step + arrayToString(myArray));

        }

        return myArray;
    }

// collect array in string for output    
    public static String arrayToString(int[] myArray) {

        String outArray = new String();
        outArray = "\t";
        int border = myArray.length;
        for (int i = 0; i < border; i++) {
            outArray += (Integer.toString(myArray[i]) + "  ");
        }
        return outArray;

    }



}