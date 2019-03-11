package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//file: SecondActivity.java
//name: KwangEun Oh
//date: Feb. 7, 2019
//Type: Assignment1

public class SecondActivity extends AppCompatActivity {

    public ShoppingList list = new ShoppingList();
    public static final String EXTRA_REPLY =
            "com.example.android.shopping-list.extra.REPLY";


    private static final String LOG_TAG =
            SecondActivity.class.getSimpleName();

    /**
     * Populate the data by the activity_second.xml.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /**
     * Reply the intent to the Main Activity when selecting lemon
     * @param view
     */
    public void selectLemon(View view) {
        Log.d(LOG_TAG, "Lemon Selected");
        String reply = list.getLemonName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting apple
     * @param view
     */
    public void selectApple(View view) {
        Log.d(LOG_TAG, "Apple Selected");
        String reply = list.getAppleName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting banana
     * @param view
     */
    public void selectBanana(View view) {
        Log.d(LOG_TAG, "Banana Selected");
        String reply = list.getBananaName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting orange
     * @param view
     */
    public void selectOrange(View view) {
        Log.d(LOG_TAG, "Orange Selected");
        String reply = list.getOrangeName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting kiwi
     * @param view
     */
    public void selectKiwi(View view) {
        Log.d(LOG_TAG, "Kiwi Selected");
        String reply = list.getKiwiName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting rice
     * @param view
     */
    public void selectRice(View view) {
        Log.d(LOG_TAG, "Rice Selected");
        String reply = list.getRiceName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting wheat
     * @param view
     */
    public void selectWheat(View view) {
        Log.d(LOG_TAG, "Wheat Selected");
        String reply = list.getWheatName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting tomato
     * @param view
     */
    public void selectTomato(View view) {
        Log.d(LOG_TAG, "Tomato Selected");
        String reply = list.getTomatoName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting melon
     * @param view
     */
    public void selectMelon(View view) {
        Log.d(LOG_TAG, "Melon Selected");
        String reply = list.getMelonName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    /**
     * Reply the intent to the Main Activity when selecting mandarin
     * @param view
     */
    public void selectMandarin(View view) {
        Log.d(LOG_TAG, "Mandarin Selected");
        String reply = list.getMandarinName();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
