package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextViewStory;
    Button mButtonAnsOne;
    Button mButtonAnsTwo;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextViewStory = findViewById(R.id.storyTextView);
        mButtonAnsOne = findViewById(R.id.buttonTop);
        mButtonAnsTwo = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonAnsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(mStoryIndex == 1){
                  mTextViewStory.setText(R.string.T3_Story);
                  mButtonAnsOne.setText(R.string.T3_Ans1);
                  mButtonAnsTwo.setText(R.string.T3_Ans2);
                  mStoryIndex += 1;
              }else if(mStoryIndex == 2){
                  mTextViewStory.setText(R.string.T3_Story);
                  mButtonAnsOne.setText(R.string.T3_Ans1);
                  mButtonAnsTwo.setText(R.string.T3_Ans2);
                  mStoryIndex += 1;
              }else if(mStoryIndex == 2 || mStoryIndex ==3){
                  mTextViewStory.setText(R.string.T6_End);
                  mButtonAnsOne.setVisibility(View.GONE);
                  mButtonAnsTwo.setVisibility(View.GONE);
              }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonAnsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(mStoryIndex == 1) {
                    mTextViewStory.setText(R.string.T2_Story);
                    mButtonAnsOne.setText(R.string.T2_Ans1);
                    mButtonAnsTwo.setText(R.string.T2_Ans2);
                    mStoryIndex += 1;
                }else if(mStoryIndex == 2){
                     mTextViewStory.setText(R.string.T4_End);
                     mButtonAnsOne.setVisibility(View.GONE);
                     mButtonAnsTwo.setVisibility(View.GONE);
                 }else if(mStoryIndex == 3 || mStoryIndex == 2){
                    mTextViewStory.setText(R.string.T5_End);
                    mButtonAnsOne.setVisibility(View.GONE);
                    mButtonAnsTwo.setVisibility(View.GONE);
                }
            }
        });

    }
}
