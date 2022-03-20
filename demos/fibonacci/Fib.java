public class Fib {
    private final int n;
    public Fib(int n) {
        this.n = n;
    }

    public int get() {
        if (this.n <= 0) return 0;
        if (this.n == 1) return 1;

        int n1 = 0;
        int n2 = 1;
        int cnt = 1;

        while(cnt <= this.n) {
            int tmp = n2;
            n2 += n1;
            n1 = tmp;
            cnt++;
        }

        return n1;
    }

    public static int fibRecur(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return Fib.fibRecur(n-1) + Fib.fibRecur(n-2);
    }
}
