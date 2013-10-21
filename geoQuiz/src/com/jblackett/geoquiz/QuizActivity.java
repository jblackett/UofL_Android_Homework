package com.jblackett.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {

    private Button mTrueButton;
    private Button mFalseButton;
    private ImageButton mNextButton;
    private ImageButton mPreviousButton;
    private TextView mQuestionTextView;
    
    private static final String TAG = "QuizActivity";
    private static final String KEY_INDEX = "index";
	
    private TrueFalse [] mQuestionBank = new TrueFalse[]{
    		new TrueFalse(R.string.question_oceans, true),
    		new TrueFalse(R.string.question_mideast, false),
    		new TrueFalse(R.string.question_africa, false),
    		new TrueFalse(R.string.question_americas, true),
    		new TrueFalse(R.string.question_asia, true),    		
    		
    };
    
    private int mCurrentIndex = 0;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_quiz);
        
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        mQuestionTextView.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				
				updateQuestion();	
			}
		});

        
        mTrueButton = (Button)findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Show Toast
				checkAnswer(true);
				
			}
		});
        
        mFalseButton = (Button)findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Show Toast
				checkAnswer(false);
				
			}
		});
        
        mPreviousButton = (ImageButton)findViewById(R.id.previous_button);
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// goto prev question
				mCurrentIndex = (mCurrentIndex == 0) ? mQuestionBank.length-1 : mCurrentIndex -1;
	            updateQuestion();
				
			}
		});
        
        mNextButton = (ImageButton)findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Goto next question
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				
				updateQuestion();	
				
			}
		});
        
        if (savedInstanceState != null){
        	mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }
        
        updateQuestion();

    }
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState){
		super.onSaveInstanceState(savedInstanceState);
		Log.i(TAG, "onSaveInstanceState");
		savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
	}
	
	@Override
	public void onStart(){
		super.onStart();
		Log.d(TAG, "onStart() called");
	}
	
	@Override
	public void onPause() { 
		super.onPause(); 
		Log.d( TAG, "onPause() called"); 
	} 
	
	@Override 
	public void onResume() { 
		super.onResume(); 
		Log.d( TAG, "onResume() called"); 
	} 
	
	@Override public void onStop() { 
		super.onStop(); 
		Log.d( TAG, "onStop() called"); 
	} 
	
	@Override 
	public void onDestroy() { 
		super.onDestroy(); 
		Log.d( TAG, "onDestroy() called"); 
	}
	


	
    private void updateQuestion(){
    	int question = mQuestionBank[mCurrentIndex].getQuestion();
    	mQuestionTextView.setText(question);
    
    }
    
    private void checkAnswer(boolean userPressedTrue){
    	boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
    	
    	int messageResId = 0;
    	
    	if (userPressedTrue == answerIsTrue){
    		messageResId = R.string.correct_toast;
    	}else{
    		messageResId = R.string.incorrect_toast;
    	}
    	
    	Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }
    
}

