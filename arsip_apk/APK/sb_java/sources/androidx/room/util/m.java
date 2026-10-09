package androidx.room.util;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class m {
    public static final int a(androidx.sqlite.d r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int r02 = k.b(r2, r3);
        if (r02 < 0) goto L5;
        return r02;
    L5:
        int r03 = k.b(r2, '`' + r3 + '`');
        if (r03 < 0) goto L9;
        return r03;
    L9:
        return b(r2, r3);
    }

    public static final int b(androidx.sqlite.d r02, String r1) {
        return -1;
    }
}
