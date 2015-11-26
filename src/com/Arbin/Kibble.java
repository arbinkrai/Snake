package com.Arbin;

import java.util.Random;
import java.awt.Graphics;
public class Kibble {

	/** Identifies a random square to display a kibble
	 * Any square is ok, so long as it doesn't have any snake segments in it. 
	 * 
	 */
	
	private int kibbleX; //This is the square number (not pixel)
	private int kibbleY;  //This is the square number (not pixel)
//	private int wallX;
//	private int wallY;
//	private int wallX1;
//	private int wallY1;
	public Kibble(Snake s){
		//Kibble needs to know where the snake is, so it does not create a kibble in the snake
		//Pick a random location for kibble, check if it is in the snake
		//If in snake, try again
		
		moveKibble(s);
	}
//	public void wall(){
//		Random rand=new Random();
//		boolean kibbleInSnake = true;
//		while(wallInSnake==ture){
//		wallX=rand.nextInt()(SnakeGame.xSquares);
//		wallY=rand.nextInt()(SnakeGame.ySquares);
//		wallInSnake=s.isSnakeSegment(wallX,wallY);
//	}}
	protected void moveKibble(Snake s){
		
		Random rng = new Random();
		boolean kibbleInSnake = true;
		while (kibbleInSnake == true) {
			//Generate random kibble location
			kibbleX = rng.nextInt(SnakeGame.xSquares);
			kibbleY = rng.nextInt(SnakeGame.ySquares);
			kibbleInSnake = s.isSnakeSegment(kibbleX, kibbleY);
		}
		
		
	}

	public int getKibbleX() {
		return kibbleX;
	}

	public int getKibbleY() {
		return kibbleY;
	}


	
}
