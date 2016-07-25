package ua.com.webacademy.beginnerslection6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Intent intent = getIntent();
        GroupP groupP = intent.getParcelableExtra("Group");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Group №: " + groupP.Number + ", students: " + groupP.Students.length);
    }
}
