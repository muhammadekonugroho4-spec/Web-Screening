package org.minidns.dnsserverlookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import org.minidns.util.f;

/* loaded from: classes3.dex */
public final class b extends a {
    public static final d d = null;

    static {
        d = new b();
    }

    public b() {
        super(b.class.getSimpleName(), 999);
    }

    public static Set b(BufferedReader r6, boolean r7) {
        HashSet r02 = new HashSet(6);
    L3:
        String r1 = r6.readLine();
        if (r1 == null) goto L35;
        int r2 = r1.indexOf("]: [");
        if (r2 == (-1)) goto L3;
        String r4 = r1.substring(1, r2);
        int r22 = r2 + 4;
        int r5 = r1.length() - 1;
        if (r5 < r22) goto L10;
        String r12 = r1.substring(r22, r5);
        if (r12.isEmpty() == true) goto L3;
        if (r4.endsWith(".dns") == true) goto L25;
        if (r4.endsWith(".dns1") == true) goto L25;
        if (r4.endsWith(".dns2") == true) goto L25;
        if (r4.endsWith(".dns3") == true) goto L25;
        if (r4.endsWith(".dns4") == false) goto L3;
    L25:
        InetAddress r13 = InetAddress.getByName(r12);
        if (r13 == null) goto L3;
        String r14 = r13.getHostAddress();
        if (r14 == null) goto L3;
        if (r14.length() == 0) goto L3;
        r02.add(r14);
        goto L3
    L10:
        if (r7 == false) goto L3;
        a.f182754c.warning("Malformed property detected: \"" + r1 + "\"");
        goto L3
    L35:
        return r02;
    }

    @Override // org.minidns.dnsserverlookup.d
    public List H0() {
        Set r02 = b(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), StandardCharsets.UTF_8)), true);     // Catch: IOException -> L6
        if (r02.size() <= 0) goto L12;
        ArrayList r1 = new ArrayList(r02.size());     // Catch: IOException -> L6
        r1.addAll(r02);     // Catch: IOException -> L6
        return r1;
    L12:
        return null;
    L6:
        e = move-exception;
        a.f182754c.log(Level.WARNING, "Exception in findDNSByExec", e);
        return null;
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        return f.a();
    }
}
