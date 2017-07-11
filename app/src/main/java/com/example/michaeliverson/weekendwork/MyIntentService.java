package com.example.michaeliverson.weekendwork;

import android.app.IntentService;
import android.content.Intent;

import java.util.ArrayList;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Intent broadcast = new Intent().setAction("TO_RETURN").putExtra("RETURN",populate());
        startService(broadcast);
    }

    private ArrayList<IvyPojo> populate()
    {
        IvyPojo pojo1 = new IvyPojo("Michael",0);
        IvyPojo pojo2 = new IvyPojo("Richard",1);
        IvyPojo pojo3 = new IvyPojo("William",2);
        IvyPojo pojo4 = new IvyPojo("Ace",3);
        IvyPojo pojo5 = new IvyPojo("Raul",4);

        ArrayList<IvyPojo> toReturn = new ArrayList<IvyPojo>();
        toReturn.add(pojo1);
        toReturn.add(pojo2);
        toReturn.add(pojo3);
        toReturn.add(pojo4);
        toReturn.add(pojo5);
        return toReturn;
    }
}
