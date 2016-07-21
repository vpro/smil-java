package nl.vpro.smil;

import javax.xml.bind.JAXB;

import org.junit.Test;
import org.w3._2001.smil20.language.SmilType;

/**
 * @author Michiel Meeuwissen
 * @since 0.1
 */

public class UnbindTest {

    @Test
    public void testUnbind() {
        SmilType type = JAXB.unmarshal(getClass().getResourceAsStream("/WO_NTR_425372.ism"), SmilType.class);
        // hmm, works, but this is hardly usefull
        type.getBody().getValue().getParOrSeqOrExcl();
    }
}
