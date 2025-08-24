import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void Test_init_Mars_Rover() {
        //given
        int x=0;
        int y =0;
        DIRECTION direction = DIRECTION.N;

        //when
        MarsRover marsRover = new MarsRover(x, y, direction);

        //then
        assertEquals(x,marsRover.getX());
        assertEquals(x,marsRover.getY());
        assertEquals(x,marsRover.getDirection());
    }
}