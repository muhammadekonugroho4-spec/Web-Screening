package com.google.android.play.integrity.internal;

/* loaded from: classes5.dex */
public final class al implements ak {

    /* renamed from: a, reason: collision with root package name */
    private static final al f38347a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38348b;

    static {
        f38347a = new al(null);
    }

    private al(Object r1) {
        this.f38348b = r1;
    }

    public static ak b(Object r1) {
        if (r1 == null) goto L7;
        return new al(r1);
    L7:
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        return this.f38348b;
    }
}
