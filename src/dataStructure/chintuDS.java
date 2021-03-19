package dataStructure;


import java.util.ArrayList;

public class chintuDS {
    static class Table {
        int height;
        int cost;
        int surfaceArea;
//        Table smallTable = new Table(1, 2, 3);

        public Table(int i, int i1, int i2) {
            height = i;
            cost = i1;
            surfaceArea = i2;
        }
    }
    static class Chair {
        int cost;
        Style style;
    }
    enum Style {
        Bending,
        Standing
    }
    public static void main(String[] args) {
//        ArrayList<Table> a = new ArrayList<>();
        Table t = new Table(1, 2, 3);
        System.out.println(t.cost);
    }
}
