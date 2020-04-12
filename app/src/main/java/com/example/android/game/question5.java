package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question5 extends AppCompatActivity {

    int count = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_dicaprio:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question5.this, "$100 earned! $500 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question5.this, question6.class));
                }
                break;
            case R.id.radio_pratt:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }
                break;
            case R.id.radio_pitt:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }

                break;

            case R.id.radio_cruise:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, Losing.class));
                }

                break;

        }
    }
}
