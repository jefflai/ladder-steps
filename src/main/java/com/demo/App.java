package com.demo;

/**
 *  One ladder has 100 steps high, one rabbit can jump 1-4 steps each time, get the total possibilities the rabbit can jump.
 *  For example: 1,1,1,1,…1 (100 times of 1), 2,2,2,2 … (50 times of 2), etc.
 */
public class App {

    public static int countPossibilities(int ladderStepsCount) {
    	if (ladderStepsCount < 1) {
    		throw new IllegalArgumentException("ladderStepsCount must be a postive integer");
    	}
    	
    	return countPossibilitiesHelper(ladderStepsCount, 1) 
    			+ countPossibilitiesHelper(ladderStepsCount, 2) 
    			+ countPossibilitiesHelper(ladderStepsCount, 3) 
    			+ countPossibilitiesHelper(ladderStepsCount, 4);
    }
    
    public static int countPossibilitiesHelper(int ladderStepsRemaining, int stepSizeToTake) {
    	if (ladderStepsRemaining >= stepSizeToTake) {
    		ladderStepsRemaining -= stepSizeToTake;
    	} else {
    		return 0;
    	}
    	
    	if (ladderStepsRemaining == 0) {
    		return 1;
    	}
    	
    	return countPossibilitiesHelper(ladderStepsRemaining, 1) 
    			+ countPossibilitiesHelper(ladderStepsRemaining, 2) 
    			+ countPossibilitiesHelper(ladderStepsRemaining, 3) 
    			+ countPossibilitiesHelper(ladderStepsRemaining, 4);
    }
    
}
