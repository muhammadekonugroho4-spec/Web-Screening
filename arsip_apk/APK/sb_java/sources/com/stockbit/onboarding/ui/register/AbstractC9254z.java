package com.stockbit.onboarding.ui.register;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* renamed from: com.stockbit.onboarding.ui.register.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9254z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f124217a = null;

    /* renamed from: com.stockbit.onboarding.ui.register.z$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(boolean r2, boolean r3) {
            return new b(r2, r3);
        }

        public a() {
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.register.z$b */
    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f124218a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f124219b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124220c;

        public b(boolean r1, boolean r2) {
            this.f124218a = r1;
            this.f124219b = r2;
            this.f124220c = com.stockbit.navigation.D.f122345Q;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("tradingRegisterComplete", this.f124218a);
            r02.putBoolean("isReferralDialogAlreadyDisplayed", this.f124219b);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f124220c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f124218a == r52.f124218a) goto L12;
            return false;
        L12:
            if (this.f124219b == r52.f124219b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f124218a) * 31) + Boolean.hashCode(this.f124219b);
        }

        public String toString() {
            return "OpenDiscoverFriend(tradingRegisterComplete=" + this.f124218a + ", isReferralDialogAlreadyDisplayed=" + this.f124219b + ')';
        }
    }

    static {
        f124217a = new a(null);
    }
}
