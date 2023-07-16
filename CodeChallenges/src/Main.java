import challenges.*;

public class Main {
    public static void main(String[] args) {
        /* Scratch */
//        Scratch.interestLoop();
//        System.out.println("\n");
//        Scratch.interestReverseLoop();
//        System.out.println("\n");
//        Scratch.findPrimes();
//        Scratch.sumThreeAndFive();
//        System.out.println(Scratch.isEvenNumber(2));
//        System.out.println(Scratch.isEvenNumber(3));
//        Scratch.fdoindEvens();
//        Scratch.stringParse();

        /* Speed Converter */
//        SpeedConverter.printConversion(1.5d);
//        SpeedConverter.printConversion(10.25d);
//        SpeedConverter.printConversion(-5.6d);
//        SpeedConverter.printConversion(25.42d);
//        SpeedConverter.printConversion(75.114d);

        /* MegaBytes Converter */
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        /* Barking Dog */
//        BarkingDog.shouldWakeUp(true, 1);
//        BarkingDog.shouldWakeUp(false, 2);
//        BarkingDog.shouldWakeUp(true, 8);
//        BarkingDog.shouldWakeUp(true, -1);

        /* Leap Year Calculator */
//        LeapYear.isLeapYear(-1600);
//        LeapYear.isLeapYear(1600);
//        LeapYear.isLeapYear(2017);
//        LeapYear.isLeapYear(2000);

        /* Decimal Comparator */
        // DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175); // Declined

        /* Equal Sum Checker */
//        EqualSumChecker.hasEqualSum(1, 1, 1);
//        EqualSumChecker.hasEqualSum(1, 1, 2);
//        EqualSumChecker.hasEqualSum(1, -1, 0);

        /* Teen Number Checker */
//        TeenNumberChecker.hasTeen(9, 99, 19);
//        TeenNumberChecker.hasTeen(23, 15, 42);
//        TeenNumberChecker.hasTeen(22, 23, 34);

        /* Area Calculator */
//        AreaCalculator.area(5.0d);
//        AreaCalculator.area(-1);
//        AreaCalculator.area(5.0d, 4.0d);
//        AreaCalculator.area(-1.0d, 4.0d);

        /* Minutes to Years and Days Calculator */
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        /* Equality Printer */
//        EqualityPrinter.printEqual(1, 1, 1);
//        EqualityPrinter.printEqual(1, 1, 2);
//        EqualityPrinter.printEqual(-1, -1, -1);
//        EqualityPrinter.printEqual(1, 2, 3);

        /* Playing Cat */
//        PlayingCat.isCatPlaying(true, 10);
//        PlayingCat.isCatPlaying(false, 36);
//        PlayingCat.isCatPlaying(false, 35);

        /* Number In Word */
//        NumberInWord.printNumberInWord(15);
//        NumberInWord.printNumberInWord(0);
//        NumberInWord.printNumberInWord(7);

        /* Number of Days in Month */
//        DaysInMonth.getDaysInMonth(1, 2020);
//        DaysInMonth.getDaysInMonth(2, 2020);
//        DaysInMonth.getDaysInMonth(2, 2018);
//        DaysInMonth.getDaysInMonth(-1, 2020);
//        DaysInMonth.getDaysInMonth(1, -2020);

        /* Digit Sum */
//        System.out.println(DigitSum.sumDigits(125));
//        System.out.println(DigitSum.sumDigits(4372));
//        System.out.println(DigitSum.sumDigits(3));
//        System.out.println(DigitSum.sumDigits(57985));
//        System.out.println(DigitSum.sumDigits(-42));

        /* Name and Age */
//        Scratch.nameAndAge();

        /* Reading User Input Challenge */
//        ReadingUserInputChallenge.addTenEntries();

        /* Minimum and Maximum */
//        MinimumAndMaximum.userInputs();

        /* OOP Part One Bank Account */

        OOPOneBankAccount davidChecking = new OOPOneBankAccount();

        davidChecking.setAccountNumber("0001");
        davidChecking.setCustomerName("David");
        davidChecking.setCustomerPhone("8041234567");
        davidChecking.setCustomerEmail("david@bank.net");
        davidChecking.setAccountBalance(100.00d);
        System.out.println(davidChecking.getAccountBalance());
        davidChecking.deposit(50.00d);
        System.out.println(davidChecking.getAccountBalance());
        davidChecking.withdrawal(151.98);
        System.out.println(davidChecking.getAccountBalance());
        davidChecking.withdrawal(51.67);
        System.out.println(davidChecking.getAccountBalance());
        davidChecking.printDetails();

        OOPOneBankAccount davidSavings = new OOPOneBankAccount("1001", 1000.00d,
                "David", "david@bank.net", "8041234567");

        davidSavings.printDetails();
    }
}