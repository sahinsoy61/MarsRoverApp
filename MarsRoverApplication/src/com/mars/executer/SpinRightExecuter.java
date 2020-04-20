package com.mars.executer;

import com.mars.base.MarsRoverApp ;


public  class SpinRightExecuter implements GenericExecuter{
	
    @Override
    public void execute(MarsRoverApp marsRoverApp) {
    	marsRoverApp.spinRight();
    }


}
