import org.grubhart.encrypt.EncryptUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEncryptUtil {


    @Test
    public void testEncrypt(){

        EncryptUtil util = new EncryptUtil();
        util.setPassword("password");
        assertNotNull(util.encrypt("hola"));

    }
//"VQ0TV64CnLmJgtpb22Pb+g=="

    @Test
    public void testDecrypt(){

        EncryptUtil util = new EncryptUtil();
        util.setPassword("password");
        assertEquals("hola",util.decrypt("75etztnOLxrArKedcvzXsw=="));

    }


}
