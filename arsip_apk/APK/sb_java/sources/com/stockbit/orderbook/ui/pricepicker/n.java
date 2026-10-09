package com.stockbit.orderbook.ui.pricepicker;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import com.stockbit.orderbook.contract.ActionType;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f124773f = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f124774a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124775b;

    /* renamed from: c, reason: collision with root package name */
    public final ActionType f124776c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f124777e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r9) {
            kotlin.jvm.internal.p.l(r9, "bundle");
            r9.setClassLoader(n.class.getClassLoader());
            if (r9.containsKey("symbol") == false) goto L40;
            String r3 = r9.getString("symbol");
            if (r3 == null) goto L38;
            if (r9.containsKey("currentSelectedPrice") == false) goto L36;
            String r4 = r9.getString("currentSelectedPrice");
            if (r9.containsKey(Constants.KEY_ACTION) == false) goto L34;
            if (Parcelable.class.isAssignableFrom(ActionType.class) == false) goto L13;
        L17:
            ActionType r5 = (ActionType) r9.get(Constants.KEY_ACTION);
            if (r5 == null) goto L32;
            if (r9.containsKey("isNego") == false) goto L23;
            boolean r02 = r9.getBoolean("isNego");
        L22:
            boolean r6 = r02;
            if (r9.containsKey("orderBookType") == false) goto L28;
            String r92 = r9.getString("orderBookType");
        L30:
            return new n(r3, r4, r5, r6, r92);
        L28:
            r92 = null;
            goto L30
        L23:
            r02 = false;
            goto L22
        L32:
            throw new IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.");
        L13:
            if (Serializable.class.isAssignableFrom(ActionType.class) == true) goto L17;
            throw new UnsupportedOperationException(ActionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L34:
            throw new IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue");
        L36:
            throw new IllegalArgumentException("Required argument \"currentSelectedPrice\" is missing and does not have an android:defaultValue");
        L38:
            throw new IllegalArgumentException("Argument \"symbol\" is marked as non-null but was passed a null value.");
        L40:
            throw new IllegalArgumentException("Required argument \"symbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f124773f = new a(null);
    }

    public n(String r2, String r3, ActionType r4, boolean r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_ACTION);
        this.f124774a = r2;
        this.f124775b = r3;
        this.f124776c = r4;
        this.d = r5;
        this.f124777e = r6;
    }

    public static final n fromBundle(Bundle r1) {
        return f124773f.a(r1);
    }

    public final String a() {
        return this.f124775b;
    }

    public final String b() {
        return this.f124777e;
    }

    public final String c() {
        return this.f124774a;
    }

    public final boolean d() {
        return this.d;
    }

    public final Bundle e() {
        Bundle r02 = new Bundle();
        r02.putString("symbol", this.f124774a);
        r02.putString("currentSelectedPrice", this.f124775b);
        if (Parcelable.class.isAssignableFrom(ActionType.class) == false) goto L6;
        Object r1 = this.f124776c;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable(Constants.KEY_ACTION, (Parcelable) r1);
    L8:
        r02.putBoolean("isNego", this.d);
        r02.putString("orderBookType", this.f124777e);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(ActionType.class) == false) goto L11;
        ActionType r12 = this.f124776c;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable(Constants.KEY_ACTION, r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(ActionType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f124774a, r52.f124774a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f124775b, r52.f124775b) == true) goto L15;
        return false;
    L15:
        if (this.f124776c == r52.f124776c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f124777e, r52.f124777e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.f124774a.hashCode() * 31;
        String r1 = this.f124775b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((((r02 + r12) * 31) + this.f124776c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
        String r13 = this.f124777e;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderQueuePricePickerDialogFragmentArgs(symbol=" + this.f124774a + ", currentSelectedPrice=" + this.f124775b + ", action=" + this.f124776c + ", isNego=" + this.d + ", orderBookType=" + this.f124777e + ')';
    }
}
