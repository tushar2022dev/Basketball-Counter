package android.example.b_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView n1 = findViewById(R.id.name1);
        TextView n2 = findViewById(R.id.name2);

        n1.setVisibility(View.GONE);
        String a = getIntent().getStringExtra("team1");
        String b = getIntent().getStringExtra("team2");



        n1.setText(a);
        n2.setText(b);
        n1.setVisibility(View.VISIBLE);
    }

    private int score_a = 0;

    private void displaya(int num) {
        TextView scorea = (TextView) findViewById(R.id.scoreA);
        scorea.setText(""+num);
    }

    public void upA3(View view) {
        score_a+=3;
        displaya(score_a);
    }

    public void upA1(View view) {
        score_a+=1;
        displaya(score_a);
    }

    public void upA2(View view) {
        score_a+=2;
        displaya(score_a);
    }

    private int score = 0;

    private void display(int num) {
        TextView scorea = (TextView) findViewById(R.id.scoreB);
        scorea.setText(""+num);
    }

    public void upB3(View view) {
        score+=3;
        display(score);
    }

    public void upB1(View view) {
        score+=1;
        display(score);
    }

    public void upB2(View view) {
        score += 2;
        display(score);
    }

    public void res(View view ) {
        Toast toast = Toast.makeText(getApplicationContext()," Scores reset ",Toast.LENGTH_LONG);
        toast.show();
        score_a = 0;
        score = 0;
        display(score);
        displaya(score);
    }

}