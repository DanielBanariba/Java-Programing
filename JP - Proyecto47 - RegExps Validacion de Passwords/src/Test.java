import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        if (t.add("one"))
            if (t.add("two"))
                if (t.add ("three"))
                    t.add("four");
        for (String variableMagica : t)
            System.out.print (variableMagica);

    recursidad(4,3);
        System.out.println(recursidad(4,3));
    }



    public static int recursidad(int numb1, int numb2){
        if (numb1==0){
            return numb2;
        }
        return recursidad(numb1 -1, numb1+numb2);
    }
}
