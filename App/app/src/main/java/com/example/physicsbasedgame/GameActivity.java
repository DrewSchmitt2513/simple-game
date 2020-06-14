package com.example.physicsbasedgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class GameActivity extends Activity {

    private GameView gameView;
    private TextView scoreValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        gameView = findViewById(R.id.game_view);

        scoreValue = findViewById(R.id.score_value);

    }

//    public void updateScore(final int score) {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                scoreValue.setText("Score: " + score);
//            }
//        });
//    }

    @Override
    protected void onResume()
    {
        super.onResume();
        gameView.resume();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        // Unregister the listener
        gameView.pause();
    }
}
