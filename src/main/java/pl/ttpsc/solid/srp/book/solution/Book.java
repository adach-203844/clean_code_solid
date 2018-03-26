package pl.ttpsc.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

  private String title;
  private String author;
  private String libraryRoomName;
  private String rowLocator;
  private int indexOnShelf;
  private Map<Integer, String> pages;

  public Book(String title, String author, String libraryRoomName, String rowLocator,
      int indexOnShelf, Map<Integer, String> pages) {
    this.title = title;
    this.author = author;
    this.libraryRoomName = libraryRoomName;
    this.rowLocator = rowLocator;
    this.indexOnShelf = indexOnShelf;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getLibraryRoomName() {
    return libraryRoomName;
  }

  public String getRowLocator() {
    return rowLocator;
  }

  public int getIndexOnShelf() {
    return indexOnShelf;
  }

  public Map<Integer, String> getPages() {
    return pages;
  }
}
