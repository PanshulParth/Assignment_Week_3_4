
import java.util.*;

public class Assignment_Week_3_4 {

    static class Client {
        String name;
        int risk;
        double balance;

        Client(String name, int risk, double balance) {
            this.name = name;
            this.risk = risk;
            this.balance = balance;
        }

        public String toString() {
            return name + ":" + risk;
        }
    }

    // Bubble Sort ASC
    static void bubbleSort(List<Client> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).risk > list.get(j + 1).risk) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    // Insertion DESC
    static void insertionSortDesc(List<Client> list) {
        for (int i = 1; i < list.size(); i++) {
            Client key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).risk < key.risk) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Client> list = new ArrayList<>();

        list.add(new Client("C", 80, 1000));
        list.add(new Client("A", 20, 2000));
        list.add(new Client("B", 50, 1500));

        bubbleSort(list);
        System.out.println("Bubble ASC: " + list);

        insertionSortDesc(list);
        System.out.println("Insertion DESC: " + list);

        System.out.println("Top Clients:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}

