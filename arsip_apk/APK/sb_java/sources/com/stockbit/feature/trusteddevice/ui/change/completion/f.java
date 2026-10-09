package com.stockbit.feature.trusteddevice.ui.change.completion;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f117965b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f117966a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r3) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("token") == false) goto L11;
            String r32 = r3.getString("token");
            if (r32 == null) goto L9;
            return new f(r32);
        L9:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f117965b = new a(null);
    }

    public f(String r2) {
        kotlin.jvm.internal.p.l(r2, "token");
        this.f117966a = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f117965b.a(r1);
    }

    public final String a() {
        return this.f117966a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f117966a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f117966a, ((f) r4).f117966a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f117966a.hashCode();
    }

    public String toString() {
        return "ChangeCompletionFragmentArgs(token=" + this.f117966a + ')';
    }
}
