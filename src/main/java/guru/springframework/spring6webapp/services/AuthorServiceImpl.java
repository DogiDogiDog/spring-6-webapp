package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service

public class AuthorServiceImpl implements AuthorService{

    public AuthorServiceImpl(AuthorRepository ar) {
        this.ar = ar;
    }

    AuthorRepository ar;
    @Override
    public Iterable<Author> findAll() {
        return ar.findAll();
    }
}
