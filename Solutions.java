import java.util.*;
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId, String resortName , String category , double price, double rating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price=price;
        this.rating = rating;
    }

    public int getResortId(){
        return resortId;
    }

    public void setResortId(int resortId){
        this.resortId=resortId;
    }

    public String getResortName(){
        return resortName;
    }

    public void setResortName(String resortName){
        this.resortName=resortName;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }
}
public class Solutions {
    public static void main(String[] args){
        Resort[] rr = new Resort[4];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<4; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();

            rr[i] = new Resort(id, name,category,price,rating);
        }
        String targetCategory = sc.nextLine();

        int result = findAvgPriceByCategory(rr , targetCategory);
        if (result>0){
            System.out.println("Average price of the " + targetCategory + "Resort" + result);
        }else { System.out.println("There are no such avaliable resort");}
    }
    public static int findAvgPriceByCategory(Resort[] list , String cat){
        int sum = 0;
        int count = 0;
        for (int i =0; i< list.length; i++){
            if ((list[i].getCategory().equalsIgnoreCase(cat)) && (list[i].getRating()>4)){
                count++;
                sum+= list[i].getPrice();
            }
        }
        return count > 0 ? (int) sum / count : 0;

    }
}
