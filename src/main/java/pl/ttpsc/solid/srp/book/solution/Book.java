package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class Book {

  private final String title;
  private final String author;
  private final String libraryRoomName;
  private final String rowLocator;
  private final int indexOnShelf;
  private final Map<Integer, String> pages;

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
