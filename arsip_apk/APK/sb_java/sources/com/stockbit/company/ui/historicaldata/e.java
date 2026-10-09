package com.stockbit.company.ui.historicaldata;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f66119c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f66120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66121b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(e.class.getClassLoader());
            if (r4.containsKey("symbol") == false) goto L19;
            String r02 = r4.getString("symbol");
            if (r02 == null) goto L17;
            if (r4.containsKey("timeFrameName") == false) goto L15;
            String r42 = r4.getString("timeFrameName");
            if (r42 == null) goto L13;
            return new e(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"timeFrameName\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"timeFrameName\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f66119c = new a(null);
    }

    public e(String r2, String r3) {
        p.l(r2, "symbol");
        p.l(r3, "timeFrameName");
        this.f66120a = r2;
        this.f66121b = r3;
    }

    public static final e fromBundle(Bundle r1) {
        return f66119c.a(r1);
    }

    public final String a() {
        return this.f66120a;
    }

    public final String b() {
        return this.f66121b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f66120a, r52.f66120a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f66121b, r52.f66121b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f66120a.hashCode() * 31) + this.f66121b.hashCode();
    }

    public String toString() {
        return "HistoricalDataFragmentArgs(symbol=" + this.f66120a + ", timeFrameName=" + this.f66121b + ')';
    }
}
