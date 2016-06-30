package com.example.self.edu.dagger2sample.Component;

import com.example.self.edu.dagger2sample.MainActivity;
import com.example.self.edu.dagger2sample.Module.EngineModule;
import com.example.self.edu.dagger2sample.Module.SpeedEngineModule;

import dagger.Component;

/**
 * Created by ootaakihiro on 16/03/22.
 */
@Component(modules = EngineModule.class)
public interface EngineComponent {

  //依存オブジェクトを欲しているActivityに対してInjectionするので
  //Activity activityとやるとInjectionできない。
  void inject(MainActivity activity);

}
