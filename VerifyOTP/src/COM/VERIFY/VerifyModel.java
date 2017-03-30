package COM.VERIFY;


public class VerifyModel {
	
	public String otp;
	public String medicalId;
	
	public VerifyModel(){
		
	}
	
	public String getOtp() {
		return otp;
	}



	public void setOtp(String otp) {
		this.otp = otp;
	}



	public String getMedicalId() {
		return medicalId;
	}



	public void setMedicalId(String medicalId) {
		this.medicalId = medicalId;
	}



	public VerifyModel(String medicalId,String otp ) {
		super();
		
		this.medicalId = medicalId;
		
		this.otp=otp;
		
	}

}
