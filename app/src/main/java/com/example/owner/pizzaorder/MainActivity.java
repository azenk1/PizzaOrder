package com.example.owner.pizzaorder;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Radio buttons
    RadioButton smallRB;
    RadioButton mediumRB;
    RadioButton largeRB;

    //Checkboxes
    CheckBox extraCheeseCB;
    CheckBox deliveryCB;

    //Total TextView
    TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smallRB = (RadioButton) findViewById(R.id.smallRadioButton);
        mediumRB = (RadioButton) findViewById(R.id.mediumRadioButton);
        largeRB = (RadioButton) findViewById(R.id.largeRadioButton);

        extraCheeseCB = (CheckBox) findViewById(R.id.extraCheeseCheckBox);
        deliveryCB = (CheckBox) findViewById(R.id.deliveryCheckBox);

        totalTV = (TextView) findViewById(R.id.totalTextView);
    }

    public void smallClicked(View view)
    {
        mediumRB.setEnabled(false);
        largeRB.setEnabled(false);
    }

    public void mediumClicked(View view)
    {
        smallRB.setEnabled(false);
        largeRB.setEnabled(false);
    }

    public void largeClicked(View view)
    {
        smallRB.setEnabled(false);
        mediumRB.setEnabled(false);
    }
    public void calculateTotal(View view)
    {
        Double total = 0.00;

        if(smallRB.isChecked())
        {
            total += 7.00;
        }

        if(mediumRB.isChecked())
        {
            total += 9.00;
        }

        if(largeRB.isChecked())
        {
            total += 13.00;
        }

        if(extraCheeseCB.isChecked())
        {
            total += 1.75;
        }

        if(deliveryCB.isChecked())
        {
            total += 2.50;
        }

        totalTV.setText(String.format("Total is $%.2f", total));
    }
}
