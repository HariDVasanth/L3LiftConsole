
import java.util.ArrayList;
import java.util.Scanner;

public class Module6 {
    public static void main(String[] args) {
        ArrayList<LiftData> liftData = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int justCreated = 1;
        int restircted = 1;
        // Module 1
        for (int i = 1; i <= 5; i++) {
            LiftData lift = new LiftData();
            lift.setLiftNumber(i);
            lift.setLiftFloorAt(0);
            liftData.add(lift);
        }

        printLiftStatus(liftData);

        int num = 10;
        while (num == 10) {
            System.out.print("Enter your current floor: ");
            int currFloor = scanner.nextInt();
            System.out.print("Enter your destination floor: ");
            int destFloor = scanner.nextInt();

            if (justCreated == 1) {
                liftData.get(0).setLiftFloorAt(destFloor);
                justCreated = -1;
                System.out.println("Lift 1 is assigned to the user");
            } else {
                int minDistance = Integer.MAX_VALUE;
                int assignedLift = -1;
                char direction = ' '; // Stores the direction of movement (+ or -)
                int step=100;
                // Module 5
                System.out.println("Do you want to restrict any lifts? press 1 if u want to");
                int userChoice = scanner.nextInt();
                scanner.nextLine();
                if(userChoice == 1){
                    System.out.println("Enter the number of lifts you want to restrict");
                    int liftCount = scanner.nextInt();
                    for( int i =0 ;i<liftCount;i++){
                        System.out.print("Enter the lift Number: ");

                        int liftNumber = scanner.nextInt();
                        System.out.print("Enter the restriction floor from: ");

                        int liftRestrictionFrom = scanner.nextInt();

                        System.out.println("Enter the restriction floor to: ");
                        int liftRestrictUpto = scanner.nextInt();

                        restrictTheLift(liftData,liftNumber,liftRestrictionFrom,liftRestrictUpto);

                    }
                }

                for (LiftData lift : liftData) {
                    if(lift.getLiftUnderMaintanence()==-1){
                        continue;
                    }
                    int distance = Math.abs(lift.getLiftFloorAt() - currFloor);
                    if(currFloor>= lift.getRestrictLiftFloorFrom() || destFloor>= lift.getRestrictLiftFloorUpto() || currFloor< lift.getRestrictLiftFloorFrom()){
                        continue;
                    }
                    // Module 3
                    if (distance < minDistance) {
                        minDistance = distance;

                        assignedLift = lift.getLiftNumber();

                        if (lift.getLiftFloorAt() > currFloor) {
                            direction = '-';
                        } else {
                            direction = '+';
                        }
                        // Module 4   && // Module 6
                    } else if (distance == minDistance) {
                        char newDirection;
                        if (lift.getLiftFloorAt() > currFloor) {
                            newDirection = '-';

                        } else {
                            newDirection = '+';
                        }
                        if (direction == ' ') {
                            direction = newDirection;

                        } else {
                            if (direction == '-' && newDirection == '+') {

                                assignedLift = lift.getLiftNumber();
                                direction = newDirection;

                            }
                        }
                    }
                }
                System.out.println("Lift Assigned to the User is: " + assignedLift);
                for (LiftData lift : liftData) {
                    if (lift.getLiftNumber() == assignedLift) {
                        lift.setLiftFloorAt(destFloor);
                    }
                }
            }
            System.out.println("If you want to exit, press 10. Otherwise, press 0.");
            int user = scanner.nextInt();
            if (user == 10) {
                num = 1;
            }

            System.out.println();
            printLiftStatus(liftData);
            System.out.println(liftData);
            // Module 8
            System.out.println("Is any lift need Maintanence? Press 1");
            int userChoic = scanner.nextInt();
            if(userChoic==1){
                System.out.println("Enter the lift number ");
                int liftNUmber = scanner.nextInt();
                liftData.get(liftNUmber-1).setLiftUnderMaintanence(-1);
            }
        }
    }

    public static void printLiftStatus(ArrayList<LiftData> liftData) {
        System.out.println("Lift Status:");
        for (LiftData lift : liftData) {
            System.out.println("Lift Number: " + lift.getLiftNumber() + ", Floor at: " + lift.getLiftFloorAt());
        }
        System.out.println();
    }
    public static void restrictTheLift(ArrayList<LiftData>liftData,int liftNumber,int restrictFrom, int restrictUpto){
        liftData.get(liftNumber).setRestrictLiftFloorFrom(restrictFrom);
        liftData.get(liftNumber).setRestrictLiftFloorUpto(restrictUpto);
    }
}

