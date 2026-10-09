package com.stockbit.company.ui.keytstats.fundachart;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f66263a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66264b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66265c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(d.class.getClassLoader());
            if (r5.containsKey("symbol") == false) goto L27;
            String r02 = r5.getString("symbol");
            if (r02 == null) goto L25;
            if (r5.containsKey(Constants.KEY_TITLE) == false) goto L23;
            String r1 = r5.getString(Constants.KEY_TITLE);
            if (r1 == null) goto L21;
            if (r5.containsKey(FirebaseAnalytics.Param.ITEMS) == false) goto L19;
            String r52 = r5.getString(FirebaseAnalytics.Param.ITEMS);
            if (r52 == null) goto L17;
            return new d(r02, r1, r52);
        L17:
            throw new IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public d(String r2, String r3, String r4) {
        p.l(r2, "symbol");
        p.l(r3, Constants.KEY_TITLE);
        p.l(r4, FirebaseAnalytics.Param.ITEMS);
        this.f66263a = r2;
        this.f66264b = r3;
        this.f66265c = r4;
    }

    public static final d fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f66265c;
    }

    public final String b() {
        return this.f66263a;
    }

    public final String c() {
        return this.f66264b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f66263a, r52.f66263a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f66264b, r52.f66264b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f66265c, r52.f66265c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f66263a.hashCode() * 31) + this.f66264b.hashCode()) * 31) + this.f66265c.hashCode();
    }

    public String toString() {
        return "KeyStatsFundaChartFragmentArgs(symbol=" + this.f66263a + ", title=" + this.f66264b + ", items=" + this.f66265c + ')';
    }
}
