package edu.bradyreed.advjava.StockQuoteApp.Database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.bradyreed.advjava.StockQuoteApp.Person;
import edu.bradyreed.advjava.StockQuoteApp.StockQuote;

/**
 * ORM model for UserStocks database table using JPA
 * UserStocks Database holds a list of stocks a person is interested in following
 * 
 * This is a modified DAO class of PersonHobby from class ORM example
 * It is modified to change hobby object references, for StockQuote references
 *  and to properly name access methods for StockQuote use
 */



@Entity
@Table(name = "UserStocks")
public class UserStocksDAO implements DAO {
    private int id;
    private Person person;
    private StockQuote quote;

    /**
     * Create a User Stock DAO that needs to be initialized
     */
    public UserStocksDAO() {
        // this empty constructor is required by hibernate framework
    }

    /**
     * Create a valid User Stock DAO
     *
     * @param person the person to assign the quote to
     * @param quote  the quote to associate the person with
     */
    public UserStocksDAO(Person person, StockQuote quote) {
        setQuote(quote);
        setPerson(person);
    }

    /**
     * Primary Key - Unique ID for a particular row in the person_quote table.
     *
     * @return an integer value
     */
    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    @Override
    public int getId() {
        return id;
    }

    /**
     * Set the unique ID for a particular row in the person_quote table.
     * This method should not be called by client code. The value is managed in internally.
     *
     * @param id a unique value.
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return get the Person associated with this quote
     */
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "ID", nullable = false)
    public Person getPerson() {
        return person;
    }

    /**
     * Specify the Person associated with the quote.
     *
     * @param person a person instance
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     *
     * @return get the quote associated with this Person
     */
    @ManyToOne
    @JoinColumn(name = "quote_id", referencedColumnName = "ID", nullable = false)
    public StockQuote getquote() {
        return quote;
    }

    /**
     * Specify the quote associated with the Person.
     *
     * @param quote a person instance
     */
    public void setQuote(StockQuote quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserStocksDAO that = (UserStocksDAO) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + person.hashCode();
        result = 31 * result + quote.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Personquote{" +
                "id=" + id +
                ", person=" + person +
                ", quote=" + quote +
                '}';
    }
}

