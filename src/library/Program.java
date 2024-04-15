package library;

import library.domain.Book;

public class Program {
	public static void main(String[] args) {
		Book book = new Book("The ABC of packages");
		System.out.println("Hello package world: " + book.getName());
	}
}
