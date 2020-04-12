package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question3 extends AppCompatActivity {
    int count = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_philmurphy:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question3.this, "$100 earned! $300 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question3.this, question4.class));
                }
                break;
            case R.id.radio_christie:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, Losing.class));
                }
                break;
            case R.id.radio_trump:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, Losing.class));
                }

                break;

            case R.id.radio_jackson:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, Losing.class));
                }

                break;

        }
    }
}
