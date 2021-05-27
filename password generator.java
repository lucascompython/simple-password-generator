import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner length = new Scanner(System.in);
        System.out.print("Type the length of the password: ");
        int answer = length.nextInt();

        for(int i = 0; i < answer; i++){
            int character = (int)(Math.random() * 93 + 33);
            char ch = (char)character;
            System.out.print(ch);
        }

    }
}