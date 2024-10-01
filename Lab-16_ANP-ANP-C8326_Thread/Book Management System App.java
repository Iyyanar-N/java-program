import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book {
    // Attributes
    private int bookId;
    private String bookName;
    private double bookPrice;  // Price in Rupees
    private String authorName;
    private boolean availability;
    
    // Static attribute for library name
    private static String libraryName = "City Library";
    
    // Constructor
    public Book(int bookId, String bookName, double bookPrice, String authorName, boolean availability) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.authorName = authorName;
        this.availability = availability;
    }
    
    // Getters
    public int getBookId() {
        return bookId;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public double getBookPrice() {
        return bookPrice;
    }
    
    public String getAuthorName() {
        return authorName;
    }
    
    public boolean isAvailable() {
        return availability;
    }
    
    public static String getLibraryName() {
        return libraryName;
    }
    
    // Setters
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    // Display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: ₹" + bookPrice);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("Library Name: " + libraryName);
        System.out.println();
    }
}

class BookManagementSystem {
    // ArrayList to store books
    private ArrayList<Book> bookList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    // Method to create and add books to the list
    public void createBook() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter Book Name: ");
            String bookName = scanner.nextLine();
            System.out.print("Enter Book Price (in ₹): ");
            double bookPrice = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter Author Name: ");
            String authorName = scanner.nextLine();
            System.out.print("Is the book available? (true/false): ");
            boolean availability = scanner.nextBoolean();
            
            // Create a new book and add to the list
            Book book = new Book(bookId, bookName, bookPrice, authorName, availability);
            bookList.add(book);
            System.out.println("Book added successfully!\n");
        }
    }
    
    // Method to delete a book by its ID
    public void deleteBook() {
        System.out.print("Enter the Book ID to delete: ");
        int bookId = scanner.nextInt();
        
        Iterator<Book> iterator = bookList.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId() == bookId) {
                iterator.remove();
                found = true;
                System.out.println("Book with ID " + bookId + " deleted successfully!\n");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookId + " not found.\n");
        }
    }
    
    // Method to display all books
    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available in the library.\n");
        } else {
            System.out.println("Book details in " + Book.getLibraryName() + ":");
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}

public class BookManagementSystemApp {
    public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Book Management System:");
            System.out.println("1. Add Books");
            System.out.println("2. Delete a Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    system.createBook();
                    break;
                case 2:
                    system.deleteBook();
                    break;
                case 3:
                    system.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}

:--------:
: OUTPUT :
:--------:
Microsoft Windows [Version 10.0.19041.1415]
(c) Microsoft Corporation. All rights reserved.

C:\Users\GANAPATHI>cd\

C:\>cd javalap

C:\Javalap>javac BookManagementSystemApp.java

C:\Javalap>java BookManagementSystemApp
Book Management System:
1. Add Books
2. Delete a Book
3. Display Books
4. Exit
Choose an option: 1

Enter details for Book 1:
Enter Book ID: 101
Enter Book Name: The Alchemist
Enter Book Price (in ₹): 499.99
Enter Author Name: Paulo Coelho
Is the book available? (true/false): true
Book added successfully!

Enter details for Book 2:
Enter Book ID: 102
Enter Book Name: Wings of Fire
Enter Book Price (in ₹): 299.50
Enter Author Name: A.P.J. Abdul Kalam
Is the book available? (true/false): true
Book added successfully!

Enter details for Book 3:
Enter Book ID: 103
Enter Book Name: The Secret
Enter Book Price (in ₹): 350.00
Enter Author Name: Rhonda Byrne
Is the book available? (true/false): false
Book added successfully!

Book Management System:
1. Add Books
2. Delete a Book
3. Display Books
4. Exit
Choose an option: 2

Enter the Book ID to delete: 102
Book with ID 102 deleted successfully!

Book Management System:
1. Add Books
2. Delete a Book
3. Display Books
4. Exit
Choose an option: 3

Book details in City Library:
Book ID: 101
Book Name: The Alchemist
Author Name: Paulo Coelho
Price: ₹499.99
Availability: Available
Library Name: City Library

Book ID: 103
Book Name: The Secret
Author Name: Rhonda Byrne
Price: ₹350.00
Availability: Not Available
Library Name: City Library

Book Management System:
1. Add Books
2. Delete a Book
3. Display Books
4. Exit
Choose an option: 4

Exiting the system.
