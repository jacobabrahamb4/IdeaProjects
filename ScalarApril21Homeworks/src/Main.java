public class Main {
    public static void main(String[] args) {
        System.out.println("Input: " + 6 + " solutions: " + solve(6));
    }

    public static int solve(int A) {
        int sum = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                if ( i == A/i) sum = sum + i;
                else sum = sum + i + A/i;
                System.out.println(" factor : " + i);
                System.out.println(" Sum : " + sum);
            }
        }

        return A == sum ? 1 : 0;
    }

    public static int print_count_Factors(int N) {
        int count = 0;
        for (int i = 1; i * i < N; i++) {
            if (N % i == 0) {
                if (i == N/i) count = count + 1;
                else count = count + 2;
            }
        }
        return count;
    }


}