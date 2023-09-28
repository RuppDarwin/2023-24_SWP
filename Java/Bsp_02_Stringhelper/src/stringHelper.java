public class stringHelper {
    public static boolean isPalindrome(String input){
        int length = input.length();
        int i = 0;
        int midle = (input.length() / 2);
        boolean ispalindrome = true;
        int k = length-1;
        for (int j = 0; j <= midle& k>=midle; ++j,--k) {
            if(j==0 & input.charAt(j)=='-'){
                ++j;
            }
            if (input.charAt(j) == input.charAt(k)){
                ispalindrome = true;

            }else{ispalindrome = false;break;}
        }return ispalindrome;
    }
    public static int countLetters(String input){
        int length = input.length();
        return length;
    }
    public static String reverseString(String input){
        String reverse;
        return reverse = new StringBuffer(input).reverse().toString();
    }
    public static String printAmountOfLetters(String input){
        return "tomfoolery";
    }
}
