package elista.dziennikPlanow.dto;


import elista.uzytkownik.dto.uzytkownikDTO;
import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by Ja on 2016-03-29.
 */

@ApiModel
public class dziennikPlanowDTO implements Serializable{
    private Long id;
    private uzytkownikDTO userId;
    private String day;
    private Date from;
    private Date to;

    public dziennikPlanowDTO(Long id, uzytkownikDTO userId, String day, Date from, Date to) {
        this.id = id;
        this.userId = userId;
        this.day = day;
        this.from = from;
        this.to = to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public uzytkownikDTO getUserId() {
        return userId;
    }

    public void setUserId(uzytkownikDTO userId) {
        this.userId = userId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
