public class UnaryOperators{
    public static void main(String[] args) {
        int p = 7;
        int q = 5;

        System.out.println(++p); //8
        System.out.println(p); //8

        System.out.println(++q); //6
        System.out.println(q); //6

        System.out.println(p++); //8
        System.out.println(p); //9

        System.out.println(q++); //6 
        System.out.println(q); //7
    }
}