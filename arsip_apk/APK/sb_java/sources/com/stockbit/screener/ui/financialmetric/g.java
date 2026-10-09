package com.stockbit.screener.ui.financialmetric;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.entity.screener.ScreenerFinancialMetric;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f132503f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f132504a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f132505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132506c;
    public final ScreenerFinancialMetric d;

    /* renamed from: e, reason: collision with root package name */
    public final int f132507e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(g.class.getClassLoader());
            int r2 = 0;
            if (r10.containsKey("originDestinationId") == false) goto L5;
            int r4 = r10.getInt("originDestinationId");
        L7:
            if (r10.containsKey("isBasicRatio") == false) goto L9;
            boolean r5 = r10.getBoolean("isBasicRatio");
        L10:
            ScreenerFinancialMetric r3 = null;
            if (r10.containsKey("requestKey") == false) goto L13;
            String r6 = r10.getString("requestKey");
        L15:
            if (r10.containsKey("screenerFinancialMetricItemParcel") == true) goto L17;
        L24:
            ScreenerFinancialMetric r7 = r3;
            if (r10.containsKey("screenerFinancialMetricChildLevel") == false) goto L28;
            r2 = r10.getInt("screenerFinancialMetricChildLevel");
        L28:
            return new g(r4, r5, r6, r7, r2);
        L17:
            if (Parcelable.class.isAssignableFrom(ScreenerFinancialMetric.class) == false) goto L19;
        L23:
            r3 = (ScreenerFinancialMetric) r10.get("screenerFinancialMetricItemParcel");
            goto L24
        L19:
            if (Serializable.class.isAssignableFrom(ScreenerFinancialMetric.class) == true) goto L23;
            throw new UnsupportedOperationException(ScreenerFinancialMetric.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L13:
            r6 = null;
            goto L15
        L9:
            r5 = false;
            goto L10
        L5:
            r4 = 0;
            goto L7
        }

        public a() {
        }
    }

    static {
        f132503f = new a(null);
    }

    public g(int r1, boolean r2, String r3, ScreenerFinancialMetric r4, int r5) {
        this.f132504a = r1;
        this.f132505b = r2;
        this.f132506c = r3;
        this.d = r4;
        this.f132507e = r5;
    }

    public static final g fromBundle(Bundle r1) {
        return f132503f.a(r1);
    }

    public final int a() {
        return this.f132504a;
    }

    public final String b() {
        return this.f132506c;
    }

    public final int c() {
        return this.f132507e;
    }

    public final ScreenerFinancialMetric d() {
        return this.d;
    }

    public final boolean e() {
        return this.f132505b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f132504a == r52.f132504a) goto L12;
        return false;
    L12:
        if (this.f132505b == r52.f132505b) goto L15;
        return false;
    L15:
        if (p.g(this.f132506c, r52.f132506c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f132507e == r52.f132507e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f132504a) * 31) + Boolean.hashCode(this.f132505b)) * 31;
        String r1 = this.f132506c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        ScreenerFinancialMetric r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Integer.hashCode(this.f132507e);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ScreenerFinancialMetricFragmentArgs(originDestinationId=" + this.f132504a + ", isBasicRatio=" + this.f132505b + ", requestKey=" + this.f132506c + ", screenerFinancialMetricItemParcel=" + this.d + ", screenerFinancialMetricChildLevel=" + this.f132507e + ')';
    }
}
