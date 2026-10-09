package com.clevertap.android.sdk.inapp.images.preload;

import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0352a f34335b = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f34336a;

    /* renamed from: com.clevertap.android.sdk.inapp.images.preload.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public /* synthetic */ C0352a(i r1) {
            this();
        }

        public final a a() {
            return new a(4);
        }

        public C0352a() {
        }
    }

    static {
        f34335b = new C0352a(null);
    }

    public a(int r1) {
        this.f34336a = r1;
    }

    public final int a() {
        return this.f34336a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (this.f34336a == ((a) r4).f34336a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34336a);
    }

    public String toString() {
        return "FilePreloadConfig(parallelDownloads=" + this.f34336a + ')';
    }
}
