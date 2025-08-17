package basics.statements;

public class SwitchExercise {
    public static void main(String[] args) {
        int month = 7; // do NOT change this line
        String season;

        /*
            TODO:
            Implement the switch statement to assign the correct season based on the month
            if month equals to 1, 2 or 12               -> assign "Winter" to the 'season' variable
            if month equals to 3, 4 or 5                -> assign "Spring" to the 'season' variable
            if month equals to 6, 7 or 8                -> assign "Summer" to the 'season' variable
            if month equals to 9, 10 or 11              -> assign "Autumn" to the 'season' variable
            if month is not within the range of 1 to 12 -> assign "Invalid month" to the 'season' variable
        */

        switch (month){
            case 1:
            case 2:
            case 12:
                season ="winter";
                break;
            case 3:
            case 4:
            case 5:
                season ="Spring";
                break;
            case 6:
            case 7:
            case 8:
                season ="Summer";
                break;
            case 9:
            case 10:
            case 11:
                season ="Autumn";
                break;
            default :
                season = "Invalid month";
        }

        System.out.println(season);

    }
}
