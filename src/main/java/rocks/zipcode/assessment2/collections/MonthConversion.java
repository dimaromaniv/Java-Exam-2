package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    private Map <String,Integer> mapListName ;
    private Map <Integer,String> mapListNumber;
    public MonthConversion () {
        this.mapListNumber = new TreeMap<>();
        this.mapListName = new TreeMap<>();

    }

    public void add(Integer monthNumber, String monthName) {
       mapListNumber.put(monthNumber,monthName);
       mapListName.put(monthName,monthNumber);




//
//        mapListInteger.put(monthNumber,monthName);
//        mapListString.put(monthName,monthNumber);


    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        return  mapListNumber.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return mapListName.get(monthName);

        //        if (mapListNumber.containsValue(monthName)) {
//            return mapListName.get(monthName);
//        }else {return Integer.parseInt(null);}

    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if (mapListNumber.containsKey(monthNumber)) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        if (mapListName.containsKey(monthName)) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return mapListName.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
