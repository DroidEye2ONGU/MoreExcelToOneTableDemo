package beneficiary.servicce.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.Map;

import beneficiary.dao.BeneficiaryMapper;
import beneficiary.model.Beneficiary;
import beneficiary.servicce.BeneficiaryService;
import beneficiary.util.SpecificBeneficiaryUtil;
import beneficiary.util.SqlSessionFactoryUtil;


public class BeneficiaryServiceImpl implements BeneficiaryService {


    @Override
    public String distinguishBeneficiary(Integer projectType) {
        switch (projectType) {
            case 1:
                return "beneficiary.model.BeneficiaryHelp";
            case 2:
                return "beneficiary.model.BeneficiaryScholar";
        }
        return "";
    }

    @Override
    public Boolean upload(String classFullName, Beneficiary uploadFile) {

        Map<String, Object> all = SpecificBeneficiaryUtil.getAll(classFullName);

        Beneficiary beneficiary = (Beneficiary) all.get("model");
        String mapperName = (String) all.get("mapperName");
        Boolean result = false;
        try {
            SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            BeneficiaryMapper mapper = (BeneficiaryMapper) sqlSession.getMapper(Class.forName(mapperName));

            result = mapper.insertOne(uploadFile);

            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
