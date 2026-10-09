package com.stockbit.transferstock.ui.brokers;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.Securities;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f150757a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final Securities f150758a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150759b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f150760c;
        public final int d;

        public a(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            this.f150758a = r2;
            this.f150759b = r3;
            this.f150760c = r4;
            this.d = com.stockbit.transferstock.g.f150602c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L6;
            Securities r1 = this.f150758a;
            p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("security", r1);
        L8:
            r02.putBoolean("fromOnboard", this.f150759b);
            r02.putBoolean("isFromDeeplink", this.f150760c);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(Securities.class) == false) goto L11;
            Parcelable r12 = this.f150758a;
            p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("security", (Serializable) r12);
            goto L8
        L11:
            throw new UnsupportedOperationException(Securities.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f150758a, r52.f150758a) == true) goto L12;
            return false;
        L12:
            if (this.f150759b == r52.f150759b) goto L15;
            return false;
        L15:
            if (this.f150760c == r52.f150760c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f150758a.hashCode() * 31) + Boolean.hashCode(this.f150759b)) * 31) + Boolean.hashCode(this.f150760c);
        }

        public String toString() {
            return "ActionAnotherBrokerageFragmentToInputDataFragment(security=" + this.f150758a + ", fromOnboard=" + this.f150759b + ", isFromDeeplink=" + this.f150760c + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(b r02, Securities r1, boolean r2, boolean r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = true;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = false;
        L9:
            return r02.a(r1, r2, r3);
        }

        public final InterfaceC4081o0 a(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            return new a(r2, r3, r4);
        }

        public b() {
        }
    }

    static {
        f150757a = new b(null);
    }
}
