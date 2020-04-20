package com.mars.generator;

public class Coordinate {
	
	    private int axisCoordinate;
	    private int ordinateCoordinate;

	    public Coordinate(final int xCoordinate, final int yCoordinate) {
	        this.axisCoordinate = xCoordinate;
	        this.ordinateCoordinate = yCoordinate;
	    }

	    public Coordinate newCoordinatesXY( int xValue,  int yValue) {
	        return new Coordinate(this.axisCoordinate + xValue, this.ordinateCoordinate + yValue);
	    }

	    @Override
	    public String toString() {
	        StringBuilder coordinateOutput = new StringBuilder();
	        coordinateOutput.append(axisCoordinate);
	        coordinateOutput.append(" ");
	        coordinateOutput.append(ordinateCoordinate);
	        return coordinateOutput.toString();
	    }

	  
	    private boolean yWithIn( int yCoordinate) {
	    	
	    	boolean isWithIn =  false;
	    	if(yCoordinate <= this.ordinateCoordinate)
	    		isWithIn = true;
	    	
			return isWithIn;
			
	    }

	  
	    private boolean xWithIn( int xCoordinate) {
	    	
	    	boolean isWithIn =  false;
	    	if(xCoordinate <= this.axisCoordinate)
	    		isWithIn = true;
	    	
			return isWithIn;
	    }
	   
	    private boolean xOutside( int xCoordinate) {
	    	boolean isOutside =  false;
	    	if(xCoordinate >= this.axisCoordinate)
	    	isOutside = true;
	    	
			return isOutside;
	    }

	  
	    
	    private boolean yOutside( int yCoordinate) {
	    	boolean isOutside =  false;
	    	if(yCoordinate >= this.ordinateCoordinate)
	    	isOutside = true;
	    	
			return isOutside;
	    
	    }

	    public Coordinate newCoordinates( int xValue, int yValue) {
	    	int x = axisCoordinate+xValue;
	    	int y = ordinateCoordinate+yValue;
	        return new Coordinate(x, y);
	    }
	    
	    public boolean outside( Coordinate coordinates) {
	        return xOutside(coordinates.axisCoordinate) && yOutside(coordinates.ordinateCoordinate);
	    }
	    
	    public boolean within( Coordinate coordinates) {
	        return xWithIn(coordinates.axisCoordinate) && yWithIn(coordinates.ordinateCoordinate);
	    }


}
