import java.util.Scanner;

class Stack{

    int[] insert(int stack[], int top, int e){
        stack[top] = e;
        return stack;
    }

    int pop(int stack[], int top){
        System.out.println("Item popped = "+stack[top]);
        top--;
        return top;
    }

    void display(int stack[], int top){
        for(int i = 0; i <= top; i++)
            System.out.print(stack[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Stack size: ");
        int n = sc.nextInt();
        int choice;

        int stack[] = new int[n];
        int top = -1;

        Stack obj = new Stack();

        do{

            System.out.println("--- Stack Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Pop / Delete");
            System.out.println("3. Display");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            // INSERT Function
            if(choice == 1){

                if(top == n){
                    System.out.println("Stack is full...");
                    continue;
                }
                top++;
                System.out.print("Enter element to be inserted: ");
                int e = sc.nextInt();
                stack = obj.insert(stack, top, e);
            }

            // POP Function
            else if(choice == 2){
                if(top == -1){
                    System.out.println("Stack is empty...");
                    continue;
                }
                top = obj.pop(stack, top);
            }

            // DISPLAY Function
            else if(choice == 3){
                if(top == -1)
                    System.out.println("Stack is empty!");
                obj.display(stack, top);
            }

            else if(choice == 0)
                System.out.println("Exitting...");
            
            else System.out.println("Choice doesn't exist :(");

        }while(choice !=0);

        sc.close();
    }
}