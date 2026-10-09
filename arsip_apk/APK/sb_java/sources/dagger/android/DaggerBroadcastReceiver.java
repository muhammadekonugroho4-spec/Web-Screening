package dagger.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    public DaggerBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context r1, Intent r2) {
        a.c(this, r1);
    }
}
