package com.example.zack.week2test;

import android.os.AsyncTask;
import android.util.Log;

import java.util.Random;

/**
 * Created by Zack on 9/8/2017.
 */

public class RandomAsyncTask extends AsyncTask<String, Integer, String> {

    private static final String TAG = "CustomAsyncTaskTag";

    int result;
    @Override
    protected String doInBackground(String... params) {
        Random rand = new Random();
        Log.d(TAG, "doInBackground: random " + rand);
        result = rand.nextInt();
        return null;

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
//        MainActivity.setRandMain(result);

    }
}
