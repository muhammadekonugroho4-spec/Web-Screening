package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class k {
    public static void a(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r1);
    }

    public static String b(String r1) {
        if (TextUtils.isEmpty(r1) == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static Collection c(Collection r1) {
        if (r1.isEmpty() == true) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static Object d(Object r1) {
        return e(r1, "Argument must not be null");
    }

    public static Object e(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }
}
