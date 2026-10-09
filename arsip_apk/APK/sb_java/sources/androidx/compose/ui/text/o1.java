package androidx.compose.ui.text;

import androidx.compose.ui.text.C3740e;

/* loaded from: classes.dex */
public final class o1 implements C3740e.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20162a;

    public /* synthetic */ o1(String r1) {
        this.f20162a = r1;
    }

    public static final /* synthetic */ o1 a(String r1) {
        return new o1(r1);
    }

    public static String b(String r02) {
        return r02;
    }

    public static boolean c(String r2, Object r3) {
        if ((r3 instanceof o1) == true) goto L6;
        return false;
    L6:
        if (kotlin.jvm.internal.p.g(r2, ((o1) r3).f()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(String r02) {
        return r02.hashCode();
    }

    public static String e(String r2) {
        return "StringAnnotation(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return c(this.f20162a, r2);
    }

    public final /* synthetic */ String f() {
        return this.f20162a;
    }

    public int hashCode() {
        return d(this.f20162a);
    }

    public String toString() {
        return e(this.f20162a);
    }
}
