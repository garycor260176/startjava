public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("==== Реверс значений массива");
        int intArr[] = {1, 7, 4, 3, 5, 6, 2};
        System.out.println("Исходный массив: ");
        printIntArr(intArr, 0);
        int len = intArr.length;
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

        long multDigits = 1;
        System.out.println("Результат: ");
        for(int i = 1; i < len - 1; i++) {
            multDigits *=  intArr[i];
            System.out.print(intArr[i] + (i < len - 2 ? " * " : " = " + multDigits));
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
            int genNumber;
            do {
                genNumber = 60 + (int) (Math.random() * 40);
                unique = false;
                for(int j = 0; j < i; j++) {
                    if(genNumber == uniqueNumbers[i]) {
                        unique = true;
                        break;
                    }
                }
            } while(unique);

            uniqueNumbers[i] = genNumber;
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
        int newLen = 0;
        for(String element : srcArr) {
            if(!element.isBlank()) newLen++;
        }

        String[] destArr = new String[newLen];
        int startCopyRange = -1;
        int nextDestStartRange = 0;
        len = srcArr.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            boolean isBlank = srcArr[i].isBlank();
            if(isBlank || i == len - 1) {
                if(!isBlank) count++;
                if(startCopyRange >= 0) {
                    System.arraycopy(srcArr, startCopyRange, destArr, nextDestStartRange, count);
                    nextDestStartRange += i - startCopyRange;
                }

                startCopyRange = -1;
                count = 0;
            } else {
                if(startCopyRange < 0) startCopyRange = i;
                count++;
            }
        }
        System.out.print("Результат: ");
        printStringArr(destArr);
    }

    private static void printIntArr(int[] arr, int columns) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if(columns > 0 && i % columns == 0) System.out.println();
            System.out.printf("%5d", arr[i]);
        }
        System.out.println();
    }

    private static void printFloatArr(float[] arr, int columns) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if(columns > 0 && i % columns == 0) System.out.println();
            System.out.printf("%8.3f", arr[i]);
        }
    }

    private static void quickSort(int[] arr, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(arr, begin, end);
        quickSort(arr, begin, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;

        return counter;
    }

    private static void printStringArr(String[] arr) {
        System.out.print("{");
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            System.out.print("\"" + arr[i]  + "\"" + (i < len - 1 ? ", " : ""));
        }
        System.out.print("}");
        System.out.println();
    }
}
