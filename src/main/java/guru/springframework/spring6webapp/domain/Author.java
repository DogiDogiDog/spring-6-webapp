package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**
 * Created by jt, Spring Framework Guru.
 */
@Entity
public class Author {


    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
