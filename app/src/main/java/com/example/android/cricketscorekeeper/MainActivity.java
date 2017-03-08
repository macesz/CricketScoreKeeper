package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /**
     * Tracks the score for India.
     */
      private   int scoreTeamIndia = 0;
      private   int wicketTeamIndia = 0;
      private   int overTeamIndia = 0;

    /**
     * Tracks the score for Australia.
     */
      private   int scoreTeamAustralia = 0;
      private   int wicketTeamAustralia = 0;
      private   int overTeamAustralia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreTeamIndia", scoreTeamIndia);
        savedInstanceState.putInt("wicketTeamIndia", wicketTeamIndia);
        savedInstanceState.putInt("overTeamIndia", overTeamIndia);
        savedInstanceState.putInt("scoreTeamAustralia", scoreTeamAustralia);
        savedInstanceState.putInt("wicketTeamAustralia", wicketTeamAustralia);
        savedInstanceState.putInt("overTeamAustralia", overTeamAustralia);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamIndia = savedInstanceState.getInt("scoreTeamIndia");
        wicketTeamIndia = savedInstanceState.getInt("wicketTeamIndia");
        overTeamIndia = savedInstanceState.getInt("overTeamIndia");
        scoreTeamAustralia = savedInstanceState.getInt("scoreTeamAustralia");
        wicketTeamAustralia = savedInstanceState.getInt("wicketTeamAustralia");
        overTeamAustralia = savedInstanceState.getInt("overTeamAustralia");

        displayForIndia(scoreTeamIndia);
        displayForAustralia(scoreTeamAustralia);
        displayWicketIndia(wicketTeamIndia);
        displayWicketAustralia(wicketTeamAustralia);
        displayOverIndia(overTeamIndia);
        displayOverAustralia(overTeamAustralia);
    }


    /**
     * Increase the score for India plus 3.
     */
    public void addSixForIndia (View v) {
        scoreTeamIndia = scoreTeamIndia + 6;
        displayForIndia(scoreTeamIndia);
    }

    /**
     * Increase the score for India plus 2.
     */
    public void addFourForIndia (View v) {
        scoreTeamIndia = scoreTeamIndia + 4;
        displayForIndia(scoreTeamIndia);
    }

    /**
     * Increase the score for India plus 1.
     */
    public void addOneForIndia (View v) {
        scoreTeamIndia = scoreTeamIndia + 1;
        displayForIndia(scoreTeamIndia);
    }

    /**
     * Increase the wicket for India plus 1.
     */
    public void setWicketTeamIndia (View v) {
        if(wicketTeamIndia <5) {
            wicketTeamIndia = wicketTeamIndia + 1;
        }

        displayWicketIndia(wicketTeamIndia);
    }

    /**
     * Increase the over for India plus 1.
     */
    public void setOverTeamIndia (View v) {
        if(overTeamIndia <6) {
            overTeamIndia = overTeamIndia + 1;
        }

        displayOverIndia(overTeamIndia);
    }

    /**
     * Displays the given score for India.
     */
    private void displayForIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_india_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wicket for India.
     */
    private void displayWicketIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_india_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given over for India.
     */
    private void displayOverIndia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_india_over);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Australia.
     */
    private void displayForAustralia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_australia_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wicket for Australia.
     */
    private void displayWicketAustralia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_australia_wickets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given over for Australia.
     */
    private void displayOverAustralia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_australia_over);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase  the score for Australia plus 3.
     */
    public void addSixForAustralia (View v) {
        scoreTeamAustralia = scoreTeamAustralia + 6;
        displayForAustralia(scoreTeamAustralia);
    }

    /**
     * Increase  the score for Australia plus 2.
     */
    public void addFourForAustralia (View v) {
        scoreTeamAustralia = scoreTeamAustralia + 4;
        displayForAustralia(scoreTeamAustralia);
    }

    /**
     * Increase  the score for Australia plus 1.
     */
    public void addOneForAustralia (View v) {
        scoreTeamAustralia = scoreTeamAustralia + 1;
        displayForAustralia(scoreTeamAustralia);
    }

    /**
     * Increase  the wicket for Australia plus 1.
     */
    public void wicketTeamAustralia (View v) {
        if(wicketTeamAustralia<5) {
            wicketTeamAustralia = wicketTeamAustralia + 1;
        }
        displayWicketAustralia(wicketTeamAustralia);
    }

    /**
     * Increase  the over for Australia plus 1.
     */
    public void overTeamAustralia (View v) {
        if(overTeamAustralia <6) {
            overTeamAustralia = overTeamAustralia + 1;
        }
        displayOverAustralia(overTeamAustralia);    }

    /**
     * Set  the score for India and Australia to 0.
     */
    public void resetScore (View v) {

        scoreTeamIndia = 0;
        scoreTeamAustralia = 0;
        wicketTeamIndia = 0;
        wicketTeamAustralia = 0;
        overTeamIndia = 0;
        overTeamAustralia = 0;

        displayForIndia(scoreTeamIndia);
        displayForAustralia(scoreTeamAustralia);
        displayWicketIndia(wicketTeamIndia);
        displayWicketAustralia(wicketTeamAustralia);
        displayOverIndia(overTeamIndia);
        displayOverAustralia(overTeamAustralia);
    }

}

