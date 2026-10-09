package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T r1, Class<T> r2) {
        if (r1 == null) goto L5;
        return;
    L5:
        throw new IllegalStateException(r2.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }

    public static <T> T checkNotNullFromComponent(T r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNullFromProvides(T r1) {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNull(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static <T> T checkNotNull(T r2, String r3, Object r4) {
        if (r2 == null) goto L4;
        return r2;
    L4:
        if (r3.contains("%s") == false) goto L16;
        if (r3.indexOf("%s") != r3.lastIndexOf("%s")) goto L14;
        if ((r4 instanceof Class) == false) goto L10;
        String r42 = ((Class) r4).getCanonicalName();
    L12:
        throw new NullPointerException(r3.replace("%s", r42));
    L10:
        r42 = String.valueOf(r4);
        goto L12
    L14:
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    L16:
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }
}
