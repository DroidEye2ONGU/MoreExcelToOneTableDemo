package beneficiary.util;

import java.util.HashMap;
import java.util.Map;

import beneficiary.dao.BeneficiaryMapper;
import beneficiary.model.Beneficiary;

public class SpecificBeneficiaryUtil {

    public static Beneficiary getModel(String fullClassName) {
        Beneficiary beneficiary = null;
        try {
            Class<Beneficiary> beneficiaryClass = (Class<Beneficiary>) Class.forName(fullClassName);
            beneficiary = beneficiaryClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return beneficiary;
    }

    public static String getMapperName(String fullClassName) {
        String mapperName = "";
        try {
            Class<Beneficiary> beneficiaryClass = (Class<Beneficiary>) Class.forName(fullClassName);
            mapperName = beneficiaryClass.newInstance().getMapper();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mapperName;
    }

    public static Map<String, Object> getAll(String fullClassName) {
        try {
            Class<Beneficiary> beneficiaryClass = (Class<Beneficiary>) Class.forName(fullClassName);
            Beneficiary beneficiary = beneficiaryClass.newInstance();
            String mapperName = beneficiary.getMapper();


            Map<String, Object> map = new HashMap<>();
            map.put("model", beneficiary);
            map.put("mapperName", mapperName);

            return map;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
