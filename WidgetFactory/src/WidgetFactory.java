import javax.swing.*;
import java.text.DecimalFormat;


public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */
    public static void main(String[] args) {
        int numDays = Integer.parseInt(JOptionPane.showInputDialog("How many days?"));

        double productionCost = productionCost(numDays);
        double profit = profit(numDays, productionCost);
        int widgetsADay = numWidgets(numDays);

        message(widgetsADay, numDays, productionCost, profit);

        }

        public static void message(int widgetsADay, int numDays, double productionCost, double profit){
            DecimalFormat round = new DecimalFormat("$0.00");

                String widgetsMessage = "\nNumber of widgets made are: " +  widgetsADay ;
                String numDaysMessage = "\nNumber of days: " + numDays;
                String widgetsCost = "\nThe cost for all the widgets is: " + round.format(widgetsADay * 10);
                String produceCostMessage = "\nThe total cost of production is: " + round.format(productionCost);
                String profitsMessage = "\nTotal profits are: " + round.format(profit);

            JOptionPane.showMessageDialog(null, widgetsMessage + numDaysMessage + widgetsCost + produceCostMessage + profitsMessage);

        }

        public static double productionCost (int numDays){

            return (2 * 8) * (5 * 16.50) * numDays ;
        }

        public static double profit (int numDays, double productionCost){

            return  (10 * (10 * (2 * 8))) * numDays - productionCost;
        }

        public static int numWidgets(int numDays){

        return 10 * 2 * 8 * numDays;
        }

}
