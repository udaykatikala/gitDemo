package COM.VERIFY;

import java.util.Calendar;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import COM.CIS.CISResults;
import COM.OT.OTConstants;

public class VerifyOTPDAO extends JdbcDaoSupport {
	
	public CISResults validateOTP(String medicalId,String otp) {
		VerifyModel verifyModel;
		CISResults otResults=new CISResults();
		Calendar cal = Calendar.getInstance();
		
		otResults.setResponseCode(OTConstants.RESPONSE_SUCCESS);
		
		Object[] inputs = new Object[]{medicalId,otp};
		try{
			
			verifyModel=(VerifyModel)getJdbcTemplate().queryForObject(VerifyOTPQueery.SQL_VALIDATE_OPT,inputs,new VerifyMapper());
			
		} catch (DataAccessException e) {
			e.printStackTrace();
		
			otResults.setResponseCode(OTConstants.RESPONSE_FAILURE);
			otResults.setErrorMessage("Failed to login to the system");
		}

   		return otResults;  
	}


}
