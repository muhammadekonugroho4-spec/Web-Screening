package com.stockbit.feature.portfolio.ui.customsort;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class g implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f106111a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106112b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106113c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(g.class.getClassLoader());
            boolean r2 = false;
            if (r5.containsKey("isHideOddLot") == false) goto L5;
            boolean r02 = r5.getBoolean("isHideOddLot");
        L7:
            if (r5.containsKey("isCompleteView") == false) goto L10;
            r2 = r5.getBoolean("isCompleteView");
        L10:
            if (r5.containsKey("currentSort") == false) goto L14;
            return new g(r5.getInt("currentSort"), r02, r2);
        L14:
            throw new IllegalArgumentException("Required argument \"currentSort\" is missing and does not have an android:defaultValue");
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public g(int r1, boolean r2, boolean r3) {
        this.f106111a = r1;
        this.f106112b = r2;
        this.f106113c = r3;
    }

    public static final g fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final boolean a() {
        return this.f106113c;
    }

    public final boolean b() {
        return this.f106112b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isHideOddLot", this.f106112b);
        r02.putBoolean("isCompleteView", this.f106113c);
        r02.putInt("currentSort", this.f106111a);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f106111a == r52.f106111a) goto L12;
        return false;
    L12:
        if (this.f106112b == r52.f106112b) goto L15;
        return false;
    L15:
        if (this.f106113c == r52.f106113c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f106111a) * 31) + Boolean.hashCode(this.f106112b)) * 31) + Boolean.hashCode(this.f106113c);
    }

    public String toString() {
        return "CustomSortPortfolioFragmentArgs(currentSort=" + this.f106111a + ", isHideOddLot=" + this.f106112b + ", isCompleteView=" + this.f106113c + ')';
    }
}
