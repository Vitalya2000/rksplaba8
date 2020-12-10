package servlets;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//public class NumConverter implements Result {
public class NumConverter{
    //private ArrayList<BigInteger> inputnumbers;
    //private int inputradix, outputradix;
    private String str;
    //private Set<Character> delimset = new HashSet<>(Arrays.asList('.',',','|',';'));
    public NumConverter(String str){
        this.str = str;
    }

    public String getStr(){
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    /*public NumConverter(ArrayList<BigInteger> userinput, int inputradix, int outputradix) throws Exception {
        this.inputnumbers = userinput;
        this.inputradix=inputradix;
        this.outputradix=outputradix;
        if (inputnumbers.isEmpty()) {
            throw new Exception("There were no numbers in string!");
        }
    }*/



    /*public NumConverter(BigInteger[] userinput, int inputradix, int outputradix) throws Exception {
        inputnumbers = new ArrayList<>(Arrays.asList(userinput));
        this.inputradix=inputradix;
        this.outputradix=outputradix;
        if (inputnumbers.isEmpty()) {
            throw new Exception("There were no numbers in string!");
        }
    }*/

    /*public NumConverter(String userinput, int inputradix, int outputradix) throws Exception {
        StringBuilder numberstring = new StringBuilder("");
        inputnumbers = new ArrayList<BigInteger>();
        this.inputradix = inputradix;
        this.outputradix = outputradix;
        for (char symbol : userinput.toCharArray()) {
            if (Character.isDigit(symbol) || Character.isAlphabetic(symbol)) {
                try {
                    if (!(inputradix > Integer.parseInt(Character.toString(symbol)))) {
                        throw new Exception("Alphanum of bigger radix found!");
                    }
                } catch (Exception e) {
                    throw new Exception("Radix parse error!");
                }
                numberstring.append(symbol);
            } else if (delimset.contains(symbol)) {
                inputnumbers.add(convert(numberstring.toString(), inputradix));
                numberstring.setLength(0);
            } else if (!(Character.isWhitespace(symbol))) {
                throw new Exception("String format exception!");
            }
        }
        if (!numberstring.toString().isEmpty()) {
            inputnumbers.add(convert(numberstring.toString(), inputradix));
        }
        if (inputnumbers.isEmpty()) {
            throw new Exception("There were no numbers in string!");
        }
    }

    public NumConverter(String userinput) throws Exception {
        StringBuilder numberstring = new StringBuilder("");
        inputnumbers = new ArrayList<BigInteger>();
        for (char symbol : userinput.toCharArray()) {
            if (Character.isDigit(symbol) || Character.isAlphabetic(symbol)) {
                try {
                    if (!(inputradix > Integer.parseInt(Character.toString(symbol)))) {
                        throw new Exception("Alphanum of bigger radix found!");
                    }
                } catch (Exception e) {
                    throw new Exception("Radix parse error!");
                }
                numberstring.append(symbol);
            } else if (delimset.contains(symbol)) {
                inputnumbers.add(convert(numberstring.toString(), inputradix));
                numberstring.setLength(0);
            } else if (!(Character.isWhitespace(symbol))) {
                throw new Exception("String format exception!");
            }
        }
        if (!numberstring.toString().isEmpty()) {
            inputnumbers.add(convert(numberstring.toString(), inputradix));
        }
        if (inputnumbers.isEmpty()) {
            throw new Exception("There were no numbers in string!");
        }
    }


    private BigInteger convert(String numberstring, int radix) {
        return new BigInteger(numberstring,radix);
    }*/

    /*public StringBuilder getResult() {
        StringBuilder result = new StringBuilder("Исходная СС: " + inputradix + "</br>Новая CC: " + outputradix + "</br></br>");
        for (BigInteger num : inputnumbers) {
            result.append(num.toString(inputradix)).append(" => ").append(num.toString(outputradix)).append("</br>");
        }
        return result;
    }*/
    public String StringOperation(String str) {
            String s1 = "";
            StringBuilder s2 = new StringBuilder();
            String s3 = "";
            String resultStr = "";

            for(String strItem : str.split(",")){
                if (Character.isDigit(strItem.charAt(0)) && !strItem.contains(".")) {
                    s1 += strItem + " ";
                }
                else if(strItem.contains(".")){
                    s2.append(String.valueOf(Float.parseFloat(strItem))).append(" ");
                }
                else{
                    s3 += strItem + " ";
                }
            }

            resultStr = "\nПервая строка: " + s1 + "       \n" + "Вторая строка: " + s2 + "       \n" + "Третья строка: " + s3 + "\n";
            return resultStr;
    }
}
