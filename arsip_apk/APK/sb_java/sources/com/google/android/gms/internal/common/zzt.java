package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzt {
    public static final CharSequence zza(Object r02, String r1) {
        Objects.requireNonNull(r02);
        if ((r02 instanceof CharSequence) == false) goto L7;
        return (CharSequence) r02;
    L7:
        return r02.toString();
    }
}
