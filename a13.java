public class a13 {
    public void remove(String str) {
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                depth = depth + 1;
                if (depth != 1) {
                    sb.append(ch);
                } else {
                    continue;
                }

            } else if (ch == ')') {
                depth = depth - 1;
                if (depth == 0) {
                    continue;
                } else {
                    sb.append(ch);

                }

            }

        }

    }

}

class maindee {
    public static void main(String[] args) {
        a13 gt = new a13();
        String str = "(()())(())(()(()))";
        gt.remove(str);
    }
}