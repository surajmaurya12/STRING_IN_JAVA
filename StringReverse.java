public class StringReverse {
    public static void main(String[] args) {
        String str = "Ajju Maurya";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }

}
