class HelloWorld {
    public static void main(String[] args) {
        boolean result = isPalindrome("RADAR");
        System.out.println(result);
    }
    
    public static boolean isPalindrome(String palindrome) {
        String nstr = "";
        
        // Reverse the input string
        for(int i = 0; i < palindrome.length(); i++) {
            char ch = palindrome.charAt(i); 
            nstr = ch + nstr;
        }
        
        // Compare the reversed string with the original one
        if (nstr.equals(palindrome)) {
            System.out.println("The string is a palindrome: " + palindrome);
            return true;
        } else {
            System.out.println("The string is not a palindrome: " + palindrome);
            return false;
        }
    }
}
