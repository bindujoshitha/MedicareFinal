package com.capstone.medicare.Medicareproject;

public class Pageobjectmodelsupplierprofile {
	public String signupbutton() {
		String Signup="signup";
		return Signup;
	}
	public String FName1() {
		String FName="firstName";
		return FName;
	}
	public String LName1() {
		String LName="lastName";
		return LName;
	}
	public String Email() {
		String EmailAddress="email";
		return EmailAddress;
	}
	public String typeNumber() {
		String CNumber="contactNumber";
		return CNumber;
	}
	public String Setpasswaord1() {
		String Password1="password";
		return Password1;
	}
	public String Setpasswaord2() {
		String Password2="confirmPassword";
		return Password2;
	}
	public String Next1() {
		String Next="//input[@id=\"role2\"]";
		return Next;
	}
	public String Next2() {
		String Next2="button";
		return Next2;
	}
	public String Address() {
		String Address1="addressLineOne";
		return Address1;
	}
	public String Address2() {
		String Address2="addressLineTwo";
		return Address2;
	}
	public String City() {
		String Address3="city";
		return Address3;
	}
	public String Pincode() {
		String Pin="postalCode";
		return Pin;
	}
	public String State() {
		String State="state";
		return State;
	}
	public String Country() {
		String country="country";
		return country;
	}
	public String Confirm() {
		String Confirmation="_eventId_confirm";
		return Confirmation;
	}
	public String actualuser() {
		String Verification="//h4[3]";
		return Verification;
	}
	public String Confirmationtologin() {
		String Confirmation1="//a[@class='btn btn-lg btn-primary']";
		return Confirmation1;
	}
	public String LoginButtonforsupplier() {
		String Button="//a[@class=\"btn btn-lg btn-success\"]";
		return Button;	
	}
	public String SupplierUsername() {
		String Username="//input[@id='username']";
		return Username;
	}
	public String SupplierPassword() {
		String Password="//input[@id='password']";
		return Password;
	}
	public String LoginSupplier() {
		String LoginHere="//input[@value='Login']";
		return LoginHere;
	}
	public String AntipyreticClick() {
		String Antipyretics="//a[@id=\"a_Antipyretics\"]";
		return Antipyretics;
	}
	public String Additem() {
		String Addingitem="(//span[@class=\"glyphicon glyphicon-shopping-cart\"])[2]";
		return Addingitem;
	}
	public String Errormsg() {
		String Message="//blockquote[@style=\"word-wrap:break-word\"]";
		return Message;
	}
}
