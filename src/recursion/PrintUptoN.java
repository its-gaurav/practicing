package recursion;

public class PrintUptoN {
    public static void main(String[] args) {
        // print 1 to 10 using recursion
        int n = 10;
        print(n);
        // print 1 to 10 in reverse using recursion
        System.out.println("printing in reverse");
        printReverse(n);
    }

    static void print(int n) {
        if (n==0) {
            return;
        }
        print(n-1); // hypothesis - print(n-1) will print all elements from 1 to n-1
        System.out.println(n); // induction
    }

    static void printReverse(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n); // induction - things to do in this recursion call
        printReverse(n-1); // hypothesis - print(n-1) will print all elements from n-1 to 1
    }
}
