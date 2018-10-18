package javaeetutorial.helloservice;

import com.stucomm.mock.osiris.ObjectFactory;
import com.stucomm.mock.osiris.OswPorResultatenRtUser;
import com.stucomm.mock.osiris.OswPorResultatenRtUserArray;
import com.stucomm.mock.osiris.ResultaatService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.math.BigDecimal;

@WebService
public class OsirisMockService implements ResultaatService {

    @WebMethod
    public OswPorResultatenRtUserArray resultaten(String pStudentnummer, String pTaal) {

        ObjectFactory factory = new ObjectFactory();
        OswPorResultatenRtUserArray results = factory.createOswPorResultatenRtUserArray();

        OswPorResultatenRtUser user = factory.createOswPorResultatenRtUser();
        user.setCursuscode("33");

        results.getOswPorResultatenRtUser().add(user);
        return results;
    }

    public OswPorResultatenRtUserArray resultatenCursus(String pStudentnummer, String pCursus, BigDecimal pCollegejaar, String pTaal) {
        return null;
    }
}
