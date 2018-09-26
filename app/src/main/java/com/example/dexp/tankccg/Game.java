package com.example.dexp.tankccg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dexp.tankccg.R;

public class Game extends AppCompatActivity {
    Card_Tank[] Deck_cr= new Card_Tank[12];
    boolean choised=false,turn;
    Tank[] map = new Tank[20];
    Card_Tank[] arm = new Card_Tank[4];
    int gold, income, Active_id,myHp,enemyHp,maxHp;
    ImageButton[] iB= new ImageButton[20], iBr= new ImageButton[4];
    Button end, incomeUp;
    TextView EnemyText,HelpText;
    Deck myDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        gold=4;
        income=2;
        myHp=30;
        enemyHp=30;
        maxHp=30;

        for (int i=0;i<20;i++){
            map[i] = new Tank("",0,0,0,0,true);
        }

        for (int i=0;i<4;i++){
            arm[i] = new Card_Tank("",0,0,0,0,0);
        }

        if(Main.isDeck()){
            for (int i = 0; i<3;i++){
                Deck_cr[i]=new Card_Tank("1",6,2,2,3,6);
            }
            for (int i = 3; i<6;i++){
                Deck_cr[i]=new Card_Tank("3",2,3,2,2,2);
            }
            for (int i = 6; i<9;i++){
                Deck_cr[i]=new Card_Tank("7",4,1,1,4,6);
            }
            for (int i = 9; i<12;i++){
                Deck_cr[i]=new Card_Tank("8",2,9,1,2,8);
            }
            map[0] = new Tank("2",5,3,1,3,true);
            map[1] = new Tank("5",2,1,4,2,true);
            map[2] = new Tank("6",1,13,1,2,true);
            map[3] = new Tank("4",4,1,1,4,true);
        }
        else{
            for (int i = 0; i<3;i++){
                Deck_cr[i]=new Card_Tank("2",5,3,1,3,6);
            }
            for (int i = 3; i<6;i++){
                Deck_cr[i]=new Card_Tank("5",2,1,4,2,2);
            }
            for (int i = 6; i<9;i++){
                Deck_cr[i]=new Card_Tank("4",4,1,1,4,6);
            }
            for (int i = 9; i<12;i++){
                Deck_cr[i]=new Card_Tank("6",1,13,1,2,8);
            }
            map[0] = new Tank("1",6,2,2,3,true);
            map[1] = new Tank("3",2,3,2,2,true);
            map[2] = new Tank("7",4,1,1,4,true);
            map[3] = new Tank("8",2,9,1,2,true);
        }
        myDeck=new Deck(Deck_cr);
        myDeck.random();

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
        end = (Button) findViewById(R.id.Turn);
        incomeUp = (Button) findViewById(R.id.income);
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
                        turn=false;
                        update(101);
                        break;
                    case R.id.income:
                        if (gold>=5) {
                            income += 1;
                            gold -= 5;
                            drawing();
                        }
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
        end.setOnClickListener(OnClickListner);
        incomeUp.setOnClickListener(OnClickListner);
        drawing();
    }
    private void update(int id){
        if (turn){
            id-=1;
            if (choised){
                if (Active_id>19){
                    if (id>19 || id<16) {
                        choised = false;
                        drawing();
                        return;
                    }
                    if (map[id].getName()==""){
                        gold-=arm[Active_id-20].getCost();
                        map[id]= new Tank(arm[Active_id-20].getName(),arm[Active_id-20].getDamage(),arm[Active_id-20].getHp(),arm[Active_id-20].getSpeed(),arm[Active_id-20].getAtack_D(),false);
                        for (int i=Active_id-20;i<3;i++){
                            arm[i]=arm[i+1];
                        }
                        arm[3]= new Card_Tank("",0,0,0,0,0);
                        drawing();
                    }else{
                        choised = false;
                        drawing();
                        return;
                    }
                }else {
                    if (id==99)
                        if ((int)(Active_id/4)<map[Active_id].getAtack_D()){
                            enemyHp-=map[Active_id].getDamage();
                            map[Active_id].move();
                            if (enemyHp<=0){
                                finish();
                            }
                            drawing();
                            choised=false;
                            return;
                        }
                        else {
                            choised = false;
                            drawing();
                            return;
                        }
                    if (id>19){
                        choised = false;
                        drawing();
                        return;
                    }
                    if (map[id].getName()=="" && map[Active_id].getSpeed()>= Math.pow(Math.pow(id%4-Active_id%4,2)+Math.pow((int)(id/4)-(int)(Active_id/4),2),0.5)){
                        map[id]=map[Active_id];
                        map[id].move();
                        map[Active_id]=new Tank("",0,0,0,0,true);
                        choised = false;
                        drawing();
                        return;
                    }
                    if (map[id].isEnemy() && map[Active_id].getAtack_D()>= Math.pow(Math.pow(id%4-Active_id%4,2)+Math.pow((int)(id/4)-(int)(Active_id/4),2),0.5)) {
                        if (map[id].damage(map[Active_id].getDamage())){
                            map[id]= new Tank("",0,0,0,0,true);
                        }
                        map[Active_id].move();
                        choised = false;
                        drawing();
                        return;
                    }
                }
            }else {
                if (id == 99) {
                    return;
                }
                if (id > 19) {
                    if (arm[id - 20].getName() != "") {
                        if (arm[id - 20].getCost() <= gold) {
                            Active_id = id;
                            choised = true;
                            for (int i = 16; i < 20; i++)
                                if (map[i].getName() == "") {
                                    iB[i].setImageResource(R.drawable.green);
                                }
                        }
                    }
                } else {
                    if (map[id].getName() != "" && map[id].isActive() && ! map[id].isEnemy()) {
                        Active_id = id;
                        choised = true;
                        if (map[id].getAtack_D() > (int) (id / 4)) {
                            EnemyText.setBackgroundResource(R.drawable.red);
                        }
                        for (int i = 0; i < 20; i++) {
                            if (map[i].getName() == "" && map[id].getSpeed() >= Math.pow(Math.pow(i % 4 - id % 4, 2) + Math.pow((int) (i / 4) - (int) (id / 4), 2), 0.5))
                                iB[i].setImageResource(R.drawable.green);
                            else if (map[i].isEnemy() && map[id].getAtack_D() >= Math.pow(Math.pow(i % 4 - id % 4, 2) + Math.pow((int) (i / 4) - (int) (id / 4), 2), 0.5)) {
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
        }else{
            for (int i=0;i<20;i++) {
                map[i].endTurn();
            }
            gold+=income;
            turn=true;
            for (int i=0; i<4;i++){
                if (arm[i].getName()=="") {
                    arm[i] = myDeck.getCard();
                    break;
                }
            }
            drawing();
        }
    }

    private void drawing(){

        HelpText.setText("Hp: "+Integer.toString(myHp)+"/"+Integer.toString(maxHp)+"  gold: "+Integer.toString(gold));
        EnemyText.setText("Hp: "+Integer.toString(enemyHp)+"/"+Integer.toString(maxHp));
        EnemyText.setBackgroundResource(R.drawable.green);

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
            if (map[i].isEnemy()){
                iB[i].setRotation(180);
            }else{
                iB[i].setRotation(0);
            }
        }
        for (int i=0;i<4;i++) {
            if (arm[i].getName() == "") {
                iBr[i].setImageResource(R.drawable.white);
            } else if (arm[i].getName() == "1") {
                iBr[i].setImageResource(R.drawable.tank1);
            } else if (arm[i].getName() == "2") {
                iBr[i].setImageResource(R.drawable.tank2);
            } else if (arm[i].getName() == "3") {
                iBr[i].setImageResource(R.drawable.tank3);
            } else if (arm[i].getName() == "4") {
                iBr[i].setImageResource(R.drawable.tank4);
            } else if (arm[i].getName() == "5") {
                iBr[i].setImageResource(R.drawable.tank5);
            } else if (arm[i].getName() == "6") {
                iBr[i].setImageResource(R.drawable.tank6);
            } else if (arm[i].getName() == "7") {
                iBr[i].setImageResource(R.drawable.tank7);
            } else if (arm[i].getName() == "8") {
                iBr[i].setImageResource(R.drawable.tank8);
            }
        }
    }
}
