package org.project.euler;

public class StopWatch {
	
	private long startTime = 0;
	private long endTime = 0;
	
	public StopWatch start(){
		startTime = System.currentTimeMillis();
		return this;
	}
	
	public StopWatch stop(){
		endTime = System.currentTimeMillis();
		return this;
	}
	
	public long getTimeElapsed(){
		long elapsedTime = endTime - startTime;
		System.out.println("Total time taken to execute is: "+elapsedTime+" ms");
		return elapsedTime;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
	

}
