package com.example.self.edu.dagger2sample.Module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ootaakihiro on 16/03/22.
 */
@Module
public class EngineModule {

  @Provides
  public Engine provideEngine() {
    return new CarEngine();
  }

}
