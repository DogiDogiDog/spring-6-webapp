package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookService bs;

    public BookController(BookService bs) {
        this.bs = bs;
    }


    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bs.findAll());
        return "books";
    }
}
