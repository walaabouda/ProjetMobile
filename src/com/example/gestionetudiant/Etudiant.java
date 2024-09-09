package com.example.gestionetudiant;


public class Etudiant {
	private int Id;
	private String Prenom;
	private String Nom;
	private String Login;
	private String Password;
	
	public Etudiant () {}
	public Etudiant (String Prenom,String Nom,String Login,String Password)
	{
		this.Prenom = Prenom ;
		this.Nom = Nom;
		this.Login = Login ;
		this.Password = Password;
	}
	
	public int getId()
	{
		return Id;
	}
	
	public void setId(int Id)
	{
		this.Id = Id;
	}
	
	public String getNom()
	{
		return Nom;
	}
	
	public void setNom(String Nom)
	{
		this.Nom = Nom;
	}
	
	public String getPrenom()
	{
		return Prenom;
	}
	
	public void setPrenom(String Prenom)
	{
		this.Prenom = Prenom;
	}
	
	public String getLogin()
	{
		return Login;
	}
	
	public void setLogin(String Login)
	{
		this.Login = Login;
	}
	
	public String getPassword()
	{
		return Password;
	}
	
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
	
	
	

}
