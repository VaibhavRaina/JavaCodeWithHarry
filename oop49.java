import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class Book{
     Book(){
         System.out.println("WELCOME");
        System.out.println("This is a online library to which you can add book issue and return your taken books !!");
        System.out.println("Use '1' to Add a book in library ");
        System.out.println("Use '2' to Return a book in library ");
        System.out.println("Use '3' to Issue a book in library ");
        System.out.println("You can also issue availiable books in Stock !! ");
        
    }
    Scanner scc= new Scanner(System.in);
    ArrayList <String> b1= new ArrayList<>();
         ArrayList <String> a1= new ArrayList<>();
         ArrayList <String> l1= new ArrayList<>();
    public void BookName(){
        
        System.out.println("Enter the numnber of books you want to add");
        int n=scc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the book NO. "+i);
            System.out.println(" ");
            b1.add(scc.nextLine());
            System.out.print("Enter the AUTHOR Of Book NO. "+i);
            System.out.println(" ");
            a1.add(scc.nextLine());

        }
        
    }

    public void Issue(){
       
        System.out.println("Now Displaying Issuable Books and Author");
        b1.add("To Kill a Mockingbird");
        b1.add("1984" );
        b1.add("The Great Gatsby");
        b1.add("Pride and Prejudice" );
        b1.add("The Lord of the Rings" );
        a1.add("Harper Lee");
        a1.add(" George Orwell");
        a1.add("F. Scott Fitzgerald");
        a1.add("Jane Austen");
        a1.add(" J.R.R. Tolkien");
        for(int i=0;i<a1.size();i++){
            System.out.println("The Position of book in Matrix is "+a1.indexOf(a1));
            System.out.println("The Name of Book No. "+(i+1)+a1.get(i)+"And AUTHOR IS "+b1.get(i));
        }
        System.out.println("Enter the postion of book you want to issue by mentioning the MATRIX POSITION ELSE IT WILL GENERATE AN ERROR");
        System.out.println("Enter the number of books you want to Issue");
        int n=scc.nextInt();
        for(int i=0;i<n;i++){
             System.out.print("Enter the book NO. "+i);
            l1.add(a1.get(scc.nextInt()));
        }
        
         System.out.println("Issued Books are "+l1);
        

    }
    public void ReturnBook(){
          
        System.out.println("Enter the numnber of books you want to Return");
        int n=scc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the book NO. "+i);
            System.out.println(" ");
            b1.add(scc.nextLine());
            System.out.print("Enter the AUTHOR Of Book NO. "+i);
            System.out.println(" ");
            a1.add(scc.nextLine());

    }
    System.out.println("Returned Books + Added Books + Previous Books are "+a1);
}

public class oop49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter the Number corresponding to the task you want to perform");
        int s=sc.nextInt();
         LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);


        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dd=dt.format(df);

        while(true){
    
          switch (s) {
                case 1:
                book.BookName();
                break;
                  

                case 2:
                 System.out.println("Enter your name for ISSUING the Book");
                 String name=sc.nextLine();
                 book.Issue();
                 System.out.println("The above Books are Issued By "+name+"AT DATE"+dd);

                
                   
                    

                case 3:
                book.ReturnBook();
                 

                default:
                    System.out.println("Please try again and enter a valid input.");
            }
        }

        
        

    }

 
}
}
