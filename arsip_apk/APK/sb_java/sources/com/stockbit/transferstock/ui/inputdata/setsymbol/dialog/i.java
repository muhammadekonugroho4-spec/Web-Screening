package com.stockbit.transferstock.ui.inputdata.setsymbol.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.FieldValueArray;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f150951c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FieldValueArray f150952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f150953b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(i.class.getClassLoader());
            if (r4.containsKey("stock") == false) goto L22;
            if (Parcelable.class.isAssignableFrom(FieldValueArray.class) == false) goto L7;
        L11:
            FieldValueArray r02 = (FieldValueArray) r4.get("stock");
            if (r02 == null) goto L20;
            if (r4.containsKey("position") == false) goto L16;
            int r42 = r4.getInt("position");
        L18:
            return new i(r02, r42);
        L16:
            r42 = 0;
            goto L18
        L20:
            throw new IllegalArgumentException("Argument \"stock\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(FieldValueArray.class) == true) goto L11;
            throw new UnsupportedOperationException(FieldValueArray.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L22:
            throw new IllegalArgumentException("Required argument \"stock\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f150951c = new a(null);
        d = 8;
    }

    public i(FieldValueArray r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "stock");
        this.f150952a = r2;
        this.f150953b = r3;
    }

    public static final i fromBundle(Bundle r1) {
        return f150951c.a(r1);
    }

    public final int a() {
        return this.f150953b;
    }

    public final FieldValueArray b() {
        return this.f150952a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f150952a, r52.f150952a) == true) goto L12;
        return false;
    L12:
        if (this.f150953b == r52.f150953b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f150952a.hashCode() * 31) + Integer.hashCode(this.f150953b);
    }

    public String toString() {
        return "OptionSymbolDialogArgs(stock=" + this.f150952a + ", position=" + this.f150953b + ')';
    }
}
