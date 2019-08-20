package ua.com.webacademy.beginnerslection6;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent = getIntent();
        String text = intent.getStringExtra("Text");

        TextView textView =  findViewById(R.id.textView);
        textView.setText(text);
    }
}
