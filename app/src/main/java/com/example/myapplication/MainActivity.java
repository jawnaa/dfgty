package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button button;
    EditText currencyToBeConverted;
    EditText currencyConverted;
    Spinner convertToDropdown;
    Spinner convertFromDropdown;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponents();
    }

    private void connectComponents() {
        currencyConverted = (EditText) findViewById(R.id.currency_converted);
        currencyToBeConverted = (EditText) findViewById(R.id.currency_to_be_converted);
        convertToDropdown = (Spinner) findViewById(R.id.to);
        convertFromDropdown = (Spinner) findViewById(R.id.from);
        button = (Button) findViewById(R.id.converte);
        img = (ImageView) findViewById(R.id.IvCurrency);
    }



    public void converte(View view) {

    img.setImageResource(R.drawable.dollars);
    }

}
