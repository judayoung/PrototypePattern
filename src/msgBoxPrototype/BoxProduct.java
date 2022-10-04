package msgBoxPrototype;

public class BoxProduct implements ProductPrototype {

    private char boxChar;

    public BoxProduct(char boxChar) {
        this.boxChar = boxChar;
    }

    @Override
    public ProductPrototype createClone() {
        ProductPrototype product = null;
        try {
            product = (ProductPrototype) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public void use(String msg) {
        int msgLength = msg.getBytes().length;
        System.out.println(Character.toString(boxChar).repeat(msgLength + 2));
        System.out.println(boxChar + msg + boxChar);
        System.out.println(Character.toString(boxChar).repeat(msgLength + 2));
        System.out.println();
    }

}
