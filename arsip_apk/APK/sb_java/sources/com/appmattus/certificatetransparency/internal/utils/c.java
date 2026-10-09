package com.appmattus.certificatetransparency.internal.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes4.dex */
public abstract class c {
    public static final String a(Exception r3) {
        p.l(r3, "<this>");
        StringWriter r02 = new StringWriter();
        PrintWriter r1 = new PrintWriter(r02);     // Catch: Throwable -> L9
        r3.printStackTrace(r1);     // Catch: Throwable -> L11
        w r32 = w.f180450a;     // Catch: Throwable -> L11
    L6:
        kotlin.io.b.a(r1, null);     // Catch: Throwable -> L9
        String r12 = r02.toString();     // Catch: Throwable -> L9
        kotlin.io.b.a(r02, null);
        p.k(r12, "use(...)");
        return r12;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        kotlin.io.b.a(r1, th);     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        kotlin.io.b.a(r02, th);
        throw th;
    }
}
