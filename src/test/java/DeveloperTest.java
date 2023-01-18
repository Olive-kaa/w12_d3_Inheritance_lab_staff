import staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Emily", 12345678, 2000.00);
    }

    @Test
    public void getName(){
        assertEquals("Emily", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(12345678, developer.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(2000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(150);
        assertEquals(2150, developer.getSalary(), 0.0);
    }

    @Test
    public void canFindPaidBonus(){
        assertEquals(20, developer.payBonus(developer.getSalary()), 0.0);

    }
}