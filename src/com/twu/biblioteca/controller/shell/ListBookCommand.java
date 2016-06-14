package com.twu.biblioteca.controller.shell;

import com.twu.biblioteca.controller.core.BookController;
import com.twu.biblioteca.model.Book;

import java.util.List;
import java.util.Map;

public class ListBookCommand implements MyCommand {
    private BookController bookController;
    private final Map<String, MyCommand> mapper;

    public ListBookCommand(BookController bookController,Map<String,MyCommand> mapper){
        this.bookController = bookController;
        this.mapper = mapper;
    }

    public String excute(Router router){
        String result = "";

        result += String.format(" *********************************************************\n");
        result += String.format(" *                       Book List                       *\n");
        result += String.format(" *********************************************************\n");
        result += String.format(" *  id *         Name        *       Author    *  Year   *\n");
        result += String.format(" *********************************************************\n");

        List<Book> bookList = bookController.getBookList();

        for (Book book:bookList){
            result += String.format(" *  %-2s *  %-18s *  %-13s  *  %-5s  *\n",book.getBookId(),book.getBookName(),book.getAuthor(),book.getPublishedYear());
        }
        result += String.format(" *********************************************************\n");
        result += String.format(" *                                1.Return the MainMenu  *\n");
        result += String.format(" *********************************************************\n");
        router.setCurrentMapper(mapper);

        return result;
    }
}
