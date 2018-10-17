import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveTreballador() {
        // Create a new user and save it
       // new Treballador("Joan",23, "Director", "joangarcia", "joan23").save();

        // Retrieve the user with e-mail address bob@gmail.com
        Treballador joan = Treballador.find("byRol", "Director").first();

        // Test
        assertNotNull(joan);
        assertEquals("Joan", joan.nom);
    }

}
