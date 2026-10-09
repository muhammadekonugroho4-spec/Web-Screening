package com.stockbit.onboarding.ui.watchlist;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f124296c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f124297a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124298b;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            boolean r2 = false;
            if (r5.containsKey("tradingRegisterComplete") == false) goto L5;
            boolean r02 = r5.getBoolean("tradingRegisterComplete");
        L7:
            if (r5.containsKey("isReferralDialogAlreadyDisplayed") == false) goto L10;
            r2 = r5.getBoolean("isReferralDialogAlreadyDisplayed");
        L10:
            return new e(r02, r2);
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f124296c = new a(null);
    }

    public e(boolean r1, boolean r2) {
        this.f124297a = r1;
        this.f124298b = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f124296c.a(r1);
    }

    public final boolean a() {
        return this.f124297a;
    }

    public final boolean b() {
        return this.f124298b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f124297a == r52.f124297a) goto L12;
        return false;
    L12:
        if (this.f124298b == r52.f124298b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f124297a) * 31) + Boolean.hashCode(this.f124298b);
    }

    public String toString() {
        return "DiscoverWatchlistItemFragmentArgs(tradingRegisterComplete=" + this.f124297a + ", isReferralDialogAlreadyDisplayed=" + this.f124298b + ')';
    }
}
