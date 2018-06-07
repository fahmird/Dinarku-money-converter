package thortechasia.android.dinarku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    void convertIdrToKwd()
    {  EditText idr= (EditText) findViewById(R.id.idr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  kwd=(EditText) findViewById(R.id.kwd);
        kwd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(idr.getText().toString());
        double result=a*0.000021786432;
        kwd.setText(String.valueOf(result));

    }

    void convertKwdToIdr()
    {  EditText idr= (EditText) findViewById(R.id.idr);
        idr.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  kwd=(EditText) findViewById(R.id.kwd);
        kwd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(kwd.getText().toString());
        double result=a/0.000021786432;
        idr.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertIdrToKwd();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText idr= (EditText) findViewById(R.id.idr);
        EditText  kwd=(EditText) findViewById(R.id.kwd);
        idr.setText("");
        kwd.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertKwdToIdr();
    }



}