package com.stockbit.profile.report;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f127808b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f127809a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(e.class.getClassLoader());
            if (r3.containsKey("userId") == false) goto L11;
            String r32 = r3.getString("userId");
            if (r32 == null) goto L9;
            return new e(r32);
        L9:
            throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f127808b = new a(null);
    }

    public e(String r2) {
        p.l(r2, "userId");
        this.f127809a = r2;
    }

    public static final e fromBundle(Bundle r1) {
        return f127808b.a(r1);
    }

    public final String a() {
        return this.f127809a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f127809a, ((e) r4).f127809a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f127809a.hashCode();
    }

    public String toString() {
        return "UserReportFragmentArgs(userId=" + this.f127809a + ')';
    }
}
