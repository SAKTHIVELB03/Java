public class averagearray {
    public static void main(String[] args){
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int sum=0;
        int length=ages.length;
        for ( int i: ages){
            sum+=i;
        }
        float average= (float) sum/ (float) length;
        System.out.println("The average is:"+ average);

        System.out.print("Lowest age:");
        int lowage=ages[0];
        for (int i: ages){
            if (lowage>i) {
                lowage=i;
            }
        }
        System.out.println(lowage);
    }
    
}
