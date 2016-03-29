package elista.uzytkownik.ob;

import elista.czasPracy.ob.czasPracyOB;
import elista.dziennikPlanow.ob.dziennikPlanowOB;
import elista.grupa.ob.grupaOB;
import elista.nieobecnosci.ob.nieobecnosciOB;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Created by Ja on 2016-03-29.
 */

@Entity(name = "uzytkownik")
public class uzytkownikOB implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "imie")
    private String firstName;

    @Column (name = "nazwsiko")
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Boolean active;


    @ManyToMany(mappedBy="uzytkownicy")
    private List<grupaOB> groups;

    @OneToMany(mappedBy="uzytkownik_id")
    private List<nieobecnosciOB> absences;

    @OneToMany(mappedBy="uzytkownik_id")
    private List<czasPracyOB> worktimes;

    @OneToMany(mappedBy="uzytkownik_id")
    private List<dziennikPlanowOB> timetables;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<grupaOB> getGroups() {
        return groups;
    }

    public void setGroups(List<grupaOB> groups) {
        this.groups = groups;
    }

    public List<nieobecnosciOB> getAbsences() {
        return absences;
    }

    public void setAbsences(List<nieobecnosciOB> absences) {
        this.absences = absences;
    }

    public List<czasPracyOB> getWorktimes() {
        return worktimes;
    }

    public void setWorktimes(List<czasPracyOB> worktimes) {
        this.worktimes = worktimes;
    }

    public List<dziennikPlanowOB> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<dziennikPlanowOB> timetables) {
        this.timetables = timetables;
    }
}
