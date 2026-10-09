package com.stockbit.feature.movers.ui;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f100212b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f100213a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(m.class.getClassLoader());
            if (r3.containsKey("type") == false) goto L5;
            String r32 = r3.getString("type");
        L7:
            return new m(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f100212b = new a(null);
    }

    public m(String r1) {
        this.f100213a = r1;
    }

    public static final m fromBundle(Bundle r1) {
        return f100212b.a(r1);
    }

    public final String a() {
        return this.f100213a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("type", this.f100213a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof m) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f100213a, ((m) r4).f100213a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f100213a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "MoversComposeFragmentArgs(type=" + this.f100213a + ')';
    }
}
