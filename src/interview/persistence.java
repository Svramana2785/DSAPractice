package interview;
/*

insurance
group in 20 - 60 -> age

insurance company who want to find the indv age group count in the given range from 20 to 60

input = 20,56,30,40,60,70,20,40,20;

output = 20:3, 40:2


 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class persistence {
    public static void main(String[] args) {

        int[] input = new int[]{20,56,30,40,60,70,20,40,20,30,1};
        //List<Integer> groups = new ArrayList<>();
        int[] visited = new int[input.length];
        for(int i=0; i<input.length;i++) {
            if(input[i] >= 20 && input[i] <= 60 && !isVisited(visited,input[i])) {
                int cnt = 0;
                for (int j=i; j<input.length; j++) {
                    if(input[i] == input[j]){
                        cnt++;
                    }
                }
                System.out.println(input[i] + ":"+ cnt);
            }
            //System.out.println("i " +i+ " " + visited.length);
            visited[i] = input[i];
        }

        //Arrays.stream(input).filter(x->x>=20 && x<=60).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Map<Integer,Long> res =  Arrays.stream(input)
                .filter(x -> x >= 20 && x <= 60).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        List<Integer> ls = Arrays.asList(20, 56, 30, 40, 60, 70, 20, 40, 20, 30, 1);

        Map<Integer,Long> mp =  ls.stream().filter(x-> x>=20 && x<=60).collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println("Result from Map " + mp);

        System.out.println("result" + res);

    }

    public static boolean isVisited(int[] visited, int val) {

        for (int j : visited) {
            if (j == val)
                return true;
        }
        return false;
    }
}


class Person {

    int age;
    String name;
    Person(int age, String name) {
        this.age = age;
        this.name = name;

    }
    public int getAge(){
        return this.age;
    }
    public String getName() {
        return this.name;
    }

}

