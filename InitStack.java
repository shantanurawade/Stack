import java.util.Scanner;

public class InitStack {
    public void init(){
    Stack stack = new Stack();
        System.out.println("Welcome to implementation of Stack.");
    int flag = 1;
        while (flag == 1) {
            System.out.println("1.To push data into Stack.");
            System.out.println("2.To pop data from Stack.");
            System.out.println("3.To peek data from Stack.");
            System.out.println("4.To add data at bottom of Stack.");
            System.out.println("5.Reverse Stack.");
            System.out.println("6.Exit.");
            System.out.print("-->");
            Scanner userChoise = new Scanner(System.in);
            int userChoice = userChoise.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("1. For Push.");
                    int data = userChoise.nextInt();
                    stack.push(data);
                }case 2 -> stack.pop();
                case 3 -> stack.peek();
                case 4 -> {
                    System.out.println("Enter data which you want to add at bottom.");
                    int data = userChoise.nextInt();
                    stack.addToBottom(data);
                }case 5 -> {
                    System.out.println("Reversing Stack");
                    stack.reverse();
                }
                case 6 -> flag = 0;
                default -> System.out.println("Enter valid input.");
            }
        }
    }
}