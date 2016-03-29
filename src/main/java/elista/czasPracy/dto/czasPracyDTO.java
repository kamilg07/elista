package elista.czasPracy.dto;

import elista.uzytkownik.dto.uzytkownikDTO;
import elista.uzytkownik.ob.uzytkownikOB;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by Ja on 2016-03-29.
 */

public class czasPracyDTO implements Serializable{
    private Long id;
    private uzytkownikOB userId;
    private Date day;
    private Date beginning;
    private Date ending;


}
