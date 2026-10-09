package com.stockbit.orderbook.ui.orderqueue;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes10.dex */
public final class F implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f124321c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f124322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124323b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final F a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(F.class.getClassLoader());
            if (r4.containsKey(CrashHianalyticsData.TIME) == false) goto L19;
            String r02 = r4.getString(CrashHianalyticsData.TIME);
            if (r02 == null) goto L17;
            if (r4.containsKey(Constants.KEY_TITLE) == false) goto L15;
            String r42 = r4.getString(Constants.KEY_TITLE);
            if (r42 == null) goto L13;
            return new F(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"time\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"time\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f124321c = new a(null);
    }

    public F(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, CrashHianalyticsData.TIME);
        kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
        this.f124322a = r2;
        this.f124323b = r3;
    }

    public static final F fromBundle(Bundle r1) {
        return f124321c.a(r1);
    }

    public final String a() {
        return this.f124322a;
    }

    public final String b() {
        return this.f124323b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof F) == true) goto L8;
        return false;
    L8:
        F r52 = (F) r5;
        if (kotlin.jvm.internal.p.g(this.f124322a, r52.f124322a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f124323b, r52.f124323b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f124322a.hashCode() * 31) + this.f124323b.hashCode();
    }

    public String toString() {
        return "OrderQueueTimeFilterDialogFragmentArgs(time=" + this.f124322a + ", title=" + this.f124323b + ')';
    }
}
