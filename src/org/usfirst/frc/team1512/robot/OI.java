package org.usfirst.frc.team1512.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1512.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public Joystick stick;
	public Joystick driveStick;
	public JoystickButton AButton;
	public JoystickButton BButton;
	public JoystickButton XButton;
	public JoystickButton YButton;
	public JoystickButton LBumper;
	public JoystickButton RBumper;
	
	public JoystickButton testBack;
	public JoystickButton testStart;

	
	public OI(){
		stick = new Joystick(0);
		driveStick = new Joystick(1);
		AButton = new JoystickButton(stick, 1);
		BButton = new JoystickButton(stick, 2);
		XButton = new JoystickButton(stick, 3);
		YButton = new JoystickButton(stick, 4);
		LBumper = new JoystickButton(stick, 5);
		RBumper = new JoystickButton(stick, 6);
		testBack = new JoystickButton(stick, 7);
		testStart = new JoystickButton(stick, 8);
	}
	
//	public double getX(){
//		double X = stick.getXL();
//		return X;
//	}
//	
//	public double getY(){
//		double Y = stick.getYL();
//		return Y;
//	}
//	
//	public double getROT(){
//		double ROT = stick.getXR();
//		return ROT;
//	}
//	
//	public double testLX()
//	{
//		if (stick.APressed()){
//			return getX();
//		}
//		return 0;
//	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
