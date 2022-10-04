package prototype;

public class BreadMachine {
    private BreadPrototype breadPrototype;

    public BreadMachine(BreadPrototype breadPrototype){
        this.breadPrototype = breadPrototype;
    }

    /**
     * 복제된 객체 반환
     * */
    public BreadPrototype makeBread(){
        return (BreadPrototype) breadPrototype.clone();
    }
}
