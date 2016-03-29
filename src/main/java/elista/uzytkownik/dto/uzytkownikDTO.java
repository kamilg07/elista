package elista.uzytkownik.dto;


import elista.grupa.dto.grupaDTO;
import io.swagger.annotations.ApiModel;
import org.apache.coyote.http11.Constants;

import java.io.Serializable;
import java.util.List;


/**
 * Created by Ja on 2016-03-29.
 */

@ApiModel
public class uzytkownikDTO implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Boolean active;
    private List<grupaDTO> groups;

    public uzytkownikDTO(Long id, String firstName, String lastName, String email, String password, String phone, Boolean active, List<grupaDTO> groups) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.active = active;
        this.groups = groups;
    }

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

    public List<grupaDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<grupaDTO> groups) {
        this.groups = groups;
    }
}
