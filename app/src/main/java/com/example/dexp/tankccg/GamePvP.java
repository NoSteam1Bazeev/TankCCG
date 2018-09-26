package com.example.dexp.tankccg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dexp.tankccg.R;

public class GamePvP extends AppCompatActivity {
    boolean choised=false,turn,Pl1=true,Pl2=false;
    Tank[] map = new Tank[20];
    Card_Tank[] arm1 = new Card_Tank[4], arm2 = new Card_Tank[4];
    int gold1,gold2, income1,income2, Active_id,Hp1,Hp2,maxHp;
    ImageButton[] iB= new ImageButton[20], iBr= new ImageButton[4];
    Button end,incomeUp;
    TextView EnemyText,HelpText;
    Deck Deck1,Deck2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        gold1=4;
        gold2=4;
        income1=2;
        income2=2;
        Hp1=30;
        Hp2=30;
        maxHp=30;
        turn=Pl1;

        for (int i=0;i<20;i++){
            map[i] = new Tank("",0,0,0,0,true);
        }

        for (int i=0;i<4;i++){
            arm1[i] = new Card_Tank("",0,0,0,0,0);
            arm2[i] = new Card_Tank("",0,0,0,0,0);
        }

        Card_Tank[] Deck_cr1= new Card_Tank[12];
        Card_Tank[] Deck_cr2= new Card_Tank[12];

        for (int i = 0; i<3;i++){
            Deck_cr1[i]=new Card_Tank("1",6,2,2,3,6);
        }
        for (int i = 3; i<6;i++){
            Deck_cr1[i]=new Card_Tank("3",2,3,2,2,2);
        }
        for (int i = 6; i<9;i++){
            Deck_cr1[i]=new Card_Tank("7",4,1,1,4,6);
        }
        for (int i = 9; i<12;i++){
            Deck_cr1[i]=new Card_Tank("8",2,9,1,2,8);
        }

        Deck1 = new Deck(Deck_cr1);

        for (int i = 0; i<3;i++){
            Deck_cr2[i]=new Card_Tank("2",5,3,1,3,6);
        }
        for (int i = 3; i<6;i++){
            Deck_cr2[i]=new Card_Tank("5",2,1,4,2,2);
        }
        for (int i = 6; i<9;i++){
            Deck_cr2[i]=new Card_Tank("4",4,1,1,4,6);
        }
        for (int i = 9; i<12;i++){
            Deck_cr2[i]=new Card_Tank("6",1,13,1,2,8);
        }

        Deck2 = new Deck(Deck_cr2);

        Deck1.random();
        Deck2.random();

        iB[0] = (ImageButton) findViewById(R.id.iB1);
        iB[1] = (ImageButton) findViewById(R.id.iB2);
        iB[2] = (ImageButton) findViewById(R.id.iB3);
        iB[3] = (ImageButton) findViewById(R.id.iB4);
        iB[4] = (ImageButton) findViewById(R.id.iB5);
        iB[5] = (ImageButton) findViewById(R.id.iB6);
        iB[6] = (ImageButton) findViewById(R.id.iB7);
        iB[7] = (ImageButton) findViewById(R.id.iB8);
        iB[8] = (ImageButton) findViewById(R.id.iB9);
        iB[9] = (ImageButton) findViewById(R.id.iB10);
        iB[10] = (ImageButton) findViewById(R.id.iB11);
        iB[11] = (ImageButton) findViewById(R.id.iB12);
        iB[12] = (ImageButton) findViewById(R.id.iB13);
        iB[13] = (ImageButton) findViewById(R.id.iB14);
        iB[14] = (ImageButton) findViewById(R.id.iB15);
        iB[15] = (ImageButton) findViewById(R.id.iB16);
        iB[16] = (ImageButton) findViewById(R.id.iB17);
        iB[17] = (ImageButton) findViewById(R.id.iB18);
        iB[18] = (ImageButton) findViewById(R.id.iB19);
        iB[19] = (ImageButton) findViewById(R.id.iB20);
        iBr[0] = (ImageButton) findViewById(R.id.iBr1);
        iBr[1] = (ImageButton) findViewById(R.id.iBr2);
        iBr[2] = (ImageButton) findViewById(R.id.iBr3);
        iBr[3] = (ImageButton) findViewById(R.id.iBr4);
        EnemyText = (TextView) findViewById(R.id.EnemyText);
        HelpText = (TextView) findViewById(R.id.HelpText);
        incomeUp = (Button) findViewById(R.id.income);
        end = (Button) findViewById(R.id.Turn);

        View.OnClickListener OnClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.iB1:
                        update(1);
                        break;
                    case R.id.iB2:
                        update(2);
                        break;
                    case R.id.iB3:
                        update(3);
                        break;
                    case R.id.iB4:
                        update(4);
                        break;
                    case R.id.iB5:
                        update(5);
                        break;
                    case R.id.iB6:
                        update(6);
                        break;
                    case R.id.iB7:
                        update(7);
                        break;
                    case R.id.iB8:
                        update(8);
                        break;
                    case R.id.iB9:
                        update(9);
                        break;
                    case R.id.iB10:
                        update(10);
                        break;
                    case R.id.iB11:
                        update(11);
                        break;
                    case R.id.iB12:
                        update(12);
                        break;
                    case R.id.iB13:
                        update(13);
                        break;
                    case R.id.iB14:
                        update(14);
                        break;
                    case R.id.iB15:
                        update(15);
                        break;
                    case R.id.iB16:
                        update(16);
                        break;
                    case R.id.iB17:
                        update(17);
                        break;
                    case R.id.iB18:
                        update(18);
                        break;
                    case R.id.iB19:
                        update(19);
                        break;
                    case R.id.iB20:
                        update(20);
                        break;
                    case R.id.EnemyText:
                        update(100);
                        break;
                    case R.id.iBr1:
                        update(21);
                        break;
                    case R.id.iBr2:
                        update(22);
                        break;
                    case R.id.iBr3:
                        update(23);
                        break;
                    case R.id.iBr4:
                        update(24);
                        break;
                    case R.id.Turn:
                        turn=!turn;
                        update(101);
                        break;
                    case R.id.income:
                        if (turn){
                            if (gold1>=5) {
                                income1 += 1;
                                gold1 -= 5;
                            }
                        }else{
                            if (gold2>=5) {
                                income2 += 1;
                                gold2 -= 5;
                            }
                        }
                        drawing();
                        break;
                    case R.id.HelpText:
                        turn=false;
                        update(100);
                        break;
                }
            }
        };
        for (int i=0;i<20;i++){
            iB[i].setOnClickListener(OnClickListner);
        }
        for (int i=0;i<4;i++){
            iBr[i].setOnClickListener(OnClickListner);
        }
        EnemyText.setOnClickListener(OnClickListner);
        HelpText.setOnClickListener(OnClickListner);
        end.setOnClickListener(OnClickListner);
        incomeUp.setOnClickListener(OnClickListner);
        drawing();
    }
    private void update(int id) {
        id -= 1;
        if (id==100){
            if (turn) {
                for (int i = 0; i < 20; i++) {
                    map[i].endTurn();
                }
                gold1 += income1;
                for (int i = 0; i < 4; i++) {
                    if (arm1[i].getName() == "") {
                        arm1[i] = Deck1.getCard();
                        break;
                    }
                }
            }else{
                for (int i = 0; i < 20; i++) {
                    map[i].endTurn();
                }
                gold2 += income2;
                for (int i = 0; i < 4; i++) {
                    if (arm2[i].getName() == "") {
                        arm2[i] = Deck2.getCard();
                        break;
                    }
                }
            }
            drawing();
        }
        else if (choised) {
            if (Active_id > 19) {
                if(id<20) {
                    if (turn) {
                        if (map[id].getName() == "" && id < 20 && id > 15) {
                            gold1 -= arm1[Active_id - 20].getCost();
                            map[id] = new Tank(arm1[Active_id - 20].getName(), arm1[Active_id - 20].getDamage(), arm1[Active_id - 20].getHp(), arm1[Active_id - 20].getSpeed(), arm1[Active_id - 20].getAtack_D(), Pl1);
                            for (int i = Active_id - 20; i < 3; i++) {
                                arm1[i] = arm1[i + 1];
                            }
                            arm1[3] = new Card_Tank("", 0, 0, 0, 0, 0);
                        }
                    } else {
                        if (map[id].getName() == "" && id <= 4 && id >= 0) {
                            gold2 -= arm2[Active_id - 20].getCost();
                            map[id] = new Tank(arm2[Active_id - 20].getName(), arm2[Active_id - 20].getDamage(), arm2[Active_id - 20].getHp(), arm2[Active_id - 20].getSpeed(), arm2[Active_id - 20].getAtack_D(), Pl2);
                            for (int i = Active_id - 20; i < 3; i++) {
                                arm2[i] = arm2[i + 1];
                            }
                            arm2[3] = new Card_Tank("", 0, 0, 0, 0, 0);
                        }
                    }
                }
            } else {
                if (id == 99) {
                    if (turn) {
                        if ((int) (Active_id / 4) < map[Active_id].getAtack_D()) {
                            Hp2 -= map[Active_id].getDamage();
                            map[Active_id].move();
                            if (Hp2 <= 0) {
                                finish();
                            }
                        }
                    } else if ((6 - (int) (Active_id / 4)) < map[Active_id].getAtack_D()) {
                        Hp1 -= map[Active_id].getDamage();
                        map[Active_id].move();
                        if (Hp1 <= 0) {
                            finish();
                        }
                    }
                } else if (id > 19) {
                    choised = false;
                    drawing();
                    return;
                } else if (map[id].getName() == "" && map[Active_id].getSpeed() >= Math.pow(Math.pow(id % 4 - Active_id % 4, 2) + Math.pow((int) (id / 4) - (int) (Active_id / 4), 2), 0.5)) {
                    map[id] = map[Active_id];
                    map[id].move();
                    map[Active_id] = new Tank("", 0, 0, 0, 0, true);
                } else if (map[id].isEnemy() != turn && map[Active_id].getAtack_D() >= Math.pow(Math.pow(id % 4 - Active_id % 4, 2) + Math.pow((int) (id / 4) - (int) (Active_id / 4), 2), 0.5)) {
                    if (map[id].damage(map[Active_id].getDamage())) {
                        map[id] = new Tank("", 0, 0, 0, 0, true);
                    }
                    map[Active_id].move();
                }
            }
            choised = false;
            drawing();
        } else {
            if (id == 99) {
                return;
            }
            if (id > 19) {
                if (turn) {
                    if (arm1[id - 20].getName() != "") {
                        if (arm1[id - 20].getCost() <= gold1) {
                            Active_id = id;
                            choised = true;
                            for (int i = 16; i < 20; i++)
                                if (map[i].getName() == "") {
                                    iB[i].setImageResource(R.drawable.green);
                                }
                        }
                    }
                } else {
                    if (arm2[id - 20].getName() != "") {
                        if (arm2[id - 20].getCost() <= gold2) {
                            Active_id = id;
                            choised = true;
                            for (int i = 0; i < 4; i++)
                                if (map[i].getName() == "") {
                                    iB[i].setImageResource(R.drawable.green);
                                }
                        }
                    }
                }
            } else {
                if (map[id].getName() != "" && map[id].isActive() && map[id].isEnemy()==turn) {
                    Active_id = id;
                    choised = true;

                    if (turn){
                        if (map[id].getAtack_D() > (int) (id / 4)) {
                            EnemyText.setBackgroundResource(R.drawable.red);
                        }
                    }else{
                        if (map[id].getAtack_D() > (5 - (int) (id / 4))) {
                            HelpText.setBackgroundResource(R.drawable.red);
                        }
                    }

                    for (int i = 0; i < 20; i++) {
                        if (map[i].getName() == "" && map[id].getSpeed() >= Math.pow(Math.pow(i % 4 - id % 4, 2) + Math.pow((int) (i / 4) - (int) (id / 4), 2), 0.5))
                            iB[i].setImageResource(R.drawable.green);
                        else if (map[i].isEnemy() !=turn && map[id].getAtack_D() >= Math.pow(Math.pow(i % 4 - id % 4, 2) + Math.pow((int) (i / 4) - (int) (id / 4), 2), 0.5)) {
                            if (map[i].getName() == "1") {
                                iB[i].setImageResource(R.drawable.tank1a);
                            } else if (map[i].getName() == "2") {
                                iB[i].setImageResource(R.drawable.tank2a);
                            } else if (map[i].getName() == "3") {
                                iB[i].setImageResource(R.drawable.tank3a);
                            } else if (map[i].getName() == "4") {
                                iB[i].setImageResource(R.drawable.tank4a);
                            } else if (map[i].getName() == "5") {
                                iB[i].setImageResource(R.drawable.tank5a);
                            } else if (map[i].getName() == "6") {
                                iB[i].setImageResource(R.drawable.tank6a);
                            } else if (map[i].getName() == "7") {
                                iB[i].setImageResource(R.drawable.tank7a);
                            } else if (map[i].getName() == "8") {
                                iB[i].setImageResource(R.drawable.tank8a);
                            }
                        }
                    }
                }
            }
        }
    }

    private void drawing(){
        HelpText.setText("P1 Hp: " + Integer.toString(Hp1) + "/" + Integer.toString(maxHp) + "  gold: " + Integer.toString(gold1));
        EnemyText.setText("P2 Hp: "+Integer.toString(Hp2)+"/"+Integer.toString(maxHp)+ "  gold: " + Integer.toString(gold2));
        if (turn){
            HelpText.setBackgroundResource(R.drawable.green);
            EnemyText.setBackgroundResource(R.drawable.white);
        }else {
            HelpText.setBackgroundResource(R.drawable.white);
            EnemyText.setBackgroundResource(R.drawable.green);
        }

        for (int i=0;i<20;i++) {
            if (map[i].getName()=="") {
                iB[i].setImageResource(R.drawable.white);
            } else if (map[i].getName() == "1") {
                iB[i].setImageResource(R.drawable.tank1);
            } else if (map[i].getName() == "2") {
                iB[i].setImageResource(R.drawable.tank2);
            } else if (map[i].getName() == "3") {
                iB[i].setImageResource(R.drawable.tank3);
            } else if (map[i].getName() == "4") {
                iB[i].setImageResource(R.drawable.tank4);
            } else if (map[i].getName() == "5") {
                iB[i].setImageResource(R.drawable.tank5);
            } else if (map[i].getName() == "6") {
                iB[i].setImageResource(R.drawable.tank6);
            } else if (map[i].getName() == "7") {
                iB[i].setImageResource(R.drawable.tank7);
            } else if (map[i].getName() == "8") {
                iB[i].setImageResource(R.drawable.tank8);
            }
            if (map[i].isEnemy()==Pl2){
                iB[i].setRotation(180);
            }else{
                iB[i].setRotation(0);
            }
        }
        if (turn) {
            for (int i = 0; i < 4; i++) {
                if (arm1[i].getName() == "") {
                    iBr[i].setImageResource(R.drawable.white);
                } else if (arm1[i].getName() == "1") {
                    iBr[i].setImageResource(R.drawable.tank1);
                } else if (arm1[i].getName() == "2") {
                    iBr[i].setImageResource(R.drawable.tank2);
                } else if (arm1[i].getName() == "3") {
                    iBr[i].setImageResource(R.drawable.tank3);
                } else if (arm1[i].getName() == "4") {
                    iBr[i].setImageResource(R.drawable.tank4);
                } else if (arm1[i].getName() == "5") {
                    iBr[i].setImageResource(R.drawable.tank5);
                } else if (arm1[i].getName() == "6") {
                    iBr[i].setImageResource(R.drawable.tank6);
                } else if (arm1[i].getName() == "7") {
                    iBr[i].setImageResource(R.drawable.tank7);
                } else if (arm1[i].getName() == "8") {
                    iBr[i].setImageResource(R.drawable.tank8);
                }
            }
        }else{
            for (int i = 0; i < 4; i++) {
                if (arm2[i].getName() == "") {
                    iBr[i].setImageResource(R.drawable.white);
                } else if (arm2[i].getName() == "1") {
                    iBr[i].setImageResource(R.drawable.tank1);
                } else if (arm2[i].getName() == "2") {
                    iBr[i].setImageResource(R.drawable.tank2);
                } else if (arm2[i].getName() == "3") {
                    iBr[i].setImageResource(R.drawable.tank3);
                } else if (arm2[i].getName() == "4") {
                    iBr[i].setImageResource(R.drawable.tank4);
                } else if (arm2[i].getName() == "5") {
                    iBr[i].setImageResource(R.drawable.tank5);
                } else if (arm2[i].getName() == "6") {
                    iBr[i].setImageResource(R.drawable.tank6);
                } else if (arm2[i].getName() == "7") {
                    iBr[i].setImageResource(R.drawable.tank7);
                } else if (arm2[i].getName() == "8") {
                    iBr[i].setImageResource(R.drawable.tank8);
                }
            }
        }
    }
}
