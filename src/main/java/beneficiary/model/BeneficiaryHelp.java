package beneficiary.model;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

import beneficiary.dao.BeneficiaryHelpMapper;
import beneficiary.dao.BeneficiaryMapper;

/*
* 项目类型:资助
* */
public class BeneficiaryHelp extends Beneficiary{

    private String helpType;

    private String beneficiaryMapperFullClassName;


    public BeneficiaryHelp() throws IOException {
        this.beneficiaryMapperFullClassName = "beneficiary.dao.BeneficiaryHelpMapper";
    }


    public BeneficiaryHelp(Integer id, String projectId, String benefitName, String benefit, String helpType) {
        super(id, projectId, benefitName, benefit);
        this.helpType = helpType;
        this.beneficiaryMapperFullClassName = "beneficiary.dao.BeneficiaryHelpMapper";
    }

    public String getHelpType() {
        return helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    @Override
    public String getMapper() {
        return this.beneficiaryMapperFullClassName;
    }
}
