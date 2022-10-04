package prototype;

public class CheeseBread extends BreadPrototype {

    public CheeseBread(int flourAmount, int degree, int time) {
        super(flourAmount, degree, time);
        this.setName("cheese bread");
        this.setTopping(new Topping("cheese", null));
    }

}
