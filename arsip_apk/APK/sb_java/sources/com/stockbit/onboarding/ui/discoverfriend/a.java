package com.stockbit.onboarding.ui.discoverfriend;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C1075a f123493c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f123494a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123495b;

    /* renamed from: com.stockbit.onboarding.ui.discoverfriend.a$a, reason: collision with other inner class name */
    public static final class C1075a {
        public /* synthetic */ C1075a(i r1) {
            this();
        }

        public final a a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(a.class.getClassLoader());
            boolean r2 = false;
            if (r5.containsKey("tradingRegisterComplete") == false) goto L5;
            boolean r02 = r5.getBoolean("tradingRegisterComplete");
        L7:
            if (r5.containsKey("isReferralDialogAlreadyDisplayed") == false) goto L10;
            r2 = r5.getBoolean("isReferralDialogAlreadyDisplayed");
        L10:
            return new a(r02, r2);
        L5:
            r02 = false;
            goto L7
        }

        public C1075a() {
        }
    }

    static {
        f123493c = new C1075a(null);
    }

    public a(boolean r1, boolean r2) {
        this.f123494a = r1;
        this.f123495b = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f123493c.a(r1);
    }

    public final boolean a() {
        return this.f123494a;
    }

    public final boolean b() {
        return this.f123495b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f123494a == r52.f123494a) goto L12;
        return false;
    L12:
        if (this.f123495b == r52.f123495b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f123494a) * 31) + Boolean.hashCode(this.f123495b);
    }

    public String toString() {
        return "DiscoverFriendRegisterFragmentArgs(tradingRegisterComplete=" + this.f123494a + ", isReferralDialogAlreadyDisplayed=" + this.f123495b + ')';
    }
}
