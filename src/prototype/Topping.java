package prototype;

public class Topping {
    private String topping1;
    private String topping2;

    public Topping(String topping1, String topping2) {
        this.topping1 = topping1;
        this.topping2 = topping2;
    }


    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }


    @Override
    public String toString() {
        return "Topping{" +
                "topping1='" + topping1 + '\'' +
                ", topping2='" + topping2 + '\'' +
                '}';
    }
}
