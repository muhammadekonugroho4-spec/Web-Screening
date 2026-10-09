package com.stockbit.personalamend.ui.changedata.verifydatachange;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f125574e = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125575a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125576b;

    /* renamed from: c, reason: collision with root package name */
    public final String f125577c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(m.class.getClassLoader());
            if (r6.containsKey("isChangeEmail") == false) goto L23;
            boolean r02 = r6.getBoolean("isChangeEmail");
            if (r6.containsKey("changeToken") == false) goto L21;
            String r1 = r6.getString("changeToken");
            if (r1 == null) goto L19;
            if (r6.containsKey("changeSource") == false) goto L17;
            String r2 = r6.getString("changeSource");
            if (r6.containsKey("currentValue") == false) goto L15;
            return new m(r02, r1, r2, r6.getString("currentValue"));
        L15:
            throw new IllegalArgumentException("Required argument \"currentValue\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Required argument \"changeSource\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Argument \"changeToken\" is marked as non-null but was passed a null value.");
        L21:
            throw new IllegalArgumentException("Required argument \"changeToken\" is missing and does not have an android:defaultValue");
        L23:
            throw new IllegalArgumentException("Required argument \"isChangeEmail\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f125574e = new a(null);
    }

    public m(boolean r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r3, "changeToken");
        this.f125575a = r2;
        this.f125576b = r3;
        this.f125577c = r4;
        this.d = r5;
    }

    public static final m fromBundle(Bundle r1) {
        return f125574e.a(r1);
    }

    public final String a() {
        return this.f125577c;
    }

    public final String b() {
        return this.f125576b;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f125575a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f125575a == r52.f125575a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f125576b, r52.f125576b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f125577c, r52.f125577c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f125575a) * 31) + this.f125576b.hashCode()) * 31;
        String r1 = this.f125577c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "VerifyIdentityFormFragmentArgs(isChangeEmail=" + this.f125575a + ", changeToken=" + this.f125576b + ", changeSource=" + this.f125577c + ", currentValue=" + this.d + ')';
    }
}
