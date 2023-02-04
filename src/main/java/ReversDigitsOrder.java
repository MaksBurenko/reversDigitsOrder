
public class ReversDigitsOrder {
    public static int revers (int number){

        String str = String.valueOf(number);
        char[] array = str.toCharArray();
        StringBuilder sum = new StringBuilder();

        for(int i = array.length-1; i >= 0 ; i--){
            sum.append(array[i]);
        }

        return  Integer.parseInt(sum.toString());
    }

    public static int reversShort (int number){
        String str = String.valueOf(number);
        String s = new StringBuilder(str).reverse().toString();
        int result = Integer.parseInt(s);
        return result;
    }

    public static int usingNumber (int number){
        int result = 0;
        do{
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;

        } while(number > 0);
        return result;
    }
}
