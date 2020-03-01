import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2;
        str1 =scanner.nextLine();
        str2 = scanner.nextLine();
        str2 = str2.replaceAll(" ","");
        str1 = str1.replaceAll(" ","");
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1 +'\n'+str2 + '\n' + str3);
    }
}