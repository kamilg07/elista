package elista.nieobecnosci.ob;

import elista.uzytkownik.ob.uzytkownikOB;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * Created by Ja on 2016-03-29.
 */

@Entity(name="nieobecnosci")
public class nieobecnosciOB implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="uzytkownik_id")
    private uzytkownikOB userId;

    private String type;
    private Date date;
    private Integer hours;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public uzytkownikOB getUserId() {
        return userId;
    }

    public void setUserId(uzytkownikOB userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
