package com.example.android_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

/*    private Button button_1,button_2,button_3;
    private EditText usertext,passtext;
    private String nameString,passString;*/
/*    @SuppressLint("MissingInflatedId")*/
    RadioGroup radiogroup;
    TextView textView;
    CheckBox checkBox_1,checkBox_2,checkBox_3;
    TextView hobby;
    @SuppressLint("MissingInflatedId")
    @Override//复写
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xianxing);
        checkBox_1=findViewById(R.id.check1);
        checkBox_2=findViewById(R.id.check2);
        checkBox_3=findViewById(R.id.check3);
        hobby=findViewById(R.id.textview11);
/*        radiogroup=findViewById(R.id.group_1);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                Toast.makeText(MainActivity.this, "你选择了性别为" + radioButton.getText(), Toast.LENGTH_LONG).show();
            }
        });*/
        checkBox_1.setOnCheckedChangeListener(this);
        checkBox_2.setOnCheckedChangeListener(this);
        checkBox_3.setOnCheckedChangeListener(this);
        //Toast.makeText(MainActivity.this,"sada",Toast.LENGTH_LONG).show();


/*        Button buttonn_1=findViewById(R.id.button1);
        Button button_2=findViewById(R.id.button2);
        Button button_3=findViewById(R.id.button3);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "内部类", Toast.LENGTH_SHORT).show();
            }
        });*/





/*        usertext=findViewById(R.id.text3);
        passtext=findViewById(R.id.text4);
        button_1=findViewById(R.id.button1);
        button_2=findViewById(R.id.button2);
        button_3=findViewById(R.id.button2);
        button_3.setOnClickListener(this);
        */

/*

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString=usertext.getText().toString();
                passString=usertext.getText().toString();
                Toast.makeText(MainActivity.this, "用户名"+nameString+"密码"+passString, Toast.LENGTH_SHORT).show();

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString=usertext.getText().toString();
                passString=usertext.getText().toString();
                Toast.makeText(MainActivity.this, "用户名"+nameString+"密码"+passString, Toast.LENGTH_SHORT).show();
            }
        });
*/



    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.isChecked())
            Toast.makeText(MainActivity.this,"你选择了"+compoundButton.getText(),Toast.LENGTH_SHORT).show();
    }

/*    public void login(View view) {
        Toast.makeText(this, "用户名"+nameString+"密码"+passString, Toast.LENGTH_SHORT).show();
        nameString=usertext.getText().toString();
        passString=usertext.getText().toString();
    }*/

/*    @Override
    public void onClick(View view) {
        nameString=usertext.getText().toString();
        passString=usertext.getText().toString();
        Toast.makeText(MainActivity.this, "用户名"+nameString+"密码"+passString, Toast.LENGTH_SHORT).show();
    }*/
/*    public void wx(View view){
        Toast.makeText(this, "微信界面", Toast.LENGTH_SHORT).show();
    }
    public void fx(View view){
        Toast.makeText(this, "发现界面", Toast.LENGTH_SHORT).show();
    }
    public void w(View view){
        Toast.makeText(this, "个人空间", Toast.LENGTH_SHORT).show();
    }
    public void txl(View view){
        Toast.makeText(this, "通讯录界面", Toast.LENGTH_SHORT).show();
    }*/










}
