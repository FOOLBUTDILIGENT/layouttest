package cn.itcast.layouttest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1=(TextView)findViewById(R.id.test2_text1);
        text2=findViewById(R.id.test2_text2);
        text3=findViewById(R.id.test2_text3);
        text4=findViewById(R.id.test2_text4);
        text5=findViewById(R.id.test2_text5);
        text6=findViewById(R.id.test2_text6);
        text7=findViewById(R.id.test2_text7);
        text1.setBackgroundColor(Color.RED);
        text2.setBackgroundColor(Color.parseColor("#FFA500"));
        text3.setBackgroundColor(Color.YELLOW);
        text4.setBackgroundColor(Color.BLUE);
        text5.setBackgroundColor(Color.GREEN);
        text6.setBackgroundColor(Color.parseColor("#4B0082"));
        text7.setBackgroundColor(Color.parseColor("#EE82EE"));
        but1=findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
