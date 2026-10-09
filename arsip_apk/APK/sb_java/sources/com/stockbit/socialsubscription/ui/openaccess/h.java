package com.stockbit.socialsubscription.ui.openaccess;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f137849b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f137850a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(h.class.getClassLoader());
            if (r3.containsKey("is_new_user") == false) goto L5;
            boolean r32 = r3.getBoolean("is_new_user");
        L7:
            return new h(r32);
        L5:
            r32 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f137849b = new a(null);
    }

    public h(boolean r1) {
        this.f137850a = r1;
    }

    public static final h fromBundle(Bundle r1) {
        return f137849b.a(r1);
    }

    public final boolean a() {
        return this.f137850a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putBoolean("is_new_user", this.f137850a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (this.f137850a == ((h) r4).f137850a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f137850a);
    }

    public String toString() {
        return "OpenAccessFragmentArgs(isNewUser=" + this.f137850a + ')';
    }
}
