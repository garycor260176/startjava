public class ArrayTheme {

    public static void main(String[] args) {
        int len;

        System.out.println("==== Реверс значений массива");
        int intArr[] = {1, 7, 4, 3, 5, 6, 2};
        System.out.println("Исходный массив: ");
        printIntArr(intArr, 0);
        len = intArr.length;
        for(int i = 0; i < len / 2; i++) {
            len--;
            int tmp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = tmp;
        }
        System.out.println("Измененный массив:");
        printIntArr(intArr, 0);

        System.out.println("==== Вывод произведения элементов массива");
        intArr = new int[10];
        System.out.println("Исходный массив:");
        len = intArr.length;
        for(int i = 0; i < len; i++)
            intArr[i] = i;
        printIntArr(intArr, 0);
        long multiply = 1;
        System.out.println("Результат: ");
        for(int i = 1; i < len - 1; i++) {
            multiply *=  intArr[i];
            System.out.print(intArr[i] + (i == intArr.length - 2 ? " = " + multiply : " * "));
        }
        System.out.println("\nИсключены: [0]=" + intArr[0] + ", [9]=" + intArr[9]);

        System.out.println("\n==== Удаление элементов массива");
        float[] floatArr = new float[15];
        int numberZeroed = 0;
        System.out.print("Исходный массив: ");
        len = floatArr.length;
        for(int i = 0; i < len; i++)
            floatArr[i] = (float) Math.random();
        printFloatArr(floatArr, 8);
        System.out.print("\nИзмененный массив: ");
        float middleNumber = floatArr[len / 2];
        for(int i = 0; i < len; i++) {
            if(floatArr[i] > middleNumber) {
                floatArr[i] = 0;
                numberZeroed++;
            }
        }
        printFloatArr(floatArr, 8);
        System.out.println("\nКоличество обнуленных ячеек: " + numberZeroed);

        System.out.println("\n==== Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for(int i = len - 1; i >= 0; i--) {
            for(int j = len - 1; j >= i; j--)
                System.out.print(alphabet[j]);
            System.out.println();
        }

        System.out.println("\n==== Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        for(int i = 0; i < len; i++) {
            boolean unique;
            int genNum;
            do {
                genNum = 60 + (int) (Math.random() * 40);
                unique = false;
                for(int j = 0; j < i; j++) {
                    if(genNum == uniqueNumbers[i]) {
                        unique = true;
                        break;
                    }
                }
            } while(unique);
            uniqueNumbers[i] = genNum;

        }
        System.out.print("Исходный массив: ");
        printIntArr(uniqueNumbers, 10);
        quickSort(uniqueNumbers, 0, uniqueNumbers.length - 1);
        System.out.print("Отсортированный массив: ");
        printIntArr(uniqueNumbers, 10);

        System.out.println("\n==== Сдвиг элементов массива");
        String srcArr[] = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив: ");
        printStringArr(srcArr);
        int numbersNoEmpty = 0;
        for(String element : srcArr) {
            if(!element.isBlank()) numbersNoEmpty++;
        }
        String[] destArr = new String[numbersNoEmpty];
        int startCopyRange = -1;
        int nextDestStartRange = 0;
        len = srcArr.length;
        for(int i = 0; i < len; i++) {
            int noEmptyNum = srcArr[i].isBlank() ? 0 : 1;
            if(noEmptyNum == 0 || i == len - 1) {
                if(startCopyRange >= 0 || i == len - 1) {
                    System.arraycopy(srcArr, startCopyRange, destArr, nextDestStartRange,
                            i - startCopyRange + noEmptyNum);
                    nextDestStartRange += i - startCopyRange;
                }
                startCopyRange = -1;
            } else {
                if(startCopyRange < 0) startCopyRange = i;
            }
        }
        System.out.print("Результат: ");
        printStringArr(destArr);
    }

    private static void printIntArr(int[] array, int elementOnRow) {
        int len = array.length;
        for(int i = 0; i < len; i++) {
            if(elementOnRow > 0 && i % elementOnRow == 0) System.out.println();
            System.out.printf("%5d", array[i]);
        }
        System.out.println();
    }

    private static void printFloatArr(float[] array, int elementOnRow) {
        int len = array.length;
        for(int i = 0; i < len; i++) {
            if(elementOnRow > 0 && i % elementOnRow == 0) System.out.println();
            System.out.printf("%8.3f", array[i]);
        }
    }

    private static void quickSort(int[] array, int begin, int end) {  
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private static int partition(int[] array, int begin, int end) {  
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    private static void printStringArr(String[] array) {
        System.out.print("{");
        int len = array.length;
        for(int i = 0; i < len; i++) {
            System.out.print("\"" + array[i]  + "\"" + (i < len - 1 ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }
}
