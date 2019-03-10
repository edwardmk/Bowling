package com.bowling.edward.bowling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    ImageButton createGame, createTournament, viewWall, viewFriends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        createGame = findViewById(R.id.createGameButton);
        createTournament = findViewById(R.id.createTournamentButton);
        viewWall = findViewById(R.id.viewWallButton);
        viewFriends = findViewById(R.id.viewFriendsButton);

        createGame.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                GoToGame();
            }

        });
        createTournament.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                GoToTournament();
            }

        });
        viewWall.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                GoToWall();
            }

        });
        viewFriends.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                GoToFriends();
            }

        });
    }

    public void GoToGame(){
        Intent i = new Intent(Homepage.this, Game.class);
        startActivity(i);
    }
    public void GoToTournament(){
        Intent i = new Intent(Homepage.this, Tournament.class);
        startActivity(i);
    }
    public void GoToWall(){
        Intent i = new Intent(Homepage.this, Wall.class);
        startActivity(i);
    }
    public void GoToFriends(){
        Intent i = new Intent(Homepage.this, Friends.class);
        startActivity(i);
    }



}
