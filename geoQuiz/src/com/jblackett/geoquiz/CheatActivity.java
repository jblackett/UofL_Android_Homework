package com.jblackett.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends Activity {
	
		private boolean mAnswerIsTrue;	
		public static final String EXTRA_ANSWERIS_TRUE = "com.jblackett.android.geoquiz.answer_is_true";
		
		private TextView mAnswerTextView;
		private Button mShowAnswer;

		@Override
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_cheat);
			
			mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWERIS_TRUE, false);
			
			mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
			
			mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
			mShowAnswer.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if (mAnswerIsTrue){
						mAnswerTextView.setText(R.string.true_button);
						
					}else{
						mAnswerTextView.setText(R.string.false_button);
					}
				}
			})
		}
}
