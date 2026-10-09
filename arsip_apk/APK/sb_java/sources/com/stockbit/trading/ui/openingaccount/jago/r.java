package com.stockbit.trading.ui.openingaccount.jago;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.securities.JagoBindingType;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class r implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f148154a;

    /* renamed from: b, reason: collision with root package name */
    public final JagoBindingType f148155b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f148156c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a(Bundle r6) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            r6.setClassLoader(r.class.getClassLoader());
            if (r6.containsKey("url") == false) goto L26;
            String r02 = r6.getString("url");
            if (r6.containsKey("isSharia") == false) goto L7;
            boolean r1 = r6.getBoolean("isSharia");
        L9:
            if (r6.containsKey("bindingType") == false) goto L24;
            if (Parcelable.class.isAssignableFrom(JagoBindingType.class) == false) goto L13;
        L17:
            JagoBindingType r62 = (JagoBindingType) r6.get("bindingType");
            if (r62 == null) goto L22;
            return new r(r02, r62, r1);
        L22:
            throw new IllegalArgumentException("Argument \"bindingType\" is marked as non-null but was passed a null value.");
        L13:
            if (Serializable.class.isAssignableFrom(JagoBindingType.class) == true) goto L17;
            throw new UnsupportedOperationException(JagoBindingType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L24:
            throw new IllegalArgumentException("Required argument \"bindingType\" is missing and does not have an android:defaultValue");
        L7:
            r1 = false;
            goto L9
        L26:
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public r(String r2, JagoBindingType r3, boolean r4) {
        kotlin.jvm.internal.p.l(r3, "bindingType");
        this.f148154a = r2;
        this.f148155b = r3;
        this.f148156c = r4;
    }

    public static final r fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final JagoBindingType a() {
        return this.f148155b;
    }

    public final String b() {
        return this.f148154a;
    }

    public final boolean c() {
        return this.f148156c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f148154a, r52.f148154a) == true) goto L12;
        return false;
    L12:
        if (this.f148155b == r52.f148155b) goto L15;
        return false;
    L15:
        if (this.f148156c == r52.f148156c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f148154a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((r03 * 31) + this.f148155b.hashCode()) * 31) + Boolean.hashCode(this.f148156c);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "JagoBindingFragmentArgs(url=" + this.f148154a + ", bindingType=" + this.f148155b + ", isSharia=" + this.f148156c + ')';
    }
}
