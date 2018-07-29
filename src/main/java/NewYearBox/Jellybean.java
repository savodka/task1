package NewYearBox;

public class Jellybean extends Staff {
    private String color;

    public Jellybean(String brand, Double price, Double weight, String color) {
        super(brand, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Jellybean = [" + super.toString() + ", color = " + color + "]";
    }
}
