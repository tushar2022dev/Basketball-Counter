package android.example.b_score;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1 = findViewById(R.id.editTextTextPersonName);
        EditText et2 = findViewById(R.id.editTextTextPersonName2);

        Button btn1 = findViewById(R.id.buttonx);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,android.example.b_score.Activity2.class);
                String teama = et1.getText().toString().trim();
                String teamb = et2.getText().toString().trim();

                if(teama.isEmpty()||teamb.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter team names",Toast.LENGTH_SHORT).show();
                }
                else{
                   intent.putExtra("team1",teama);
                   intent.putExtra("team2",teamb);
                   startActivity(intent);

                }

            }



        });


    }





}