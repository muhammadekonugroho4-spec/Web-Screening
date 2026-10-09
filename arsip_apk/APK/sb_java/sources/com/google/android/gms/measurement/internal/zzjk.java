package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class zzjk {
    public static <T> T zza(Bundle r02, String r1, Class<T> r2, T r3) {
        T r03 = (T) r02.get(r1);
        if (r03 != null) goto L6;
        return r3;
    L6:
        if (r2.isAssignableFrom(r03.getClass()) == false) goto L9;
        return r03;
    L9:
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{r1, r2.getCanonicalName(), r03.getClass().getCanonicalName()}));
    }

    public static void zza(Bundle r4, Object r5) {
        if ((r5 instanceof Double) == false) goto L7;
        r4.putDouble("value", ((Double) r5).doubleValue());
        return;
    L7:
        if ((r5 instanceof Long) == false) goto L10;
        r4.putLong("value", ((Long) r5).longValue());
        return;
    L10:
        r4.putString("value", r5.toString());
    }
}
