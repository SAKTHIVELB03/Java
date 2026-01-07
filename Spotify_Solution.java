import java.util.*;
class Spotify{
    private int spotifyId;
    private String profileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private String groupSessionAvaliable;
    
    public Spotify(int spotifyId , String profileName, String subscriptionType, double subscriptionPrice , String groupSessionAvaliable){
        this.spotifyId = spotifyId;
        this.profileName = profileName;
        this.subscriptionType = subscriptionType;
        this.subscriptionPrice = subscriptionPrice;
        this.groupSessionAvaliable = groupSessionAvaliable;
    }

    public int getSpotifyId(){
        return spotifyId;
    }

    public String getProfileName(){
        return profileName;
    }

    public String getSubscriptionType(){
        return subscriptionType;
    }

    public double getSubscriptionPrice(){
        return subscriptionPrice;
    }

    public String getGroupSessionAvaliable(){
        return groupSessionAvaliable;
    }
}

public class Spotify_Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Spotify[] list = new Spotify[4];

        for (int i=0; i<4; i++){
            int id= Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String type = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            String group = sc.nextLine();

            list[i] = new Spotify(id,name,type,price,group);
        }
        String targetType = sc.nextLine();
        String targetGroup = sc.nextLine();

        double result = findAvgSpotifySubsByType(list, targetType, targetGroup);

        if (result>0){
            System.out.println(result);
        }
        
        else {
            System.out.println("There is no such Spotify subscription");
        }
    }
        public static double findAvgSpotifySubsByType(Spotify[] list, String Type , String Group){
            double total = 0;
            int count = 0;
            for (Spotify i: list){
                if ((i.getSubscriptionType().equalsIgnoreCase(Type)) && (i.getGroupSessionAvaliable().equalsIgnoreCase(Group))){
                        total=i.getSubscriptionPrice();
                        count++;
                }
            }
            return count>0? total/count : 0.0;
        }
    }

