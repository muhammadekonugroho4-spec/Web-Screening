package com.stockbit.feature.transaction.ui.dialog.daytrade;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final DayTradeUnavailableType f113435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113436b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113437c;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(b.class.getClassLoader());
            String r2 = "";
            if (r6.containsKey("startTime") == false) goto L9;
            String r02 = r6.getString("startTime");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"startTime\" is marked as non-null but was passed a null value.");
        L11:
            if (r6.containsKey("endTime") == false) goto L18;
            r2 = r6.getString("endTime");
            if (r2 != null) goto L18;
            throw new IllegalArgumentException("Argument \"endTime\" is marked as non-null but was passed a null value.");
        L18:
            if (r6.containsKey("dayTradeUnavailableType") == false) goto L33;
            if (Parcelable.class.isAssignableFrom(DayTradeUnavailableType.class) == false) goto L22;
        L26:
            DayTradeUnavailableType r62 = (DayTradeUnavailableType) r6.get("dayTradeUnavailableType");
            if (r62 == null) goto L31;
            return new b(r62, r02, r2);
        L31:
            throw new IllegalArgumentException("Argument \"dayTradeUnavailableType\" is marked as non-null but was passed a null value.");
        L22:
            if (Serializable.class.isAssignableFrom(DayTradeUnavailableType.class) == true) goto L26;
            throw new UnsupportedOperationException(DayTradeUnavailableType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L33:
            throw new IllegalArgumentException("Required argument \"dayTradeUnavailableType\" is missing and does not have an android:defaultValue");
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public b(DayTradeUnavailableType r2, String r3, String r4) {
        p.l(r2, "dayTradeUnavailableType");
        p.l(r3, "startTime");
        p.l(r4, "endTime");
        this.f113435a = r2;
        this.f113436b = r3;
        this.f113437c = r4;
    }

    public static final b fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final DayTradeUnavailableType a() {
        return this.f113435a;
    }

    public final String b() {
        return this.f113437c;
    }

    public final String c() {
        return this.f113436b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f113435a == r52.f113435a) goto L12;
        return false;
    L12:
        if (p.g(this.f113436b, r52.f113436b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f113437c, r52.f113437c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f113435a.hashCode() * 31) + this.f113436b.hashCode()) * 31) + this.f113437c.hashCode();
    }

    public String toString() {
        return "DayTradeUnavailableBottomSheetArgs(dayTradeUnavailableType=" + this.f113435a + ", startTime=" + this.f113436b + ", endTime=" + this.f113437c + ')';
    }
}
