package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question10 extends AppCompatActivity {
    int count = 900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_pluto:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question10.this, "$100 earned! $1000 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question10.this, winning.class));
                }
                break;
            case R.id.radio_java:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, Losing.class));
                }
                break;
            case R.id.radio_python:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, Losing.class));
                }

                break;

            case R.id.radio_perl:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, Losing.class));
                }

                break;

        }
    }
}
