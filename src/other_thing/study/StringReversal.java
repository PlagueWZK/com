package other_thing.study;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(reversal("012345", 2, 5));
    }

    public static String reversal(String str, int start, int end) {
        char[] cs = str.toCharArray();
        for (int i = start - 1, j = end - 1; i < j; i++, j--) {
            swap(cs,i,j);
        }
        return new String(cs);  
    }

    protected static void swap(char[] cs, int a, int b) {
        char temp = cs[a];
        cs[a] = cs[b];
        cs[b] = temp;
    }
}
