import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Harry", "A1", 100, "Admin", 200);
    }

    @Test
    public void getName() {
        assertEquals("Harry", director.getName());
    }

    @Test
    public void getNINum(){
        assertEquals("A1", director.getnINum());
    }

    @Test
    public void getSalary(){
        assertEquals(100, director.getSalary());
    }

    @Test
    public void getDept(){
        assertEquals("Admin", director.getDeptName());
    }

    @Test
    public void getBudget() {
        assertEquals(200, director.getBudget(),0.01);
    }

    @Test
    public void getDirectorBonus() {
        director.payBonus(1.02);
        assertEquals(102, director.getSalary());
    }
}
