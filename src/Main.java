public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int q = add(3, 7);
        System.out.println("q = " + q);

        int p = sub(7, 3);
        System.out.println("p = " + p);
    }

    static int add(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }
}