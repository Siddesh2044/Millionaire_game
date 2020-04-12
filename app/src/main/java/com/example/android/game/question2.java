package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question2 extends AppCompatActivity {

    int count = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_albany:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question2.this, Losing.class));
                }
                break;
            case R.id.radio_brooklyn:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question2.this, "$100 earned! $200 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question2.this, question3.class));
                }
                break;
            case R.id.radio_trenton:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                        startActivity(new Intent(question2.this, Losing.class));
                }

                break;

            case R.id.radio_syracuse:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question2.this, Losing.class));
                }

                break;

        }
    }
}
