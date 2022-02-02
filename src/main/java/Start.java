
import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        int [] arrey1 = {9,8,7,6,5,4,3,2,1,0};
        int [] arrey2 = {21,4,4,7,2,7,10,11,1,13};

        Obrabotka obr = new Obrabotka();
        obr.priemOtdacha(arrey1,arrey2);
    }
}
class Obrabotka{
       public void priemOtdacha (int [] a, int [] b){
           Set <Integer> set1 = new HashSet<>();
           for (int i = 0; i < a.length; i++) {
               set1.add(a[i]);
           }
           Set <Integer> set2 = new HashSet<>();
           for (int i = 0; i < b.length; i++) {
               set2.add(b[i]);
           }
           Set <Integer> inrersection = new HashSet<>(set1);
           inrersection.retainAll(set2);
           System.out.println(inrersection);
    }
}


/*
9,8,7,6,5,4,3,2,1,0
0,2,4,6,8,9,10,11,12,13
21,4,4,7,2,7,10,11,1,13
*/
