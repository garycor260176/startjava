public class Wolf {
    private boolean maleGender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public void setGender(boolean value){
        maleGender = value;
    }
    public boolean getGender(){
        return maleGender;
    }

    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }

    public void setWeight(float value){
        weight = value;
    }
    public float getWeight(){
        return weight;
    }

    public void setAge(int value){
        if(value > 8) {
            System.out.println("Некорректный возраст");
            return;
        }
        age = value;
    }
    public int getAge(){
        return age;
    }

    public void setColor(String value){
        color = value;
    }
    public String getColor(){
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