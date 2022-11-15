public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.maleGender = true;
        wolf.name = "Акелла";
        wolf.weight = 50.0f;
        wolf.age = 3;
        wolf.color = "Серый";

        System.out.println("пол: " + wolf.maleGender);
        System.out.println("имя: " + wolf.name);
        System.out.println("вес: " + wolf.weight);
        System.out.println("возраст: " + wolf.age);
        System.out.println("окрас: " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}