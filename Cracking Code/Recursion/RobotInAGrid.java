import java.util.*;

public class RobotInAGrid {
    public LinkedList<Integer> solution(HashMap<Integer, int[]> input) {

        //intial setup
        LinkedList<Integer> pathTaken = new LinkedList<>();
        int[] visited = new int[12];  // ****
        visited[0] = 1;
        pathTaken.add(0);
        int currentPosition = 0;


        while (currentPosition != 11) {    // ****

            //To move forward

            int[] possiblePath = input.getOrDefault(currentPosition, new int[0]);
            boolean didRobotMove = false;
                for (int i : possiblePath) {  // Issue arises when you run two because two is empty and doesnot run the for loop
                    if (visited[i] == 0) {
                        currentPosition = i;
                        visited[i] = 1;
                        pathTaken.add(i);
                        didRobotMove = true;
                        break;
                    }
                }

                // Go back to the start
                if(didRobotMove)continue;

            // To move back on the path list by one, only runs if robot did not move

                Iterator<Integer> i = pathTaken.descendingIterator();
                i.next();
                currentPosition = i.next();
                pathTaken.removeLast();

            }
        return pathTaken;
        }


        public static void main (String[]args){


            // Give input in form of possible options to move from one place on grid

            // Grid looks like
            // 0    1     2
            //     _________
            // 3    4     5
            //     ________
            // 6    7     8

            HashMap<Integer, int[]> input = new HashMap<>();
            input.put(0, new int[]{1});
            input.put(1, new int[]{2});
            input.put(2, new int[]{5});
            input.put(3, new int[]{4, 6});
            input.put(4, new int[]{3,5});
            input.put(5, new int[]{4});
            input.put(6, new int[]{7});
            input.put(7, new int[]{8});
            input.put(8, new int[]{11});
            input.put(9, new int[]{10});
            input.put(10, new int[]{9,11});


            RobotInAGrid hello = new RobotInAGrid();
            System.out.println(hello.solution(input));

        }
}