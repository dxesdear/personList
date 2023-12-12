package int101.array;

import people.Person;
import people.PersonList;

public class Int101w12Array {
    public static void main(String[] args) {

            //demoArray1();
            //demoArray2();
            demoPersonList2();
    }





    private static void demoPersonList2() {

        PersonList pp2 = new PersonList(10);
        PersonList pp3 = new PersonList(-4);
        Person p1 = new Person("Chakhrit");
        Person p2 = new Person("Phulaenna");
        Person p3 = new Person("Dear");
        Person p4 = new Person("far");
        Person p5 = new Person("near");
        Person p6 = new Person("tea");

        // use method add
        pp2.add(p2);
        pp2.add(p4);
        pp2.add(p6);
        System.out.println( pp2.add(p1));
        System.out.println(pp2);

        pp3.add(p1);
        pp3.add(p2);
        System.out.println(pp3);

        //use remove method
        pp2.remove(p1);
        System.out.println(pp2);

        // use findPersonByName method
        System.out.println(pp2.findPersonByName("Chakhirt"));
        System.out.println(pp2.findPersonByName("Tea"));
        System.out.println(pp2.findPersonByName("tea"));








    }

    private static void demoArray2() {
        var ps = new Person[] {new Person("one"), new Person("two")};
        int len = ps.length;
        System.out.println("Length of ps" + len);
        for(int i = 0; i < len;i++){
            System.out.format("ps[%d] : %s%n", i,ps[i]);
        }
        System.out.println("");

        ps[0] = new Person("three");
//        for(int i = 0; i < len;i++){
//            System.out.format("ps[%d] : %s%n", i,ps[i]);
//        }
        for ( Person p :ps){
            System.out.println("P : "+ p);
        }

        System.out.println("");
        var x = new Person[7];
        int count  = 4;
        x[0] = new Person("Mono");
        x[1] = new Person("Bi");
        x[2] = new Person("Tri");
        x[3] = new Person("Quad");
        System.out.println("Print Round1");
        for (Person person:x) {
            System.out.println("x : " + person);
        }
        System.out.println("Print round2");
        for (int i=0; i < count;i++){
            System.out.format("x[%d] : %s%n", i,x[i]);
        }
    }

    static void demoArray1() {
        // declaration
        int i;
        double d;
        String s;
        Person p;
        // array declaration
        int[] is;
        double[] ds;
        String[] ss;
        Person[] ps;
        
        // initialization
        i = 10; // initialize
        d = 2.0; // initialize
        s = "First String"; // instantiate,initialize
        p = new Person("Somchai");  // instantiate,initialize
        
        // array instantiation
        is = new int[(int) d];
        ds = new double[i];
        ss = new String[5];
        ps = new Person[i];
        
        // array declaration & instantiation & initialization
        double[] dArr = {10.0, 20.0, d, 40.0};
        ds = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] sArr = {"One", "Two", "Three"};
        ss = new String[] {"First", "Second", "Third"};
        Person[] pArr = {new Person("Mono"), new Person("Bi"), p};
        ps = new Person[] {p, p, new Person("Noname")};
    }
}
