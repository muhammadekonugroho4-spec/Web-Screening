package com.stockbit.livestream.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class n implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f121861b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f121862a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final n a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(n.class.getClassLoader());
            if (r3.containsKey("livestreamSource") == false) goto L5;
            String r32 = r3.getString("livestreamSource");
        L7:
            return new n(r32);
        L5:
            r32 = "";
            goto L7
        }

        public a() {
        }
    }

    static {
        f121861b = new a(null);
    }

    public n(String r1) {
        this.f121862a = r1;
    }

    public static final n fromBundle(Bundle r1) {
        return f121861b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putString("livestreamSource", this.f121862a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f121862a, ((n) r4).f121862a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f121862a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "LivestreamMainFragmentArgs(livestreamSource=" + this.f121862a + ')';
    }
}
