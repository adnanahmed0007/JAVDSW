import java.util.*;

class a4 {
    public void twosum(int arr[], int target) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        boolean k1 = false;
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(target - arr[i])) {
                int k = map1.get(target - arr[i]);
                k1 = true;
                System.out.print("we got" + " " + i + " " + k);
                break;
            } else {
                map1.put(arr[i], i);
            }
        }
        if (!k1) {
            System.out.println("we could not get the pair");
        }
    }

    public void best(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Integer.min(min, arr[i]);
            max = Integer.max(max, arr[i] - min);
        }
        System.out.println("BUY is " + " " + min + " " + "the profit is " + " " + max);
    }

    public void maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Integer.max(max, sum);
            if (sum < 0) {
                sum = 0;

            }

        }
        System.out.println(max);
    }

    public void mozezer(int arr[]) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            } else {
                i++;
            }
        }
        for (int value : arr) {
            System.out.println((value));
        }
    }

    public void merge(int arr[], int m, int arr2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (arr[i] < arr2[j]) {
                arr[k] = arr2[j];
                k--;
                j--;

            } else {
                arr[k] = arr[i];
                k--;
                i--;
            }

        }
        while (j >= 0) {
            arr[k] = arr2[j];
            j--;
            k--;
        }
        while (i >= 0) {
            arr[k] = arr[i];
            i--;
            k--;
        }
        for (int value : arr) {
            System.out.println(value);
        }

    }

    public boolean duplicate(int num[]) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int value : num) {
            if (set1.contains(value)) {
                return true;
            }
            set1.add(value);
        }
        return false;
    }

    public int majority(int arr[]) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i])) {
                int h = map1.get(arr[i]);
                int og = h + 1;
                map1.put(arr[i], og);
            } else {
                map1.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {

            int h = map1.get(arr[i]);
            if (h > arr.length / 2) {
                return arr[i];
            }

        }
        return -1;
    }

    public int removeDuplicate(int arr[]) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
            i++;
        }
        return j + 1;

    }

    public int missing(int arr[]) {
        int sum = 0;
        for (int value : arr) {
            sum = sum + value;
        }
        int n = arr.length;
        int sum2 = (n * (n + 1)) / 2;
        return sum2 - sum;

    }

    public int count(int arr[], int val) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }

        return j;

    }

    public boolean anagram(String s, String s1) {
        int count[] = new int[26];
        if (s.length() != s1.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch1 = s1.charAt(i);
            count[ch - 'a']--;
            count[ch1 - 'a']++;

        }
        for (int value : count) {
            if (value != 0) {
                return false;
            }
        }
        return true;

    }

    public String commomprefix(String arr[]) {
        Arrays.sort(arr);
        String s = arr[0];
        String s1 = arr[arr.length - 1];
        int i = 0;
        int j = 0;
        String s2 = "";
        while (i < s.length() && j < s1.length()) {
            char ch = s.charAt(i);
            char ch1 = s1.charAt(j);
            if (ch == ch1) {
                s2 = s2 + ch;

            } else {
                break;
            }
            i++;
            j++;
        }
        return s2;
    }

    public char[] revrse(char ch[]) {
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return ch;

    }

    public boolean palindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if (!Character.isLetterOrDigit(ch)) {
                i++;
                continue;

            }
            if (!Character.isLetterOrDigit(ch1)) {
                j--;
                continue;

            }

            if (ch != ch1) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public String reverseword(String s) {
        String arr[] = s.split("\\s+");
        String s1 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            s1 = s1 + arr[i] + " ";

        }
        return s1.trim();
    }

    public boolean isomorphic(String s, String s1) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < s1.length()) {
            char ch = s.charAt(i);
            char ch1 = s1.charAt(j);
            if (map1.containsKey(ch)) {
                char ch2 = map1.get(ch);
                if (ch2 != ch1) {
                    return false;
                }

            } else {
                map1.put(ch, ch1);
            }
            i++;
            j++;
        }

        int i1 = 0;
        int j1 = 0;
        while (i1 < s.length() && j1 < s1.length()) {
            char ch = s.charAt(i1);
            char ch1 = s1.charAt(j1);
            if (map2.containsKey(ch1)) {
                char ch2 = map2.get(ch1);
                if (ch2 != ch) {
                    return false;
                }

            } else {
                map2.put(ch1, ch);
            }
            i1++;
            j1++;
        }
        return true;

    }

    public int first(String arr) {
        int count[] = new int[26];
        for (int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            if (count[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int strst(String hasystick, String needle) {
        for (int i = 0; i <= hasystick.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && (hasystick.charAt(i + j) == needle.charAt(j))) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public void largest(String str) {
        int i = 0;
        int j = 0;
        HashSet<Character> set1 = new HashSet<>();
        int maxlen = 0;
        while (j < str.length()) {
            while (set1.contains(str.charAt(j))) {

                set1.remove(str.charAt(i));
                i++;

            }

            set1.add(str.charAt(j));
            maxlen = Math.max(set1.size(), maxlen);
            j++;

        }
        System.out.print(maxlen);
    }

    public void Groupanagram(String arr[]) {
        HashMap<String, ArrayList<String>> map1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String jk = arr[i];
            char ch[] = jk.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if (map1.containsKey(sorted)) {
                map1.get(sorted).add(jk);

            } else {
                ArrayList<String> list1 = new ArrayList<>();
                list1.add(jk);
                map1.put(sorted, list1);
            }

        }
        System.out.println(map1);
    }

    public void binary(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                System.out.println("we got the number" + " " + arr[mid]);
                break;
            }
        }
    }

    public int binaryelement(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                return mid;
            }
        }
        return low;
    }

    public int peakelement(int arr[]) {
        int i = arr.length - 2;
        while (i >= 1) {
            int first = arr[i - 1];
            int second = arr[i + 1];
            if (arr[i] > first && arr[i] > second) {
                return i;

            }
            i--;

        }
        if (arr[0] > arr[1]) {

            return 0;

        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {

            return arr.length - 1;

        }
        return -1;
    }

    public int sortedpart(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else if (arr[high] > arr[mid]) {
                if (arr[high] >= target && target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return -1;

    }

    public int minimum(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr[mid] > arr[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return arr[i];
    }
}

class mainseee {
    public static void main(String[] args) {
        a4 jg = new a4();
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        jg.peakelement(arr);

    }
}