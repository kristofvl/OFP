class Book {
  private String title, isbn;
  public void set( String title, String isbn ) {
    this.title = title; this.isbn = isbn; }
  public String getTitle() { return title; }
  public String getISBN() { return isbn; }
}
class BookShelf {
  public Book[] books;
}
class BookCase {
  public BookShelf[] bookShelves;
}
class BeispielBooks {
  public static void main(String[] s) {  // Erzeuge ein Bookcase mit 6 BookShelfs, dann 80 Books
              // im ersten BookShelf. Das erste Buch sollte „Steal me“ mit der ISBN „1-2-3“ sein.

  }
}
