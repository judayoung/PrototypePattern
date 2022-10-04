package msgBoxPrototype;

public class ProductPrototypeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's register Product and get Clone Product");
        System.out.println();

        // 1. Manager 생성
        Manager manager = new Manager();

        // 2. 각 Product 생성 및 등록
        ProductPrototype underlinePen = new UnderlinePenProduct('=');
        ProductPrototype warningBox = new BoxProduct('*');
        ProductPrototype ballBox = new BoxProduct('~');
        manager.register("double line", underlinePen);
        manager.register("warning box", warningBox);
        manager.register("ball box",ballBox);

        // 3. Manager 에서 가져와 사용.
        ProductPrototype double_line = manager.getCloneProduct("double line");
        String msg = "Everything you've ever wanted is on the other side of FEAR";
        double_line.use(msg);

        ProductPrototype warning_box = manager.getCloneProduct("warning box");
        msg = "Yesterday is history, Tomorrow is mystery, but TODAY is a gift";
        warning_box.use(msg);

        ProductPrototype ball_box = manager.getCloneProduct("ball box");
        msg = "A day without laughter is a day wasted";
        ball_box.use(msg);
    }

}
