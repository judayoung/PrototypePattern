package prototype;

// Cloneable 은 빈 껍데기처럼 되어 있다. 따라서 해당 클래스가 복사 가능하다는 의미만 전달한다.
public class BreadPrototype implements Cloneable {

    private String name;
    private int flourAmount;
    private int degree;
    private int time;
    private Topping topping;

    public BreadPrototype(String name, int flourAmount, int degree, int time, Topping topping) {
        this.name = name;
        this.flourAmount = flourAmount;
        this.degree = degree;
        this.time = time;
        this.topping = topping;
    }

    public BreadPrototype(int flourAmount, int degree, int time) {
        this.flourAmount = flourAmount;
        this.degree = degree;
        this.time = time;
    }

    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public Object clone(){
        try{
            BreadPrototype copy = (BreadPrototype) super.clone();
            return copy;
        }catch (CloneNotSupportedException e){
            // Cloneable 을 구현했기 때문에, 이 블록이 실행될 일은 없다.
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlourAmount() {
        return flourAmount;
    }

    public void setFlourAmount(int flourAmount) {
        this.flourAmount = flourAmount;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Topping getTopping() {
        return topping;
    }



    @Override
    public String toString() {
        return "BreadPrototype{" +
                "name='" + name + '\'' +
                ", flourAmount=" + flourAmount +
                ", degree=" + degree +
                ", time=" + time +
                ", topping=" + topping +
                '}';
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }
}
