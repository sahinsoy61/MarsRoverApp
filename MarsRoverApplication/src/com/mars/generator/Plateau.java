package com.mars.generator;

public class Plateau {
	
    private Coordinate rightCoordinate = new Coordinate(0, 0);
    private Coordinate leftCoordinates = new Coordinate(0, 0);

    public Plateau( int rightXCoordinate,  int rightYCoordinate) {
        this.rightCoordinate = this.rightCoordinate.newCoordinatesXY(rightXCoordinate, rightYCoordinate);
    }

    public boolean controlPlateau(Coordinate coordinates) {
        return this.leftCoordinates.outside(coordinates) && this.rightCoordinate.within(coordinates);
    }

}
