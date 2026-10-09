package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzcl {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater r1, Object r2, Object r3, Object r4) {
    L3:
        if (androidx.concurrent.futures.a.a(r1, r2, r3, r4) == true) goto L4;
        if (r1.get(r2) == r3) goto L3;
        return false;
    L4:
        return true;
    }
}
