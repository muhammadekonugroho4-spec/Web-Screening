package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class b {

    public interface a {
        void a(Context r1, String[] r2, String r3, File r4, com.getkeepsafe.relinker.c r5);
    }

    /* renamed from: com.getkeepsafe.relinker.b$b, reason: collision with other inner class name */
    public interface InterfaceC0389b {
        String a(String r1);

        String[] b();

        void c(String r1);

        void d(String r1);

        String e(String r1);
    }

    public interface c {
    }

    public static void a(Context r1, String r2) {
        b(r1, r2, null, null);
    }

    public static void b(Context r1, String r2, String r3, c r4) {
        new com.getkeepsafe.relinker.c().f(r1, r2, r3, r4);
    }
}
