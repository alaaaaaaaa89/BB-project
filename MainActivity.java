package com.example.android.nnn;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        TextView quantityTextView1 = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView1.setText("" + number);

    }

    public void increment(View view) {

        int w;
        w= Integer.parseInt(((EditText) findViewById(R.id.editText)).getText().toString());
        w=w+1;
        display(w);
    }

    public void Dncrement(View view) {
int t;
        t= Integer.parseInt(((EditText) findViewById(R.id.editText)).getText().toString());
        t=t-1;
        display(t);


    }
}