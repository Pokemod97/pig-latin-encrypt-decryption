import com.k_linedev.latin.decryption;
import com.k_linedev.latin.encryption;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by caden on 7/10/2016.
 */
public class latinTest {
    @Test
    public void decryptionTest() {
        String eword = "hi ";
        String lword = "ihay";
        assertEquals(eword, decryption.decrypt(lword));
    }

    @Test
    public void encryptionTest() {

        String lword = "ihay ";
        String eword = decryption.decrypt(lword);

        assertEquals(lword, encryption.encrypt(eword));
    }

}
