import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! I am your AI Chatbot.");

        while (true) {
            System.out.print("You: ");
            String message = sc.nextLine().toLowerCase();

            if (message.equals("hello")) {
                System.out.println("Bot: Hi! How can I help you?");
            } 
            else if (message.equals("how are you")) {
                System.out.println("Bot: I am fine, thank you!");
            } 
            else if (message.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            } 
            else {
                System.out.println("Bot: Sorry, I did not understand that.");
            }
        }

        sc.close();
    }
}