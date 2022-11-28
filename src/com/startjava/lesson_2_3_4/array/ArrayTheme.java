public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("==== Реверс значений массива");
        int intArr[] = {1, 7, 4, 3, 5, 6, 2};
        for(int num : intArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for(int idx = 0; idx < intArr.length / 2; idx++) {
            int idxFromEnd = intArr.length - 1 - idx;
            intArr[idx] ^= intArr[idxFromEnd];
            intArr[idxFromEnd] ^= intArr[idx];
            intArr[idx] ^= intArr[idxFromEnd];
        }
        for(int num : intArr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n==== Вывод произведения элементов массива");
        System.out.print("Исходный массив: ");
        int intGenArr[] = new int[10];
        String skippedIdx = "";
        String formula = "";
        long multiply = 1;
        boolean isOperationPrinted = false;
        for(int idx = 0; idx < intGenArr.length; idx++) {
            intGenArr[idx] = (int) ( Math.random() * 10 );
            System.out.print(intGenArr[idx] + " ");
            if((intGenArr[idx] == 0 || intGenArr[idx] == 9) ? true : false){
                skippedIdx = skippedIdx + (skippedIdx.length() > 0 ? ", " + idx : idx);
            } else {
                multiply *= intGenArr[idx];
                formula += (formula.length() > 0 ? " * " + intGenArr[idx] : intGenArr[idx]);
            }
        }
        System.out.println("\n" + formula + " = " + multiply);
        System.out.println("Пропущены элементы: " + skippedIdx);

        System.out.println("\n==== Удаление элементов массива");
        float[] floatArr = new float[15];
        int numbersZeroed = 0;
        System.out.print("Исходный массив: ");
        for(int idx = 0; idx < floatArr.length; idx++) {
            floatArr[idx] = (float) Math.random();
            if(idx % 8 == 0) System.out.println();
            System.out.printf("%8.3f", floatArr[idx]);
        }
        System.out.print("\nИзмененный массив: ");
        for(int idx = 0; idx < floatArr.length; idx++) {
            if(idx % 8 == 0) System.out.println();
            if(floatArr[idx] > floatArr[floatArr.length / 2]) {
                floatArr[idx] = 0;
                numbersZeroed++;
            }
            System.out.printf("%8.3f", floatArr[idx]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + numbersZeroed);

        System.out.println("\n==== Вывод элементов массива лесенкой в обратном порядке");
        char letters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 
            'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        for(int numRow = letters.length - 1; numRow >=0; numRow--){
            for(int numnLetter = letters.length - 1; numnLetter >= numRow; numnLetter--)
                System.out.print(letters[numnLetter]);
            System.out.println();
        }

        System.out.println("\n==== Генерация уникальных чисел");
        int[] numbers = new int[30];
        for(int idx = 0; idx < numbers.length; idx++){
            boolean exist;
            do {
                numbers[idx] = 60 + (int) ( Math.random() * 40 );
                exist = false;
                for(int i = 0; i < idx; i++) {
                    if(numbers[i] == numbers[idx]) {
                        exist = true;
                        break;
                    }
                }
            } while(exist);

        }
        System.out.print("Исходный массив: ");
        printArrTask5(numbers);
        quickSort(numbers, 0, numbers.length - 1);
        System.out.print("\nОтсортированный массив: ");
        printArrTask5(numbers);

        System.out.println("\n\n==== Сдвиг элементов массива");
        String srcArr[] = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", "D"};
        int numbersNoEmpty = 0;
        for(String element : srcArr) {
            numbersNoEmpty += (element.replaceAll("\\s+", "").length() == 0 ? 0 : 1);
        }
        String[] destArr = new String[numbersNoEmpty];
        int startCopyRange = -1;
        int cntNum = -1;
        int nextDestStartRange = 0;
        for(int idx = 0; idx < srcArr.length; idx++) {
            if(srcArr[idx].isBlank() || idx == srcArr.length - 1) {
                if(startCopyRange >= 0 || idx == srcArr.length - 1) {
                    System.arraycopy(srcArr, startCopyRange, destArr, nextDestStartRange, 
                        idx - startCopyRange + (idx == srcArr.length - 1 ? 1 : 0));
                    nextDestStartRange += idx - startCopyRange;
                }
                startCopyRange = -1;
            } else {
                if(startCopyRange < 0) startCopyRange = idx;
            }
        }
        for(String element : destArr) {
            System.out.println(element);
        }
    }

    private static void printArrTask5(int[] array){
        for(int num = 0; num < array.length; num++) {
            if(num % 10 == 0) System.out.println();
            System.out.printf("%5d", array[num]);
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
}
