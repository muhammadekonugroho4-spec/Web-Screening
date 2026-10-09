package com.stockbit.tipping.ui.mytipjar;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.TippingMyJarProfile;
import java.io.Serializable;

/* loaded from: classes11.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final c f146015a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final TippingMyJarProfile f146016a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146017b;

        public a(TippingMyJarProfile r1) {
            this.f146016a = r1;
            this.f146017b = com.stockbit.tipping.b.f145563b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(TippingMyJarProfile.class) == false) goto L7;
            r02.putParcelable("tippingProfile", this.f146016a);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(TippingMyJarProfile.class) == false) goto L9;
            r02.putSerializable("tippingProfile", (Serializable) this.f146016a);
        L9:
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f146017b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f146016a, ((a) r4).f146016a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            TippingMyJarProfile r02 = this.f146016a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionTippingMyTipJarFragmentToTippingClaimTipFragment(tippingProfile=" + this.f146016a + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f146018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146019b;

        public b(String r1) {
            this.f146018a = r1;
            this.f146019b = com.stockbit.tipping.b.f145565c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("tippingAvailableCredit", this.f146018a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f146019b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f146018a, ((b) r4).f146018a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f146018a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ActionTippingMyTipJarFragmentToTippingUpdateGopayAccountFragment(tippingAvailableCredit=" + this.f146018a + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(TippingMyJarProfile r2) {
            return new a(r2);
        }

        public final InterfaceC4081o0 b(String r2) {
            return new b(r2);
        }

        public c() {
        }
    }

    static {
        f146015a = new c(null);
    }
}
