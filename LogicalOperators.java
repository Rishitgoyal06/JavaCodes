public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a < b && c < d); // true
        System.out.println(a < b && c > d); // false
        System.out.println(a > b && c < d); // false
        System.out.println(a > b && c > d); // false
        System.out.println(a < b || c < d); // true
        System.out.println(a < b || c > d); // true
        System.out.println(a > b || c < d); // true
        System.out.println(a > b || c > d); // false
        System.out.println(!(a < b)); // false
        System.out.println(!(a > b)); // true
    }
    }

