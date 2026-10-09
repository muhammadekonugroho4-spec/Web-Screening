package com.stockbit.feature.trusteddevice.ui.remove.completion;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f118593b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118594a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("removalToken") == false) goto L11;
            String r32 = r3.getString("removalToken");
            if (r32 == null) goto L9;
            return new f(r32);
        L9:
            throw new IllegalArgumentException("Argument \"removalToken\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"removalToken\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f118593b = new a(null);
    }

    public f(String r2) {
        p.l(r2, "removalToken");
        this.f118594a = r2;
    }

    public static final f fromBundle(Bundle r1) {
        return f118593b.a(r1);
    }

    public final String a() {
        return this.f118594a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("removalToken", this.f118594a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f118594a, ((f) r4).f118594a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f118594a.hashCode();
    }

    public String toString() {
        return "RemoveCompletionFragmentArgs(removalToken=" + this.f118594a + ')';
    }
}
