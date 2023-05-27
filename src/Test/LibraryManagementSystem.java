package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//inner book class ,you can use separate lass
class books {
    private int bookId;
    private String title;
    private int lendFlag;

    public books(int bookId, String title, int lendFlag) {
	this.bookId = bookId;
	this.title = title;
	this.lendFlag = lendFlag;
    }

    @Override
    public String toString() {
	return "bookId=" + bookId + ", title=" + title + ", lendFlag=" + lendFlag;
    }

    public int getBookId() {
	return bookId;
    }

    public String getTitle() {
	return title;
    }

    public int getLendFlag() {
	return lendFlag;
    }

    public void setLendFlag(int lendFlag) {
	this.lendFlag = lendFlag;
    }

}

//inner member class ,,you can use separate lass
class Members {
    private int memberId;
    private String name;
    private ArrayList<Object> borrowedBooks;

    public Members(int memberId, String name, ArrayList<Object> borrowedBooks) {
	super();
	this.memberId = memberId;
	this.name = name;
	this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
	return "memberId=" + memberId + ", name=" + name + ", borrowedBooks=" + borrowedBooks;
    }

    public int getMemberId() {
	return memberId;
    }

}

//Top Level Library Class
public class LibraryManagementSystem {
    public static void main(String[] args) {

	// create member List
	List<Members> memberList = new ArrayList<>();
	memberList.add(new Members(1, "John", new ArrayList<>()));
	memberList.add(new Members(2, "John", new ArrayList<>()));

	// create bookList
	List<books> bookList = new ArrayList<>();
	bookList.add(new books(1, "The Lord of the Rings", 1));
	bookList.add(new books(2, "The Hobbit", 0));
	bookList.add(new books(3, "Harry Potter and the Philosopher's Stone", 0));
	bookList.add(new books(4, "Harry Potter and the Chamber of Secrets", 0));

	// Use StringBuilder append for readability
	StringBuilder initMsg = new StringBuilder();
	initMsg.append("Welcome to the library management system. Please choose an option:\n");
	initMsg.append("1. Display All Books\n");
	initMsg.append("2. Display All Members\n");
	initMsg.append("3. Lend Book\n");
	initMsg.append("4. Return Book\n");
	initMsg.append("5. Exit\n");
	initMsg.append("Enter your choice:\n");
	// print to display Message
	System.out.println(initMsg);

	// Create a Scanner object

	try (Scanner sc = new Scanner(System.in);) {// to close scanner automatically
	    int userInput = sc.nextInt();
	    System.out.println(userInput);
	    switch (userInput) {
	    case 1: {
		for (books bkList : bookList)
		    System.out.println(bkList);
		break;
	    }
	    case 2: {
		for (Members mbList : memberList)
		    System.out.println(mbList);
		break;
	    }
	    case 3: {
		System.out.println("Enter book ID:");
		boolean lentAvailable = false;
		while (!lentAvailable) {
		    int bkId = sc.nextInt();
		    for (books bkList : bookList) {
			// check if book ID is found or not
			if (bkId == bkList.getBookId()) {
			    // if Lend flag is 1
			    if (bkList.getBookId() == bkId && bkList.getLendFlag() == 1) {
				System.out.println("Your choise is already lended.\nEnter book ID:");
				break;
			    } else {
				// now book is available and check member information
				System.out.println("Enter member ID:");
				boolean correctMember = false;
				while (!correctMember) {
				    int mbId = sc.nextInt();
				    for (Members mbList : memberList) {
					// check if Member Id is  Found or not
					if (mbId == mbList.getMemberId()) {
					    System.out.println("Thank you ");
					    bkList.setLendFlag(1);
					    correctMember = true;
					    lentAvailable = true;
					    break;
					} else {
					    // Check if this member object is final or not
					    boolean latestmbRecord = (mbList == memberList.get(memberList.size() - 1));
					    if (latestmbRecord) {
						System.out.println("Please enter correct member ID");
						break;
					    }
					}
				    }

				}
			    }

			} else {
			    // Check if this book object is final or not
			    boolean latestbkRecord = (bkList == bookList.get(bookList.size() - 1));
			    if (latestbkRecord) {
				System.out.println("Please enter correct book ID");
				break;
			    }

			}
		    }
		}
		break;
	    }
	    case 4: {
		System.out.println("Enter book ID:");
		boolean lentAvailable = false;
		while (!lentAvailable) {
		    int bkId = sc.nextInt();
		    for (books bkList : bookList) {
			// check if book ID is found
			if (bkId == bkList.getBookId()) {
			    // now book is available and check member information
			    System.out.println("Enter member ID:");
			    boolean correctMember = false;
			    while (!correctMember) {
				int mbId = sc.nextInt();
				for (Members mbList : memberList) {
				    // if Member Id is not Found
				    if (mbId == mbList.getMemberId()) {
					System.out.println("Thank you ");
					bkList.setLendFlag(1);
					correctMember = true;
					lentAvailable = true;
					break;
				    } else {
					// Check if this member object is final or not
					boolean latestmbRecord = (mbList == memberList.get(memberList.size() - 1));
					if (latestmbRecord) {
					    System.out.println("Please enter correct member ID");
					    break;
					}
				    }
				}

			    }
			} else {
			    // Check if this book object is final or not
			    boolean latestbkRecord = (bkList == bookList.get(bookList.size() - 1));
			    if (latestbkRecord) {
				System.out.println("Please enter correct book ID");
				break;
			    }

			}
		    }
		}
		break;
	    }

	    case 5:
		System.out.println("Exiting Library Management System. Goodbye!");
		return;
	    default:
		System.out.println("Invalid choice. Please enter a number from 1-5.");
		;
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}

    }

}
