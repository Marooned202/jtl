package com.ehsan.jtl;

import java.util.Scanner;

public class InputStateDiagram {
	public StateDiagram getStateDiagram() {
		StateDiagram stateDiagram = new StateDiagram();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Module: ");
	    String module = scanner.nextLine();
	    stateDiagram.setModule(module);
	    
	    System.out.println("Argument: ");
	    String argument = scanner.nextLine();
	    stateDiagram.setArgument(argument);
	    
	    while (true) {
	    	System.out.println("State"+stateDiagram.getStateDiagram().keySet()+": (# to end)");
	    	String state = scanner.nextLine();
	    	if (state.equals("#")) break;
	    	stateDiagram.addState(state);
	    }
	    
	    for (String state: stateDiagram.getStateDiagram().keySet()) {
	    	while (true) {
		    	
	    		System.out.printf("For State %s, Enter Action: (# to end)\n", state);
		    	String action = scanner.nextLine();
		    	if (action.equals("#")) break;
		    	
		    	System.out.printf("For State %s, Action %s, Enter Transition State%s: (# to end)\n", 
		    			state, action, stateDiagram.getStateDiagram().keySet());
		    	String transition = scanner.nextLine();
		    	if (transition.equals("#")) break;
		    	
		    	stateDiagram.addTransitionState(state, action, transition);
		    }
	    }
	    
	    scanner.close();
		return stateDiagram;
	}
}
