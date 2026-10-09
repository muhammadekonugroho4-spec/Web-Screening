package com.stockbit.estatement.ui.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f91592b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f91593a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("EXTRA_MESSAGE") == false) goto L11;
            String r32 = r3.getString("EXTRA_MESSAGE");
            if (r32 == null) goto L9;
            return new e(r32);
        L9:
            throw new IllegalArgumentException("Argument \"EXTRA_MESSAGE\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"EXTRA_MESSAGE\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f91592b = new a(null);
    }

    public e(String r2) {
        p.l(r2, "EXTRAMESSAGE");
        this.f91593a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f91592b.a(r1);
    }

    public final String a() {
        return this.f91593a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f91593a, ((e) r4).f91593a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f91593a.hashCode();
    }

    public String toString() {
        return "SendEmailSuccessDialogFragmentArgs(EXTRAMESSAGE=" + this.f91593a + ')';
    }
}
