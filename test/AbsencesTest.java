import org.junit.Test;

public class AbsencesTest {

    @Test
    public void testAddAbsences() {
        Absences absences = new Absences(5);
        int newTotal = absences.addAbsences(3);
        assert newTotal == 8 : "Expected total absences to be 8, but got " + newTotal;
    }

    @Test
    public void testAddAbsencesWithNegative() {
        Absences absences = new Absences(5);
        int newTotal = absences.addAbsences(-3);
        assert newTotal == 2 : "Expected total absences to be 8, but got " + newTotal;
    }
}
