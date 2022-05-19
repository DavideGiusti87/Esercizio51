import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Switch 02
Exercise: Switch Statement 2

create a List of string called list
keep asking the user to input a string infinite times
if the entered value is:
size - print the size of the list
clear - remove all the elements from the list
print - print the list
in all the other cases, add the value to list
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String string;

        while (true){
            System.out.println("\nEnter a phrase or word and hit enter.\n" +
                    "write size to know the size of the list\n" +
                    "write clear to remove all items from the list\n" +
                    "write print to know the composition of the list");
            string = scanner.nextLine();

            switch (string){
                case "size" -> System.out.println("The elements in the list are: "+list.size());
                case "clear" -> {
                    list.clear();
                    System.out.println("The list has been emptied");
                }
                case "print" -> System.out.println("The items in the list are: "+list.toString());
                default -> list.add(string);
            }

        }
    }
}
