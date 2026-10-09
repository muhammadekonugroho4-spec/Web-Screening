package com.clevertap.android.sdk.cryption;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f33768c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f33769a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33770b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(String r3) {
            return new l(r3, false);
        }

        public a() {
        }
    }

    static {
        f33768c = new a(null);
    }

    public l(String r1, boolean r2) {
        this.f33769a = r1;
        this.f33770b = r2;
    }

    public final String a() {
        return this.f33769a;
    }

    public final boolean b() {
        return this.f33770b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f33769a, r52.f33769a) == true) goto L12;
        return false;
    L12:
        if (this.f33770b == r52.f33770b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f33769a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f33770b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "MigrationResult(data=" + this.f33769a + ", migrationSuccessful=" + this.f33770b + ')';
    }
}
