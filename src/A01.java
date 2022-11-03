import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.println("please enter the first number");
        int firstNumber = scan.nextInt();
        System.out.println("please enter the second number");
        int secondNumber = scan.nextInt();
        int numberSumm =0;
        if (firstNumber<secondNumber){
            for (int i = firstNumber; i <=secondNumber ; i++) {
                numberSumm =numberSumm+i;

            }
            System.out.println(numberSumm);
        }else {
            for (int i = firstNumber; i >=secondNumber ; i--) {
                numberSumm+=i;

            }
            System.out.println(numberSumm);
        }*/
        //faktoriyelHesaplama(6);
        fizzBuzzYazdirma(21);

    }
    public static void faktoriyelHesaplama(int input){
        int carpim =1;
        for (int i = input; i >=1 ; i--) {
            carpim*=i;


        }
        System.out.print(input+"faktoriyel : "+carpim);
    }
    public static void fizzBuzzYazdirma (int value){
        for (int i = 1; i <=value ; i++) {
            if (i%3==0&&i%5==0){
                System.out.print(" fizzBuzz ");
            } else if (i%3==0) {
                System.out.print(" fizz ");

            } else if (i%5==0) {
                System.out.print(" buzz ");

            }else {
                System.out.print(i+" ");
            }

        }
    }








}
