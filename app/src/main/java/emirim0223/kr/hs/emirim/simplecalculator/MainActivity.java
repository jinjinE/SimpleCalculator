package emirim0223.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_first;
    EditText edit_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_first = (EditText)findViewById(R.id.edit_first);
        edit_second = (EditText)findViewById(R.id.edit_second);
        Button but_plus = (Button)findViewById(R.id.but_plus);
        Button but_minus = (Button)findViewById(R.id.but_minus);
        Button but_multiply = (Button)findViewById(R.id.but_multiply);
        Button but_division = (Button)findViewById(R.id.but_division);
        final TextView text_result=(TextView)findViewById(R.id.text_result);

        but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(Integer.parseInt(edit_first.getText().toString()) + Integer.parseInt(edit_second.getText().toString()));
                text_result.setText(String.valueOf(num1));
            }
        });
        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(Integer.parseInt(edit_first.getText().toString()) - Integer.parseInt(edit_second.getText().toString()));
                text_result.setText(""+num1);
            }
        });
        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(Integer.parseInt(edit_first.getText().toString()) * Integer.parseInt(edit_second.getText().toString()));
                text_result.setText(""+num1);
            }
        });
        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(Integer.parseInt(edit_first.getText().toString()) / Integer.parseInt(edit_second.getText().toString()));
                text_result.setText(""+num1);
            }
        });
    }
}
