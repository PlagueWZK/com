package wzk.test;

public class Main {
    public static void main(String[] args) {
        String str;
        int count = 0;
        for (int i = 1;i <= 2020;i++ ) {
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '2') count++;
            }
        }
        System.out.println(count);
    }
}
