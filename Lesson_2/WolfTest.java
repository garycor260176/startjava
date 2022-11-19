public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMaleGender(true);
        wolf.setName("Акелла");
        wolf.setWeight(50.0f);
        wolf.setAge(3);
        wolf.setColor("Серый");

        System.out.println("пол: " + wolf.getMaleGender());
        System.out.println("имя: " + wolf.getName());
        System.out.println("вес: " + wolf.getWeight());
        System.out.println("возраст: " + wolf.getAge());
        System.out.println("окрас: " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}