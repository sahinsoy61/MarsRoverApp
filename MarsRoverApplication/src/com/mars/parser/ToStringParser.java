package com.mars.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mars.executer.ForwardMoveExecuter;
import com.mars.executer.GenericExecuter;
import com.mars.executer.SpinLeftExecuter;
import com.mars.executer.SpinRightExecuter;

public class ToStringParser {
	

	    private static Map<String, GenericExecuter> map = new HashMap<String, GenericExecuter>() {{
	    	put("R", new SpinRightExecuter());
	        put("L", new SpinLeftExecuter());
	        put("M", new ForwardMoveExecuter());
	    }};

	    private String value;

	    public ToStringParser(String value) {
	        this.value = value;
	    }

	    public List<GenericExecuter> exec() {
		if (null == value || value.trim().length() == 0) {
			return new ArrayList<GenericExecuter>();
		}
	        return execute(value);
	    }

	    private List<GenericExecuter> execute(String value) {
	        List<GenericExecuter> genericExecuter = new ArrayList<GenericExecuter>();

	        for(String character : charactersFrom(value)) {
	            if (character == null) 
	            break;
	            
	            
	            GenericExecuter mapped = control(character);
	            genericExecuter.add(mapped);
	        }

	        return genericExecuter;
	    }

	    private String[] charactersFrom(String value) {
	        return Arrays.copyOfRange(value.split(""), 0, value.length() + 1);
	    }

	    private GenericExecuter control(String value) {
	        return map.get(value);
	    }

}
