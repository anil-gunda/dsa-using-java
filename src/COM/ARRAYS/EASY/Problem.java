package COM.ARRAYS.EASY;

import java.security.PrivateKey;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class  MinAge{
    String mla;
    String factory;
    String governor;

}

class ExceptionCheck{

    public  String mlaCheck(MinAge a,int age){
        try{
            if(age < 21){
                a.mla="illegal";
                throw new  IllegalAgeException("Illegal MLA age");
            }
            else{
                a.mla="legal";
            }
        } catch (IllegalAgeException e) {
            throw new RuntimeException(e);
        }

        return a.mla;
    }

    public  String factoryCheck(MinAge a,int age){
        try{
            if(age < 14){
                a.factory="illegal";
                throw new IllegalAgeException("illegal factory age");
            }
            else{
                a.factory="legal";
            }
        }
        catch (IllegalAgeException e) {
            throw new RuntimeException(e);
        }
        return a.factory;

    }

    public  String governorCheck(MinAge a,int age){
        try{
            if(age <35){
                a.governor="ilegal";
                throw new IllegalAgeException("Illegal governor age");
            }
            else{
                a.governor="legal";
            }
        } catch (IllegalAgeException e) {
            throw new RuntimeException(e);
        }
        return a.governor;
    }
}

class IllegalAgeException extends Exception{

    IllegalAgeException(String message){
        super(message);
    }
}

public class Problem extends Thread{

    public void run(){
        System.out.println("Name: " +Thread.currentThread().getName());
        System.out.println("Daemon "+Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        Problem t1 = new Problem();
        Problem t2 = new Problem();
        t1.start();
        t1.setDaemon(true);
        t2.start();
    }

}
