package COM.VERIFY;

import org.apache.log4j.Logger;

import COM.CIS.CISResults;
import COM.OTP.OTPBL;
import COM.OTP.OTPWebService;

public class VerifyOTPWebService {

	static Logger logger = Logger.getLogger(OTPWebService.class);
	VerifyOTPBL verifyOTPBL=new VerifyOTPBL();

	public CISResults validateOTP(String medicalId,String otp) {
		
		 CISResults otResult = verifyOTPBL.validateOTP(medicalId,otp);
		 logger.info(" DigitalHealthCare:Validate OTP :"+otResult);
		return otResult;
	}
}
