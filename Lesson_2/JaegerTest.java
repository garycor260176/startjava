public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1.850f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);
        
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "United States of America", 79.25f, 
            1.980f, 8, 6);

        System.out.println("\n********* Base parameters **********************");
        outputJaggerFields(jaeger1);
        jaeger1.useVortexCannon();

        System.out.println();
        
        outputJaggerFields(jaeger2);
        jaeger2.move();

        System.out.println("\n********* Parameters after upgrade *************");
        jaeger1.setArmor(10);
        jaeger2.setHeight(74.4f);

        outputJaggerFields(jaeger1);
        System.out.println();
    
        outputJaggerFields(jaeger2);

    }

    public static void outputJaggerFields(Jaeger jaeger) {
        System.out.println("====== Jaeger '" + jaeger.getModelName() + "'");
        System.out.println("Mark: " + jaeger.getMark());
        System.out.println("Origin: " + jaeger.getOrigin());
        System.out.println("Height: " + jaeger.getHeight());
        System.out.println("Weight: " + jaeger.getWeight());
        System.out.println("Strength: " + jaeger.getStrength());
        System.out.println("Armor: " + jaeger.getArmor());
    }

}