import static org.junit.Assert.*;
import org.junit.*;

public class ILoveTester {

    @Test
    public void Tester1() {
        assertEquals("I love you so much !", ILove.ILove("you")); // test should fail
    }

    @Test
    public void Tester2() {
        assertEquals("I love Bucky so much !", ILove.ILove("Bucky")); // test should fail
    }

}