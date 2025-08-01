package ch03_array;

public class Array01 {
    public static void main(String[] args) {
        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "정국";
        bts[2] = "제이홉";
        bts[3] = "RM";
        bts[4] = "뷔";
        bts[5] = "슈가";
        bts[6] = "지민";

        for (int i = 0; i < bts.length; i++) {
            System.out.println("bts[" + i + "] = " + bts[i]);
        }

        for (int i = 0; i < bts.length; i++) {
            if (i != 6) {
                System.out.print(bts[i] + ", ");
            } else {
                System.out.print(bts[i]);
            }
        }
        System.out.println();
    }
}