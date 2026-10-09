package com.stockbit.requestverifiedbadge.requestbadge;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f130802b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f130803a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("isKTPAdded") == false) goto L7;
            return new c(r3.getBoolean("isKTPAdded"));
        L7:
            throw new IllegalArgumentException("Required argument \"isKTPAdded\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f130802b = new a(null);
    }

    public c(boolean r1) {
        this.f130803a = r1;
    }

    public static final c fromBundle(Bundle r1) {
        return f130802b.a(r1);
    }

    public final boolean a() {
        return this.f130803a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (this.f130803a == ((c) r4).f130803a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f130803a);
    }

    public String toString() {
        return "MainRequestBadgeFragmentArgs(isKTPAdded=" + this.f130803a + ')';
    }
}
