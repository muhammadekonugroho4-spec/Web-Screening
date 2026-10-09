package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzaee {
    public static String zza() {
        Locale r02 = Locale.getDefault();
        StringBuilder r1 = new StringBuilder();
        zza(r1, r02);
        Locale r2 = Locale.US;
        if (r02.equals(r2) == true) goto L9;
        if (r1.length() <= 0) goto L7;
        r1.append(", ");
    L7:
        zza(r1, r2);
    L9:
        return r1.toString();
    }

    private static void zza(StringBuilder r1, Locale r2) {
        String r02 = r2.getLanguage();
        if (r02 == null) goto L8;
        r1.append(r02);
        String r22 = r2.getCountry();
        if (r22 == null) goto L9;
        r1.append("-");
        r1.append(r22);
        return;
    L9:
        return;
    }
}
