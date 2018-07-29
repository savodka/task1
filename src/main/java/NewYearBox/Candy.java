package NewYearBox;

public class Candy extends Staff {
    private Double size;
    public Candy(String brand, Double price, Double weight, Double size) {
        super(brand, price, weight);
        this.size = size;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy = [" + super.toString() + ", size = " + size + "]";
    }
}
