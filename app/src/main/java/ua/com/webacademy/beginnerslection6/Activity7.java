package ua.com.webacademy.beginnerslection6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }

    public void OnClick(View v){
        Intent intent = new Intent();
        intent.putExtra("Result", "Все ок!");
        setResult(RESULT_OK, intent);
        finish();
    }
}
