package HW_3;

public class Fruit {
    String type;
    float weight;

    public Fruit(String type, float weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + type + '\'' +
                '}';
    }

    public float getWeight() {
        return weight;
    }
}
