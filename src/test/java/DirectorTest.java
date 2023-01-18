import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Bonnie", 12345679, 10000.00, "Maths", 2000000);
    }

    @Test
    public void getName(){
        assertEquals("Bonnie", director.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(12345679, director.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(10000.00, director.getSalary(), 0.0);
    }

    @Test
    public void getDeptName(){
        assertEquals("Maths", director.getDeptName());
    }

    @Test
    public void getBudget(){
        assertEquals(2000000, director.getBudget(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(11000, director.getSalary(), 0.0);
    }

    @Test
    public void canFindPaidBonus(){
        assertEquals(200, director.payBonus(director.getSalary()), 0.0);

    }
}
