package com.stockbit.screener.ui.universe;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f133043c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f133044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133045b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(g.class.getClassLoader());
            if (r4.containsKey("requestKey") == false) goto L5;
            String r02 = r4.getString("requestKey");
        L7:
            if (r4.containsKey("universeScopeId") == false) goto L13;
            String r42 = r4.getString("universeScopeId");
            if (r42 != null) goto L15;
            throw new IllegalArgumentException("Argument \"universeScopeId\" is marked as non-null but was passed a null value.");
        L15:
            return new g(r02, r42);
        L13:
            r42 = "";
            goto L15
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f133043c = new a(null);
    }

    public g(String r2, String r3) {
        p.l(r3, "universeScopeId");
        this.f133044a = r2;
        this.f133045b = r3;
    }

    public static final g fromBundle(Bundle r1) {
        return f133043c.a(r1);
    }

    public final String a() {
        return this.f133044a;
    }

    public final String b() {
        return this.f133045b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f133044a, r52.f133044a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f133045b, r52.f133045b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f133044a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f133045b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ScreenerUniverseFragmentArgs(requestKey=" + this.f133044a + ", universeScopeId=" + this.f133045b + ')';
    }
}
