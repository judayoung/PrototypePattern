package msgBoxPrototype;

public interface ProductPrototype extends Cloneable {

    ProductPrototype createClone();

    void use(String msg);

}
