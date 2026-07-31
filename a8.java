import java.util.*;

class a8 {
    public void longest(String arr[]) {
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int i = 0;
        int j = 0;
        String str = "";
        while (i < first.length() && j < last.length()) {
            char ch = first.charAt(i);
            char ch1 = last.charAt(j);
            if (ch == ch1) {
                str = str + ch;
            } else {
                break;
            }
            i++;
            j++;
        }
        System.out.println(str);

    }
}

class mainde {
    public static void main(String[] args) {
        a8 gt = new a8();
        String sr[] = { "flower", "fly", "flattimg" };
        gt.longest(sr);

    }
}