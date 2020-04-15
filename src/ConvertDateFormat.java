import java.util.Scanner;

public class ConvertDateFormat {
    public static void main(String[] args) {

        // Scanner object instantiated
        Scanner input = new Scanner(System.in);

        // prompt user to Enter date
        System.out.print("Enter date (mm/dd/yyyy): ");

        // read from user input as a String
        String str = input.nextLine();

        // splits the input String into three parts and assign it to an array
        String[] arrOfStr = str.split("/",3);

        // boolean variable to control the while loop
        boolean test = ((arrOfStr[0].length() == 2) && (arrOfStr[1].length() == 2) && (arrOfStr[2].length() == 4));

        // while loop checks if the inserted format is accordingly 2 digit for month and date each and four digits for the year
        while(!test)
        {
            System.out.println("Please enter correct digit numbers? two digits for month, two digits for date and four digits for year");
            System.out.print("Enter date (mm/dd/yyyy): ");
            str = input.nextLine();
            arrOfStr = str.split("/",3);
            test = ((arrOfStr[0].length() == 2) && (arrOfStr[1].length() == 2) && (arrOfStr[2].length() == 4));
        }

        // convert String variables of month, date and year into integer
        int mm = Integer.parseInt(arrOfStr[0]);
        int dd = Integer.parseInt(arrOfStr[1]);
        int yy = Integer.parseInt(arrOfStr[2]);
        String month;

        // check the given month is between 1 and 12
        if(mm < 1 || mm > 12){
            System.out.println("Oops! Number out of range.");
            return;
        }

        // switch statement to determine month name from the month number and validate the date
        switch (mm){
            case 1:
                month = "January";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 2:
                month = "February";
                if(dd < 1 || dd > 29){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                else if(yy % 4 != 0 && dd == 29){
                    System.out.println("Oops! February will have 29 days only in leap year.");
                    return;
                }
                break;
            case 3:
                month = "March";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 4:
                month = "April";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 5:
                month = "May";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 6:
                month = "June";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 7:
                month = "July";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 8:
                month = "August";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 9:
                month = "September";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 10:
                month = "October";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            case 11:
                month = "November";
                if(dd < 1 || dd > 30){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;
            default:
                month = "December";
                if(dd < 1 || dd > 31){
                    System.out.println("Oops! date out of range.");
                    return;
                }
                break;

        }
        System.out.println("It is " + dayofweek(dd, mm, yy) + ", " + month + " " + dd + ", " + yy);
        //System.out.println("The result is " + dayofweek(dd, mm, yy));

    }
    static String dayofweek(int d, int m, int y)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        y -= (m < 3) ? 1 : 0;
        int day = ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
        //return ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;

        switch (day){
            case 0:
                return "Sunday";

            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            default:
                return "Saturday";

        }



    }
}
