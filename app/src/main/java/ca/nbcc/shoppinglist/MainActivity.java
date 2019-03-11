package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

//file: MainActivity.java
//name: KwangEun Oh
//date: Feb. 7, 2019
//Type: Assignment1

public class MainActivity extends AppCompatActivity {

    public ShoppingList shoppingList = new ShoppingList();

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    public static final int TEXT_REQUEST = 1;
    private TextView mLemonTextView;
    private TextView mAppleTextView;
    private TextView mBananaTextView;
    private TextView mOrangeTextView;
    private TextView mKiwiTextView;
    private TextView mRiceTextView;
    private TextView mWheatTextView;
    private TextView mTomatoTextView;
    private TextView mMelonTextView;
    private TextView mMandarinTextView;

    /**
     * Populate specified data from activity_main
     * and also restore the saved state
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Log the start of the onCreate() method.
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        // Initialize all the view variables.
        mLemonTextView = findViewById(R.id.first_item);
        mAppleTextView = findViewById(R.id.second_item);
        mBananaTextView = findViewById(R.id.third_item);
        mOrangeTextView = findViewById(R.id.fourth_item);
        mKiwiTextView = findViewById(R.id.fifth_item);
        mRiceTextView = findViewById(R.id.sixth_item);
        mWheatTextView = findViewById(R.id.seventh_item);
        mTomatoTextView = findViewById(R.id.eighth_item);
        mMelonTextView = findViewById(R.id.ninth_item);
        mMandarinTextView = findViewById(R.id.tenth_item);

        // Restore the saved state.
        // See onSaveInstanceState() for what gets saved.
        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            // Show both the header and the message views. If isVisible is
            // false or missing from the bundle, use the default layout.
            if (isVisible) {
                mLemonTextView.setText(savedInstanceState
                        .getString("reply_text1"));
                shoppingList.setLemonCount(savedInstanceState
                        .getInt("reply_count1"));
                mLemonTextView.setVisibility(View.VISIBLE);

                mAppleTextView.setText(savedInstanceState
                        .getString("reply_text2"));
                shoppingList.setAppleCount(savedInstanceState
                        .getInt("reply_count2"));
                mAppleTextView.setVisibility(View.VISIBLE);

                mBananaTextView.setText(savedInstanceState
                        .getString("reply_text3"));
                shoppingList.setBananaCount(savedInstanceState
                        .getInt("reply_count3"));
                mBananaTextView.setVisibility(View.VISIBLE);

                mOrangeTextView.setText(savedInstanceState
                        .getString("reply_text4"));
                shoppingList.setOrangeCount(savedInstanceState
                        .getInt("reply_count4"));
                mOrangeTextView.setVisibility(View.VISIBLE);

                mKiwiTextView.setText(savedInstanceState
                        .getString("reply_text5"));
                shoppingList.setKiwiCount(savedInstanceState
                        .getInt("reply_count5"));
                mKiwiTextView.setVisibility(View.VISIBLE);

                mRiceTextView.setText(savedInstanceState
                        .getString("reply_text6"));
                shoppingList.setRiceCount(savedInstanceState
                        .getInt("reply_count6"));
                mRiceTextView.setVisibility(View.VISIBLE);

                mWheatTextView.setText(savedInstanceState
                        .getString("reply_text7"));
                shoppingList.setWheatCount(savedInstanceState
                        .getInt("reply_count7"));
                mWheatTextView.setVisibility(View.VISIBLE);

                mTomatoTextView.setText(savedInstanceState
                        .getString("reply_text8"));
                shoppingList.setTomatoCount(savedInstanceState
                        .getInt("reply_count8"));
                mTomatoTextView.setVisibility(View.VISIBLE);

                mMelonTextView.setText(savedInstanceState
                        .getString("reply_text9"));
                shoppingList.setMelonCount(savedInstanceState
                        .getInt("reply_count9"));
                mMelonTextView.setVisibility(View.VISIBLE);

                mMandarinTextView.setText(savedInstanceState
                        .getString("reply_text10"));
                shoppingList.setMandarinCount(savedInstanceState
                        .getInt("reply_count10"));
                mMandarinTextView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    /**
     * Launch Second Activity when clicking the button
     * @param view
     */
    public void launchSecondActivity(View view) {
        // Launch the secondActivity after Add button clicked
        Log.d(LOG_TAG, "Add Button Clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    /**
     * Save the instance state.
     * Message needs to be saved if the heading is visible.
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // If the heading is visible, message needs to be saved.
        // Otherwise we're still using default layout.
        if (mLemonTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text1",
                    mLemonTextView.getText().toString());
            outState.putInt("reply_count1",
                    shoppingList.getLemonCount());
        }

        if (mAppleTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text2",
                    mAppleTextView.getText().toString());
            outState.putInt("reply_count2",
                    shoppingList.getAppleCount());
        }

        if (mBananaTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text3",
                    mBananaTextView.getText().toString());
            outState.putInt("reply_count3",
                    shoppingList.getBananaCount());
        }
        if (mKiwiTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text5",
                    mKiwiTextView.getText().toString());
            outState.putInt("reply_count5",
                    shoppingList.getKiwiCount());
        }
        if (mRiceTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text6",
                    mRiceTextView.getText().toString());
            outState.putInt("reply_count6",
                    shoppingList.getRiceCount());
        }
        if (mWheatTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text7",
                    mWheatTextView.getText().toString());
            outState.putInt("reply_count7",
                    shoppingList.getWheatCount());
        }
        if (mTomatoTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text8",
                    mTomatoTextView.getText().toString());
            outState.putInt("reply_count8",
                    shoppingList.getTomatoCount());
        }
        if (mMelonTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text9",
                    mMelonTextView.getText().toString());
            outState.putInt("reply_count9",
                    shoppingList.getMelonCount());
        }
        if (mMandarinTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text10",
                    mMandarinTextView.getText().toString());
            outState.putInt("reply_count10",
                    shoppingList.getMandarinCount());
        }
        if (mOrangeTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text4",
                    mOrangeTextView.getText().toString());
            outState.putInt("reply_count4",
                    shoppingList.getOrangeCount());
        }
    }

    /**
     * Populate the result of selection of users including name and count.
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST)
        {
            if(resultCode == RESULT_OK)
            {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);

                // Set to populate each item name and count
                // when clicking the button in the second activity
                if(reply.equals(shoppingList.getLemonName()))
                {
                    shoppingList.setLemonCount(1);
                    mLemonTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getLemonCount()));
                    mLemonTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getAppleName()))
                {
                    shoppingList.setAppleCount(1);
                    mAppleTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getAppleCount()));
                    mAppleTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getBananaName()))
                {
                    shoppingList.setBananaCount(1);
                    mBananaTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getBananaCount()));
                    mBananaTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getOrangeName()))
                {
                    shoppingList.setOrangeCount(1);
                    mOrangeTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getOrangeCount()));
                    mOrangeTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getKiwiName()))
                {
                    shoppingList.setKiwiCount(1);
                    mKiwiTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getKiwiCount()));
                    mKiwiTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getRiceName()))
                {
                    shoppingList.setRiceCount(1);
                    mRiceTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getRiceCount()));
                    mRiceTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getWheatName()))
                {
                    shoppingList.setWheatCount(1);
                    mWheatTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getWheatCount()));
                    mWheatTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getTomatoName()))
                {
                    shoppingList.setTomatoCount(1);
                    mTomatoTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getTomatoCount()));
                    mTomatoTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getMelonName()))
                {
                    shoppingList.setMelonCount(1);
                    mMelonTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getMelonCount()));
                    mMelonTextView.setVisibility(View.VISIBLE);
                }
                else if (reply.equals(shoppingList.getMandarinName()))
                {
                    shoppingList.setMandarinCount(1);
                    mMandarinTextView.setText(reply + ", "
                            + Integer.toString(shoppingList.getMandarinCount()));
                    mMandarinTextView.setVisibility(View.VISIBLE);
                }
            }
        }
    }
}
