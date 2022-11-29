public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("==== Реверс значений массива");
        int intArr[] = {1, 7, 4, 3, 5, 6, 2};
        System.out.println("Исходный массив: ");
        printIntArr(intArr, 0);
        System.out.println();
        int idxFromEnd = intArr.length;
        for(int i = 0; i < intArr.length / 2; i++) {
            idxFromEnd--;
            int tmp = intArr[i];
            intArr[i] = intArr[idxFromEnd];
            intArr[idxFromEnd] = tmp;
        }
        System.out.println("Измененный массив:");
        printIntArr(intArr, 0);

        System.out.println("\n\n==== Вывод произведения элементов массива");
        intArr = new int[10];
        System.out.print("Исходный массив:\n");
        for(int i = 0; i < intArr.length; i++)
            intArr[i] = i;
        printIntArr(intArr, 0);
        System.out.println();
        long multiply = 1;
        boolean isOperationPrinted = false;
        System.out.print("Результат: ");
        for(int i = 1; i < intArr.length - 1; i++) {
            System.out.print(intArr[i] + (i == intArr.length - 2 ? " = " : " * "));
            multiply *=  intArr[i];
        }
        System.out.println(multiply + "\nИсключены: [0]=" + intArr[0] + ", [9]=" + intArr[9]);

        System.out.println("\n==== Удаление элементов массива");
        float[] floatArr = new float[15];
        int numbersZeroed = 0;
        System.out.print("Исходный массив: ");
        for(int i = 0; i < floatArr.length; i++)
            floatArr[i] = (float) Math.random();
        printFloatArr(floatArr, 8);
        System.out.print("\nИзмененный массив: ");
        float numBase = floatArr[floatArr.length / 2];
        for(int i = 0; i < floatArr.length; i++) {
            if(floatArr[i] > numBase) {
                floatArr[i] = 0;
                numbersZeroed++;
            }
        }
        printFloatArr(floatArr, 8);
        System.out.println("\nКоличество обнуленных ячеек: " + numbersZeroed);

        System.out.println("\n==== Вывод элементов массива лесенкой в обратном порядке");
        char letters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 
            'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        for(int i = letters.length - 1; i >=0; i--){
            for(int j = letters.length - 1; j >= i; j--)
                System.out.print(letters[j]);
            System.out.println();
        }

        System.out.println("\n==== Генерация уникальных чисел");
        int[] numbers = new int[30];
        for(int i = 0; i < numbers.length; i++){
            boolean exist;
            do {
                numbers[i] = 60 + (int) ( Math.random() * 40 );
                exist = false;
                for(int j = 0; j < i; j++) {
                    if(numbers[j] == numbers[i]) {
                        exist = true;
                        break;
                    }
                }
            } while(exist);
        }
        System.out.print("Исходный массив: ");
        printIntArr(numbers, 10);
        quickSort(numbers, 0, numbers.length - 1);
        System.out.print("\nОтсортированный массив: ");
        printIntArr(numbers, 10);

        System.out.println("\n\n==== Сдвиг элементов массива");
        String srcArr[] = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив: ");
        printStringArr(srcArr);
        System.out.println();
        int numbersNoEmpty = 0;
        for(String element : srcArr) {
            numbersNoEmpty += (element.isBlank() ? 0 : 1);
        }
        String[] destArr = new String[numbersNoEmpty];
        int startCopyRange = -1;
        int nextDestStartRange = 0;
        for(int i = 0; i < srcArr.length; i++) {
            if(srcArr[i].isBlank() || i == srcArr.length - 1) {
                if(startCopyRange >= 0 || i == srcArr.length - 1) {
                    System.arraycopy(srcArr, startCopyRange, destArr, nextDestStartRange,
                            i - startCopyRange + (srcArr[i].isBlank() ? 0 : 1));
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

    private static void printIntArr(int[] array, int elementOnRow){
        for(int i = 0; i < array.length; i++) {
            if(elementOnRow > 0 && i % elementOnRow == 0) System.out.println();
            System.out.printf("%5d", array[i]);
        }
    }

    private static void printFloatArr(float[] array, int elementOnRow) {
        for(int i = 0; i < array.length; i++) {
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

    private static void printStringArr(String[] array){
        System.out.print("{");
        for(int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i]  + "\"" + (i < array.length - 1 ? ", " : ""));
        }
        System.out.print("}");
    }

}
