package com.example.android.scorekeeper;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    int viewIdGoalsTeamA = R.id.team_a_goals;
    int viewIdGoalsTeamB = R.id.team_b_goals;
    int viewIdYellowCardsTeamA = R.id.team_a_yellow_cards;
    int viewIdYellowCardsTeamB = R.id.team_b_yellow_cards;
    int viewIdRedCardsTeamA = R.id.team_a_red_cards;
    int viewIdRedCardsTeamB = R.id.team_b_red_cards;

    int goalsTeamA = 0;
    int goalsTeamB = 0;
    int yellowCardsTeamA = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamA = 0;
    int redCardsTeamB = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetScores();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScores();
            }

        });

        Button goalTeamAButton = (Button) findViewById(R.id.goalTeamAButton);
        goalTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalsTeamA = goalsTeamA + 1;
                displayScore(goalsTeamA, viewIdGoalsTeamA);
            }

        });

        Button goalTeamBButton = (Button) findViewById(R.id.goalTeamBButton);
        goalTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalsTeamB = goalsTeamB + 1;
                displayScore(goalsTeamB, viewIdGoalsTeamB);
            }

        });

        Button yellowCardTeamAButton = (Button) findViewById(R.id.yellowCardTeamAButton);
        yellowCardTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowCardsTeamA = yellowCardsTeamA + 1;
                displayScore(yellowCardsTeamA, viewIdYellowCardsTeamA);
            }

        });

        Button yellowCardTeamBButton = (Button) findViewById(R.id.yellowCardTeamBButton);
        yellowCardTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowCardsTeamB = yellowCardsTeamB + 1;
                displayScore(yellowCardsTeamB, viewIdYellowCardsTeamB);
            }

        });

        Button redCardTeamAButton = (Button) findViewById(R.id.redCardTeamAButton);
        redCardTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redCardsTeamA = redCardsTeamA + 1;
                displayScore(redCardsTeamA, viewIdRedCardsTeamA);
            }

        });

        Button redCardTeamBButton = (Button) findViewById(R.id.redCardTeamBButton);
        redCardTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redCardsTeamB = redCardsTeamB + 1;
                displayScore(redCardsTeamB, viewIdRedCardsTeamB);
            }

        });

        return true;
    }

    public void resetScores() {
        goalsTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamA = 0;
        yellowCardsTeamB = 0;
        redCardsTeamA = 0;
        redCardsTeamB = 0;

        displayScore(goalsTeamA, viewIdGoalsTeamA);
        displayScore(goalsTeamB, viewIdGoalsTeamB);
        displayScore(yellowCardsTeamA, viewIdYellowCardsTeamA);
        displayScore(yellowCardsTeamB, viewIdYellowCardsTeamB);
        displayScore(redCardsTeamA, viewIdRedCardsTeamA);
        displayScore(redCardsTeamB, viewIdRedCardsTeamB);
    }

    public void displayScore(int score, int viewId) {
        TextView scoreView = (TextView) findViewById(viewId);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("goalsTeamA", goalsTeamA);
        outState.putInt("goalsTeamB", goalsTeamB);
        outState.putInt("yellowCardsTeamA", yellowCardsTeamA);
        outState.putInt("yellowCardsTeamB", yellowCardsTeamB);
        outState.putInt("redCardsTeamA", redCardsTeamA);
        outState.putInt("redCardsTeamB", redCardsTeamB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalsTeamA = savedInstanceState.getInt("goalsTeamA");
        goalsTeamB = savedInstanceState.getInt("goalsTeamB");
        yellowCardsTeamA = savedInstanceState.getInt("yellowCardsTeamA");
        yellowCardsTeamB = savedInstanceState.getInt("yellowCardsTeamB");
        redCardsTeamA = savedInstanceState.getInt("redCardsTeamA");
        redCardsTeamB = savedInstanceState.getInt("redCardsTeamB");

        displayScore(goalsTeamA, viewIdGoalsTeamA);
        displayScore(goalsTeamB, viewIdGoalsTeamB);
        displayScore(yellowCardsTeamA, viewIdYellowCardsTeamA);
        displayScore(yellowCardsTeamB, viewIdYellowCardsTeamB);
        displayScore(redCardsTeamA, viewIdRedCardsTeamA);
        displayScore(redCardsTeamB, viewIdRedCardsTeamB);
    }
}

