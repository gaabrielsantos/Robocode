package Robo;
import robocode.*;
import java.awt.Color;

/**
 * ATOM - a robot by Joao Gabriel, William Correia e Jamensson Kardec
 */
public class ATOM extends AdvancedRobot
{
	/**
	 * run: ATOM's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:
		setColors(Color.black,Color.black,Color.blue); // corpo,arma,radar

		// Robot main loop
		while(true) {
			setAhead(100);               //vai para frente (pixel)
			setTurnRight(90);            //gira o robo (graus)
			setTurnGunRight(15);		 //gira a arma para direita (graus)
			setTurnGunLeft(15);			 //gira a arma para esquerda (graus)
			setBack(100);                //vai para trás (pixel)
			execute();
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		// se encontrar outro robo(quantida/potencia)
		fire(2);
		fire(2);
		fire(2);
		fire(2);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		// Levar tiro
		setAhead(200);
		setBack(50);
	}
	
	public void onHitWall(HitWallEvent e) {
		// Bater na parede
		setBack(100);
		setAhead(150);
	}	
}
