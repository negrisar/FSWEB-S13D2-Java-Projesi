public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("--------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("--------------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);

        char[] digits = String.valueOf(num).toCharArray();
        String reversed = "";

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }

        return Integer.parseInt(reversed) == num;

    }

    public static boolean isPerfectNumber(int num) {
        if(num <= 0) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i<= num/2; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        return num == sum;
    }

    public static String numberToWords(int num) {
        if(num < 0){
            return "Invalid Value";
        }
        String text = "";
        char[] numArray = String.valueOf(num).toCharArray();
        for(char digit: numArray) {
            switch (digit){
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }

        return text;
    }

}