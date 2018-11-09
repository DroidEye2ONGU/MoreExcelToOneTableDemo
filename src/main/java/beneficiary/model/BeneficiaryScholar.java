package beneficiary.model;

import beneficiary.dao.BeneficiaryMapper;
import beneficiary.dao.BeneficiaryScholarMapper;

/*
 * 项目类型:助学
 * */
public class BeneficiaryScholar extends Beneficiary {

    //助学学校
    private String helpSchool;

    private Integer grade;

    private String beneficiaryMapperFullClassName;

    public BeneficiaryScholar() {
        this.beneficiaryMapperFullClassName = "beneficiary.dao.BeneficiaryScholarMapper";
    }

    public BeneficiaryScholar(Integer id, String projectId, String benefitName, String benefit, String helpSchool, Integer grade) {
        super(id, projectId, benefitName, benefit);
        this.helpSchool = helpSchool;
        this.grade = grade;
        this.beneficiaryMapperFullClassName = "beneficiary.dao.BeneficiaryScholarMapper";
    }

    public String getHelpSchool() {
        return helpSchool;
    }

    public void setHelpSchool(String helpSchool) {
        this.helpSchool = helpSchool;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }


    @Override
    public String getMapper() {
        return this.beneficiaryMapperFullClassName;
    }
}
