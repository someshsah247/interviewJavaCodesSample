package com.learn.basics.palindromcode;

// a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam, mom,  nurses run, etc
// checking palindrom
public class StringPalindrom {

    public static boolean isPalindromWayOne(String original){
        String reverse = "";
        for (int i = original.length()-1; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(reverse.equals(original))
            return  true;
        return false;
    }

    private static boolean isPalindromWayTwo(String original){
        int len = original.length();
        boolean answer = true ;
        for(int i = 0 ; i<= len/2 ; i++){
            if(original.charAt(i) != original.charAt((len-1) -i)){
                answer = false;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(isPalindromWayOne("asdfxrtdhedsxfdsa"));
        System.out.println(isPalindromWayOne("asdffdsa"));
        System.out.println(isPalindromWayOne("asdfxfdsa"));
        System.out.println("===============");
        System.out.println(isPalindromWayTwo("asdfxrtdhedsxfdsa"));
        System.out.println(isPalindromWayTwo("asdffdsa"));
        System.out.println(isPalindromWayTwo("asdfxfdsa"));
    }


}
