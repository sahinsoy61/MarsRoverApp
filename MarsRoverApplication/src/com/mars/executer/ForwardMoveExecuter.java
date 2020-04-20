package com.mars.executer;


import com.mars.base.MarsRoverApp ;

public class ForwardMoveExecuter implements GenericExecuter{
	
    @Override
    public void execute(MarsRoverApp marsRoverApp) {
    	marsRoverApp.forwardMove();
    }

}
