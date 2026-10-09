package com.stockbit.transferstock.ui.transaction;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.Securities;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f151104a = null;

    /* renamed from: com.stockbit.transferstock.ui.transaction.a$a, reason: collision with other inner class name */
    public static final class C1374a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f151105a;

        /* renamed from: b, reason: collision with root package name */
        public final int f151106b;

        public C1374a(boolean r1) {
            this.f151105a = r1;
            this.f151106b = com.stockbit.transferstock.g.f150629q;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("fromOnboard", this.f151105a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f151106b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1374a) == true) goto L9;
            return false;
        L9:
            if (this.f151105a == ((C1374a) r4).f151105a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f151105a);
        }

        public String toString() {
            return "ActionTransferStockMainFragmentToBrokerageFragment(fromOnboard=" + this.f151105a + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final Securities f151107a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f151108b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f151109c;
        public final int d;

        public b(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            this.f151107a = r2;
            this.f151108b = r3;
            this.f151109c = r4;
            this.d = com.stockbit.transferstock.g.f150631r;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L6;
            Securities r1 = this.f151107a;
            p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("security", r1);
        L8:
            r02.putBoolean("fromOnboard", this.f151108b);
            r02.putBoolean("isFromDeeplink", this.f151109c);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(Securities.class) == false) goto L11;
            Parcelable r12 = this.f151107a;
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
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f151107a, r52.f151107a) == true) goto L12;
            return false;
        L12:
            if (this.f151108b == r52.f151108b) goto L15;
            return false;
        L15:
            if (this.f151109c == r52.f151109c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f151107a.hashCode() * 31) + Boolean.hashCode(this.f151108b)) * 31) + Boolean.hashCode(this.f151109c);
        }

        public String toString() {
            return "ActionTransferStockMainFragmentToInputDataFragment(security=" + this.f151107a + ", fromOnboard=" + this.f151108b + ", isFromDeeplink=" + this.f151109c + ')';
        }
    }

    public static final class c implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final Securities f151110a;

        /* renamed from: b, reason: collision with root package name */
        public final int f151111b;

        public c(Securities r2) {
            p.l(r2, "security");
            this.f151110a = r2;
            this.f151111b = com.stockbit.transferstock.g.f150633s;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L7;
            Securities r1 = this.f151110a;
            p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("security", r1);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(Securities.class) == false) goto L11;
            Parcelable r12 = this.f151110a;
            p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("security", (Serializable) r12);
            return r02;
        L11:
            throw new UnsupportedOperationException(Securities.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f151111b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f151110a, ((c) r4).f151110a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f151110a.hashCode();
        }

        public String toString() {
            return "ActionTransferStockMainFragmentToTransactionDetailFragment(security=" + this.f151110a + ')';
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(d r02, Securities r1, boolean r2, boolean r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = true;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = false;
        L9:
            return r02.b(r1, r2, r3);
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new C1374a(r2);
        }

        public final InterfaceC4081o0 b(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            return new b(r2, r3, r4);
        }

        public final InterfaceC4081o0 d(Securities r2) {
            p.l(r2, "security");
            return new c(r2);
        }

        public d() {
        }
    }

    static {
        f151104a = new d(null);
    }
}
