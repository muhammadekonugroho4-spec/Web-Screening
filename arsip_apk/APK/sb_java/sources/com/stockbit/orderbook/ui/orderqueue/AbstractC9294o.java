package com.stockbit.orderbook.ui.orderqueue;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* renamed from: com.stockbit.orderbook.ui.orderqueue.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9294o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f124705a = null;

    /* renamed from: com.stockbit.orderbook.ui.orderqueue.o$a */
    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f124706a;

        /* renamed from: b, reason: collision with root package name */
        public final String f124707b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124708c;

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, CrashHianalyticsData.TIME);
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
            this.f124706a = r2;
            this.f124707b = r3;
            this.f124708c = com.stockbit.feature.orderbook.f.f103607a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString(CrashHianalyticsData.TIME, this.f124706a);
            r02.putString(Constants.KEY_TITLE, this.f124707b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f124708c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f124706a, r52.f124706a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f124707b, r52.f124707b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f124706a.hashCode() * 31) + this.f124707b.hashCode();
        }

        public String toString() {
            return "ActionOrderQueueFilterFragmentToOrderQueueTimeFilterDialogFragment(time=" + this.f124706a + ", title=" + this.f124707b + ')';
        }
    }

    /* renamed from: com.stockbit.orderbook.ui.orderqueue.o$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, CrashHianalyticsData.TIME);
            kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
            return new a(r2, r3);
        }

        public b() {
        }
    }

    static {
        f124705a = new b(null);
    }
}
