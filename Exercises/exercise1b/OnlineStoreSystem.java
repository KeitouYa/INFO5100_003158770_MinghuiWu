package exercise1b;

import java.util.*;

public class OnlineStoreSystem {
    public static void main(String[] args) {
        String[] orderDate = {
            "John,Laptop,1,899.99", "Sarah,Mouse,2,25.50", "Mike,Keyboard,1,75.00",
            "John,Monitor,1,299.99", "Sarah,Laptop,1,899.99", "Lisa,Mouse,3,25.50",
            "Mike,Headphones,1,150.00", "John,Mouse,1,25.50", "Lisa,Keyboard,2,75.00",
            "Sarah,Monitor,2,299.99", "Mike,Monitor,1,299.99", "Lisa,Headphones,1,150.00"
        };
        String orderFormat =  "CustomerName,ProductName,Quantity,Price";
        String[] orderFormats = orderFormat.split(",");

        System.out.println("=== ONLINE STORE ORDER PROCESSING SYSTEM ===");

        System.out.println("STEP 1: Managing orders with ArrayList");
        List<List<String>> orders = new ArrayList<>();
        for(int i = 0; i < orderDate.length; i++){
            String[] strArray = orderDate[i].split(",");
            List<String> list = new ArrayList<>();
            for(int j = 0; j < strArray.length; j++){
                list.add(strArray[j]);
            }
            orders.add(list);
        }

        System.out.println("Total orders: " +orders.size());
        System.out.println("First 3 orders:");
        for(int i = 0; i < 3; i++){
            System.out.println(orderDate[i]);
        }
        System.out.println();

        System.out.println("STEP 2: Finding customers with HashSet");
        Set<String> uniqueCustomers = new HashSet<>();
        for(List<String> l : orders){
            uniqueCustomers.add(l.get(0));
        }
        System.out.print("Unique customers: [");
        int count = 0;
        for(String s: uniqueCustomers){
            System.out.print(s);
            count++;
            if(count <  uniqueCustomers.size()){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("Total customers: ");
        System.out.println(count);
        System.out.println();


        System.out.println("STEP 3: Use TreeSet to sort product names");
        TreeSet<String> products = new TreeSet<>();
        for(List<String> l : orders){
            products.add(l.get(1));
        }

        int countProducts = 0;
        System.out.print("Sorted products: [");
        for(String s : products){
            System.out.print(s);
            countProducts++;
            if(countProducts <= products.size()){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("Total products: " + countProducts);
        System.out.println();


        System.out.println("STEP 4: Use HashMap for financial summaries");
        HashMap<String, Double> totalSpent = new HashMap<>();
        HashMap<String, Double> totalQuantity = new HashMap<>();
        for(List<String> l : orders){
            String customer = l.get(0);
            Double price = Double.valueOf(l.get(3));
            totalSpent.put(customer, totalSpent.getOrDefault(customer, 0.0) + price);
        }
        for(List<String> l : orders){
            String product = l.get(1);
            Double quantity = Double.valueOf(l.get(2));
            totalQuantity.put(product, totalQuantity.getOrDefault(product, 0.0) + quantity);
        }


        System.out.println("CustomerName, TotalSpent: ");
        for(Map.Entry<String, Double> entry : totalSpent.entrySet()){
            System.out.println(entry.getKey() + ", "+ entry.getValue());
        }
        System.out.println();

        System.out.println("ProductName, TotalQuantity : ");
        for(Map.Entry<String, Double> entry : totalQuantity.entrySet()){
            System.out.println(entry.getKey() + ", "+ entry.getValue());
        }
        System.out.println();


        System.out.println("STEP 5: Use Queue to process big orders");
        Queue<String> bigOrders = new ArrayDeque<>();

        for(String order : orderDate){
            String[] parts = order.split(",");
            int quantity = Integer.valueOf(parts[2]);
            double price = Double.valueOf(parts[3]);
            if(price * quantity >= 200){
                bigOrders.offer(order);
            }
        }

        System.out.println("Total Big Orders: " + bigOrders.size());

        while(!bigOrders.isEmpty()){
            System.out.println("Processing orders:" + bigOrders.poll());
        }

        System.out.println("\nAll big orders have been processed.\n");

        System.out.println("STEP 6: Use Stack to handle returns");
        Stack<String> returns = new Stack<>();
        returns.add("John,Laptop,1,899.99");
        returns.add("Sarah,Laptop,1,899.99");
        returns.add("Lisa,Headphones,1,150.00");

        while(!returns.isEmpty()){
            System.out.println("Processing return: " + returns.pop());
        }
        System.out.println("\nAll returns have been processed.\n");











    }
}
