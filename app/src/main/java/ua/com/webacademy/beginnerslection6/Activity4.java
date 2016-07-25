package ua.com.webacademy.beginnerslection6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Intent intent = getIntent();
        GroupS groupS = (GroupS) intent.getSerializableExtra("Group");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Group №: " + groupS.Number + ", students: " + groupS.Students.length);
    }
}
