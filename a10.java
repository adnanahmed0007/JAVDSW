public class a10 {

    public int overload(int a, int c) {
        return a + c;

    }

    public int overload(String d, int e) {
        return e;

    }

    public int overload(int a, int b, int c) {
        return b + c + a;
    }

    public boolean overload(int a) {
        return false;
    }

}

class maij {
    public static void main(String[] args) {
        a10 ji = new a10();
        boolean k = ji.overload(1);
        System.out.println(k);

    }

}
