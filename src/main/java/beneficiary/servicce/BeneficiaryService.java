package beneficiary.servicce;


import beneficiary.model.Beneficiary;

public interface BeneficiaryService {


    public String distinguishBeneficiary(Integer projectType);

    public Boolean upload(String classFullName, Beneficiary uploadFile);
}
