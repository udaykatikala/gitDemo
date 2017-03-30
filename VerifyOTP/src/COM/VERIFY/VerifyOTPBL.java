package COM.VERIFY;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import COM.CIS.CISResults;
import COM.OTP.OTPBL;
import COM.OTP.OTPDAO;

public class VerifyOTPBL {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	VerifyOTPDAO verifyOTPDAO=(VerifyOTPDAO)ctx.getBean("verifyDAO");

	public CISResults validateOTP(String medicalId,String otp) {
		final Logger logger = Logger.getLogger(OTPBL.class);
		 
		CISResults otResult = verifyOTPDAO.validateOTP(medicalId,otp);
		logger.info("DigitalHealthCare:Validate OTP  dao service" +otResult );
		return otResult;
	}


}
