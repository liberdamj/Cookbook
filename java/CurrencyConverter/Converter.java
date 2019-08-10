class Converter{

    //Method will print out statements if 2 arguments are not given.
    public static void correctUsage(){
        System.out.println("Usage:");
        System.out.println("    java Converter <firstISO4217Code> <secondISO4217Code>");
        System.out.println("Example:");
        System.out.println("    java Converter USD CAD");
        System.out.println("Use \"java Converter get codes\" to list all ISO 4217 Codes.");
    }

    //Method will check if Codes given are OK
    public static boolean correctCodes(String code){
        String[] codes = {"USD", "CAD", "EUR", "CNY", "JPY", "KRW", "AUD", "HKD", "PHP", "RUB"};
        for(String x : codes){
            if(code.equals(x)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        //Checks to make sure 2 arguments are given.
        if((args.length < 2) || (args.length > 2)){
            System.out.println("===============");
            System.out.println("Incorrect Usage");
            System.out.println("===============");
            correctUsage();
            System.exit(1);
        //If arguments equal "get codes" then we print the available Codes
        }else if(args[0].equals("get") && args[1].equals("codes")){
            System.out.println("Available Codes");
            System.out.println("==========================================");
            System.out.println("|USD -- United States of America, Dollars|");
            System.out.println("|CAD -- Canada, Dollars                  |");
            System.out.println("|EUR -- Euro Member Countries, Euro      |");
            System.out.println("|CNY -- China, Yuan Renminbi             |");
            System.out.println("|JPY -- Japan, Yen                       |");
            System.out.println("|KRW -- Korea (South), Won               |");
            System.out.println("|AUD -- Australia, Dollars               |");
            System.out.println("|HKD -- Hong Kong, Dollars               |");
            System.out.println("|PHP -- Philippines, Pesos               |");
            System.out.println("|RUB -- Russia, Rubles                   |");
            System.out.println("==========================================");
        }

        //String Variables for ISO 4217 Codes
        String firstCode = args[0];
        String secondCode = args[1];

        //Check to make sure that the variables are the available codes and not mistakes.
        Boolean codeOneCheck = correctCodes(firstCode);
        Boolean codeTwoCheck = correctCodes(secondCode);
        if((codeOneCheck == false) || (codeTwoCheck == false)){
            if(args[0].equals("get") && args[1].equals("codes")){
                System.out.println();
            }else{
                System.out.println("Incorrect Code(s)");
                System.out.println("Use \"java Correct get codes\" to get a list of codes.");
                System.exit(2);
            }
        }

        //Nested Switch statements to print out correct currency.
        switch(firstCode){
            case "CAD":
                switch(secondCode){
                    case "USD":
                        System.out.println("1 CAD is 0.76 USD");
                        break;
                    case "EUR":
                        System.out.println("1 CAD is 0.69 EUR");
                        break;
                    case "CNY":
                        System.out.println("1 CAD is 5.21 CNY");
                        break;
                    case "JPY":
                        System.out.println("1 CAD is 82.67 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 CAD is 899.26 KRW");
                        break;
                    case "AUD":
                        System.out.println("1 CAD is 1.11 AUD");
                        break;
                    case "HKD":
                        System.out.println("1 CAD is 5.93 HKD");
                        break;
                    case "PHP":
                        System.out.println("1 CAD is 38.64 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 CAD is 48.12 RUB");
                        break;
                }
                break;
            case "USD":
                switch(secondCode){
                    case "CAD":
                        System.out.println("1 USD is 1.32 CAD");
                        break;
                    case "EUR":
                        System.out.println("1 USD is 0.91 EUR");
                        break;
                    case "CNY":
                        System.out.println("1 USD is 6.88 CNY");
                        break;
                    case "JPY":
                        System.out.println("1 USD is 109.20 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 USD is 1187.40 KRW");
                        break;
                    case "AUD":
                        System.out.println("1 USD is 1.46 AUD");
                        break;
                    case "HKD":
                        System.out.println("1 USD is 7.83 HKD");
                        break;
                    case "PHP":
                        System.out.println("1 USD is 51.06 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 USD is 63.56 RUB");
                        break;
                }
                break;
            case "EUR":
                switch(secondCode){
                    case "USD":
                        System.out.println("1 EUR is 1.10 USD");
                        break;
                    case "CAD":
                        System.out.println("1 EUR is 1.46 CAD");
                        break;
                    case "CNY":
                        System.out.println("1 EUR is 7.61 CNY");
                        break;
                    case "JPY":
                        System.out.println("1 EUR is 120.64 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 EUR is 1312.02 KRW");
                        break;
                    case "AUD":
                        System.out.println("1 EUR is 1.61 AUD");
                        break;
                    case "HKD":
                        System.out.println("1 EUR is 8.65 HKD");
                        break;
                    case "PHP":
                        System.out.println("1 EUR is 56.41 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 EUR is 70.25 RUB");
                        break;
                }
                break;
            case "CNY":
                switch(secondCode){
                    case "USD":
                        System.out.println("1 CNY is 0.15 USD");
                        break;
                    case "EUR":
                        System.out.println("1 CNY is 0.13 EUR");
                        break;
                    case "CAD":
                        System.out.println("1 CNY is 0.19 CAD");
                        break;
                    case "JPY":
                        System.out.println("1 CNY is 15.86 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 CNY is 172.32 KRW");
                        break;
                    case "AUD":
                        System.out.println("1 CNY is 0.21 AUD");
                        break;
                    case "HKD":
                        System.out.println("1 CNY is 1.14 HKD");
                        break;
                    case "PHP":
                        System.out.println("1 CNY is 7.41 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 CNY is 9.23 RUB");
                        break;
                }
                break;
            case "JPY":
                switch(secondCode){
                    case "USD":
                        System.out.println("1000 JPY is 9.16 USD");
                        break;
                    case "EUR":
                        System.out.println("1000 JPY is 8.29 EUR");
                        break;
                    case "CNY":
                        System.out.println("1000 JPY is 63.19 CNY");
                        break;
                    case "CAD":
                        System.out.println("1000 JPY is 12.09 CAD");
                        break;
                    case "KRW":
                        System.out.println("1000 JPY is 10866.50 KRW");
                        break;
                    case "AUD":
                        System.out.println("1000 JPY is 13.37 AUD");
                        break;
                    case "HKD":
                        System.out.println("1000 JPY is 71.68 HKD");
                        break;
                    case "PHP":
                        System.out.println("1000 JPY is 467.35 PHP");
                        break;
                    case "RUB":
                        System.out.println("1000 JPY is 581.84 RUB");
                        break;
                }
                break;
            case "KRW":
                switch(secondCode){
                    case "USD":
                        System.out.println("1000 KRW is 0.84 USD");
                        break;
                    case "EUR":
                        System.out.println("1000 KRW is 0.76 EUR");
                        break;
                    case "CNY":
                        System.out.println("1000 KRW is 5.80 CNY");
                        break;
                    case "JPY":
                        System.out.println("1000 KRW is 92.00 JPY");
                        break;
                    case "CAD":
                        System.out.println("1000 KRW is 1.11 CAD");
                        break;
                    case "AUD":
                        System.out.println("1000 KRW is 1.23 AUD");
                        break;
                    case "HKD":
                        System.out.println("1000 KRW is 6.60 HKD");
                        break;
                    case "PHP":
                        System.out.println("1000 KRW is 43.00 PHP");
                        break;
                    case "RUB":
                        System.out.println("1000 KRW is 53.53 RUB");
                        break;
                }
                break;
            case "AUD":
                switch(secondCode){
                    case "USD":
                        System.out.println("1 AUD is 0.69 USD");
                        break;
                    case "EUR":
                        System.out.println("1 AUD is 0.62 EUR");
                        break;
                    case "CNY":
                        System.out.println("1 AUD is 4.73 CNY");
                        break;
                    case "JPY":
                        System.out.println("1 AUD is 74.82 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 AUD is 813.28 KRW");
                        break;
                    case "CAD":
                        System.out.println("1 AUD is 0.90 CAD");
                        break;
                    case "HKD":
                        System.out.println("1 AUD is 5.36 HKD");
                        break;
                    case "PHP":
                        System.out.println("1 AUD is 34.97 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 AUD is 43.52 RUB");
                        break;
                }
                break;
            case "HKD":
                switch(secondCode){
                    case "USD":
                        System.out.println("1 HKD is 0.13 USD");
                        break;
                    case "EUR":
                        System.out.println("1 HKD is 0.12 EUR");
                        break;
                    case "CNY":
                        System.out.println("1 HKD is 0.88 CNY");
                        break;
                    case "JPY":
                        System.out.println("1 HKD is 13.95 JPY");
                        break;
                    case "KRW":
                        System.out.println("1 HKD is 151.66 KRW");
                        break;
                    case "AUD":
                        System.out.println("1 HKD is 0.19 AUD");
                        break;
                    case "CAD":
                        System.out.println("1 HKD is 0.17 CAD");
                        break;
                    case "PHP":
                        System.out.println("1 HKD is 6.52 PHP");
                        break;
                    case "RUB":
                        System.out.println("1 HKD is 8.12 RUB");
                        break;
                }
                break;
            case "PHP":
                switch(secondCode){
                    case "USD":
                        System.out.println("1000 PHP is 19.58 USD");
                        break;
                    case "EUR":
                        System.out.println("1000 PHP is 17.72 EUR");
                        break;
                    case "CNY":
                        System.out.println("1000 PHP is 134.83 CNY");
                        break;
                    case "JPY":
                        System.out.println("1000 PHP is 2138.62 JPY");
                        break;
                    case "KRW":
                        System.out.println("1000 PHP is 23248.26 KRW");
                        break;
                    case "AUD":
                        System.out.println("1000 PHP is 28.59 AUD");
                        break;
                    case "HKD":
                        System.out.println("1000 PHP is 153.28 HKD");
                        break;
                    case "CAD":
                        System.out.println("1000 PHP is 25.86 CAD");
                        break;
                    case "RUB":
                        System.out.println("1000 PHP is 1243.91 RUB");
                        break;
                }
                break;
            case "RUB":
                switch(secondCode){
                    case "USD":
                        System.out.println("1000 RUB is 15.74 USD");
                        break;
                    case "EUR":
                        System.out.println("1000 RUB is 14.25 EUR");
                        break;
                    case "CNY":
                        System.out.println("1000 RUB is 108.37 CNY");
                        break;
                    case "JPY":
                        System.out.println("1000 RUB is 1719.11 JPY");
                        break;
                    case "KRW":
                        System.out.println("1000 RUB is 18684.64 KRW");
                        break;
                    case "AUD":
                        System.out.println("1000 RUB is 22.97 AUD");
                        break;
                    case "HKD":
                        System.out.println("1000 RUB is 123.21 HKD");
                        break;
                    case "PHP":
                        System.out.println("1000 RUB is 803.68 PHP");
                        break;
                    case "CAD":
                        System.out.println("1000 RUB is 20.79 CAD");
                        break;
                }
                break;
        }
    }
}
