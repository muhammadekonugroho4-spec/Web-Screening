package com.stockbit.emittenclassification.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f91342e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f91343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91345c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r7) {
            kotlin.jvm.internal.p.l(r7, "bundle");
            r7.setClassLoader(g.class.getClassLoader());
            if (r7.containsKey(Constants.KEY_ID) == false) goto L22;
            int r02 = r7.getInt(Constants.KEY_ID);
            String r3 = "";
            if (r7.containsKey(Constants.KEY_TITLE) == false) goto L11;
            String r1 = r7.getString(Constants.KEY_TITLE);
            if (r1 != null) goto L13;
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        L13:
            if (r7.containsKey("catalogSymbol") == false) goto L15;
            String r2 = r7.getString("catalogSymbol");
        L17:
            if (r7.containsKey("sourcePage") == false) goto L20;
            r3 = r7.getString("sourcePage");
        L20:
            return new g(r02, r1, r2, r3);
        L15:
            r2 = "";
            goto L17
        L11:
            r1 = "";
            goto L13
        L22:
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f91342e = new a(null);
    }

    public g(int r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
        this.f91343a = r2;
        this.f91344b = r3;
        this.f91345c = r4;
        this.d = r5;
    }

    public static final g fromBundle(Bundle r1) {
        return f91342e.a(r1);
    }

    public final String a() {
        return this.f91345c;
    }

    public final int b() {
        return this.f91343a;
    }

    public final String c() {
        return this.f91344b;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putInt(Constants.KEY_ID, this.f91343a);
        r02.putString(Constants.KEY_TITLE, this.f91344b);
        r02.putString("catalogSymbol", this.f91345c);
        r02.putString("sourcePage", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f91343a == r52.f91343a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f91344b, r52.f91344b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f91345c, r52.f91345c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f91343a) * 31) + this.f91344b.hashCode()) * 31;
        String r1 = this.f91345c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "EmittenClassificationFragmentArgs(id=" + this.f91343a + ", title=" + this.f91344b + ", catalogSymbol=" + this.f91345c + ", sourcePage=" + this.d + ')';
    }
}
