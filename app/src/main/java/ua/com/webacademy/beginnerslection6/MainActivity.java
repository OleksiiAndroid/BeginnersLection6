package ua.com.webacademy.beginnerslection6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(this, Activity2.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Activity3.class);

                intent2.putExtra("Text", "Hello parameters!");

                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, Activity4.class);

                StudentS[] studentSes = new StudentS[2];

                studentSes[0] = new StudentS("Ivan", 22);
                studentSes[1] = new StudentS("Petro", 25);

                GroupS groupS = new GroupS();

                groupS.Number = "A1";
                groupS.Students = studentSes;

                intent3.putExtra("Group", groupS);

                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(this, Activity5.class);

                StudentP[] studentPs = new StudentP[2];

                studentPs[0] = new StudentP("Ivan", 22);
                studentPs[1] = new StudentP("Petro", 25);

                GroupP groupP = new GroupP();

                groupP.Number = "A2";
                groupP.Students = studentPs;

                intent4.putExtra("Group", groupP);

                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(this, Activity6.class);
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(this, Activity7.class);
                startActivityForResult(intent6, 1);
                break;
            case R.id.button7:
                Intent intent10 = new Intent(this, Activity8.class);
                startActivity(intent10);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                String text = data.getStringExtra("Result");

                TextView textView6 = (TextView) findViewById(R.id.textViewResult6);
                textView6.setText(text);
            }
        }
    }
}
