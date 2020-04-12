package com.example.android.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question8 extends AppCompatActivity {
    int count = 700;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_lesotho:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question8.this, "$100 earned! $800 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question8.this, question9.class));
                }
                break;
            case R.id.radio_russia:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question8.this, Losing.class));
                }
                break;
            case R.id.radio_madagascar:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question8.this, Losing.class));
                }

                break;

            case R.id.radio_mexico:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question8.this, Losing.class));
                }

                break;

        }
    }
}
