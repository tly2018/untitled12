package com.neuedu.test;

public class WorkerAdapterImpl implements WorkerAdapter {
    @Override
    public String work(Object work) {
        String workcontent=null;
        if(work instanceof Icooker){
            workcontent=((Icooker)work).cook();
        }else if(work instanceof Programmer){
           workcontent= ((Programmer)work).prom();
        }
        return workcontent;
    }
}
