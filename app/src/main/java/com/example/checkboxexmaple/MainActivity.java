package com.example.checkboxexmaple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // initialize variable
    CheckBox java, python, php, csharp, javascript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize view's
        java = (CheckBox) findViewById(R.id.javaCheckBox);
        java.setOnClickListener(this);
        python = (CheckBox) findViewById(R.id.pythonCheckBox);
        python.setOnClickListener(this);
        php = (CheckBox) findViewById(R.id.phpCheckBox);
        php.setOnClickListener(this);
        csharp = (CheckBox) findViewById(R.id.csharpCheckBox);
        csharp.setOnClickListener(this);
        javascript = (CheckBox) findViewById(R.id.javascriptCheckBox);
        javascript.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.javaCheckBox:
                if (java.isChecked()) {
                    Toast.makeText(
                        getApplicationContext(),
                        "Java",
                        Toast.LENGTH_LONG
                    ).show();
                }
                break;

            case R.id.pythonCheckBox:
                if (python.isChecked()) {
                    Toast.makeText(
                        getApplicationContext(),
                        "Python",
                        Toast.LENGTH_LONG
                    ).show();
                }

            case R.id.phpCheckBox:
                if (php.isChecked()) {
                    Toast.makeText(
                        getApplicationContext(),
                        "PHP",
                        Toast.LENGTH_LONG
                    ).show();
                }

            case R.id.csharpCheckBox:
                if (csharp.isChecked()) {
                    Toast.makeText(
                        getApplicationContext(),
                        "C#",
                        Toast.LENGTH_LONG
                    ).show();
                }

            case R.id.javascriptCheckBox:
                if (javascript.isChecked()) {
                    Toast.makeText(
                        getApplicationContext(),
                        "Javascript",
                        Toast.LENGTH_LONG
                    ).show();
                }
        }
    }
}