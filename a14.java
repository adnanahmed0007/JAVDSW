public class a14 {
    public String subaa(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int k = Character.getNumericValue(ch);
            if (k % 2 != 0) {
                String k1 = str.substring(0, i + 1);
                return k1;

            }
        }
    }

}

class hbjjkjk {
    public static void main(String[] args) {
        a14 v = new a14();
        v.subaa("35427");

    }
}