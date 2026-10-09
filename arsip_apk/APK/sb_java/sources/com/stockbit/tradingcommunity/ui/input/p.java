package com.stockbit.tradingcommunity.ui.input;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class p implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f149644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f149646c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final p a(Bundle r5) {
            kotlin.jvm.internal.p.l(r5, "bundle");
            r5.setClassLoader(p.class.getClassLoader());
            if (r5.containsKey("isUserLeaveCommunity") == false) goto L5;
            boolean r02 = r5.getBoolean("isUserLeaveCommunity");
        L7:
            if (r5.containsKey("communityCode") == false) goto L13;
            String r1 = r5.getString("communityCode");
            if (r1 != null) goto L15;
            throw new IllegalArgumentException("Argument \"communityCode\" is marked as non-null but was passed a null value.");
        L15:
            if (r5.containsKey("entryPoint") == false) goto L21;
            String r52 = r5.getString("entryPoint");
            if (r52 != null) goto L23;
            throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
        L23:
            return new p(r02, r1, r52);
        L21:
            r52 = "SETTINGS";
            goto L23
        L13:
            r1 = "";
            goto L15
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public p(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "communityCode");
        kotlin.jvm.internal.p.l(r4, "entryPoint");
        this.f149644a = r2;
        this.f149645b = r3;
        this.f149646c = r4;
    }

    public static final p fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f149645b;
    }

    public final boolean b() {
        return this.f149644a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (this.f149644a == r52.f149644a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f149645b, r52.f149645b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f149646c, r52.f149646c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f149644a) * 31) + this.f149645b.hashCode()) * 31) + this.f149646c.hashCode();
    }

    public String toString() {
        return "InputCommunityCodeFragmentArgs(isUserLeaveCommunity=" + this.f149644a + ", communityCode=" + this.f149645b + ", entryPoint=" + this.f149646c + ')';
    }
}
