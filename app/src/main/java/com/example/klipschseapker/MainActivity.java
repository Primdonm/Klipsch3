package com.example.klipschseapker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

//Todo Add scroll bar
public class MainActivity extends AppCompatActivity {

    //variables
    Button btnCalculate, btnReset;
    Spinner spinSpeaker;
    EditText editLength, editWidth, editHeight;
    String t1,t2,t3;

    int numLength, numWidth, numHeight, numResult=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting variables to GUI elements
        btnCalculate= findViewById(R.id.btnCalculate);
        btnReset = findViewById(R.id.btnReset2);
        spinSpeaker = findViewById(R.id.spinSpeaker);
        editLength= findViewById(R.id.editLength);
        editWidth = findViewById(R.id.editWidth);
        editHeight = findViewById(R.id.editHeight);

        //Adding check for focus on the keyboard
        //todo work on adding focus on the keyboard/no focus
        //https://stackoverflow.com/questions/33295310/clear-edittext-focus-and-hide-keyboard-when-clicked-or-touched-another-views
        editLength.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (v.getId() == R.id.editLength && !hasFocus) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                }
            }
        });


        //adding function to the calculate button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //parsing text to integers
                t1=editLength.getText().toString();
                t2=editWidth.getText().toString();
                t3=editHeight.getText().toString();


                if (t3.equals("")) {
                    editHeight.setText("11");
                }else if (t2.equals("")) {
                    editWidth.setText("11");
                }else if (t1.equals("")) {
                    editLength.setText("11");
                }else{
                    numLength = Integer.parseInt(t1);
                    numWidth = Integer.parseInt(t2);
                    numHeight = Integer.parseInt(t3);
                }
                //todo figure out a check for no item selected.
                //alert to contact Pro design
                if ((numLength>=999)||(numWidth>=999)||(numHeight>=20)) {

                    Toast.makeText(MainActivity.this, R.string.contactPro,
                            Toast.LENGTH_LONG).show();
                }else {
                    //calculating volume
                    numResult = numHeight * numWidth * numLength;

                    //sending data to other activities
                    Intent intent = new Intent(MainActivity.this, Result.class);
                    intent.putExtra("varHeight", numHeight);
                    intent.putExtra("varWidth", numWidth);
                    intent.putExtra("varLength", numLength);
                    intent.putExtra("varResult", numResult);
                    startActivity(intent);
                }
            }
        });
}
    //todo watch video about spinners.
    //todo figure out what the spinner is needed for
    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
             parent.getItemAtPosition(pos);
            //Spinner spinner = (Spinner) findViewById(R.id.spinner);
            spinSpeaker.setOnItemSelectedListener(this);

        }

        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }
    }
    //Reset button main activity onClick event set in widget
    public void reset(View v){
        //reset values
        numHeight =0;
        numWidth = 0;
        numLength =0;
        numResult=0;
        editHeight.setText("0");
        editWidth.setText("0");
        editLength.setText("0");
    }
}
