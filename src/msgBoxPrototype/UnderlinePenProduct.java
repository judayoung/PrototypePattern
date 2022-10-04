package msgBoxPrototype;

import java.nio.charset.StandardCharsets;

public class UnderlinePenProduct implements ProductPrototype {

    private char underlineChar;

    public UnderlinePenProduct(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public ProductPrototype createClone() {
        ProductPrototype product=null;
        try{
            product = (ProductPrototype) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }

    // 밑줄을 긋는다.
    @Override
    public void use(String msg) {
        int msgLength = msg.getBytes().length;
        System.out.println(msg);
        System.out.println(Character.toString(underlineChar).repeat(msgLength));
        System.out.println();
    }

}
