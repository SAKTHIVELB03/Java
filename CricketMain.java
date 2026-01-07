/*
Create the class Cricket with the below attributes:

id – int
name – String
run – int
playerType – String
matchType – String

The above attributes should be private.
Write appropriate getter methods, and a parameterized constructor.

Create a class CricketMain with the main method.
Implement the following two static methods:

🔹 findLowestRunByPlayerType
This method should take an array of Cricket objects and a String value (representing player type) as input.
The method should return the lowest run scored by a player of the given player type (case-insensitive).
If no player of that type is found, the method should return Integer.MAX_VALUE.

🔹 getPlayersByMatchTypeSorted
This method should take an array of Cricket objects and a String value (representing match type) as input.
It should return a new array of Cricket objects, containing only those players who match the given match type (case-insensitive), sorted in descending order of their id.
If no player matches the match type, the method should return an empty array.

⚙️ Main Method Requirements:
In the main method:
Read all required input from the user.
Call both static methods accordingly.

🖨️ For findLowestRunByPlayerType:
If the returned value is not Integer.MAX_VALUE, print the lowest run.
Else, print:
No Such Type of Player Type Exist

🖨️ For getPlayersByMatchTypeSorted:
If the returned array is not empty, print the IDs of the players in descending order.

If the returned array is empty, print:
No Match Type match

📥 Sample Input 1:
Copy
Edit
3
1
John
350
Bastman
ODI
2
Mike
200
Bowler
T20
3
Steve
400
Bastman
ODI
Bastman
ODI
📤 Sample Output 1:
Copy
Edit
350
3
1
📥 Sample Input 2:
Copy
Edit
3
101
Divyen
300
bowler
ABC
102
Hiren
200
batsman
DEF
103
Jay
400
bwler
ABC
Bowler
Abc
📤 Sample Output 2:
Copy
Edit
300
103
101

*/
import java.util.*;

class Cricket {
    private int id;
    private String name;
    private int run;
    private String playerType;
    private String matchType;

    public Cricket(int id, String name, int run, String playerType, String matchType) {
        this.id = id;
        this.name = name;
        this.run = run;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

public class CricketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cricket[] list = new Cricket[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int run = sc.nextInt(); sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            list[i] = new Cricket(id, name, run, playerType, matchType);
        }

        String targetPlayerType = sc.nextLine();
        String targetMatchType = sc.nextLine();

        int result1 = findLowestRunByPlayerType(list, targetPlayerType);
        if (result1 != Integer.MAX_VALUE) {
            System.out.println(result1);
        } else {
            System.out.println("No Such Type of Player Type Exist");
        }

        Cricket[] result2 = getPlayersByMatchTypeSorted(list, targetMatchType);
        if (result2.length > 0) {
            for (Cricket c : result2) {
                System.out.println(c.getId());
            }
        } else {
            System.out.println("No Match Type match");
        }
    }

    public static int findLowestRunByPlayerType(Cricket[] list, String targetPlayerType) {
        int minRun = Integer.MAX_VALUE;
        for (Cricket c : list) {
            if (c.getPlayerType().equalsIgnoreCase(targetPlayerType)) {
                if (c.getRun() < minRun) {
                    minRun = c.getRun();
                }
            }
        }
        return minRun;
    }

    public static Cricket[] getPlayersByMatchTypeSorted(Cricket[] list, String targetMatchType) {
        ArrayList<Cricket> filteredList = new ArrayList<>();
        for (Cricket c : list) {
            if (c.getMatchType().equalsIgnoreCase(targetMatchType)) {
                filteredList.add(c);
            }
        }

        filteredList.sort((a, b) -> b.getId() - a.getId()); // Descending order by ID

        return filteredList.toArray(new Cricket[0]);
    }
}
