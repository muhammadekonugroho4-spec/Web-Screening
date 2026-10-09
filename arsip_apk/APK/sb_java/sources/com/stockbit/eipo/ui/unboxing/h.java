package com.stockbit.eipo.ui.unboxing;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f91198b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f91199a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(h.class.getClassLoader());
            if (r3.containsKey("urlUnboxingEIpo") == false) goto L5;
            String r32 = r3.getString("urlUnboxingEIpo");
        L7:
            return new h(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f91198b = new a(null);
    }

    public h(String r1) {
        this.f91199a = r1;
    }

    public static final h fromBundle(Bundle r1) {
        return f91198b.a(r1);
    }

    public final String a() {
        return this.f91199a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f91199a, ((h) r4).f91199a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f91199a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "EipoUnboxingFragmentArgs(urlUnboxingEIpo=" + this.f91199a + ')';
    }
}
