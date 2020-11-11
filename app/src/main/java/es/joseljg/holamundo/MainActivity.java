package es.joseljg.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_saludo = null;
    EditText edt_saludo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_saludo = (EditText) findViewById(R.id.edt_saludo);
        txt_saludo = (TextView) findViewById(R.id.txt_saludo);

    }

    public void saludar(View view)
    {
        String saludo = String.valueOf(edt_saludo.getText());
        txt_saludo.setText(saludo);
    }
}