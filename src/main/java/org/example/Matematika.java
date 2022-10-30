package org.example;

public class Matematika {
    public static int faktorijel(int broj) {
        int faktorijel = 1;
        if(broj==0) return 1;
        for(int i=broj;i>=2;--i) {
            faktorijel = faktorijel * broj;
            broj--;
        }
        return faktorijel;
    }
    public static double sinus(double broj){
        double sin=0;
        int i=0;
        int stepen=1,predznak=1;
        broj=broj*Math.PI/180;
        for(i=1;i<10;i++,stepen+=2,predznak*=(-1)){
                sin+=(Math.pow(broj,stepen)/faktorijel(stepen))*predznak;
            }

        return sin;
    }
}
