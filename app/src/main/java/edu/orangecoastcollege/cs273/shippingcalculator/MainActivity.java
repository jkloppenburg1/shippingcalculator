package edu.orangecoastcollege.cs273.shippingcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static java.text.NumberFormat currency = java.text.NumberFormat.getCurrencyInstance();


    EditText weightEditText;
    TextView weightOfTextView;
    TextView baseCostTextView;
    TextView addedCostTextView;
    TextView totalCostTextView;

    private ShippingCost myShipping = new ShippingCost();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = (EditText) findViewById(R.id.weightEditText);
        weightOfTextView = (TextView) findViewById(R.id.wieghtOfTextView);
        baseCostTextView = (TextView) findViewById(R.id.baseCostTextView);
        addedCostTextView = (TextView) findViewById(R.id.addedCostTextView);
        totalCostTextView = (TextView) findViewById(R.id.totalCostTextView);

        weightEditText.addTextChangedListener(amountTextChangedListener);
    }

    private TextWatcher amountTextChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try
            {
                if (charSequence.length() > 0)
                {
                    int amount = Integer.parseInt(charSequence.toString());
                    myShipping.setWeight(amount);
                }
                else
                {
                    myShipping.setWeight((0));
                }
            }

            catch (NumberFormatException e)
            {
                weightEditText.setText("");
            }

            //No exception, input is valid:

            updateViews();
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    private void updateViews()
    {
        weightOfTextView.setText(String.valueOf(myShipping.getWeight()));
        baseCostTextView.setText(currency.format(myShipping.getBaseCost()));
        addedCostTextView.setText(currency.format(myShipping.getAddedCost()));
        totalCostTextView.setText(currency.format(myShipping.getTotalCost()));
    }
}
