import java.util.Scanner;

public class ashray {
    public class Book{
        int BookId;
        String Title;
        String Author;
    }
    public class IssuedBook extends Book{
        String IssueDate;
        String ReturnDate;
    }
    public void main(String[] args){
        IssuedBook a = new IssuedBook();
        System.out.println("Enter details of Book\n Book Id:");
        Scanner sc = new Scanner(System.in);
        a.BookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Title:");
        a.Title = sc.nextLine();
        System.out.println("Author:");
        a.Author = sc.nextLine();
        System.out.println("Issue Date:");
        a.IssueDate = sc.nextLine();
        System.out.println("Return Date:");
        a.ReturnDate = sc.nextLine();

        System.out.println("BOOK DETAILS\nBOOK ID:\t"+a.BookId+"\nTITLE:\t"+a.Title+"\nAuthor:\t"+a.Author+"\nISSUE DATE:\t"+a.IssueDate+"\nReturn Date:\t"+a.ReturnDate);



    }
