package beneficiary.dao;

import beneficiary.model.Beneficiary;

public interface BeneficiaryScholarMapper extends BeneficiaryMapper {
    @Override
    Boolean insertOne(Beneficiary beneficiary);
}

