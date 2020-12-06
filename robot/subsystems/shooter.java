/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooter extends SubsystemBase {
  

  DigitalInput digital = new DigitalInput(1);
  public shooter() {
    
  }
  public boolean isSwitchClosed(){

    return digital.get();

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
