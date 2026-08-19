import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
    int age = 17;
    if (age >= 18) {
        System.out.println("The person is 18 years old or older");
    } else {
        System.out.println("Hasn't reached the age of majority, so we need to wait");
    }

    int temperature = 0;
    if (temperature < 5) {
        System.out.println("\n" + "It's cold outside, you need to put on a hat.");
    } else {
        System.out.println("Today is warm, so you can go without a hat.");
    }

    int speed = 50;
    if (speed <= 60) {
        System.out.println("There is no speeding, you can drive safely");
    } else {
        System.out.println("If the speed limit is exceeded, you will have to pay a fine.");
    }

    int age1 = 5;
    if (age1 >= 2 && age1 <= 6) {
        System.out.println("Need go kindergarten");
    } else {
        System.out.println("No need go kindergarten");
    }
    int age2 = 10;
    if (age2 >= 7 && age2 <= 17) {
        System.out.println("Need go school");
    } else {
        System.out.println("No need go School");
    }
    int age3 = 33;
    if (age3 >= 18 && age3 <= 24 || age3 < 24) {
        System.out.println("Need go university");
    } else {
        System.out.println("GO Work!");
    }

    int age4 = 16;
    if (age4 >= 5 && age4 <= 14) {
        System.out.println("It is possible with an accompanying person");
    } else if (age4 < 5) {
        System.out.println("Cant ride");
    } else if (age4 > 14) {
        System.out.println("Over 14 years old can be unaccompanied");
    }

    int totalCapacity = 102;
    int sittingSeats = 60;
    int standingPlaces = (totalCapacity - sittingSeats);
    System.out.println(standingPlaces);
    int occupiedSeats = 0;
    if (occupiedSeats < totalCapacity) {
        if (occupiedSeats < sittingSeats)
            System.out.println("There is a free seat available");
    }else{
        System.out.println("There is a free standing place");
    }



    int one = 1;
    int two = 2;
    int three = 3;
    if (one > two) {
        if (two > three) {
            System.out.println("largestNumber" + one);
        } else System.out.println("largestNumber" + two);

    } else {
        if (three > two) {
            System.out.println("largestNumber " + three);
        } else {
            System.out.println("largestNumber" + two);

        }
    }
}


