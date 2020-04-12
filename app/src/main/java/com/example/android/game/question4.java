package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question4 extends AppCompatActivity {

    int count = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_maryland:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question4.this, "$100 earned! $400 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question4.this, question5.class));
                }
                break;
            case R.id.radio_california:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, Losing.class));
                }
                break;
            case R.id.radio_wisconsin:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, Losing.class));
                }

                break;

            case R.id.radio_michigan:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, Losing.class));
                }

                break;

        }
    }
}
