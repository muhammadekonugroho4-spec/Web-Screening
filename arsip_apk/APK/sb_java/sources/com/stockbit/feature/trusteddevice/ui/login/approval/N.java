package com.stockbit.feature.trusteddevice.ui.login.approval;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.feature.trusteddevice.contract.PromptType;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class N implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f118252g = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118253a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118254b;

    /* renamed from: c, reason: collision with root package name */
    public final String f118255c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f118256e;

    /* renamed from: f, reason: collision with root package name */
    public final PromptType f118257f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final N a(Bundle r10) {
            kotlin.jvm.internal.p.l(r10, "bundle");
            r10.setClassLoader(N.class.getClassLoader());
            if (r10.containsKey("token") == false) goto L42;
            String r3 = r10.getString("token");
            if (r3 == null) goto L40;
            if (r10.containsKey("device") == false) goto L38;
            String r4 = r10.getString("device");
            if (r10.containsKey("dateTime") == false) goto L36;
            String r5 = r10.getString("dateTime");
            if (r10.containsKey("city") == false) goto L34;
            String r6 = r10.getString("city");
            if (r10.containsKey("country") == false) goto L32;
            String r7 = r10.getString("country");
            if (r10.containsKey("type") == true) goto L17;
            PromptType r102 = PromptType.NEW_LOGIN;
        L30:
            return new N(r3, r4, r5, r6, r7, r102);
        L17:
            if (Parcelable.class.isAssignableFrom(PromptType.class) == false) goto L19;
        L23:
            r102 = (PromptType) r10.get("type");
            if (r102 != null) goto L30;
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        L19:
            if (Serializable.class.isAssignableFrom(PromptType.class) == true) goto L23;
            throw new UnsupportedOperationException(PromptType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L32:
            throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
        L34:
            throw new IllegalArgumentException("Required argument \"city\" is missing and does not have an android:defaultValue");
        L36:
            throw new IllegalArgumentException("Required argument \"dateTime\" is missing and does not have an android:defaultValue");
        L38:
            throw new IllegalArgumentException("Required argument \"device\" is missing and does not have an android:defaultValue");
        L40:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L42:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118252g = new a(null);
    }

    public N(String r2, String r3, String r4, String r5, String r6, PromptType r7) {
        kotlin.jvm.internal.p.l(r2, "token");
        kotlin.jvm.internal.p.l(r7, "type");
        this.f118253a = r2;
        this.f118254b = r3;
        this.f118255c = r4;
        this.d = r5;
        this.f118256e = r6;
        this.f118257f = r7;
    }

    public static final N fromBundle(Bundle r1) {
        return f118252g.a(r1);
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f118256e;
    }

    public final String c() {
        return this.f118255c;
    }

    public final String d() {
        return this.f118254b;
    }

    public final String e() {
        return this.f118253a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof N) == true) goto L8;
        return false;
    L8:
        N r52 = (N) r5;
        if (kotlin.jvm.internal.p.g(this.f118253a, r52.f118253a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118254b, r52.f118254b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f118255c, r52.f118255c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f118256e, r52.f118256e) == true) goto L24;
        return false;
    L24:
        if (this.f118257f == r52.f118257f) goto L26;
        return false;
    L26:
        return true;
    }

    public final PromptType f() {
        return this.f118257f;
    }

    public final Bundle g() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f118253a);
        r02.putString("device", this.f118254b);
        r02.putString("dateTime", this.f118255c);
        r02.putString("city", this.d);
        r02.putString("country", this.f118256e);
        if (Parcelable.class.isAssignableFrom(PromptType.class) == false) goto L7;
        Object r1 = this.f118257f;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("type", (Parcelable) r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(PromptType.class) == false) goto L9;
        PromptType r12 = this.f118257f;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("type", r12);
    L9:
        return r02;
    }

    public int hashCode() {
        int r02 = this.f118253a.hashCode() * 31;
        String r1 = this.f118254b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f118255c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f118256e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return ((r05 + r2) * 31) + this.f118257f.hashCode();
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "LoginApprovalFragmentArgs(token=" + this.f118253a + ", device=" + this.f118254b + ", dateTime=" + this.f118255c + ", city=" + this.d + ", country=" + this.f118256e + ", type=" + this.f118257f + ')';
    }
}
