package com.capstone.medicare.Medicareproject;

public class PageobjectModeluserProfile  {
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
		String Next="radio-inline";
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
	public String LoginButton() {
		String Login="//a[contains(text(),'Login Here')]";
		return Login;
	}
	public String UserLogin() {
		String Username="username";
		return Username;
	}
	public String PAssworforlogin(){
		String PASSWORD="password";
		return PASSWORD;
	}
	public String LoginButtonforuser() {
		String Username="//input[@value='Login']";
		return Username;
	}
	public String Click_Antipyretics() {
		String Antipyretics="//a[@href=\"/medicare/show/category/1/products\"]";
		return Antipyretics;
	}
	public String cart_Antipyretics() {
		String cart="(//a[@class=\"btn btn-success\"])[1]";
		return cart;
	}
	public String checkout_Antipyretics() {
		String Checkout="//a[contains(text(),'Checkout')]";
		return Checkout;
	}
	public String Click_Antibiotics() {
		String Antibiotics="a_Antibiotics";
		return Antibiotics;
	}
	public String Cart_Antibiotics() {
		String cartAntibiotics="(//span[@class=\"glyphicon glyphicon-shopping-cart\"])[3]";
		return cartAntibiotics;
	}
	public String Cart_anti1() {
		String Cart="(//span[@class=\"glyphicon glyphicon-shopping-cart\"])[6]";
		return Cart;
	}
	public String Checkout_Antibiotics() {
		String checkoutAntibiotics="//a[@class='btn btn-success btn-block']";
		return checkoutAntibiotics;
	}
	public String selectAddress() {
		String Address="//a[@class=\"btn btn-primary\"]";
		return Address;
	}
	public String Cardnumber() {
		String Cardno="//input[@id=\"cardNumber\"]";
		return Cardno;
	}
	public String ExpiryMonth() {
		String EMonth="//input[@id=\"expityMonth\"]";
		return EMonth;
	}
	public String ExpiryYear() {
		String EYear="//input[@id=\"expityYear\"]";
		return EYear;
	}
	public String CVVNO() {
		String CVV="//input[@id=\"cvCode\"]";
		return CVV;
	}
	public String Payment() {
		String Pay="//a[@role=\"button\"]";
		return Pay;
	}
	public String ContinueShopping() {
		String Continue="//a[@class=\"btn btn-lg btn-warning\"]";
		return Continue;
	}
	public String validatepayment() {
		String validate="//h3[@class=\"text-center\"]";
		return validate;
	}
	public String backshopping() {
	String backshopping="//a[@class=\"btn btn-warning\"]";
	return backshopping;
}
}