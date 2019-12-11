package com.test.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText value_a, value_b, value_result;
    Button btnCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value_a = findViewById(R.id.value_a);
        value_b = findViewById(R.id.value_b);
        value_result = findViewById(R.id.value_result);

        btnCalculate = findViewById(R.id.calculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n"})
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(value_a.getText()) || TextUtils.isEmpty(value_b.getText())) {
                    Toast.makeText(getApplicationContext(), "value A / value B cannot empty.", Toast.LENGTH_LONG).show();
                } else {
                    int result = calculate(value_a.getText(), value_b.getText());
                    value_result.setText(""+result);
                }
            }
        });
    }

    /**
     * calculate
     * @param value_a
     * @param value_b
     * @return
     */
    private int calculate(Editable value_a, Editable value_b) {
        return Integer.parseInt(value_a.toString()) + Integer.parseInt(value_b.toString());
    }
}
