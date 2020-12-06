/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Analog extends SubsystemBase {
  /**
   * Creates a new Analog.
   */
  AnalogInput analog = new AnalogInput(0);
  public Analog() {
    
    analog.setAverageBits(4);

  }
  public Integer getanalogvalue(){
    
    return analog.getAverageValue();

  }

  @Override
  public void periodic() {
    analog.setAccumulatorInitialValue(0);

    analog.setAccumulatorCenter(0);

    analog.getAccumulatorCount();// Number of sample

    analog.getAccumulatorValue();//Sum of all values

    analog.resetAccumulator();
  }
}
