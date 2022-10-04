package prototype;

import prototype.BreadMachine;
import prototype.BreadPrototype;
import prototype.CheeseBread;
import prototype.Topping;


public class PrototypeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int breadCount = 5;
        System.out.println("Let's make " + breadCount + " Breads by type.");
        System.out.println();

        /**
         * deep copy vs swallow copy
         * 1. deep copy : 새로운 객체를 만듬 + 객체가 참조하고 있는 객체도 새로 만듬
         * 2. swallow copy : 새로운 객체를 만듬 + 객체가 참조하고 있는 객체는 있는 객체를 가져다씀(주소값이 같다.)
         *      -> clone()
         *      -> 객체가 참조하고 있는 객체 변경시, 원본과 모든 복제품에 적용되어 버린다.
         * */
        System.out.println("----Let's see if clone is swallow copy...");
        BreadPrototype breadPrototype = new BreadPrototype("bread Prototype", 0, 0, 0, new Topping(null, null));
        BreadPrototype copyBreadPrototype = (BreadPrototype) breadPrototype.clone();
        copyBreadPrototype.getTopping().setTopping1("chocolate");
        System.out.println("Topping chocolate to original bread");
        System.out.println("original bread : " + breadPrototype);
        System.out.println("copied bread : " + copyBreadPrototype);
        int i1 = breadPrototype.getTopping().hashCode();
        int i2 = copyBreadPrototype.getTopping().hashCode();
        System.out.println("original bread's Topping hashcode : " + i1);
        System.out.println("copied bread's Topping hashcode : " + i2);
        System.out.println("Toppings Are equal? " + (i1 == i2));
        System.out.println();

        /**
         * 프로토타입 미사용시
         * */
        System.out.println("----If not using Prototype...");
        System.out.println("---- instance = new CheeseBread(param, param, param);");
        for (int i = 0; i < breadCount; i++) {
            // 생성시 생성자에 맞춰 input 값을 입력해야 한다.
            BreadPrototype cheeseBread = new CheeseBread(600, 180, 30);
            cheeseBread.setTime(i * 10);
            System.out.println(cheeseBread + " hashCode : " + cheeseBread.hashCode());
        }
        System.out.println();

        /**
         * 프로토타입 사용시
         * */
        System.out.println("----If using Prototype...");
        System.out.println("---- instance = prototype.clone();");
        BreadPrototype cheeseBreadPrototype = new CheeseBread(600, 180, 30);
        BreadMachine cheeseBreadMachine = new BreadMachine(cheeseBreadPrototype);
        for (int i = 0; i < breadCount; i++) {
            // 불필요한 input 값을 생략한다.
            BreadPrototype cheeseBread = cheeseBreadMachine.makeBread();
            cheeseBread.setTime(i * 10);
            System.out.println(cheeseBread + " hashCode : " + cheeseBread.hashCode());
        }

        /**
         * 프로토타입을 사용하는 경우
         * 1. DB에서 빈번하게 데이터를 가져올 때, 그 데이터가 항상 똑같은 값을 반환하는 경우?
         *
         * 프로토타입의 특징
         * - 생성자 동작 처리 배제
         * - 기존 객체 생성 방법을 몰라도 사용 가능
         * - 적은 자원 소모로 객체 대량 생산
         * - 유사 객체 사용시 유용
         * */

    }

}
