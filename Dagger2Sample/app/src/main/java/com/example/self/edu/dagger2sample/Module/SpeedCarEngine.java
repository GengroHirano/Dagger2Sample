package com.example.self.edu.dagger2sample.Module;

/**
 * Created by ootaakihiro on 16/03/22.
 */
public class SpeedCarEngine implements Engine {

  @Override
  public String ignition() {
    return "WHEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE";
  }

  @Override
  public String stop() {
    return "SCREEEEEEEEEEEEECH!!";
  }

  @Override
  public String info() {
    return "SpeedCarEngine";
  }
}
