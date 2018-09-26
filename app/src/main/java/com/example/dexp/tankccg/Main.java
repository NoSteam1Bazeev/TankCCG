package com.example.dexp.tankccg;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Main extends AppCompatActivity {
    private Button bt1,bt2,PvP;
    private static boolean deck=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        PvP = (Button) findViewById(R.id.PvP);

        View.OnClickListener OnClickListnerMain = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bt1:
                        deck=true;
                        Intent intent = new Intent(Main.this, Game.class);
                        startActivity(intent);
                        break;
                    case R.id.bt2:
                        deck=false;
                        Intent intent2 = new Intent(Main.this, Game.class);
                        startActivity(intent2);
                        break;
                    case R.id.PvP:
                        Intent intent3 = new Intent(Main.this, GamePvP.class);
                        startActivity(intent3);
                        break;
                }
            }
        };

        bt1.setOnClickListener(OnClickListnerMain);
        bt2.setOnClickListener(OnClickListnerMain);
        PvP.setOnClickListener(OnClickListnerMain);
    }

    public static boolean isDeck() {
        return deck;
    }
}
