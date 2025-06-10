package Math.Maths;

public class NPrimeNumber {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
        System.out.println(Math.sqrt(34));
    }

    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
            for (int j = 2; j <= n; j++) {
                if(!primes[j]){
                    System.out.print(j+" ");
                }
            }
    }
}
