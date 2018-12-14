package com.neuedu.test;

public class Atest {
    public static void main(String[] args) {
        Icooker cook = new CookerImpl();
        Programmer pro = new ProgramImpl();
        Object[] abs = {cook,pro};
        WorkerAdapter w = new WorkerAdapterImpl();
        for (Object o:abs
             ) {
            System.out.println(w.work(o)  );
        }
    }
}
