public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right && (Character.isLetterOrDigit(s.charAt(right))) != (Character.isLetterOrDigit(left))) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            if (Character.toLowerCase(s.charAt(right)) != (Character.toLowerCase(s.charAt(left)))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}