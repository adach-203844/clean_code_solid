package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {

  private int currentPage = 0;

  /**
   * Prints specific page.
   */
  public void printPage(Book book, int pageNumber) {
    System.out.println(book.getPages().get(pageNumber));
  }

  /**
   * Prints all pages
   */
  public void printAllPages(Book book) {

    for (Map.Entry<Integer, String> page : book.getPages().entrySet()) {
      System.out.println(page.getKey() + " " + page.getValue());
    }
  }
}
