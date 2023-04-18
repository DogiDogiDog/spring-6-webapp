package guru.springframework.spring6webapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue
    Long id;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    private String name;
    private String city;
    private String adress;



    private String state;
    private String zip;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        if (getId() != null ? !getId().equals(publisher.getId()) : publisher.getId() != null) return false;
        if (getName() != null ? !getName().equals(publisher.getName()) : publisher.getName() != null) return false;
        if (getCity() != null ? !getCity().equals(publisher.getCity()) : publisher.getCity() != null) return false;
        if (getAdress() != null ? !getAdress().equals(publisher.getAdress()) : publisher.getAdress() != null)
            return false;
        if (getState() != null ? !getState().equals(publisher.getState()) : publisher.getState() != null) return false;
        return getZip() != null ? getZip().equals(publisher.getZip()) : publisher.getZip() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getAdress() != null ? getAdress().hashCode() : 0);
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        result = 31 * result + (getZip() != null ? getZip().hashCode() : 0);
        return result;
    }

}
