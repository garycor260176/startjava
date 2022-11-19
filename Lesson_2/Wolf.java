public class Wolf {
    private boolean maleGender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public void setGender(boolean gender) {
        this.maleGender = gender;
    }

    public boolean getGender() {
        return maleGender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}