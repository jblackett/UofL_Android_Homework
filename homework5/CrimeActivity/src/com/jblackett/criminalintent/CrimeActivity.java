package com.jblackett.criminalintent;

//change shit for git
//more changes
//change shit again for git

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        
        android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        
        if (fragment == null){
        	fragment = new CrimeFragment();
        	fm.beginTransaction()
        		.add(R.id.fragmentContainer, fragment)
        		.commit();
        }
    }



}
