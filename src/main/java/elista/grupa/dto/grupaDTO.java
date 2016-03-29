package elista.grupa.dto;

import elista.uzytkownik.ob.uzytkownikOB;
import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import java.util.List;


/**
 * Created by Ja on 2016-03-29.
 */

@ApiModel
public class grupaDTO {
    private Long id;
    private String groupName;
    private List<uzytkownikOB> users;

    public grupaDTO(Long id, String groupName, List<uzytkownikOB> users) {
        this.id = id;
        this.groupName = groupName;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<uzytkownikOB> getUsers() {
        return users;
    }

    public void setUsers(List<uzytkownikOB> users) {
        this.users = users;
    }
}
