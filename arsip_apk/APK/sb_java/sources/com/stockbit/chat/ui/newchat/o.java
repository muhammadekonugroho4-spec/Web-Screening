package com.stockbit.chat.ui.newchat;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class o implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56713b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56714a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final o a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(o.class.getClassLoader());
            if (r3.containsKey("isChatEnabled") == false) goto L5;
            boolean r32 = r3.getBoolean("isChatEnabled");
        L7:
            return new o(r32);
        L5:
            r32 = true;
            goto L7
        }

        public a() {
        }
    }

    static {
        f56713b = new a(null);
    }

    public o(boolean r1) {
        this.f56714a = r1;
    }

    public static final o fromBundle(Bundle r1) {
        return f56713b.a(r1);
    }

    public final Bundle a() {
        Bundle r02 = new Bundle();
        r02.putBoolean("isChatEnabled", this.f56714a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof o) == true) goto L9;
        return false;
    L9:
        if (this.f56714a == ((o) r4).f56714a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56714a);
    }

    public String toString() {
        return "ChatNewFragmentArgs(isChatEnabled=" + this.f56714a + ')';
    }
}
