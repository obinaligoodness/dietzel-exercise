package Turtle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle ijapa = new Turtle();
    private Sketchpad sketchpad = new Sketchpad(20,20);

    @Test
    public void thereIsATurtleTest(){
        assertNotNull(ijapa);
    }
    @Test
    public void turtleCanMovePenDownTest(){
        assertFalse(ijapa.isPenDown());
        ijapa.movePenDown();
        assertTrue(ijapa.isPenDown());
    }
    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.movePenDown();
        ijapa.movePenUp();
        assertFalse(ijapa.isPenDown());
    }
    @Test
    public void turtleCanTurnRightFacingEastTest(){
        assertSame(EAST,ijapa.getDirection());
        ijapa.turnRight();
        assertSame(SOUTH,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnRightFacingSouthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnRightFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnRightFacingNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(EAST,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingEastTest(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingNorthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingWestTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingSouthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(EAST,ijapa.getDirection());
    }
    @Test
    public void turtleCanMoveWhileFacingEastTest(){
        assertSame(EAST, ijapa.getDirection());
        assertFalse(ijapa.isPenDown());
        Position position = new Position(0,0);
        assertEquals(new Position(0,0), ijapa.getPosition());
        ijapa.moveForward(4,sketchpad);
        assertEquals(new Position(0,4), ijapa.getPosition());
    }
    @Test
    public void turtleCanMoveWhileFacingWest(){
        assertSame(EAST,ijapa.getDirection());
        ijapa.moveForward(3,sketchpad);
        assertEquals(new Position(0,3),ijapa.getPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.moveForward(2,sketchpad);
        assertEquals(new Position(0,1),ijapa.getPosition());
    }
    @Test
    public void turtleCanWriteWithPenDownWhileFacingEastTest(){
        Sketchpad sketchpad = new Sketchpad(20,20);
        assertSame(EAST,ijapa.getDirection());
        assertEquals(new Position(0,0),ijapa.getPosition());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchpad);
        assertEquals(new Position(0,5),ijapa.getPosition());
        int [][] floor = sketchpad.getFloor();
        assertEquals(1,floor[0][0]);
        assertEquals(1,floor[0][1]);
        assertEquals(1,floor[0][2]);
        assertEquals(1,floor[0][3]);
        assertEquals(1,floor[0][4]);
        assertEquals(1,floor[0][5]);
    }
    @Test
    public void turtleCanWriteWithPenDownWhileFacingWestTest(){
        ijapa.moveForward(5,sketchpad);
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getDirection());
        ijapa.movePenDown();
        ijapa.moveForward(3,sketchpad);
        assertEquals(new Position(0,2),ijapa.getPosition());
        int[][]floor = sketchpad.getFloor();
        assertEquals(1,floor[0][4]);
        assertEquals(1,floor[0][3]);
        assertEquals(1,floor[0][2]);
    }
    @Test
    public void turtleCanWriteWithPenDownWhileFacingNorthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.moveForward(5,sketchpad);
        assertSame(SOUTH,ijapa.getDirection());
        assertEquals(new Position(5,0),ijapa.getPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH,ijapa.getDirection());
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchpad);
        int [][] floor = sketchpad.getFloor();
        assertEquals(1,floor[5][0]);
        assertEquals(1,floor[4][0]);
        assertEquals(1,floor[3][0]);
        assertEquals(1,floor[2][0]);
        assertEquals(1,floor[1][0]);
        assertEquals(1,floor[0][0]);
    }
    @Test
    public void turtleCanWriteWithPenDownWhileFacingSouthTest(){
//        ijapa.turnLeft();
//        ijapa.turnLeft();
//        ijapa.turnLeft();
        ijapa.turnRight();
        assertSame(SOUTH,ijapa.getDirection());
        ijapa.movePenDown();
        assertEquals(new Position(0,0 ), ijapa.getPosition());
        ijapa.moveForward(4,sketchpad);
        assertEquals(new Position(4,0),ijapa.getPosition());
        int [][] floor = sketchpad.getFloor();
//        assertEquals(1,floor[5][0]);
        assertEquals(1,floor[4][0]);
        assertEquals(1,floor[3][0]);
        assertEquals(1,floor[2][0]);
        assertEquals(1,floor[1][0]);
        assertEquals(1,floor[0][0]);
    }
}
