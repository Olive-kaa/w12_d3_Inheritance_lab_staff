import staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Tony", 87654321, 1500.00);
    }

    @Test
    public void getName(){
        assertEquals("Tony", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals(87654321, databaseAdmin.getNiNumber());
    }
    @Test
    public void getSalary(){
        assertEquals(1500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(250);
        assertEquals(1750, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canFindPaidBonus(){
        assertEquals(15, databaseAdmin.payBonus(databaseAdmin.getSalary()), 0.0);

    }
}