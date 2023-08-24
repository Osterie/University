/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowedCount;
    private final boolean courseText;
    private String refNumber;
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = bookCourseText;
        refNumber = "";
        borrowedCount = 0;
    }

    public void borrowBook()
    {
        borrowedCount += 1;
    }

    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else if (ref.length() < 3){
            System.out.println("Error: Referance number must be at least 3 characters");
        }
    }

    // Returns the book author (as the naming implies)
    public String getAuthor()
    {
        return author;
    }

    // Returns the book title 
    public String getTitle()
    {
        return title;
    }

    // Returns the number of pages in the book
    public int getPages()
    {
        return pages;
    }

    // Returns the number of times book has been borrowed
    public int getBorrowed()
    {
        return borrowedCount;
    }    

    // Returns the books referance number
    public String getRefNumber()
    {
        return refNumber;
    }

    // prints book author to terminal
    public void printAuthor()
    {
        System.out.println(author);
    }

    // prints book title to terminal
    public void printTitle()
    {
        System.out.println(title);
    }

    // prints book pages to terminal
    public void printPages()
    {
        System.out.println(pages);
    }

    // prints details about book, i.e author, title, pages, referance number, etc.
    public void printDetails()
    {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("This book has been borrowed " + borrowedCount + "times");
        // checks if refNumber is given, if not prints zzz, else prints ref number
        if (refNumber == "")
        {
            System.out.println("Referance Number: ZZZ");
        }
        else
        {
            System.out.println("Referance Number: " + refNumber);    
        }
        
    }
}
