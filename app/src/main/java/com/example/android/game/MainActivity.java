package com.example.android.game;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.radio_pirates:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, Losing.class));
                }
                break;

            case R.id.radio_ninjas:
                if (checked) {
                    count += 100;
                    Toast toastCorrect = Toast.makeText(MainActivity.this, "$100 earned! $100 total!", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(MainActivity.this, question2.class));
                }
                break;

            case R.id.radio_warlocks:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, Losing.class));
                }
                break;

            case R.id.radio_cowboys:
                if (checked) {
                    Toast toastWrong = Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(MainActivity.this, Losing.class));
                }
                break;

        }
    }
}