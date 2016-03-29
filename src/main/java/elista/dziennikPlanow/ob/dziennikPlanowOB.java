package elista.dziennikPlanow.ob;

import elista.uzytkownik.ob.uzytkownikOB;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Ja on 2016-03-29.
 */

@Entity(name = "dziennikPlanow")
public class dziennikPlanowOB {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="uzytkownik_id")
    private uzytkownikOB userId;

    private String day;

    @Column(name = "plan_od")
    private Date planOd;

    @Column(name = "plan_do")
    private Date planDo;

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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getPlanFrom() {
        return planOd;
    }

    public void setPlanFrom(Date planFrom) {
        this.planOd = planFrom;
    }

    public Date getPlanTo() {
        return planDo;
    }

    public void setPlanTo(Date planTo) {
        this.planDo = planTo;
    }
}
