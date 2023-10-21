package HW8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class hw1 {
    public static void main(String[] args) {
        // 建立一個ArrayList作為Collection物件
        Collection<Object> myCollection = new ArrayList<>();

        // 將指定的資料加入到Collection
        myCollection.add(Integer.valueOf(100));
        myCollection.add(Double.valueOf(3.14));
        myCollection.add(Long.valueOf(21L));
        myCollection.add(Short.valueOf((short) 100));
        myCollection.add(Double.valueOf(5.1));
        myCollection.add("Kitty");
        myCollection.add(Integer.valueOf(100));
        myCollection.add(new Object());
        myCollection.add("Snoopy");
        myCollection.add(new java.math.BigInteger("1000"));

        // 印出所有元素 (使用Iterator)
        System.out.println("印出所有元素 (使用Iterator):");
        Iterator<Object> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 移除非Number相關的物件
        Iterator<Object> iterator2 = myCollection.iterator();
        while (iterator2.hasNext()) {
            Object element = iterator2.next();
            if (!(element instanceof Number)) {
                iterator2.remove();
            }
        }

        // 再次印出元素 (使用傳統for)
        System.out.println("\n再次印出元素 (使用傳統for):");
        for (Object element : myCollection) {
            System.out.println(element);
        }

        // 再次印出元素 (使用foreach)
        System.out.println("\n再次印出元素 (使用foreach):");
        myCollection.forEach(System.out::println);
    }
}
