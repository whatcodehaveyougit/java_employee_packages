import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Kenny", "AB2", 200);
    }

    @Test
    public void getName() {
        assertEquals("Kenny", databaseAdmin.getName());
    }

    @Test
    public void getNINum(){
        assertEquals("AB2", databaseAdmin.getnINum());
    }

    @Test
    public void getSalary(){
        assertEquals(200, databaseAdmin.getSalary());
    }

}
