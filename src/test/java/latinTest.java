import com.k_linedev.latin.decryption;
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
}
