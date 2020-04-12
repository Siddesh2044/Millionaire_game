package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question6 extends AppCompatActivity {

    public int count = 500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_hockey:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, Losing.class));
                }
                break;
            case R.id.radio_polo:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question6.this, "$100 earned! $600 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question6.this, question7.class));
                }
                break;
            case R.id.radio_curling:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, Losing.class));
                }

                break;

            case R.id.radio_golf:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question6.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question6.this, Losing.class));
                }

                break;

        }
    }
}
