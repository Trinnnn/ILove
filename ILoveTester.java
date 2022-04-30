import static org.junit.Assert.*;
import org.junit.*;

public class ILoveTester {

    @Test
    public void Tester () {
        assertEquals("I love you so much !", ILove.ILove("you")); // test should fail

    }

}