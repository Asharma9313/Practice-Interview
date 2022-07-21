public class Interview2 {
    public static void main(String[] args) {

        int num = 123;
        int sumOfDigit = 0;
        while(num>0){
            sumOfDigit+=num/10;
            num = num%10;
        }
        System.out.println(sumOfDigit);

    }
}
