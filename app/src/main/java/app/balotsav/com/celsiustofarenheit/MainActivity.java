package app.balotsav.com.celsiustofarenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button s;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et);
        s=(Button)findViewById(R.id.submit);
        tv=(TextView)findViewById(R.id.tv);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss=et1.getText().toString();
                int k=Integer.parseInt(ss);
                float ans=k*(9/5)+32;
                String aa=(ans+"");
                tv.setText(aa);
            }
        });
    }


}
