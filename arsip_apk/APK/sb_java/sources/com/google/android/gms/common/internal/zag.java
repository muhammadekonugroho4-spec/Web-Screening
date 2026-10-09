package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* loaded from: classes5.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public zag() {
    }

    public static zag zab(Activity r1, Intent r2, int r3) {
        return new zad(r2, r1, r3);
    }

    public static zag zac(Fragment r1, Intent r2, int r3) {
        return new zae(r2, r1, r3);
    }

    public static zag zad(LifecycleFragment r1, Intent r2, int r3) {
        return new zaf(r2, r1, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r5, int r6) {
        zaa();     // Catch: Throwable -> L4 ActivityNotFoundException -> L6
    L11:
        r5.dismiss();
        return;
    L6:
        e = move-exception;
        String r02 = "Failed to start resolution intent.";
        if (true != Build.FINGERPRINT.contains("generic")) goto L10;
        r02 = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
    L10:
        Log.e("DialogRedirect", r02, e);     // Catch: Throwable -> L4
    L4:
        th = move-exception;
        r5.dismiss();
        throw th;
    }

    public abstract void zaa();
}
