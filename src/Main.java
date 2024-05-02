//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<LiftData> liftData = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int justCreated = 1;
//        int liftRestricted = -1;
//        for (int i = 1; i <= 5; i++) {
//            LiftData liftData1 = new LiftData();
//            liftData1.setLiftNumber(i);
//            liftData1.setLiftFloorAt(0);
//            liftData.add(liftData1);
//        }
//        for (LiftData i : liftData) {
//            System.out.print("Lift Number: ");
//            System.out.print(i.getLiftNumber());
//            System.out.print("  Floor at: ");
//            System.out.print(i.getLiftFloorAt() + "   ");
//            System.out.println();
//        }
//        int num = 10;
//        while (num == 10) {
//            System.out.print("Enter your current floor: ");
//            int currFloor = scanner.nextInt();
//            System.out.print("Enter your destination floor: ");
//            int destFloor = scanner.nextInt();
//            if (justCreated == 1) {
//                liftData.get(0).setLiftFloorAt(destFloor);
//                justCreated = -1;
//                System.out.println("Lift 1 is assigned to the user");
//                //Module 5 restrict user
//                System.out.println("Press 1 if you want to restrict any lifts");
//                int userChoice = scanner.nextInt();
//                if (userChoice == 1) {
//                    System.out.println();
//                    System.out.println("Enter the lift number you want to restrict: ");
//                    int liftNumber = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.println("Enter the floor upto which you want to restrict.");
//                    int restrictedFloor = scanner.nextInt();
//                    System.out.println();
//                    restrictLiftFloors(liftData, liftNumber, restrictedFloor);
//                    liftRestricted=0;
//                }
//            } else {
//                int minRequiredFloor = Integer.MAX_VALUE;
//                int assignedLift = -1;
//                for (int i = 0; i < liftData.size(); i++) {
//                    int requiredFloor = Math.abs(liftData.get(i).getLiftFloorAt() - currFloor);
//                    if (requiredFloor < minRequiredFloor) {
//                        assignedLift = liftData.get(i).getLiftNumber();
//                        minRequiredFloor = requiredFloor; // Update the minimum required floor
//                    }
//                }
//                // Module 2 Lift assigning
//                System.out.print("Lift Assigned to the User is: " + assignedLift);
//                for (LiftData i : liftData) {
//                    if (i.getLiftNumber() == assignedLift) {
//                        i.setLiftFloorAt(destFloor);
//                    }
//                }
//
//            }
//            System.out.println("If u want to exit press 10 else 0");
//            int user = scanner.nextInt();
//            if (user == 10) {
//                num = 1;
//            }
//            System.out.println();
//            liftStatus(liftData);
//            if(liftRestricted!=-1) {
//                System.out.println("Lift restrictions at : " + liftData);
//            }
//            }
//    }
//
//    public static void liftStatus(ArrayList<LiftData> liftData) {
//        for (LiftData i : liftData) {
//            System.out.print("Lift Number: ");
//            System.out.print(i.getLiftNumber());
//            System.out.print("  Floor at: ");
//            System.out.print(i.getLiftFloorAt() + "   ");
//            System.out.println();
//        }
//    }
//
//    public static void restrictLiftFloors(ArrayList<LiftData> liftData, int liftNumber, int restrictedFloor) {
//        liftData.get(liftNumber).setRestrictLiftFloor(restrictedFloor);
//    }
//}
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<LiftData> liftData = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int justCreated = 1;
//        int restircted = 1;
//        // Module 1
//        for (int i = 1; i <= 5; i++) {
//            LiftData lift = new LiftData();
//            lift.setLiftNumber(i);
//            lift.setLiftFloorAt(0);
//            liftData.add(lift);
//        }
//
//        printLiftStatus(liftData);
//
//        int num = 10;
//        while (num == 10) {
//            System.out.print("Enter your current floor: ");
//            int currFloor = scanner.nextInt();
//            System.out.print("Enter your destination floor: ");
//            int destFloor = scanner.nextInt();
//
//            if (justCreated == 1) {
//                liftData.get(0).setLiftFloorAt(destFloor);
//                justCreated = -1;
//                System.out.println("Lift 1 is assigned to the user");
//            } else {
//                int minDistance = Integer.MAX_VALUE;
//                int assignedLift = -1;
//                char direction = ' '; // Stores the direction of movement (+ or -)
//
//            // Module 5
//            System.out.println("Do you want to restrict any lifts? press 1 if u want to");
//            int userChoice = scanner.nextInt();
//            scanner.nextLine();
//            if(userChoice == 1){
//                System.out.println("Enter the number of lifts you want to restrict");
//                int liftCount = scanner.nextInt();
//                for( int i =0 ;i<liftCount;i++){
//                    System.out.print("Enter the lift Number: ");
//
//                    int liftNumber = scanner.nextInt();
//                    System.out.print("Enter the restriction floor from: ");
//
//                    int liftRestrictionFrom = scanner.nextInt();
//
//                    System.out.println("Enter the restriction floor to: ");
//                    int liftRestrictUpto = scanner.nextInt();
//
//                    restrictTheLift(liftData,liftNumber,liftRestrictionFrom,liftRestrictUpto);
//                }
//            }
//
//                for (LiftData lift : liftData) {
//                    int distance = Math.abs(lift.getLiftFloorAt() - currFloor);
//                    // Module 3
//                    if (distance < minDistance) {
//                        minDistance = distance;
//                        assignedLift = lift.getLiftNumber();
//
//                        if (lift.getLiftFloorAt() > currFloor) {
//                            direction = '-';
//                        } else {
//                            direction = '+';
//                        }
//                    // Module 4
//                    } else if (distance == minDistance) {
//                        char newDirection;
//                        if (lift.getLiftFloorAt() > currFloor) {
//                            newDirection = '-';
//                        } else {
//                            newDirection = '+';
//                        }
//                        if (direction == ' ') {
//                            direction = newDirection;
//                        } else {
//                            if (direction == '-' && newDirection == '+') {
//                                assignedLift = lift.getLiftNumber();
//                                direction = newDirection;
//                            }
//                        }
//                    }
//                }
//                System.out.println("Lift Assigned to the User is: " + assignedLift);
//                for (LiftData lift : liftData) {
//                    if (lift.getLiftNumber() == assignedLift) {
//                        lift.setLiftFloorAt(destFloor);
//                    }
//                }
//            }
//            System.out.println("If you want to exit, press 10. Otherwise, press 0.");
//            int user = scanner.nextInt();
//            if (user == 10) {
//                num = 1;
//            }
//
//            System.out.println();
//            printLiftStatus(liftData);
//        }
//    }
//
//    public static void printLiftStatus(ArrayList<LiftData> liftData) {
//        System.out.println("Lift Status:");
//        for (LiftData lift : liftData) {
//            System.out.println("Lift Number: " + lift.getLiftNumber() + ", Floor at: " + lift.getLiftFloorAt());
//        }
//        System.out.println();
//    }
//    public static void restrictTheLift(ArrayList<LiftData>liftData,int liftNumber,int restrictFrom, int restrictUpto){
//        liftData.get(liftNumber).setRestrictLiftFloorFrom(restrictFrom);
//        liftData.get(liftNumber).setRestrictLiftFloorUpto(restrictUpto);
//    }
//}
