import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        List<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(7);
        c.add(7);
        c.add(7);
        c.size();

        myList.add("sdsdfsd");
        myList.add(44);
        myList.add(6,"eyt");
        System.out.println(myList);
        ArrayList b = new ArrayList();
        b.add("ògkhfg");
        b.add(new ooo());
        b.add(4);
        b.add(4);

        b.add(4);
        b.add(4);
        MyList<Integer> a = new MyList<>();
        a.add(1);
        a.add(1);
        a.add(6, 6);
        System.out.println(myList);
        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(myList.get(6));
        System.out.println(myList.contains(44));

    }
}
