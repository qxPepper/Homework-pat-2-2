public class BinOps {
    public String sum(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        int cc = aa + bb;

        return Integer.toBinaryString(cc);
    }

    public String mult(String a, String b) {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        int cc = aa * bb;

        return Integer.toBinaryString(cc);
    }
}