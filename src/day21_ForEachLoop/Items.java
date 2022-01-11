package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {
      String []items = {"Shoes","Jacket","Gloves","Airpods","iPad","iPhone 12 case"};
      //   indexN        0           1     2         3         4       5
      double[]prices = {99.99,   150.0,   9.99,    250.0,   439.50,   39.99};
      int[]itemsId = {12345,    12346,   12347,   12348,   12349,    12350};

      // itemName-itemeId-price

        for (int i = 0; i<=5 ; i++) {
            String item = items[i];
            int itemId = itemsId[i];
            double price = prices[i];
            System.out.println(item+ " - "+itemId+" - $"+price);
        }









    }
}
