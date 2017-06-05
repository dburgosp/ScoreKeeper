package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button goalTeamBButton;
    Button goalTeamAButton;
    Button yellowCardTeamAButton;
    Button yellowCardTeamBButton;
    Button redCardTeamAButton;
    Button redCardTeamBButton;
    Button resetButton;

    TextView goalTeamATextView;
    TextView goalTeamBTextView;
    TextView yellowCardTeamATextView;
    TextView yellowCardTeamBTextView;
    TextView redCardTeamATextView;
    TextView redCardTeamBTextView;

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hides the action bar.
        if (getSupportActionBar() != null) getSupportActionBar().hide();

        // Gets the TextViews for every score in the app.
        goalTeamATextView = (TextView) findViewById(R.id.team_a_goals);
        goalTeamBTextView = (TextView) findViewById(R.id.team_b_goals);
        yellowCardTeamATextView = (TextView) findViewById(R.id.team_a_yellow_cards);
        yellowCardTeamBTextView = (TextView) findViewById(R.id.team_b_yellow_cards);
        redCardTeamATextView = (TextView) findViewById(R.id.team_a_red_cards);
        redCardTeamBTextView = (TextView) findViewById(R.id.team_b_red_cards);

        // Set all scores to 0.
        resetScores();

        // Defines the behaviour of the resetButton.
        resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScores();
            }
        });

        // Defines the behaviour of the goalTeamAButton.
        goalTeamAButton = (Button) findViewById(R.id.goalTeamAButton);
        goalTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalsTeamA = goalsTeamA + 1;
                displayScore(goalsTeamA, goalTeamATextView);
            }
        });

        // Defines the behaviour of the goalTeamBButton.
        goalTeamBButton = (Button) findViewById(R.id.goalTeamBButton);
        goalTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalsTeamB = goalsTeamB + 1;
                displayScore(goalsTeamB, goalTeamBTextView);
            }

        });

        // Defines the behaviour of the yellowCardTeamAButton.
        yellowCardTeamAButton = (Button) findViewById(R.id.yellowCardTeamAButton);
        yellowCardTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowCardsTeamA = yellowCardsTeamA + 1;
                displayScore(yellowCardsTeamA, yellowCardTeamATextView);
            }

        });

        // Defines the behaviour of the yellowCardTeamBButton.
        yellowCardTeamBButton = (Button) findViewById(R.id.yellowCardTeamBButton);
        yellowCardTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowCardsTeamB = yellowCardsTeamB + 1;
                displayScore(yellowCardsTeamB, yellowCardTeamBTextView);
            }

        });

        // Defines the behaviour of the redCardTeamAButton.
        redCardTeamAButton = (Button) findViewById(R.id.redCardTeamAButton);
        redCardTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redCardsTeamA = redCardsTeamA + 1;
                displayScore(redCardsTeamA, redCardTeamATextView);
            }

        });

        // Defines the behaviour of the redCardTeamBButton.
        redCardTeamBButton = (Button) findViewById(R.id.redCardTeamBButton);
        redCardTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redCardsTeamB = redCardsTeamB + 1;
                displayScore(redCardsTeamB, redCardTeamBTextView);
            }

        });
    }

    /**
     * Display one score into a particular TextView.
     *
     * @param score: score to be displayed.
     * @param view:  the TextView in which the score is going to be displayed.
     */
    public void displayScore(int score, TextView view) {
        view.setText(String.valueOf(score));
    }

    /**
     * Display all the scores in the app.
     */
    public void displayAllScores() {
        displayScore(goalsTeamA, goalTeamATextView);
        displayScore(goalsTeamB, goalTeamBTextView);
        displayScore(yellowCardsTeamA, yellowCardTeamATextView);
        displayScore(yellowCardsTeamB, yellowCardTeamBTextView);
        displayScore(redCardsTeamA, redCardTeamATextView);
        displayScore(redCardsTeamB, redCardTeamBTextView);
    }

    /**
     * Set every score to 0 and displays them in their corresponding TextViews.
     */
    public void resetScores() {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;

        displayAllScores();
    }

    /**
     * Saves the state of the app.
     *
     * @param outState: variable for storing the state of the app.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Saves the scores.
        outState.putInt("goalsTeamA", goalsTeamA);
        outState.putInt("goalsTeamB", goalsTeamB);
        outState.putInt("yellowCardsTeamA", yellowCardsTeamA);
        outState.putInt("yellowCardsTeamB", yellowCardsTeamB);
        outState.putInt("redCardsTeamA", redCardsTeamA);
        outState.putInt("redCardsTeamB", redCardsTeamB);
    }

    /**
     * Recovers the state of the app, previously saved.
     *
     * @param savedInstanceState: the saved state fot the app.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Gets the saved scores.
        goalsTeamA = savedInstanceState.getInt("goalsTeamA");
        goalsTeamB = savedInstanceState.getInt("goalsTeamB");
        yellowCardsTeamA = savedInstanceState.getInt("yellowCardsTeamA");
        yellowCardsTeamB = savedInstanceState.getInt("yellowCardsTeamB");
        redCardsTeamA = savedInstanceState.getInt("redCardsTeamA");
        redCardsTeamB = savedInstanceState.getInt("redCardsTeamB");

        // Displays the scores.
        displayAllScores();
    }
}

