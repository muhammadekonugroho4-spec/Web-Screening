package com.stockbit.alert.ui.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.alert.contract.model.AlertDetailModeNavParam;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class q implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f45375f = null;

    /* renamed from: a, reason: collision with root package name */
    public final AlertDetailModeNavParam f45376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45378c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45379e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a(Bundle r10) {
            kotlin.jvm.internal.p.l(r10, "bundle");
            r10.setClassLoader(q.class.getClassLoader());
            String r2 = null;
            if (r10.containsKey("requestKey") == false) goto L5;
            String r5 = r10.getString("requestKey");
        L7:
            if (r10.containsKey("alertDetailMode") == false) goto L34;
            if (Parcelable.class.isAssignableFrom(AlertDetailModeNavParam.class) == false) goto L11;
        L15:
            AlertDetailModeNavParam r4 = (AlertDetailModeNavParam) r10.get("alertDetailMode");
            if (r4 == null) goto L32;
            if (r10.containsKey("alertId") == false) goto L20;
            String r6 = r10.getString("alertId");
        L22:
            if (r10.containsKey("stock") == false) goto L24;
            r2 = r10.getString("stock");
        L24:
            String r7 = r2;
            if (r10.containsKey("isFromActiveAlert") == false) goto L28;
            boolean r102 = r10.getBoolean("isFromActiveAlert");
        L30:
            return new q(r4, r5, r6, r7, r102);
        L28:
            r102 = false;
            goto L30
        L20:
            r6 = null;
            goto L22
        L32:
            throw new IllegalArgumentException("Argument \"alertDetailMode\" is marked as non-null but was passed a null value.");
        L11:
            if (Serializable.class.isAssignableFrom(AlertDetailModeNavParam.class) == true) goto L15;
            throw new UnsupportedOperationException(AlertDetailModeNavParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L34:
            throw new IllegalArgumentException("Required argument \"alertDetailMode\" is missing and does not have an android:defaultValue");
        L5:
            r5 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f45375f = new a(null);
    }

    public q(AlertDetailModeNavParam r2, String r3, String r4, String r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, "alertDetailMode");
        this.f45376a = r2;
        this.f45377b = r3;
        this.f45378c = r4;
        this.d = r5;
        this.f45379e = r6;
    }

    public static final q fromBundle(Bundle r1) {
        return f45375f.a(r1);
    }

    public final AlertDetailModeNavParam a() {
        return this.f45376a;
    }

    public final String b() {
        return this.f45378c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f45379e;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("requestKey", this.f45377b);
        if (Parcelable.class.isAssignableFrom(AlertDetailModeNavParam.class) == false) goto L6;
        Object r1 = this.f45376a;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("alertDetailMode", (Parcelable) r1);
    L8:
        r02.putString("alertId", this.f45378c);
        r02.putString("stock", this.d);
        r02.putBoolean("isFromActiveAlert", this.f45379e);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(AlertDetailModeNavParam.class) == false) goto L11;
        AlertDetailModeNavParam r12 = this.f45376a;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("alertDetailMode", r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(AlertDetailModeNavParam.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f45376a == r52.f45376a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f45377b, r52.f45377b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f45378c, r52.f45378c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f45379e == r52.f45379e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.f45376a.hashCode() * 31;
        String r1 = this.f45377b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f45378c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return ((r04 + r2) * 31) + Boolean.hashCode(this.f45379e);
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "AlertDetailFragmentArgs(alertDetailMode=" + this.f45376a + ", requestKey=" + this.f45377b + ", alertId=" + this.f45378c + ", stock=" + this.d + ", isFromActiveAlert=" + this.f45379e + ')';
    }

    public /* synthetic */ q(AlertDetailModeNavParam r2, String r3, String r4, String r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = null;
    L12:
        if ((r7 & 16) == 0) goto L14;
        r6 = false;
    L14:
        boolean r72 = r6;
        String r62 = r5;
        this(r2, r3, r4, r62, r72);
    }
}
