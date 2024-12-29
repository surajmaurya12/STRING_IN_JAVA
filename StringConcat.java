public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "I am Ajju Maurya ";
        String str3 = "I am a software developer";
        System.out.println("Add Str1 & Str2 String : " + (str1 + str2));
        System.out.println("Add Str1 & Str2 & Str3 String : " + (str1 + str2 + str3));
        // Add string with Method
        System.out.println("Add Str1 & Str2 String using Method : " + str1.concat(str2));
        System.out.println("Add Str1 & Str2 & Str3 String using Method : " + str1.concat(str2.concat(str3)));
        System.out.println("Length of whole String : " + str1.concat(str2.concat(str3)).length());
    }
}
