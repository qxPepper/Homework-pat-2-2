public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String result1 = bins.sum("100", "1001");
        System.out.println(result1);

        String result2 = bins.mult("100", "10");
        System.out.println(result2);
    }
}
