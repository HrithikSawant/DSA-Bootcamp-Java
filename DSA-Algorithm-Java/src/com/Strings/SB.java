package com.Strings;
//String Builder
public class SB {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 26; i++) {
//            char ch =(char) ('a' + i);
//            builder.append(ch);
//        }
//        System.out.println(builder.toString());

        System.out.println(  canBePalindrome(4,"abca"));
    }


    public static int canBePalindrome(int n, String s) {
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            if(isPalindrome(addChar(s,ch,n-1))){
                return 1;
            }
        }
        return 0;
    }

    public static String addChar(String str, char ch, int position) {
        int len = str.length();
        char[] updatedArr = new char[len + 1];
        str.getChars(0, position, updatedArr, 0);
        updatedArr[position] = ch;
        str.getChars(position, len, updatedArr, position + 1);
        return new String(updatedArr);
    }

    public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        for (int i = 0; i < str.length() / 2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }


}
