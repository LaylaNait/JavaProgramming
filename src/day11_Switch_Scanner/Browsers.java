package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "Firefox";
        String result = "";

        boolean validBrowser = browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera"
                || browserName == "Safari" || browserName == "Edge";

        if (validBrowser){
            // 5 options
            if (browserName == "Chrome"){
                result = "Chrome Browser is selected";

            }else if(browserName == "Firefox"){
                result = " Firefox Browser is selected";

            }else if(browserName == "Edge") {
                result = "Edge Browser is selected";

            }else if(browserName == "Safari"){
                result = "Safari Browser is selected";

            }else{
                result = "Opera Browser is selected";
            }

        }else{
            result = "Invalid Browser name";
        }
        System.out.println(result);















    }
}
/*
 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */