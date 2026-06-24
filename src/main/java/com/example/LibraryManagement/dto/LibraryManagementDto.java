package com.example.LibraryManagement.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibraryManagementDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

    private String bookName;

    private String authorName;

    private double price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LibraryManagementDto [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", price=" + price + "]";
	}
    

}
