import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveTreballador() {

        Treballador joan = Treballador.find("byRol", "Director").first();

        // Test
        assertNotNull(joan);
        assertEquals("Joan", joan.nom);
    }

}
