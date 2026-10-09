package com.stockbit.feature.insider.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f98777c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f98778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98779b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(f.class.getClassLoader());
            if (r4.containsKey("insiderId") == false) goto L19;
            String r02 = r4.getString("insiderId");
            if (r02 == null) goto L17;
            if (r4.containsKey("insiderName") == false) goto L15;
            String r42 = r4.getString("insiderName");
            if (r42 == null) goto L13;
            return new f(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"insiderName\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"insiderName\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"insiderId\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"insiderId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f98777c = new a(null);
    }

    public f(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "insiderId");
        kotlin.jvm.internal.p.l(r3, "insiderName");
        this.f98778a = r2;
        this.f98779b = r3;
    }

    public static final f fromBundle(Bundle r1) {
        return f98777c.a(r1);
    }

    public final String a() {
        return this.f98778a;
    }

    public final String b() {
        return this.f98779b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("insiderId", this.f98778a);
        r02.putString("insiderName", this.f98779b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f98778a, r52.f98778a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f98779b, r52.f98779b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f98778a.hashCode() * 31) + this.f98779b.hashCode();
    }

    public String toString() {
        return "InsiderDetailComposeFragmentArgs(insiderId=" + this.f98778a + ", insiderName=" + this.f98779b + ')';
    }
}
