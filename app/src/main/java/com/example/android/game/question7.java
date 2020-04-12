package com.example.android.game;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question7 extends AppCompatActivity {
    int count = 600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_calico:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(question7.this, "$100 earned! $700 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question7.this, question8.class));
                }
                break;
            case R.id.radio_persian:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, Losing.class));
                }
                break;
            case R.id.radio_blue:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, Losing.class));
                }

                break;

            case R.id.radio_tabby:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, Losing.class));
                }

                break;

        }
    }
}
