package org.openhab.habdroid.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.openhab.habdroid.ui.OpenHABMainActivity;

/**
 * Created by aidan on 01/04/15.
 */
public class BootupReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, OpenHABMainActivity.class);
        context.startService(startServiceIntent);
    }
}
