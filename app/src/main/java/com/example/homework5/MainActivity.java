package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей для вывода информации на экран
    private EditText massIn; // поле вывода размера массы груза
    private Button button; // кнопка обработки информации
    private TextView massOut; // поле вывода массы топлива

    // создание поля для алгоритма
    private String mass = ""; // переменная для записи входного значения

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        massIn = findViewById(R.id.massIn);
        button = findViewById(R.id.button);
        massOut = findViewById(R.id.massOut);

        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание введённого значения
            mass = massIn.getText().toString();

            // вывод полученной информации на экран
            Calculation calculation = null;
            massOut.setText("Чтобы вывести груз, понадобится " + calculation.massFuelCalculation(mass) + " кг топлива");
        }
    };
}