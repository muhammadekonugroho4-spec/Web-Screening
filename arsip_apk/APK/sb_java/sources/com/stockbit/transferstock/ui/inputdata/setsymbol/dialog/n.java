package com.stockbit.transferstock.ui.inputdata.setsymbol.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.domain.model.valueobject.FieldValueArray;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f150958c = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FieldValueArray f150959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f150960b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(n.class.getClassLoader());
            if (r4.containsKey("stock") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(FieldValueArray.class) == false) goto L7;
        L11:
            FieldValueArray r02 = (FieldValueArray) r4.get("stock");
            if (r4.containsKey("position") == false) goto L14;
            int r42 = r4.getInt("position");
        L16:
            return new n(r02, r42);
        L14:
            r42 = 0;
            goto L16
        L7:
            if (Serializable.class.isAssignableFrom(FieldValueArray.class) == true) goto L11;
            throw new UnsupportedOperationException(FieldValueArray.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"stock\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f150958c = new a(null);
        d = 8;
    }

    public n(FieldValueArray r1, int r2) {
        this.f150959a = r1;
        this.f150960b = r2;
    }

    public static final n fromBundle(Bundle r1) {
        return f150958c.a(r1);
    }

    public final int a() {
        return this.f150960b;
    }

    public final FieldValueArray b() {
        return this.f150959a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f150959a, r52.f150959a) == true) goto L12;
        return false;
    L12:
        if (this.f150960b == r52.f150960b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        FieldValueArray r02 = this.f150959a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Integer.hashCode(this.f150960b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "SetSymbolDialogArgs(stock=" + this.f150959a + ", position=" + this.f150960b + ')';
    }
}
