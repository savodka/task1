package NewYearBox;

public class Cake extends Staff {
    private String form;

    public Cake(String brand, Double price, Double weight, String form) {
        super(brand, price, weight);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Cake = [" + super.toString() + ", form = " + form + "]";
    }
}
