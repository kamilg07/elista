package elista.grupa.ob;


import io.swagger.annotations.ApiModel;
import elista.uzytkownik.ob.uzytkownikOB;

import javax.persistence.*;
import java.util.List;


/**
 * Created by Ja on 2016-03-29.
 */

@Entity(name = "grupa")
public class grupaOB {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name="grupa_nazwa",
            joinColumns=@JoinColumn(name="grupa_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="uzytkownik_id", referencedColumnName="id"))
    private List<uzytkownikOB> users;

    @Column(name = "grupa_nazwa")
    private String groupName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<uzytkownikOB> getUsers() {
        return users;
    }

    public void setUsers(List<uzytkownikOB> users) {
        this.users = users;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}


