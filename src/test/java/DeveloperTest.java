import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("James", "AB1", 200);
    }

    @Test
    public void getName() {
        assertEquals("James", developer.getName());
    }

    @Test
    public void getNINum(){
        assertEquals("AB1", developer.getnINum());
    }

    @Test
    public void getSalary(){
        assertEquals(200, developer.getSalary());
    }

}
