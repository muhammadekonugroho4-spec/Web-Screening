package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzafj {
    public static String zza(String r5) {
        Object r52 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke(null, new Object[]{r5});     // Catch: Exception -> L10
        if (r52 == null) goto L9;
        if (String.class.isAssignableFrom(r52.getClass()) == false) goto L9;
        return (String) r52;
    L9:
        return null;
    }
}
