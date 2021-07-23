package HW_4;

import java.util.*;

public class PhoneDataBase {
    private Map <String, List<Long>> phoneDataBase = new HashMap<>();
    private List <Long> phoneNumber;
    public void add (String firstName, Long number){
        if (phoneDataBase.containsKey(firstName)){
            phoneNumber = phoneDataBase.get(firstName);
            phoneNumber.add(number);
        }else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(number);
            phoneDataBase.put(firstName, phoneNumber);
        }
    }
    public List <Long> get (String firstName){
        return phoneDataBase.get(firstName);
    }
}
