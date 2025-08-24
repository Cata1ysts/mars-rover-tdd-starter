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
    public void Test_Command_M_from_S(){
        //given
        MarsRover marsRover = new MarsRover(0,0, DIRECTION.S);
        String result = "(0,-1) S";
        //when
        marsRover.execute("M");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_M_from_N(){
        //given
        MarsRover marsRover = new MarsRover(0,0, DIRECTION.N);
        String result = "(0,1) N";
        //when
        marsRover.execute("M");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_M_from_W(){
        //given
        MarsRover marsRover = new MarsRover(1,2, DIRECTION.W);
        String result = "(0,2) W";
        //when
        marsRover.execute("M");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_M_from_E(){
        //given
        MarsRover marsRover = new MarsRover(6,3, DIRECTION.E);
        String result = "(7,3) E";
        //when
        marsRover.execute("M");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_L_from_W(){
        //given
        MarsRover marsRover = new MarsRover(6,3, DIRECTION.W);
        String result = "(6,3) S";
        //when
        marsRover.execute("L");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_L_from_S(){
        //given
        MarsRover marsRover = new MarsRover(6,3, DIRECTION.S);
        String result = "(6,3) E";
        //when
        marsRover.execute("L");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_R_from_E(){
        //given
        MarsRover marsRover = new MarsRover(6,3, DIRECTION.E);
        String result = "(6,3) S";
        //when
        marsRover.execute("R");
        //then
        assertEquals(result,marsRover.report());

    }
    @Test
    public void Test_Command_R_from_N(){
        //given
        MarsRover marsRover = new MarsRover(6,3, DIRECTION.N);
        String result = "(6,3) E";
        //when
        marsRover.execute("R");
        //then
        assertEquals(result,marsRover.report());

    }

}