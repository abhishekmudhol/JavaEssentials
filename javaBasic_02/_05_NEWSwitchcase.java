package javaBasic_02;

public class _05_NEWSwitchcase {
    
}


/*
In Java 12 and later versions, the switch statement has been 
enhanced with a new syntax that uses -> (arrow) to replace the
traditional case and break keywords. This new syntax is called "Switch Expressions." 
It allows you to use a more concise and expressive form for handling multiple cases
and returning values from each case. Here's the syntax:


int result = switch (expression) {
    case value1 -> expression1;
    case value2 -> expression2;
    // Additional cases and expressions can be added here
    default -> defaultExpression;
};


EXAMPLE

int day = 3;
String dayName = switch (day) {
    case 1 ,2  -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    default -> "Weekend";
};

System.out.println(dayName); // Output: "Wednesday"

// if want to use switch as expression but without 
   using -> then we have to  use a     yield   keyword to return value

   int day = 3;
String dayName = switch (day) {
    case 1 ,2  : yield "Monday";
    case 2  : yield "Tuesday";
    case 3  : yield "Wednesday";
    case 4  : yield "Thursday";
    case 5  : yield "Friday";
    default  : yield "Weekend";
};
 */