package tests;

import org.junit.Assert;
import org.junit.Test;

import com.mars.base.MarsRoverApp;
import com.mars.generator.Coordinate;
import com.mars.generator.Direction;
import com.mars.generator.Plateau;

@SuppressWarnings("deprecation")
public class MarsRoverApplicationTest {
	
	
	@Test
    public void runToFirstCaseMultiple() {
        //Given
        Plateau plateau = new Plateau(5,5);
        Coordinate startingPosition = new Coordinate(1,2);
        MarsRoverApp marsRoverApp = new MarsRoverApp(plateau, Direction.N, startingPosition);
        marsRoverApp.run("LMLMLMLMM");
        Assert.assertEquals("1 3 N", marsRoverApp.location());
        System.out.println(marsRoverApp.location());
    }
	

	@Test
    public void runToSecondCaseMultiple() {
        //Given
        Plateau plateau = new Plateau(5,5);
        Coordinate startingPosition = new Coordinate(3,3);
        MarsRoverApp marsRoverApp = new MarsRoverApp(plateau, Direction.E, startingPosition);
        marsRoverApp.run("MMRMMRMRRM");
        Assert.assertEquals("5 1 E", marsRoverApp.location());
        System.out.println(marsRoverApp.location());
    }


}
