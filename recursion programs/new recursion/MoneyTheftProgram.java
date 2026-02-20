import java.util.ArrayList;
import java.util.Arrays;

public class MoneyTheftProgram {
    static String s;
    public static void main(String[] args) {
        // Given an array among which a thief will steal only the homes that are not adjacent to each other. And return the max of it.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(moneyStolenByThiefFromNonAdjacentHouse(list, 0, ""));
    }
    static int moneyStolenByThiefFromNonAdjacentHouse(ArrayList<Integer> list, int index, String str){
        if(index == list.size() - 1) return 0;
        if(index >= list.size()) return 0;

        int take = list.get(index) + moneyStolenByThiefFromNonAdjacentHouse(list, index + 2, str + "R") ;
        int noTake = moneyStolenByThiefFromNonAdjacentHouse(list, index + 1, str + "L");
        
        return Math.max(take, noTake);
    }
}
