package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzic implements zzih {
    public zzic() {
    }

    private static final boolean zzb(int r2) {
        new Socket("localhost", r2).close();     // Catch: ConnectException -> L5
        return true;
    L5:
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] r1) {
        return zzie.zza(this, r1);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... r8) {
        int r1 = r8.length;
        ArrayList r02 = new ArrayList(r1);
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L12;
        Object r3 = r8[r2];
        if (true == (r3 instanceof Integer)) goto L7;
        r3 = null;
    L7:
        Integer r32 = (Integer) r3;
        if (r32 == null) goto L11;
        r02.add(Integer.valueOf(r32.intValue()));
        r2 = r2 + 1;
        goto L3
    L11:
        throw new zzce(4, 5, null);
    L12:
        ArrayList r82 = new ArrayList();
        Iterator r03 = r02.iterator();
    L14:
        if (r03.hasNext() == false) goto L18;
        int r12 = ((Number) r03.next()).intValue();
        if (zzb(r12) == false) goto L14;
        r82.add(Integer.valueOf(r12));
        goto L14
    L18:
        return r82;
    }
}
