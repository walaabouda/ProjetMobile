package com.example.gestionetudiant;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Inscription extends Activity implements OnClickListener{
	
	EditText Prenom,Nom,Login,Password;
	String prenom,nom,login,password;
	Button B2,B3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inscription);
		
		
		Button B2 = (Button) findViewById(R.id.B2);
        B2.setOnClickListener(this);
        
        Button B3 = (Button) findViewById(R.id.B3);
        B3.setOnClickListener(this);
        
         Prenom = (EditText) findViewById(R.id.E1);
		 Nom = (EditText) findViewById(R.id.E2);
		 Login = (EditText) findViewById(R.id.E3);
		 Password = (EditText) findViewById(R.id.E4);
        

        	}

	public void onClick (View view) 
	{
		if (view.getId() == R.id.B2)
		{
			String prenom = Prenom.getText().toString(); 
			String nom = Nom.getText().toString();  
			String login = Login.getText().toString();  
			String password = Password.getText().toString();  
			
			
			EtudiantDatabaseHandler db =  new EtudiantDatabaseHandler(this);
			db.insertEtudiant(new Etudiant (prenom,nom,login,password));
			
			setResult(RESULT_OK);
			finish();

		
		}
		
		if (view.getId() == R.id.B3)
		{
			setResult(RESULT_CANCELED);
			finish();
		}
	}

}
