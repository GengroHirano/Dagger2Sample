package com.example.self.edu.dagger2sample.Module;

/**
 * Created by ootaakihiro on 16/03/22.
 */
public class CarEngine implements Engine{

  @Override
  public String ignition() {
    return "BRRRRRRRRRR!!";
  }

  @Override
  public String stop() {
    return "SCREECH!!";
  }

  @Override
  public String info() {
    return "CarEngine";
  }
}
