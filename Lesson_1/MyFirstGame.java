//Игра “Угадай число”
public class MyFirstGame {    

    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”");

        int minValue = 1; //минимальное значение
        int maxValue = 100; //максимальное значение

        int hiddenNum = 32; //загаданное значение
        int userNum = 99; //значение пользователя

        int i = 1; //счетчик итераций
        while(true) {
            if(userNum > hiddenNum) {
                System.out.println(i + ") Число " + userNum + " больше того, что загадал компьютер");
                maxValue = userNum - 1; //сужаем диапазон справа
            } else if(userNum < hiddenNum) {
                System.out.println(i + ") " + userNum + " меньше того, что загадал компьютер");
                minValue = userNum + 1; //сужаем диапазон слева
            } else {
                System.out.println(i + ") Вы победили!");
                break;
            }
            userNum = minValue + ( maxValue - minValue ) / 2; //середина нового диапазона
            i++;
        }
    }   
}