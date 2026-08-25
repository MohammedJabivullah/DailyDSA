import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Problem 412. Fizz Buzz

//Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.
//https://leetcode.com/problems/fizz-buzz/description/

public class FizzBuzz {
    public List<String> fizzBuzzMethod(int n){
        List<String> answers = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                answers.add("FizzBuzz");
            }else if(i%3==0){
                answers.add("Fizz");
            }else if(i%5==0){
                answers.add("Buzz");
            }else{
                answers.add(String.valueOf(i));
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();

         FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> fizzBuzzList = fizzBuzz.fizzBuzzMethod(num);
        System.out.print("\n[");
        for(String s : fizzBuzzList){

            System.out.print( " \""+s+"\"");
        }
        System.out.print(" ]");

    }
}
