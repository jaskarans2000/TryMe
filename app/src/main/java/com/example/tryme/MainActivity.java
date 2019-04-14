package com.example.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button button;
private View windowView;
private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        windowView=(View)findViewById(R.id.windowView);
        colors =new int[]{Color.BLACK,Color.BLUE,Color.CYAN,Color.GRAY,Color.GREEN,Color.MAGENTA,Color.RED,Color.WHITE,Color.TRANSPARENT,Color.DKGRAY,Color.LTGRAY,Color.YELLOW};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomnum=(int)(Math.random()*12);
                windowView.setBackgroundColor(colors[randomnum]);
            }
        });
    }
}
