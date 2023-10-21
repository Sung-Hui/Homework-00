package HW8;

import java.util.*;

public class hw2 {
    public static class Train {
        private int number;
        private String type;
        private String start;
        private String dest;
        private double price;

        public Train(int number, String type, String start, String dest, double price) {
            this.number = number;
            this.type = type;
            this.start = start;
            this.dest = dest;
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getDest() {
            return dest;
        }

        public void setDest(String dest) {
            this.dest = dest;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", type='" + type + '\'' +
                    ", start='" + start + '\'' +
                    ", dest='" + dest + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 建立Train物件並放入集合
        List<Train> trainList = new ArrayList<>();
        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));

        // 1. 印出不重複的Train物件
        Set<Train> uniqueTrains = new HashSet<>(trainList);
        System.out.println("不重複的Train物件:");
        for (Train train : uniqueTrains) {
            System.out.println(train);
        }

        // 2. 以班次編號由大到小印出
        Collections.sort(trainList, (t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));
        System.out.println("\n班次編號由大到小印出:");
        for (Train train : trainList) {
            System.out.println(train);
        }

        // 3. 以班次編號由大到小印出，並不重複
        Set<Integer> seenNumbers = new HashSet<>();
        System.out.println("\n班次編號由大到小不重複印出:");
        for (Train train : trainList) {
            if (!seenNumbers.contains(train.getNumber())) {
                System.out.println(train);
                seenNumbers.add(train.getNumber());
            }
        }
    }
}
