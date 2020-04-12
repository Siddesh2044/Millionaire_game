package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question9 extends AppCompatActivity {
    int count = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_hendrix:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question9.this, "$100 earned! $800 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question9.this, question10.class));
                }
                break;
            case R.id.radio_ringo:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, Losing.class));
                }
                break;
            case R.id.radio_john:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, Losing.class));
                }

                break;

            case R.id.radio_paul:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, Losing.class));
                }

                break;

        }
    }
}

