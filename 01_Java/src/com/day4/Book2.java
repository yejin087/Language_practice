package com.day4;

public class Book2 {
  private String bookName;
  private String author;

  public Book2() { // ??΄?Έ??±?

  }

  public Book2(String bookName, String author) {
    this.bookName = bookName;
    this.author = author;
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void showBookInfo() { // μ±? ? λ³? μΆλ ₯
    System.out.println(bookName + "," + author);
  }
}
