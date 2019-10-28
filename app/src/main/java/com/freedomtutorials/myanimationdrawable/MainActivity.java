package com.freedomtutorials.myanimationdrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button objButton = (Button)findViewById(R.id.aniButton);

        objButton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v)
                    {
                        ImageView imgView = (ImageView) findViewById(R.id.spin_image);
                        imgView.setBackgroundResource( R.drawable.spin_animation_ad);

                        AnimationDrawable objAnimationDrawable = (AnimationDrawable) imgView.getBackground();

                        objAnimationDrawable.start();

                        Toast.makeText( getApplicationContext(), "Animation Started", Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
