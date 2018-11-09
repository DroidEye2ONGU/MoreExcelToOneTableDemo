package beneficiary.Controller;


import beneficiary.model.BeneficiaryHelp;
import beneficiary.model.BeneficiaryScholar;
import beneficiary.servicce.BeneficiaryService;
import beneficiary.servicce.impl.BeneficiaryServiceImpl;

public class BeneficiaryController {
    public static void main(String[] args) {
        BeneficiaryController beneficiaryController = new BeneficiaryController();

        beneficiaryController.testHelp();
        beneficiaryController.testScholar();
    }

    public void testScholar() {
        //准备数据,假设这是从前台传来或查出来的
        Integer projectType = 2;

        BeneficiaryService beneficiaryService = new BeneficiaryServiceImpl();

        //查询对应全类名
        String modelClassFullName = beneficiaryService.distinguishBeneficiary(projectType);

        //准备数据,假设这是从Excel中读取出来的
        BeneficiaryScholar beneficiaryScholar = new BeneficiaryScholar(1, "1", "Mr.wang", "1000", "NUC", 1500);

        //上传
        Boolean upload = beneficiaryService.upload(modelClassFullName, beneficiaryScholar);

        System.err.println(upload);
    }

    public void testHelp() {
        //准备数据,假设这是从前台传来或查出来的
        Integer projectType = 1;

        BeneficiaryService beneficiaryService = new BeneficiaryServiceImpl();

        //查询对应全类名
        String modelClassFullName = beneficiaryService.distinguishBeneficiary(projectType);

        //准备数据,假设这是从Excel中读取出来的
        BeneficiaryHelp beneficiaryHelp = new BeneficiaryHelp(1, "1", "Wang", "1000", "totalyHel");

        //上传
        Boolean upload = beneficiaryService.upload(modelClassFullName, beneficiaryHelp);

        System.err.println(upload);
    }
}
