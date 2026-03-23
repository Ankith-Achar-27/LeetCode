package Easy;

public class FruitIntoBasket_3477 {
    public static void main(String[] args) {
        int[] fruits={3,6,1};
        int[] baskets={6,4,7};
        FruitIntoBasket_3477 obj = new FruitIntoBasket_3477();
        System.out.println(obj.numOfUnplacedFruits(fruits,baskets));

    }
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for (int j=0;j<baskets.length;j++){
                if (fruits[i]<=baskets[j]){
                    count++;
                    baskets[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}
