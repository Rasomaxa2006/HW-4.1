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
        System.out.println("The age of majority hasn’t been reached yet; we need to wait a little longer.");
    }


    int temperature = 10;
    if (temperature < 5) {
        System.out.println("It's cold outside, you need to put on a hat.");
    } else {
        System.out.println("Today is warm, so you can go without a hat.");
    }

    int speed = 150;
    if (speed <= 60) {
        System.out.println("There is no speeding, you can drive safely");
    } else {
        System.out.println("If the speed limit is exceeded, you will have to pay a fine.");
    }

    int age1 = 34;
    if (age1 >= 2 && age1 <= 6) {
        System.out.println("Need go kindergarten");
    } else if (age1 >= 7 && age1 <= 17) {
        System.out.println("Need go school");
    } else if (age1 >= 18 && age1 <= 24) {
        System.out.println("Need go university");
    } else {
        System.out.println("GO Work!");
    }

    int age4 = 50;
    if (age4 >= 5 && age4 <= 14) {
        System.out.println("It is possible with an accompanying person");
    } else if (age4 < 5) {
        System.out.println("Cant ride");
    } else if (age4 > 14) {
        System.out.println("Over 14 years old can be unaccompanied");
    }

    int totalCapacity = 102;
    System.out.println(totalCapacity);
    int sittingSeats = 60;
    System.out.println(sittingSeats);
    int standingPlaces = (totalCapacity - sittingSeats);
    System.out.println(standingPlaces);
    int occupiedSeats = 0;
    if (occupiedSeats < totalCapacity) {
        System.out.println("There are places");
    }else if (occupiedSeats < sittingSeats) {
    System.out.println("There is a free seat available");
    }else  {
        System.out.println("There is a free standing place");
    }







    int one = 15;
    int two = 6;
    int three = 9;
    if (one > two) {
        if (two < three) {
            System.out.println("largestNumber " + one);
        } else System.out.println("largestNumber " + two);

    } else {
        if (three > two) {
            System.out.println("largestNumber " + three);
        } else {
            System.out.println("largestNumber " + two);

        }
    }
}


