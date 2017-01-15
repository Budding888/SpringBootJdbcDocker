package cn.com.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by xiaxuan on 16/11/29.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String first;
    private String last;
    private Date dateofbirth;
    private String placeofbirth;

    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirst() {
        return first;
    }

    public Person setFirst(String first) {
        this.first = first;
        return this;
    }

    public String getLast() {
        return last;
    }

    public Person setLast(String last) {
        this.last = last;
        return this;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public Person setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
        return this;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public Person setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
        return this;
    }
}
