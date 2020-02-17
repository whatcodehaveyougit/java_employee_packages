import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jim", "A123", 100, "Sales");
    }

    @Test
    public void getName() {
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void getNINum(){
    assertEquals("A123", manager.getnINum());
    }

    @Test
    public void getSalary(){
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void getDept(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void getSalaryRise() {
        manager.raiseSalary(15);
        assertEquals(115, manager.getSalary() );
    }

    @Test
   public void getPayBonus() {
        manager.payBonus(1.01);
        assertEquals(101, manager.getSalary());
    }

    @Test
    public void ensureNegativeRaisesAreBanned() {
        manager.raiseSalary(-10);
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void ensureNameCannotBeNull() {
        manager.setName("");
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void ensureNameCanBeChanged() {
        manager.setName("Steve");
        assertEquals("Steve", manager.getName());
    }
}
