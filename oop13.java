import java.util.Scanner;

class Library{
    int n,r;
    String []book=new String[100];
     String []issue=new String[100];
    Scanner sc = new Scanner(System.in);
    int n1,n2;
    Library(){
        System.out.println("WELCOME");
        System.out.println("This is a online library to which you can add book issue and return your taken books !!");
        System.out.println("Use 'ADD' to Add a book in library ");
        System.out.println("Use 'RETURN' to Return a book in library ");
        System.out.println("Use 'ISSUE' to Issue a book in library ");
        System.out.println("You can also issue availiable books in stock !! ");
    }
    void addbook() {
    System.out.println("Enter the amount of books you want to add");
    n = sc.nextInt();
    sc.nextLine(); // Consume the newline character after reading the integer

    for (int i = 1; i <= n; i++) {
        System.out.println("Enter the name of book " + i + " = ");
        book[i] = sc.nextLine();
    }

    System.out.println("Added Books are as Follows");
    for (int i = 1; i <= n; i++) {
        System.out.println("The added book No. " + i + " = " + book[i]);
    }
}


    void issueBook(){
         for(int i=1;i<=n;i++){
            System.out.println("Displaying book No. "+i+" "+book[i]);

            }
            System.out.println("Enter the number of books you want to issue");
            n1=sc.nextInt();

            for(int i=1;i<=n1;i++){
                 System.out.println("Enter the serial number of book you want to issue");
                issue[i]=book[sc.nextInt()];
            }

            for(int i=1;i<=n1;i++){
                System.out.println("The issued books NO. "+i+" = "+issue[i]);
            }

            
        }

        void defaultBook() {
    String[] bookNames = {
        "To Kill a Mockingbird",
        "1984",
        "The Great Gatsby",
        "Pride and Prejudice",
        "Harry Potter and the Sorcerer's Stone",
        "The Lord of the Rings",
        "The Catcher in the Rye",
        "Animal Farm",
        "The Hobbit",
        "The Chronicles of Narnia"
    };

    for (int i = 0; i < bookNames.length; i++) {
        System.out.println("Displaying book NO." + i);
        System.out.println(bookNames[i]);
    }

    System.out.println("Enter the number of books you want to issue");
    int n2 = sc.nextInt();

    for (int i = 0; i < n2; i++) {
        System.out.println("Enter the serial number of book you want to issue");
        issue[i] = bookNames[sc.nextInt()];
    }

    for (int i = 0; i < n2; i++) {
        System.out.println("The issued books NO. " + i + " = " + issue[i]);
    }
}

        void returnBook(){
            System.out.println("Enter the number of the book you want to return");
            r=sc.nextInt();
            for(int i=0;i<r;i++){
                System.out.print("Enter the name of the book "+i+" you want to return = ");
                book[n+i]=sc.nextLine();
            }
        }
    }

public class oop13 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scc = new Scanner(System.in);
        String user;

        do {
            System.out.println("Enter the command above !!");
            user = scc.nextLine();

            if (user.equalsIgnoreCase("ADD")) {
                library.addbook();
            } else if (user.equalsIgnoreCase("ISSUE")) {
                System.out.println("If you want issue your added books type 'Issue1");
                System.out.println("If you want go back type 'Back' ");
                String user1 = scc.nextLine();

                if (user1.equalsIgnoreCase("ISSUE1")) {
                    library.defaultBook();
                } else if (user1.equalsIgnoreCase("BACK")) {
                    library.issueBook();
                } else {
                    System.out.println("Please Enter correctly !!");
                }
            } else if (user.equalsIgnoreCase("RETURN")) {
                library.returnBook();
            } else {
                System.out.println("Please Enter correctly !!");
            }

        } while (!user.equalsIgnoreCase("EXIT"));
    }
}

        
    
    

