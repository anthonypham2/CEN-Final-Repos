import java.util.ArrayList;
import java.util.Scanner;

class todo {
    public ArrayList<String> todoItem;

    public todo() {
        this.todoItem = new ArrayList<>();
    }

    public void addToDoItem(String addItem) {
        todoItem.add(addItem);
    }

    public void deleteToDoItem(String deleteItem) {
        todoItem.remove(deleteItem);
    }

    public void viewToDoList() {
        System.out.println("Items list: \n)");
        for (int i = 0; i < todoItem.size(); i++) {
            System.out.println(i + 1 + ") " + todoItem.get(i));
        }
    }
}

public class simpleToDoApplication {
    public static void main(String[] args) {
        todo todoList = new todo();
        boolean toContinue = true;
        Scanner userInput = new Scanner(System.in);

        while (toContinue) {
            System.out.println("1) Add item: \n"
                    + "2) Delete item: \n"
                    + "3) View items\n"
                    + "\nPick an option (Enter 1-3): ");
            int userOption = userInput.nextInt();
            userInput.nextLine();
            if (userOption == 1) {
                System.out.print("Input item: \n");
                String pushItem = userInput.nextLine();
                todoList.addToDoItem(pushItem);
            } else if (userOption == 2) {
                System.out.print("Enter item to be deleted: \n");
                String deleteItem = userInput.nextLine();
                todoList.deleteToDoItem(deleteItem);
            } else if (userOption == 3) {
                todoList.viewToDoList();
                System.out.print("Enter 0 to exit or any other number to continue. ");
                int listOption = userInput.nextInt();
                userInput.nextLine();
                if (listOption == 0) {
                    toContinue = false;
                }
            } else {
                System.out.println("\nError: Try again.");
            }
        }
    }
}