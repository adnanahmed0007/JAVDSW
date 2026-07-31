
class main87 {
    String name = "knjkj";

    public void first() {
        System.out.println("jbjkbjk");

    }

    public void first2() {
        System.out.println("jk");

    }

}

class main76 extends main87 {

    public void first() {
        super.name = "adnan";

        System.out.println("a");
    }

    public void first1() {

        System.out.println("b");
    }

}

public class a11 {
    public static void main(String[] args) {
        main87 y = new main87();

        System.out.println(y.name);

    }
}
