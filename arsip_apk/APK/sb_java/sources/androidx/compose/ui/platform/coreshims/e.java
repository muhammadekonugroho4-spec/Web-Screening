package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19316a;

    public static class a {
        public static Bundle a(ViewStructure r02) {
            return r02.getExtras();
        }

        public static void b(ViewStructure r02, String r1) {
            r02.setClassName(r1);
        }

        public static void c(ViewStructure r02, CharSequence r1) {
            r02.setContentDescription(r1);
        }

        public static void d(ViewStructure r02, int r1, int r2, int r3, int r4, int r5, int r6) {
            r02.setDimens(r1, r2, r3, r4, r5, r6);
        }

        public static void e(ViewStructure r02, int r1, String r2, String r3, String r4) {
            r02.setId(r1, r2, r3, r4);
        }

        public static void f(ViewStructure r02, CharSequence r1) {
            r02.setText(r1);
        }

        public static void g(ViewStructure r02, float r1, int r2, int r3, int r4) {
            r02.setTextStyle(r1, r2, r3, r4);
        }
    }

    public e(ViewStructure r1) {
        this.f19316a = r1;
    }

    public static e i(ViewStructure r1) {
        return new e(r1);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f19316a);
    }

    public void b(String r2) {
        a.b((ViewStructure) this.f19316a, r2);
    }

    public void c(CharSequence r2) {
        a.c((ViewStructure) this.f19316a, r2);
    }

    public void d(int r9, int r10, int r11, int r12, int r13, int r14) {
        a.d((ViewStructure) this.f19316a, r9, r10, r11, r12, r13, r14);
    }

    public void e(int r2, String r3, String r4, String r5) {
        a.e((ViewStructure) this.f19316a, r2, r3, r4, r5);
    }

    public void f(CharSequence r2) {
        a.f((ViewStructure) this.f19316a, r2);
    }

    public void g(float r2, int r3, int r4, int r5) {
        a.g((ViewStructure) this.f19316a, r2, r3, r4, r5);
    }

    public ViewStructure h() {
        return (ViewStructure) this.f19316a;
    }
}
