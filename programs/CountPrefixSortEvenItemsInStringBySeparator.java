import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class CountPrefixSortEvenItemsInStringBySeparator {
    public static void main(String[] args) {
        String inputString = "sdfgabcwetrrytruyrtuabcpotre!@#abcprtort";
        ArrayList<HashMap<String, String>> resultList = new ArrayList<HashMap<String, String>>();

        resultList.add(processString(inputString, "abc"));
        resultList.add(processString(inputString, "s"));
        resultList.add(processString(inputString, "r"));
        resultList.add(processString(inputString, "zi"));

        printResult(resultList);
    }

    private static HashMap<String, String> processString(String inputStr, String separator) {
        HashMap<String, String> result = new HashMap<String, String>();
        // count
        String count;
        if (inputStr.split(separator, -1).length - 1 == 0) {
            count = String.valueOf(1);
        } else {
            count = String.valueOf(inputStr.split(separator, -1).length - 1);
        }
        result.put("Count: ", count);
        // prefix
        String [] split = inputStr.split(separator);
        result.put("Prefix: ", split[0]);
        // sortedItems
        String [] sort = inputStr.split(separator);
        Arrays.sort(sort);
        result.put("sortedItems: ", Arrays.toString(sort).replaceAll("[\\[\\],]", " "));
        // evenChars
        StringBuilder evenCharsSB = new StringBuilder();
        for (int index = 0; index < inputStr.length(); index++) {
            if (inputStr.charAt(index) % 2 == 0) {
                evenCharsSB.append(inputStr.charAt(index));
            }
        }
        String evenChars = evenCharsSB.toString();
        result.put("evenChars: ", evenChars);

        //Add the implementation here

        return result;
    }

    private static void printResult(ArrayList<HashMap<String, String>> resultList) {
        /*
    		Below is an example output when executed with inputString = "abcdefSEPgabcwetSEPsdsSEPdsfgSEPfro", separator = "SEP"

    		Count: 4
    		Prefix: abcdef
    		sortedItems: dsfg fro gabcwet sds
    		evenChars: aceSPaceSPdSPsgEfo
		*/

        for (HashMap<String, String> entry : resultList) {
            System.out.println("Count: " + entry.get("Count: "));
            System.out.println("Prefix: " + entry.get("Prefix: "));
            System.out.println("sortedItems: " + entry.get("sortedItems: "));
            System.out.println("evenChars: " + entry.get("evenChars: "));

        }

        //Add the implementation here
    }

}

