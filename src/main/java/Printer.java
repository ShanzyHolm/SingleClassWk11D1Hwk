//Printer
//        Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.

public class Printer {
    private int sheetsOfPaper;
    private int toner;

    public Printer(int sheetsOfPaper, int toner) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.toner = toner;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int printMultiplePageDocuments(int pagesInDocument, int numberOfCopies) {
        int totalPagesToPrint = pagesInDocument * numberOfCopies;
        return totalPagesToPrint;
    }

    public void print( int pages, int copies) {
        int totalPages = pages * copies;
        if (this.sheetsOfPaper >= totalPages) {
            this.sheetsOfPaper -= totalPages;
            this.toner -= totalPages;
        } //cmd option t - to surround with an if statement
    }
}
