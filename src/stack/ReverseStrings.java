package stack;
import java.util.Scanner;
public class ReverseStrings {

    public static void main(String[] args){
        String myString = "hello";
        //Scanner scnr = new Scanner(System.in);

        //myString = scnr.nextLine();

        String reversedString = reverseString(myString);

        System.out.println(reversedString);
        //Expected Output 'olleh'
    }

    /*TODO HOMEWORK CREATE THIS METHOD USING STACKS*/
    private static String reverseString(String myString) {
        GenericStack<Character> stringStack = new GenericStack<>();

        for(char c : myString.toCharArray()) {
            stringStack.push(c);
        }
        String reverseString = "";
        while (!stringStack.isEmpty()) {
            reverseString += stringStack.pop();
        }
        return reverseString;
    }

}
