package com.stockbit.stream.ui.snip;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f144915b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f144916a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("source") == false) goto L5;
            String r32 = r3.getString("source");
        L7:
            return new c(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f144915b = new a(null);
    }

    public c(String r1) {
        this.f144916a = r1;
    }

    public static final c fromBundle(Bundle r1) {
        return f144915b.a(r1);
    }

    public final String a() {
        return this.f144916a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("source", this.f144916a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f144916a, ((c) r4).f144916a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f144916a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SnipsFragmentArgs(source=" + this.f144916a + ')';
    }
}
