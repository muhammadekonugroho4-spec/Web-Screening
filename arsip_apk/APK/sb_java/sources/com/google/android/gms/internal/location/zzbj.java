package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzbj {
    public static Looper zza(Looper r02) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        return zzb();
    }

    public static Looper zzb() {
        if (Looper.myLooper() == null) goto L5;
        boolean r02 = true;
    L6:
        Preconditions.checkState(r02, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    L5:
        r02 = false;
        goto L6
    }
}
