public class a7 {
    private int age;

    public void set(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

    public void get() {
        System.out.println(age);
    }

}

class mainsdeeaaz {
    public static void main(String[] args) {
        a7 hy = new a7();
        hy.set(12);
        hy.get();
    }
}