package com.stockbit.transferstock.ui.brokers;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.Securities;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final c f150768a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f150769a;

        /* renamed from: b, reason: collision with root package name */
        public final int f150770b;

        public a(boolean r1) {
            this.f150769a = r1;
            this.f150770b = com.stockbit.transferstock.g.d;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("fromOnboard", this.f150769a);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f150770b;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f150769a == ((a) r4).f150769a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f150769a);
        }

        public String toString() {
            return "ActionBrokerageFragmentToAnotherBrokerageFragment(fromOnboard=" + this.f150769a + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final Securities f150771a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150772b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f150773c;
        public final int d;

        public b(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            this.f150771a = r2;
            this.f150772b = r3;
            this.f150773c = r4;
            this.d = com.stockbit.transferstock.g.f150605e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            if (Parcelable.class.isAssignableFrom(Securities.class) == false) goto L6;
            Securities r1 = this.f150771a;
            p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("security", r1);
        L8:
            r02.putBoolean("fromOnboard", this.f150772b);
            r02.putBoolean("isFromDeeplink", this.f150773c);
            return r02;
        L6:
            if (Serializable.class.isAssignableFrom(Securities.class) == false) goto L11;
            Parcelable r12 = this.f150771a;
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
            if (p.g(this.f150771a, r52.f150771a) == true) goto L12;
            return false;
        L12:
            if (this.f150772b == r52.f150772b) goto L15;
            return false;
        L15:
            if (this.f150773c == r52.f150773c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f150771a.hashCode() * 31) + Boolean.hashCode(this.f150772b)) * 31) + Boolean.hashCode(this.f150773c);
        }

        public String toString() {
            return "ActionBrokerageFragmentToInputDataFragment(security=" + this.f150771a + ", fromOnboard=" + this.f150772b + ", isFromDeeplink=" + this.f150773c + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(c r02, Securities r1, boolean r2, boolean r3, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = true;
        L6:
            if ((r4 & 4) == 0) goto L9;
            r3 = false;
        L9:
            return r02.b(r1, r2, r3);
        }

        public final InterfaceC4081o0 a(boolean r2) {
            return new a(r2);
        }

        public final InterfaceC4081o0 b(Securities r2, boolean r3, boolean r4) {
            p.l(r2, "security");
            return new b(r2, r3, r4);
        }

        public c() {
        }
    }

    static {
        f150768a = new c(null);
    }
}
