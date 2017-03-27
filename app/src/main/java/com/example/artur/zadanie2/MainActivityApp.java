package com.example.artur.zadanie2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityApp extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_app);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk1");
            }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk2");
            }

        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Wciśnięto przycisk3");
            }

        });

        final EditText edytowany = (EditText)findViewById(R.id.first);
        final EditText edytowany2 = (EditText)findViewById(R.id.last);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText(edytowany.getText());
                TextView textView2 = (TextView) findViewById(R.id.textView3);
                textView2.setText(edytowany2.getText());
            }

        });
    }
}
