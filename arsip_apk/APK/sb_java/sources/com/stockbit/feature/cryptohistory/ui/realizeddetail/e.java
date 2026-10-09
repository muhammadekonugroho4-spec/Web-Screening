package com.stockbit.feature.cryptohistory.ui.realizeddetail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f94108c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f94109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94110b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            String r2 = "";
            if (r5.containsKey("orderId") == false) goto L9;
            String r02 = r5.getString("orderId");
            if (r02 != null) goto L11;
            throw new IllegalArgumentException("Argument \"orderId\" is marked as non-null but was passed a null value.");
        L11:
            if (r5.containsKey("baseAsset") == false) goto L18;
            r2 = r5.getString("baseAsset");
            if (r2 != null) goto L18;
            throw new IllegalArgumentException("Argument \"baseAsset\" is marked as non-null but was passed a null value.");
        L18:
            return new e(r02, r2);
        L9:
            r02 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f94108c = new a(null);
    }

    public e(String r2, String r3) {
        p.l(r2, "orderId");
        p.l(r3, "baseAsset");
        this.f94109a = r2;
        this.f94110b = r3;
    }

    public static final e fromBundle(Bundle r1) {
        return f94108c.a(r1);
    }

    public final String a() {
        return this.f94110b;
    }

    public final String b() {
        return this.f94109a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("orderId", this.f94109a);
        r02.putString("baseAsset", this.f94110b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f94109a, r52.f94109a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94110b, r52.f94110b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f94109a.hashCode() * 31) + this.f94110b.hashCode();
    }

    public String toString() {
        return "CryptoHistoryRealizedDetailFragmentArgs(orderId=" + this.f94109a + ", baseAsset=" + this.f94110b + ')';
    }
}
