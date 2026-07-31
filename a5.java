import java.util.Stack;

class a5 {
    Node head;
    Node tail;

    class Node {
        int length;
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void revrse() {
        Node prev = null;
        Node curren = head;
        while (curren != null) {
            Node next = curren.next;
            curren.next = prev;
            prev = curren;
            curren = next;

        }
        head = prev;
    }

    public void middlelist() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.value);
    }

    public boolean detect() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node sorted(Node head, Node head1) {
        Node temp = head;
        Node temp1 = head1;
        Node dummy = new Node(0);
        Node temp3 = dummy;
        while (temp != null && temp1 != null) {
            if (temp.value >= temp1.value) {
                temp3.next = temp1;
                temp1 = temp1.next;
                temp3 = temp3.next;

            } else if (temp.value < temp1.value) {
                temp3.next = temp;
                temp = temp.next;
                temp3 = temp3.next;
            }
        }
        if (temp != null) {
            temp3.next = temp;
        } else if (temp1 != null) {
            temp3.next = temp1;
        }
        return dummy.next;

    }

    public void remove(int n) {
        if (head == null) {
            return;
        }
        Node fast = head;
        Node slow = head;

        int k = 0;
        while (k < n) {
            fast = fast.next;
            k++;
        }
        if (fast == null) {

            head = head.next;
            return;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
    }

    public boolean palindromLined() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp1 = head;
        Node revered = revrse(slow);
        Node temp2 = revered;
        while (temp2 != null) {
            if (temp1.value != temp2.value) {

                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return true;

    }

    public Node revrse(Node slow) {
        Node curren = slow;
        Node prev = null;
        while (curren != null) {

            Node next = curren.next;
            curren.next = prev;
            prev = curren;
            curren = next;
        }
        slow = prev;
        return slow;

    }

    public Node interscetion(Node a, int x, Node b, int y) {
        int diff = Math.abs(x - y);
        Node temp = a;
        Node temp1 = b;
        if (x > y) {
            int i = 0;
            while (i < diff) {
                temp = temp.next;
                i++;

            }
        } else if (y > x) {
            int i = 0;
            while (i < diff) {
                temp1 = temp1.next;
                i++;

            }
        }
        while (temp != null && temp1 != null) {
            if (temp == temp1) {
                return temp;

            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return null;
    }

    public Node detectcycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Node temp = head;
                Node temp2 = slow;
                while (temp != temp2) {
                    temp = temp.next;
                    temp2 = temp2.next;

                }
                return temp;

            }

        }
        return null;
    }
}

class mainsee {
    public boolean stackparne(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch1 = st.pop();
                if ((ch == '}' && ch1 != '{') || (ch == ']' && ch1 != '[') || (ch == ')' && ch1 != '(')) {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean leapyear(int n) {
        if (n % 400 == 0) {
            return true;
        }
        if (n % 4 == 0 && n % 100 != 0) {
            return true;
        }
        return false;
    }

    public int count(int n, int y) {
        boolean k = false;
        if (y % 400 == 0) {
            k = true;
        }
        if ((y % 4 == 0) && (y % 100 != 0)) {
            k = true;
        }

        if (n == 1) {
            return 31;
        } else if (n == 2 && k) {
            return 29;
        } else if (n == 2 && !k) {
            return 28;
        }
        return -1;

    }

    public boolean coun1(int day, int month, int year) {
        boolean k = false;
        if (month < 1 || month > 12) {
            return false;
        }
        if (year % 400 == 0) {
            k = true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            k = true;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) {
                return true;

            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day >= 1 && day <= 31) {
                return true;
            }
        } else if (month == 2 && k) {
            if (day >= 1 && day <= 29) {
                return true;
            }
        } else {

            if (day >= 1 && day <= 28) {
                return true;
            }
        }
        return false;

    }

    public int totalnumber(int day, int month, int year) {
        if (month > 12) {
            return -1;

        }
        boolean s = leapyear(year);
        int ttal = 0;
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                ttal = ttal + 30;
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                ttal = ttal + 31;

            } else if (i == 2 && s) {
                ttal = ttal + 29;
            } else if (i == 2 && !s) {
                ttal = ttal + 28;
            }

        }
        ttal = ttal + day;
        if (s) {
            int reman = 366 - ttal;
            return reman;
        }

        int reman = 365 - ttal;
        return reman;
    }

    public void dta(int day, int month, int year) {
        boolean k = leapyear(year);
        if (day > 31 || month > 12) {
            System.out.println("invalid values");
            return;
        }
        if (month == 2) {
            if (k) {
                if (day >= 1 && day <= 28) {
                    day = day + 1;

                } else if (day == 29) {
                    day = 1;
                    month = month + 1;
                }
            }

            else {
                if (day >= 1 && day <= 27) {
                    day = day + 1;

                } else if (day == 28) {
                    day = 1;
                    month = month + 1;
                }

            }
        } else {

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 29) {
                    day = day + 1;
                } else if (day == 30 && month != 12) {
                    day = 1;
                    month = month + 1;
                }

            } else {
                if (day >= 1 && day <= 30) {
                    day = day + 1;
                } else if (day == 31 && month != 12) {
                    day = 1;
                    month = month + 1;
                } else if (day == 31 && month == 12) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                }
            }
        }
        System.out.println(day + " " + month + " " + year);

    }

    public void prev(int day, int month, int year) {
        boolean k = leapyear(year);
        if (month == 2) {
            if (k) {
                if (day > 1 && day <= 29) {
                    day = day - 1;
                } else if (day == 1) {
                    day = 31;
                    month = month - 1;
                }
            } else {
                if (day > 1 && day <= 28) {
                    day = day - 1;
                } else if (day == 1) {
                    day = 31;
                    month = month - 1;
                }

            }

        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 1 && day <= 30) {
                    day = day - 1;
                } else if (day == 1) {
                    day = 31;
                    month = month - 1;
                }
            } else {
                if (month == 3 && day == 1 && k) {
                    day = 29;
                    month = month - 1;

                } else if (month == 3 && day == 1 && !k) {
                    day = 28;
                    month = month - 1;
                } else if ((month == 5 || month == 7 || month == 10 || month == 12) && day == 1) {
                    day = 30;
                    month--;
                } else if (day > 1 && day <= 31) {
                    day = day - 1;
                } else if (day == 1 && month != 1) {
                    day = 31;
                    month = month - 1;
                } else if (day == 1 && month == 1) {
                    day = 31;
                    month = 12;
                    year = year - 1;
                }
            }
        }
        System.out.println(day + " " + month + " " + year);
    }

    public int diff(int d, int m, int y) {
        boolean k = leapyear(y);
        int t = 0;
        for (int i = 1; i < m; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                t = t + 30;
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                t = t + 31;

            } else if (i == 2 && k) {
                t = t + 29;
            } else {
                t = t + 28;
            }
        }
        t = t + d;
        return t;

    }

    public int differ(int d1, int m1, int y1, int d2, int m2, int y2) {
        boolean k = leapyear(y1);
        int first = diff(d1, m1, y1);
        int second = diff(d2, m2, y2);
        if (y1 == y2) {
            int answer = Math.abs(first - second);
            return answer;
        }
        int rem = k ? 366 - first : 365 - first;
        int secondspent = second;
        int total = rem + secondspent;
        System.out.println(total);

        for (int i = y1 + 1; i < y2; i++) {
            if (leapyear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        return total;

    }

}

class m11aisd {
    public static void main(String[] args) {

        mainsee k = new mainsee();
        k.diff(31, 12, 2025);

    }

}