package com.stockbit.calendar.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f50487c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f50488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50489b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(f.class.getClassLoader());
            if (r4.containsKey("detailPage") == false) goto L9;
            String r02 = r4.getString("detailPage");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"detailPage\" is marked as non-null but was passed a null value.");
        L11:
            if (r4.containsKey("isFromDeeplink") == false) goto L13;
            boolean r42 = r4.getBoolean("isFromDeeplink");
        L15:
            return new f(r02, r42);
        L13:
            r42 = false;
            goto L15
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f50487c = new a(null);
    }

    public f(String r2, boolean r3) {
        p.l(r2, "detailPage");
        this.f50488a = r2;
        this.f50489b = r3;
    }

    public static final f fromBundle(Bundle r1) {
        return f50487c.a(r1);
    }

    public final String a() {
        return this.f50488a;
    }

    public final boolean b() {
        return this.f50489b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("detailPage", this.f50488a);
        r02.putBoolean("isFromDeeplink", this.f50489b);
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
        if (p.g(this.f50488a, r52.f50488a) == true) goto L12;
        return false;
    L12:
        if (this.f50489b == r52.f50489b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f50488a.hashCode() * 31) + Boolean.hashCode(this.f50489b);
    }

    public String toString() {
        return "CalendarMainFragmentArgs(detailPage=" + this.f50488a + ", isFromDeeplink=" + this.f50489b + ')';
    }
}
