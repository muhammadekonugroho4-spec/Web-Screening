package com.stockbit.trading.ui.openingaccount.jago;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4081o0;
import com.stockbit.domain.model.valueobject.securities.JagoBindingType;
import java.io.Serializable;

/* loaded from: classes11.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f148163a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r2, JagoBindingType r3, boolean r4) {
            kotlin.jvm.internal.p.l(r3, "bindingType");
            return new b(r2, r3, r4);
        }

        public a() {
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f148164a;

        /* renamed from: b, reason: collision with root package name */
        public final JagoBindingType f148165b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f148166c;
        public final int d;

        public b(String r2, JagoBindingType r3, boolean r4) {
            kotlin.jvm.internal.p.l(r3, "bindingType");
            this.f148164a = r2;
            this.f148165b = r3;
            this.f148166c = r4;
            this.d = com.stockbit.trading.h.Q1;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f148164a);
            r02.putBoolean("isSharia", this.f148166c);
            if (Parcelable.class.isAssignableFrom(JagoBindingType.class) == false) goto L7;
            Object r1 = this.f148165b;
            kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
            r02.putParcelable("bindingType", (Parcelable) r1);
            return r02;
        L7:
            if (Serializable.class.isAssignableFrom(JagoBindingType.class) == false) goto L11;
            JagoBindingType r12 = this.f148165b;
            kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
            r02.putSerializable("bindingType", r12);
            return r02;
        L11:
            throw new UnsupportedOperationException(JagoBindingType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
            if (kotlin.jvm.internal.p.g(this.f148164a, r52.f148164a) == true) goto L12;
            return false;
        L12:
            if (this.f148165b == r52.f148165b) goto L15;
            return false;
        L15:
            if (this.f148166c == r52.f148166c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f148164a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((r03 * 31) + this.f148165b.hashCode()) * 31) + Boolean.hashCode(this.f148166c);
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "OpenJagoBinding(url=" + this.f148164a + ", bindingType=" + this.f148165b + ", isSharia=" + this.f148166c + ')';
        }
    }

    static {
        f148163a = new a(null);
    }
}
