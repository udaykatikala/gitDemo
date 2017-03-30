package COM.VERIFY;

public class VerifyOTPQueery {
	
	public static String SQL_VALIDATE_OPT ="select Medical_Id,eMail_Address,Registered_Phone_Number,OTP from Request_OTP where Medical_Id=? and OTP=?"; 
	 

}
