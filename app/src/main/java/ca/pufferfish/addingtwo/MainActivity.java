package ca.pufferfish.addingtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.Format;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button button;
    double num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);
        num1=num2=num3=0;
        ((View) button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTheNumbers();
            }
        });
    }

    private void addTheNumbers()
    {    num1 = Double.parseDouble(editText1.getText().toString());
         num2 = Double.parseDouble(editText2.getText().toString());
         num3 = num1 + num2;

         editText3.setText(String.format("%.2f",num3));
    }



}
