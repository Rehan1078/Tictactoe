package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {


    Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 ;
    TextView playerturn;


    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int variable=0;
    int count=0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerturn = findViewById(R.id.textViewTitle);
        init();
    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        playerturn.setText("Player X Turn");
    }

    public void Conditions(View view) {
        Button btncurrent = (Button) view;
        count = count + 1;

    Log.d("style","Onactivity");

        if (btncurrent.getText().toString().equals("")) {
            if (variable == 0) {
                btncurrent.setText("X");
                variable = 1;
                playerturn.setText("Player O Turn");
//                YoYo.with(Techniques.Bounce).duration(2000).playOn(playerturn);

            } else {
                btncurrent.setText("O");
                variable = 0;
                playerturn.setText("Player X Turn");
            }
            if (count >= 5) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                //Conditions

                if (b1 == b2 && b2 == b3 && b1 != "") {
                    //1
                    Toast.makeText(this, "Player Won " + b1, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;


                } else if (b4 == b5 && b5 == b6 && b4 != "") {
                    //2
                    Toast.makeText(this, "Player Won " + b4, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b7 == b8 && b8 == b9 && b7 != "") {
                    //3
                    Toast.makeText(this, "Player Won " + b7, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b1 == b4 && b4 == b7 && b1 != "") {
                    //4
                    Toast.makeText(this, "Player Won " + b1, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b2 == b5 && b5 == b8 && b2 != "") {
                    //5
                    Toast.makeText(this, "Player Won " + b2, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b3 == b6 && b6 == b9 && b3 != "") {
                    //6
                    Toast.makeText(this, "Player Won " + b3, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b1 == b5 && b5 == b9 && b1 != "") {
                    //7
                    Toast.makeText(this, "Player Won " + b1, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                } else if (b3 == b5 && b5 == b7 && b3 != "") {
                    //8
                    Toast.makeText(this, "Player Won " + b3, Toast.LENGTH_LONG).show();
                    clearall();
                    count=0;
                }
                else if(count==9){
                    Toast.makeText(this, "Match is Drawn", Toast.LENGTH_LONG).show();
                    clearall();
                }

            }

//            else if(count>8){
//                clearall();
//            }


        }
    }
    public void clearall() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

    }


}