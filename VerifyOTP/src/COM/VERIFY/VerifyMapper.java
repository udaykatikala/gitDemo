package COM.VERIFY;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VerifyMapper implements RowMapper{
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		VerifyModel verifyModel = new VerifyModel();
		
		verifyModel.setMedicalId(rs.getString("User_id"));
		verifyModel.setMedicalId(rs.getString("Medical_Id"));
		
		verifyModel.setOtp(rs.getString("OTP"));
		return verifyModel;
	}
}
