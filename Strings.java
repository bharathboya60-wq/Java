public class Strings {
    public static void main(String[] args) {
        String str = "Validateded the $100";
        System.out.println(str);
        System.out.println(str.getClass());
        System.out.println(str.charAt(3));
        int l = str.length();
        String Es = "";
       System.out.println(str.indexOf("$uy"));
        for(int i = l-1; i>-1; i--){
            Es = Es + str.charAt(i);
        }
        System.out.println(Es);

    }

}
