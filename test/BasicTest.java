import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveDepartament() {
        new Departament("admin", 10, "admin123").save();

        Departament d = Departament.find("byNomdepartament", "admin").first();

        // Test
        assertNotNull(d);
        assertEquals("admin", d.nomdepartament);
    }

    @Test
    public void createAndRetrieveTreballador() {
        Departament dep=new Departament("admin", 10, "admin123").save();
        new Treballador("Joan", 2, dep, "joan98","joan123").save();
        Treballador treballador = Treballador.find("byNom", "Joan").first();

        // Test
        assertNotNull(treballador);
        assertEquals("Joan", treballador.nom);
    }
    @Test
    public void createAndRetrieveNotification() {
        Departament d= new Departament("admin", 10, "admin123").save();
        new Notificacions(d, "Passar tests", "Urgent").save();
        Notificacions not = Notificacions.find("byTitol", "Urgent").first();

        // Test
        assertNotNull(not);
        assertEquals("Passar tests", not.contingut);
    }

}
