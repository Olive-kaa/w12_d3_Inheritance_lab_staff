import staff.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", 97896547, 1000.00, "Maths");
    }

    @Test
    public void getName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(97896547, manager.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(1000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void getDeptName(){
        assertEquals("Maths", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(100);
        assertEquals(1100, manager.getSalary(), 0.0);
    }

    @Test
    public void canFindPaidBonus(){
        assertEquals(10, manager.payBonus(manager.getSalary()), 0.0);

    }
}
