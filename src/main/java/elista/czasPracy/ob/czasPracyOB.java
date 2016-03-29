package elista.czasPracy.ob;

import elista.uzytkownik.ob.uzytkownikOB;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Ja on 2016-03-29.
 */

@Entity(name = "czasPracy")
public class czasPracyOB {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="uzytkownik_id")
    private uzytkownikOB userId;

    private Date day;
    private Date beginning;
    private Date ending;

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

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }
}
