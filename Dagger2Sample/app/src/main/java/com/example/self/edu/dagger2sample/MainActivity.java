package com.example.self.edu.dagger2sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.self.edu.dagger2sample.Component.*;
import com.example.self.edu.dagger2sample.Module.Engine;
import com.example.self.edu.dagger2sample.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject
  Engine mEngine;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    //Let's Injection!!
    EngineComponent component = DaggerEngineComponent.create();
    component.inject(this);

    if (mEngine == null) {
      Log.v("injectsObject", "null");
      return;
    }


    binding.textView.setText(mEngine.info());

    binding.ignition.setOnClickListener(
            v -> Toast.makeText(getApplicationContext(), mEngine.ignition(), Toast.LENGTH_SHORT).show()
    );

    binding.brake.setOnClickListener(
            v -> Toast.makeText(getApplicationContext(), mEngine.stop(), Toast.LENGTH_SHORT).show()
    );
  }


}
