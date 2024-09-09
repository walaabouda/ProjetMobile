package com.example.gestionetudiant;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button B1 = (Button) findViewById(R.id.B1);
        B1.setOnClickListener(this);
    }
    
    public void onClick (View view)
    {
    	if (view.getId() == R.id.B1)
    	{
    		Intent intent = new Intent(MainActivity.this,Inscription.class);
    		startActivityForResult(intent,1);
    	}
    }
    
    public void onActivityResault (int RequestCode,int ResultCode , Intent data)
    {
    	switch (RequestCode) 
    	{
    	case (1) : 
    	{
    		switch (ResultCode)
        	{
        	case (RESULT_OK) : 
        	{
        		Toast.makeText(this,"INSCRIPTION VALIDEE",Toast.LENGTH_LONG).show();
        		return;
        	}
        	case (RESULT_CANCELED) : 
        	{
        		Toast.makeText(this,"INSCRIPTION ANNULEE",Toast.LENGTH_LONG).show();
        		return;
        	}
        	}
    	}
    	}
    }



    
}
