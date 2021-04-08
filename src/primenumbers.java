public class primenumbers {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            if (((i == 2) || (i == 3) || (i ==5) || (i == 7)) || ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0))) {
                System.out.print(i + " ");
            }
        }
    }
}
