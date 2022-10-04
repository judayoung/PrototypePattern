package msgBoxPrototype;

import java.util.HashMap;

public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String productName, ProductPrototype product){
        showcase.put(productName, product);
    }

    public ProductPrototype getCloneProduct(String productName){
        ProductPrototype product = (ProductPrototype) showcase.get(productName);
        return product.createClone();
    }

}
