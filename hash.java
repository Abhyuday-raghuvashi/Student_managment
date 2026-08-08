import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Hashing{
    public static void main(String args[]){
    HashSet<Integer> set=new HashSet<>();  // syntax to declare a hashset
    set.add(2);
    set.add(5);
    set.add(3);
    set.add(2);  //Although u add it but it wont creat a unique set in hashset data structure;
    System.out.println(set);
    set.remove(2);   // remove element from the SET
    int l=set.size();
    Iterator it=set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    HashMap<String, Integer> map=new HashMap<>();
    map.put("Abhyuday Singh",96);
    map.put("Piyush kumar",94);
    map.put("Divyanshu Verma", 93);
    map.put("Kyush Kumar",76);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=sc.nextLine();
    if(map.containsKey(name)){
        System.out.println("Your marks are:"+ map.get(name));
    }
    for(Map.Entry<String, Integer> e:map.entrySet()){
        System.out.print(e.getKey()+ ":-");
        System.out.println(e.getValue());
    }
    Set<String> keys=map.keySet();
    for(String key:keys){
        System.out.println(key+" "+map.get(key));
    }
    }

}