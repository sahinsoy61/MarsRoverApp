package com.mars.base;


import com.mars.executer.GenericExecuter;
import com.mars.parser.ToStringParser;
import com.mars.generator.Coordinate;
import com.mars.generator.Direction;
import com.mars.generator.Plateau;
import java.util.List;


public class MarsRoverApp {
	
	    private Coordinate coordinates;
	    private Direction direction;
	    private Plateau plateau;


	    public MarsRoverApp(Plateau plateau, Direction direction, Coordinate coordinates) {
	        this.plateau = plateau;
	        this.direction = direction;
	        this.coordinates = coordinates;
	    }
        /*Komut dizisi başlıyor*/
	    public void run(String value) {
	        List<GenericExecuter> genericExecuters = new ToStringParser(value).exec();
	        for (GenericExecuter genericExecuter : genericExecuters) {
	        	genericExecuter.execute(this);
	        }
	    }
	    
	    /*Hareket komutu*/
	    public void forwardMove() {
	    	/*Hareket edilecek komutlar bulunur*/
	    	 int axis=direction.sizeXAxis();
		     int ordinat=direction.sizeYOrdinat();
	    	
	        Coordinate afterPosition = coordinates.newCoordinates(axis, ordinat);
	       
	        /*Hareket edilecek komut plato içinde mi kontrol edilir*/
	        if(plateau.controlPlateau(afterPosition))
	        	coordinates = coordinates.newCoordinatesXY(axis,ordinat );
	    }
	    

	    /*Sağa dön komutu */
	    public void spinRight() {
	        this.direction = this.direction.right();
	    }
        
	    /*Sola dön komutu */
	    public void spinLeft() {
	        this.direction = this.direction.left();
	    }
	    
	    
        
	    /*Son bulunduğu Location Değerini string döndürür*/
	    public String location() {
	        return coordinates.toString() + " " + direction.toString();
	    }
        


}