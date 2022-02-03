import java.util.*;

public class Task {
    public static class FavoriteClasses {
        private String favorite1;
        private int favorite2;
        private double favorite3;
        FavoriteClasses(String fav1, int fav2, double fav3){
            this.favorite1 = fav1;
            this.favorite2 = fav2;
            this.favorite3 = fav3;
        }

        public String getFav1(){
            return(this.favorite1);
        }

        public int getFav2(){
            return(this.favorite2);
        }

        public double getFav3(){
            return(this.favorite3);
        }
    }

    public static void main(String[] args){
        List<Double> r = new ArrayList<>();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses a = new FavoriteClasses("Hello", 67, r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
    }
}
