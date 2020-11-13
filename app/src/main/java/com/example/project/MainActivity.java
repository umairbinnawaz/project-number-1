package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                intent.putExtra("kalama","لآ اِلَهَ اِلّا اللّهُ مُحَمَّدٌ رَسُوُل اللّهِ");
                intent.putExtra("english","There is no god but Allah, Muhammad is the Messenger of Allah.t");
                intent.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                intent.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                startActivity(intent);

                break;
                case R.id.btn2:
                    Intent intent1=new Intent(getApplicationContext(),MainActivity4.class);
                    intent1.putExtra("kalama","اشْهَدُ انْ لّآ اِلهَ اِلَّا اللّهُ وَ اَشْهَدُ اَنَّ مُحَمَّدً اعَبْدُه وَرَسُولُه");
                    intent1.putExtra("english","I bear witness that there is no god but Allah, and I bear witness that Muhammad is a servant and a Messenger of Allah");
                    intent1.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                    intent1.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                    startActivity(intent1);

                break;
                case R.id.btn3:
                    Intent intent2=new Intent(MainActivity.this,MainActivity4.class);
                    intent2.putExtra("kalama","سُبْحَان اللهِ وَ الْحَمْدُ لِلّهِ وَ لآ اِلهَ اِلّا اللّهُ، وَ اللّهُ اَكْبَرُ وَلا حَوْلَ وَلاَ قُوَّة ِ الَّا بِاللّهِ الْعَلِىّ الْعَظِيْم");
                    intent2.putExtra("english","Glory be to Allah and Praise to Allah, and there is no god but Allah, and Allah is the Greatest.\n" +
                            "\n" +
                            "And there is no Might or Power except with Allah, the Exalted, the Great one.\n" +
                            "\n");
                    intent2.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                    intent2.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                    startActivity(intent2);

                break;
                case R.id.btn4:
                    Intent intent4=new Intent(getApplicationContext(),MainActivity4.class);
                    intent4.putExtra("kalama","سُبْحَان اللهِ وَ الْحَمْدُ لِلّهِ وَ لآ اِلهَ اِلّا اللّهُ، وَ اللّهُ اَكْبَرُ وَلا حَوْلَ وَلاَ قُوَّة ِ الَّا بِاللّهِ الْعَلِىّ الْعَظِيْم");
                    intent4.putExtra("english","Glory be to Allah and Praise to Allah, and there is no god but Allah, and Allah is the Greatest.\n" +
                            "\n" +
                            "And there is no Might or Power except with Allah, the Exalted, the Great one.\n" +
                            "\n");
                    intent4.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                    intent4.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                    startActivity(intent4);

                break;
                case R.id.btn5:

                    Intent intent5=new Intent(getApplication(),MainActivity4.class);
                    intent5.putExtra("kalama","سُبْحَان اللهِ وَ الْحَمْدُ لِلّهِ وَ لآ اِلهَ اِلّا اللّهُ، وَ اللّهُ اَكْبَرُ وَلا حَوْلَ وَلاَ قُوَّة ِ الَّا بِاللّهِ الْعَلِىّ الْعَظِيْم");
                    intent5.putExtra("english","Glory be to Allah and Praise to Allah, and there is no god but Allah, and Allah is the Greatest.\n" +
                            "\n" +
                            "And there is no Might or Power except with Allah, the Exalted, the Great one.\n" +
                            "\n");
                    intent5.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                    intent5.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                    startActivity(intent5);

                break;
                case R.id.btn6:

                    Intent intent6=new Intent(MainActivity.this,MainActivity4.class);
                    intent6.putExtra("kalama","سُبْحَان اللهِ وَ الْحَمْدُ لِلّهِ وَ لآ اِلهَ اِلّا اللّهُ، وَ اللّهُ اَكْبَرُ وَلا حَوْلَ وَلاَ قُوَّة ِ الَّا بِاللّهِ الْعَلِىّ الْعَظِيْم");
                    intent6.putExtra("english","Glory be to Allah and Praise to Allah, and there is no god but Allah, and Allah is the Greatest.\n" +
                            "\n" +
                            "And there is no Might or Power except with Allah, the Exalted, the Great one.\n" +
                            "\n");
                    intent6.putExtra("urdu","La ilaha illa-llah, Muhammadu-rasulu-lla");
                    intent6.putExtra("Arb","La ilaha illa-llah, Muhammadu-rasulu-llah");
                    startActivity(intent6);

                break;
        }

    }
}