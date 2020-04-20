package com.mars.executer;

import com.mars.base.MarsRoverApp ;

public class SpinLeftExecuter implements GenericExecuter{
	
    @Override
    public void execute(MarsRoverApp marsRoverApp) {
    	marsRoverApp.spinLeft();
    }

}
