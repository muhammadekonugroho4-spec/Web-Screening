package com.stockbit.stream.ui.main;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes11.dex */
public final class q implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f143610b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f143611a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final q a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(q.class.getClassLoader());
            if (r3.containsKey("requestedTab") == false) goto L5;
            String r32 = r3.getString("requestedTab");
        L7:
            return new q(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f143610b = new a(null);
    }

    public q(String r1) {
        this.f143611a = r1;
    }

    public static final q fromBundle(Bundle r1) {
        return f143610b.a(r1);
    }

    public final String a() {
        return this.f143611a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("requestedTab", this.f143611a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof q) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f143611a, ((q) r4).f143611a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f143611a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "StreamMainFragmentArgs(requestedTab=" + this.f143611a + ')';
    }
}
