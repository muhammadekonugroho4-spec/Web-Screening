package org.minidns.dnsserverlookup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.minidns.util.f;

/* loaded from: classes3.dex */
public final class e extends a {
    public static final d d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f182758e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f182759f = null;

    /* renamed from: g, reason: collision with root package name */
    public static List f182760g;

    /* renamed from: h, reason: collision with root package name */
    public static long f182761h;

    static {
        d = new e();
        f182758e = Logger.getLogger(e.class.getName());
        f182759f = Pattern.compile("^nameserver\\s+(.*)$");
    }

    public e() {
        super(e.class.getSimpleName(), 2000);
    }

    @Override // org.minidns.dnsserverlookup.d
    public List H0() {
        File r1 = new File("/etc/resolv.conf");
        BufferedReader r3 = null;
        if (r1.exists() == true) goto L5;
        return null;
    L5:
        long r4 = r1.lastModified();
        if (r4 != f182761h) goto L10;
        List r2 = f182760g;
        if (r2 == null) goto L10;
        return r2;
    L10:
        ArrayList r22 = new ArrayList();
        BufferedReader r6 = new BufferedReader(new InputStreamReader(new FileInputStream(r1), StandardCharsets.UTF_8));     // Catch: Throwable -> L32 IOException -> L34
    L49:
        String r12 = r6.readLine();     // Catch: Throwable -> L18 IOException -> L20
        if (r12 == null) goto L52;
        Matcher r13 = f182759f.matcher(r12);     // Catch: Throwable -> L18 IOException -> L20
        if (r13.matches() == false) goto L49;
        r22.add(r13.group(1).trim());     // Catch: Throwable -> L18 IOException -> L20
        goto L49
    L52:
        r6.close();     // Catch: IOException -> L24
    L27:
        if (r22.isEmpty() == false) goto L30;
        f182758e.fine("Could not find any nameservers in /etc/resolv.conf");
        return null;
    L30:
        f182760g = r22;
        f182761h = r4;
        return r22;
    L24:
        e = move-exception;
        f182758e.log(Level.WARNING, "Could not close reader", e);
    L20:
        e = e;
    L36:
        f182758e.log(Level.WARNING, "Could not read from /etc/resolv.conf", e);     // Catch: Throwable -> L18
        if (r6 != null) goto L56;
    L42:
        return null;
    L56:
        r6.close();     // Catch: IOException -> L40
    L40:
        e = move-exception;
        f182758e.log(Level.WARNING, "Could not close reader", e);
    L18:
        th = th;
        r3 = r6;
    L43:
        if (r3 != null) goto L54;
    L48:
        throw th;
    L54:
        r3.close();     // Catch: IOException -> L46
    L46:
        e = move-exception;
        f182758e.log(Level.WARNING, "Could not close reader", e);
        goto L48
    L34:
        e = e;
        r6 = null;
    L32:
        th = th;
        goto L43
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        if (f.a() == false) goto L11;
        return false;
    L11:
        return new File("/etc/resolv.conf").exists();
    L8:
        e = move-exception;
        f182758e.log(Level.FINE, "Access to /etc/resolv.conf not possible", e);
        return false;
    }
}
