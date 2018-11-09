package beneficiary.dao;

import beneficiary.model.Beneficiary;

public interface BeneficiaryHelpMapper extends BeneficiaryMapper {
    @Override
    Boolean insertOne(Beneficiary beneficiary);
}
