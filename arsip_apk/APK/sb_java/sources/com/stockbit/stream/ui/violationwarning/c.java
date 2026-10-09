package com.stockbit.stream.ui.violationwarning;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f145219b = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f145220a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("postId") == false) goto L7;
            return new c(r3.getInt("postId"));
        L7:
            throw new IllegalArgumentException("Required argument \"postId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f145219b = new a(null);
    }

    public c(int r1) {
        this.f145220a = r1;
    }

    public static final c fromBundle(Bundle r1) {
        return f145219b.a(r1);
    }

    public final int a() {
        return this.f145220a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putInt("postId", this.f145220a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (this.f145220a == ((c) r4).f145220a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f145220a);
    }

    public String toString() {
        return "ViolationWarningDialogArgs(postId=" + this.f145220a + ')';
    }
}
