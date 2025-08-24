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
        assertEquals(y,marsRover.getY());
        assertEquals(direction.name(),marsRover.getDirection());
    }
    @Test
    public void Test_Command_M(){
        //given
        MarsRover marsRover = new MarsRover(0,0, DIRECTION.S);
        String result = "(0,-1) S";
        //when
        marsRover.execute("M");
        //then
        assertEquals(result,marsRover.report());

    }
}