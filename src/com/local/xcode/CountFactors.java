package com.local.xcode;

public class CountFactors {

    public static void main(String[] args) {

        int a = 5, cnt=0;
        for(int i=1; i * i <= a; i++) {
            if(a%i==0){
                if(i*i == a)
                    cnt+=1;
                else
                    cnt+=2;
            }
        }
        System.out.println(cnt);
    }

}
