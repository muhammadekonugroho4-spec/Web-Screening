package com.koushikdutta.async.http.cache;

/* loaded from: classes6.dex */
public abstract class b {
    public static boolean a(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }
}
