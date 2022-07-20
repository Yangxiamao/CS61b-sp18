public class getMaxInt {
    public static int max(int[] m) {
        int maxnum = m[0];
        for (int n : m) {
            if (n>maxnum){
                maxnum = n;
            }
        }
        return maxnum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
