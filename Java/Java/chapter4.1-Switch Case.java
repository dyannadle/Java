public class PairExample {
    public static void main(String[] args) {
        int[] num = {2, 3, 1, 5};
 
        System.out.println("All unique pairs:");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("(" + num[i] + ", " + num[j] + ")");
            }
        }
    }
}
