package com.example.darktema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
static boolean dark;
//обьявление переменной переключателя
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (dark)setTheme(R.style.NewTema);
        //если выражение верное установ ливаем тему нами созданную
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //эти две строчки не трогаем
        SwitchCompat DarkB=findViewById(R.id.switch1);
        //обьявляем переменную переключателя обращаясь по id
        DarkB.setChecked(dark);
        //при нажатии установливаем dark в true
        DarkB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
         //устанавливаем слушателя

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                dark=!dark;
                recreate();
                //когда дарк не дарк пересоздаем то есть возвращаем к исходной теме
            }
        });
    }
}