package com.example.gestionetudiant;
//import com.example.gestionetudiant.Etudiant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class EtudiantDatabaseHandler extends SQLiteOpenHelper{
	
	private static final int DATABASE_VERSION = 1 ;
	private static final String DATABASE_NAME = "EtudiantDB";
	private static final String TABLE_ETUDIANTS = "Table_Etudiants" ;
	private static final String COLONNE_ID = "Id";
	private static final String COLONNE_PRENOM = "Prenom";
	private static final String COLONNE_NOM = "Nom";
	private static final String COLONNE_LOGIN = "Login";
	private static final String COLONNE_PASSWORD = "Password";
	
	private static final String REQUETE_CREATION_BD ="create table " +TABLE_ETUDIANTS+" ("+COLONNE_ID+" integer primary key autoincrement," +
	COLONNE_PRENOM+" TEXT not null,"+COLONNE_NOM+ " TEXT not null," + COLONNE_LOGIN + " TEXT not null,"+COLONNE_PASSWORD+" TEXT not null);";
	
	public EtudiantDatabaseHandler (Context context ,String nom , CursorFactory cursorfactory , int version)
	{
		super(context,nom,cursorfactory,version);
	}
	
	public EtudiantDatabaseHandler (Context context)
	{
		super (context , DATABASE_NAME,null,DATABASE_VERSION);
	}
	

	@Override
	public void onCreate (SQLiteDatabase db)
	{
		db.execSQL(REQUETE_CREATION_BD);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db , int oldVersion , int newVersion)
	{
		db.execSQL("DROP TABLE "+TABLE_ETUDIANTS + ";");
		onCreate(db);
	}
	
	
	public void insertEtudiant (Etudiant etudiant)
	{
		SQLiteDatabase maDB = this.getReadableDatabase();
		
		ContentValues valeurs = new ContentValues();
		
		valeurs.put(COLONNE_PRENOM, etudiant.getPrenom());
		valeurs.put(COLONNE_NOM, etudiant.getNom() );
		valeurs.put(COLONNE_LOGIN, etudiant.getLogin());
		valeurs.put(COLONNE_PASSWORD, etudiant.getPassword());
		
		maDB.insert(TABLE_ETUDIANTS, null, valeurs);
		
		maDB.close();

	}
	
	
	
	
	
	

	
	

	
	

}
