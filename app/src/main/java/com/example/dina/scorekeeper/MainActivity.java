package com.example.dina.scorekeeper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int egyptScore = 0;
    int egyptFouls = 0;
    int egyptRedCard = 0;
    int egyptYellowCard = 0;
    int uruguayScore = 0;
    int uruguayFouls = 0;
    int uruguayRedCard = 0;
    int uruguayYellowCard = 0;
    /**
     * When screen is rotated , the activity is killed and restarted so to make sure no data is lost ,I've used
     * lifecycle method to save and restore my data
     */
    static final String STATE_SCOREEGYPT = "egyptScore";
    static final String STATE_SCOREURUGUAY = "uruguayScore";
    static final String STATE_FOULSEGYPT = "egyptFouls";
    static final String STATE_FOULSURUGUAY = "uruguayFouls";
    static final String STATE_REDCARDEGYPT = "egyptRedCard";
    static final String STATE_REDCARDURUGUAY = "uruguayRedCard";
    static final String STATE_YELLOWCARDEGYPT = "egyptYellowCard";
    static final String STATE_YELLOWCARDURUGUAY = "uruguayYellowCard";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // This method used to save your application's state that you want to restore when you return to your app.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the egypt & uruguay current score state
        savedInstanceState.putInt(STATE_SCOREEGYPT, egyptScore);
        savedInstanceState.putInt(STATE_SCOREURUGUAY, uruguayScore);
        savedInstanceState.putInt(STATE_FOULSEGYPT, egyptFouls);
        savedInstanceState.putInt(STATE_FOULSURUGUAY, uruguayFouls);
        savedInstanceState.putInt(STATE_REDCARDEGYPT, egyptRedCard);
        savedInstanceState.putInt(STATE_REDCARDURUGUAY, uruguayRedCard);
        savedInstanceState.putInt(STATE_YELLOWCARDEGYPT, egyptYellowCard);
        savedInstanceState.putInt(STATE_YELLOWCARDURUGUAY, uruguayYellowCard);
        super.onSaveInstanceState(savedInstanceState);
    }
    //This method is called after onStart() when the activity is being re-initialized from a previously saved state
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
// Restore states from saved Instance
        egyptScore = savedInstanceState.getInt(STATE_SCOREEGYPT);
        uruguayScore = savedInstanceState.getInt(STATE_SCOREURUGUAY);
        egyptFouls = savedInstanceState.getInt(STATE_FOULSEGYPT);
        uruguayFouls = savedInstanceState.getInt(STATE_FOULSURUGUAY);
        egyptRedCard = savedInstanceState.getInt(STATE_REDCARDEGYPT);
        uruguayRedCard = savedInstanceState.getInt(STATE_REDCARDURUGUAY);
        egyptYellowCard = savedInstanceState.getInt(STATE_YELLOWCARDEGYPT);
        uruguayYellowCard = savedInstanceState.getInt(STATE_YELLOWCARDURUGUAY);
        displayForEgypt(egyptScore);
        displayForUruguay(uruguayScore);
        displayForEgyptFouls(egyptFouls);
        displayForUrugFouls(uruguayFouls);
        displayForEgyptRedCard(egyptRedCard);
        displayForUrugRedCard(uruguayRedCard);
        displayForEgyptyellowCard(egyptYellowCard);
        displayForUrugyellowCard(uruguayYellowCard);
    }
    //This method displays Egypt's Goals
    public void displayForEgypt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.egypt_team_score);
        scoreView.setText(String.valueOf(score));
    }
    //This methods displays Egypt's Fouls
    public void displayForEgyptFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.egypt_fouls);
        scoreView.setText(String.valueOf(score));
    }
    //This method displays Egypt's Yellow cards
    public void displayForEgyptyellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.egypt_yellow_card);
        scoreView.setText(String.valueOf(score));
    }
    //This method displays Egypt's Red cards
    public void displayForEgyptRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.egypt_red_card);
        scoreView.setText(String.valueOf(score));
    }
    //  This method is called when button +1GOAL is clicked.
    public void egyptGoal(View v) {
        egyptScore = egyptScore + 1;
        displayForEgypt(egyptScore);
    }
    //This method is called when button +1FOUL is clicked.
    public void egyptFoul(View v) {
        egyptFouls++;
        displayForEgyptFouls(egyptFouls);
    }
    //This method is called when button +1CARD is clicked.
    public void egyptRedCard(View v) {
        egyptRedCard++;
        displayForEgyptRedCard(egyptRedCard);
    }
    //This method is called when button +1CARD is clicked.
    public void egyptYellowCard(View v) {
        egyptYellowCard++;
        displayForEgyptyellowCard(egyptYellowCard);
    }
    public void displayForUruguay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.uruguay_team_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForUrugFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.uruguay_fouls);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForUrugyellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.uruguay_yellow_card);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForUrugRedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.uruguay_red_card);
        scoreView.setText(String.valueOf(score));
    }
    public void urugGoal(View v) {
        uruguayScore++;
        displayForUruguay(uruguayScore);
    }
    public void urugFoul(View v) {
        uruguayFouls++;
        displayForUrugFouls(uruguayFouls);
    }
    public void urugRedCard(View v) {
        uruguayRedCard++;
        displayForUrugRedCard(uruguayRedCard);
    }
    public void urugYellowCard(View v) {
        uruguayYellowCard++;
        displayForUrugyellowCard(uruguayYellowCard);
    }
    //This method sets all scores into zero.
    public void reset(View v) {
        egyptScore = 0;
        egyptFouls = 0;
        egyptRedCard = 0;
        egyptYellowCard = 0;
        uruguayScore = 0;
        uruguayFouls = 0;
        uruguayRedCard = 0;
        uruguayYellowCard = 0;
        displayForEgypt(egyptScore);
        displayForEgyptFouls(egyptFouls);
        displayForEgyptRedCard(egyptRedCard);
        displayForEgyptyellowCard(egyptYellowCard);
        displayForUruguay(uruguayScore);
        displayForUrugFouls(uruguayFouls);
        displayForUrugyellowCard(uruguayYellowCard);
        displayForUrugRedCard(uruguayRedCard);
    }
}
