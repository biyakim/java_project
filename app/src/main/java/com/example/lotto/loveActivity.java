package com.example.lotto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class loveActivity extends AppCompatActivity {

    ImageButton button;
    TextView textView;
    ImageButton home;

    List<String> cardValues,cardnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        home = findViewById(R.id.home_btn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loveActivity.this, homeActivity.class);
                startActivity(intent);
            }
        });

        cardValues = new ArrayList<>();
        cardnumber = new ArrayList<>();

        cardValues.add("더 신중해지세요!");
        cardValues.add("주위 사람에게 다정해져보세요!");
        cardValues.add("오늘은 불안합니다!");
        cardValues.add("등잔 밑이 어둡다!");
        cardValues.add("가까운 사람을 잘 보세요!");
        cardValues.add("누군가 당신에게 다가옵니다!");
        cardValues.add("오늘은 나가보세요!");
        cardValues.add("자신을 어필하세요!");
        cardValues.add("좋아하는 사람이 있다면 다정해져보세요!");
        cardValues.add("사랑이 찾아옵니다!");
        cardValues.add("누군가가 당신에게 다가오고 있어요!");
        cardValues.add("누군가를 함부로 믿지 마세요!");
        cardValues.add("몸을 조심하세요!");
        cardValues.add("모든지 조심!");
        cardValues.add("오늘을 쉬는게 좋아요!");

        cardnumber.add("12");
        cardnumber.add("70");
        cardnumber.add("56");
        cardnumber.add("79");
        cardnumber.add("100");
        cardnumber.add("89");
        cardnumber.add("96");
        cardnumber.add("99");
        cardnumber.add("43");
        cardnumber.add("30");
        cardnumber.add("92");
        cardnumber.add("57");
        cardnumber.add("78");
        cardnumber.add("16");
        cardnumber.add("33");


        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Random r = new Random();
                String randomValue = cardValues.get(r.nextInt(cardValues.size()));
                String randomnumbers = cardnumber.get(r.nextInt(cardnumber.size()));

                textView.setText("\n"+"                 "+randomnumbers+"\n"+"\n"+"\n"+randomValue);
            }
        });
    }

}