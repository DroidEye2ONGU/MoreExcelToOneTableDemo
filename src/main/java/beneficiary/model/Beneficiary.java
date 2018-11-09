package beneficiary.model;

/*
* 一个抽象类,用来承载不同项目类型对应的受益人表结构
* 将所有表公有的字段提取出来,其子类只需要添加其特有属性即可
* */

import beneficiary.dao.BeneficiaryMapper;

public abstract class Beneficiary {
    //主键
    private Integer id;
    //项目(表)ID
    private String projectId;

    //受益人
    private String benefitName;
    //收益
    private String benefit;


    public Beneficiary() {
    }

    public Beneficiary(Integer id, String projectId, String benefitName, String benefit) {
        this.id = id;
        this.projectId = projectId;
        this.benefitName = benefitName;
        this.benefit = benefit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public abstract String getMapper();
}
