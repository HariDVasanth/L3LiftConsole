//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class OldCOde {
//    public static void main(String[] args) {
//        ArrayList<LiftData>liftData = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int justCreated = 1;
//        for(int i=1;i<=5;i++){
//            LiftData liftData1 = new LiftData();
//            liftData1.setLiftNumber(i);
//            liftData1.setLiftFloorAt(0);
//            liftData.add(liftData1);
//        }
//        for(LiftData i:liftData){
//            System.out.print("Lift Number: ");
//            System.out.print(i.getLiftNumber());
//            System.out.print("  Floor at: ");
//            System.out.print(i.getLiftFloorAt() +"   ");
//            System.out.println();
//        }
//        int num = 10;
//        while (num==10){
//            System.out.print("Enter your current floor: ");
//            int currFloor = scanner.nextInt();
//            System.out.print("Enter your destination floor: ");
//            int destFloor = scanner.nextInt();
//            if(justCreated==1){
//                liftData.get(0).setLiftFloorAt(destFloor);
//                justCreated = -1;
//                System.out.println("Lift 1 is assigned to the user");
//            }else {
//                int floor= Integer.MAX_VALUE;
//                int assignedLift=-1;
//                ArrayList<Integer>sameFloor = new ArrayList<>();
//                for(int i=0;i<liftData.size();i++){
//                    int requiredFloor = Math.abs(liftData.get(i).getLiftFloorAt() - currFloor);
//                    if(requiredFloor<floor){
//                        assignedLift = liftData.get(i).getLiftNumber();
//                    }
//                    if(requiredFloor == floor){
//                        int assignedLift1 = liftData.get(i).getLiftNumber();
//                        int floor1 = currFloor-floor; //Calculating the floor upwards or downwards
//                        if(sameFloor.size()==0) {
//                            if (floor1 > 0) {
//                                sameFloor.add(assignedLift);
//                            }else {
//                                sameFloor.add(assignedLift*-1);
//                            }
//
//                        }else {
//                            int calculateFLoor = currFloor - assignedLift1;
//                            if (calculateFLoor > 0) {
//                                sameFloor.add(assignedLift1);
//                            }else {
//                                sameFloor.add(assignedLift1*-1);
//                            }
//                        }
//                    }
//                    if(sameFloor.size()>0 && sameFloor.get(0)==floor){
//                        for(int i1: sameFloor){
//                            if(i1>0){
//                                assignedLift = i1;
//                            }
//                        }
//                    }
//                }
//                System.out.print("Lift Assigned to the User is: "+ assignedLift);
//                for(LiftData i: liftData){
//                    if(i.getLiftNumber() == assignedLift){
//                        i.setLiftFloorAt(destFloor);
//                    }
//                }
//
//            }
//            System.out.println("If u want to exit press 10 else 0");
//            int user = scanner.nextInt();
//            if(user==10){
//                num=1;
//            }
//            System.out.println();
//            liftStatus(liftData);
//        }
//    }
//    public static void liftStatus(ArrayList<LiftData>liftData){
//        for(LiftData i:liftData){
//            System.out.print("Lift Number: ");
//            System.out.print(i.getLiftNumber());
//            System.out.print("  Floor at: ");
//            System.out.print(i.getLiftFloorAt() +"   ");
//            System.out.println();
//        }
//    }
//}