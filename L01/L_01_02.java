//Расчет стоимости товара со скидкой
public class L_01_02 {    

    public static void main(String[] args) {
        float price_pen = 100.0f;
        float price_book = 200.0f;
        float discont = 11.0f;

        float all_discont = ( price_pen + price_book ) * discont / 100;
        System.out.println("Сумма скидки: " + all_discont + " руб.");

        float all_stoim = price_pen + price_book - all_discont;
        System.out.println("Общая стоимость товаров со скидкой: " + all_stoim + " руб.");
    }

}