package com.example.zack.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

//Coding test: 1. Create an application that generates a random number and updates
// the textview with that number. The random number generation will be done in a separate thread.
// You cannot pass the textview to the thread.
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.btnRandNumGen);
        RandomAsyncTask task = new RandomAsyncTask();
        task.execute();
        addOddNumbers();
        validateEmailAddress("zwrpro@gmail.com");
        validateEmailAddress("zwr.com@pro"); // Validator is simple
        validateEmailAddress("zwrprogmail");
    }


    // Called from AsyncTask
    public void setRandMain(int i) {
        tv.setText(i);
    }

    //Create a Java function to add the odd numbers in the “List” of numbers.
    public void addOddNumbers() {
        int[] i = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum = 0;
        int cursor;

        for (int j = 0; j < 20; j++) {
            cursor = i[j];
            Log.d(TAG, "addOddNumbers: " + cursor);
            if (cursor%2 != 0){
                sum += cursor;
                Log.d(TAG, "addOddNumbers: sum " + sum);
            }
        }
    }

    //Write a function that validates an email address.
    public boolean validateEmailAddress (String s){
        Log.d(TAG, "validateEmailAddress: "+s);
        boolean testAt = false;
        boolean testDotCom = false;
            if (s.contains("@")){
                testAt = true;
                Log.d(TAG, "validateEmailAddress: " +"@ " + testAt);
            }
            if(s.contains(".com")){
                testDotCom = true;
                Log.d(TAG, "validateEmailAddress: " +".com "+ testDotCom);
            }

        if(testAt==true&&testDotCom==true){
            Log.d(TAG, "validateEmailAddress: " + true);
            return true;
        }
        Log.d(TAG, "validateEmailAddress: " + false);

        return false;
    }


}
