package com.stockbit.tipping.ui.tip;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.tipping.contract.TippingType;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f146138h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f146139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f146140b;

    /* renamed from: c, reason: collision with root package name */
    public final TippingType f146141c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f146142e;

    /* renamed from: f, reason: collision with root package name */
    public final String f146143f;

    /* renamed from: g, reason: collision with root package name */
    public final int f146144g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(i.class.getClassLoader());
            if (r10.containsKey("tippingId") == false) goto L9;
            String r02 = r10.getString("tippingId");
            if (r02 == null) goto L8;
        L6:
            String r5 = r02;
            if (r10.containsKey("userName") == false) goto L54;
            String r2 = r10.getString("userName");
            if (r2 == null) goto L52;
            if (r10.containsKey("avatar") == false) goto L50;
            String r3 = r10.getString("avatar");
            if (r3 == null) goto L48;
            if (r10.containsKey("type") == false) goto L46;
            if (Parcelable.class.isAssignableFrom(TippingType.class) == false) goto L23;
        L27:
            TippingType r4 = (TippingType) r10.get("type");
            if (r4 == null) goto L44;
            String r6 = null;
            if (r10.containsKey("pageContext") == false) goto L32;
            String r03 = r10.getString("pageContext");
        L34:
            if (r10.containsKey("additionalTippingData") == false) goto L36;
            r6 = r10.getString("additionalTippingData");
        L36:
            String r7 = r6;
            if (r10.containsKey("recipientUserId") == false) goto L40;
            int r102 = r10.getInt("recipientUserId");
        L42:
            return new i(r2, r3, r4, r5, r03, r7, r102);
        L40:
            r102 = 0;
            goto L42
        L32:
            r03 = null;
            goto L34
        L44:
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        L23:
            if (Serializable.class.isAssignableFrom(TippingType.class) == true) goto L27;
            throw new UnsupportedOperationException(TippingType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L46:
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        L48:
            throw new IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.");
        L50:
            throw new IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue");
        L52:
            throw new IllegalArgumentException("Argument \"userName\" is marked as non-null but was passed a null value.");
        L54:
            throw new IllegalArgumentException("Required argument \"userName\" is missing and does not have an android:defaultValue");
        L8:
            throw new IllegalArgumentException("Argument \"tippingId\" is marked as non-null but was passed a null value.");
        L9:
            r02 = "";
            goto L6
        }

        public a() {
        }
    }

    static {
        f146138h = new a(null);
    }

    public i(String r2, String r3, TippingType r4, String r5, String r6, String r7, int r8) {
        p.l(r2, "userName");
        p.l(r3, "avatar");
        p.l(r4, "type");
        p.l(r5, "tippingId");
        this.f146139a = r2;
        this.f146140b = r3;
        this.f146141c = r4;
        this.d = r5;
        this.f146142e = r6;
        this.f146143f = r7;
        this.f146144g = r8;
    }

    public static final i fromBundle(Bundle r1) {
        return f146138h.a(r1);
    }

    public final String a() {
        return this.f146143f;
    }

    public final String b() {
        return this.f146140b;
    }

    public final String c() {
        return this.f146142e;
    }

    public final int d() {
        return this.f146144g;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f146139a, r52.f146139a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f146140b, r52.f146140b) == true) goto L15;
        return false;
    L15:
        if (this.f146141c == r52.f146141c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f146142e, r52.f146142e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f146143f, r52.f146143f) == true) goto L27;
        return false;
    L27:
        if (this.f146144g == r52.f146144g) goto L29;
        return false;
    L29:
        return true;
    }

    public final TippingType f() {
        return this.f146141c;
    }

    public final String g() {
        return this.f146139a;
    }

    public final Bundle h() {
        Bundle r02 = new Bundle();
        r02.putString("tippingId", this.d);
        r02.putString("userName", this.f146139a);
        r02.putString("avatar", this.f146140b);
        if (Parcelable.class.isAssignableFrom(TippingType.class) == false) goto L6;
        Object r1 = this.f146141c;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("type", (Parcelable) r1);
    L8:
        r02.putString("pageContext", this.f146142e);
        r02.putString("additionalTippingData", this.f146143f);
        r02.putInt("recipientUserId", this.f146144g);
        return r02;
    L6:
        if (Serializable.class.isAssignableFrom(TippingType.class) == false) goto L11;
        TippingType r12 = this.f146141c;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("type", r12);
        goto L8
    L11:
        throw new UnsupportedOperationException(TippingType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public int hashCode() {
        int r02 = ((((((this.f146139a.hashCode() * 31) + this.f146140b.hashCode()) * 31) + this.f146141c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String r1 = this.f146142e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f146143f;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Integer.hashCode(this.f146144g);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingTipFragmentArgs(userName=" + this.f146139a + ", avatar=" + this.f146140b + ", type=" + this.f146141c + ", tippingId=" + this.d + ", pageContext=" + this.f146142e + ", additionalTippingData=" + this.f146143f + ", recipientUserId=" + this.f146144g + ')';
    }
}
