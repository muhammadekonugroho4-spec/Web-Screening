package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class m extends b implements n {
    public static n b(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r02 = r2.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if ((r02 instanceof n) == false) goto L10;
        return (n) r02;
    L10:
        return new l(r2);
    }
}
