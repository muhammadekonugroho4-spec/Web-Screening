package org.minidns.dnsserverlookup;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.minidns.util.f;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final d f182757e = null;
    public final Method d;

    static {
        f182757e = new c();
    }

    public c() {
        super(c.class.getSimpleName(), 1000);
        if (f.a() == true) goto L15;
    L12:
        Method r02 = null;
    L13:
        this.d = r02;
        return;
    L15:
        r02 = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});     // Catch: SecurityException -> L6 Throwable -> L8 ClassNotFoundException -> L10
    L8:
        e = move-exception;
        a.f182754c.log(Level.FINE, "Can not get method handle for android.os.SystemProperties.get(String).", e);
        goto L12
    }

    @Override // org.minidns.dnsserverlookup.d
    public List H0() {
        ArrayList r1 = new ArrayList(5);
        String[] r2 = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
        int r3 = 0;
    L4:
        if (r3 >= 4) goto L39;
        String r5 = r2[r3];
        String r52 = (String) this.d.invoke(null, new Object[]{r5});     // Catch: InvocationTargetException -> L31 IllegalArgumentException -> L33 Throwable -> L35
        if (r52 == null) goto L30;
        if (r52.length() == 0) goto L30;
        if (r1.contains(r52) == true) goto L30;
        InetAddress r4 = InetAddress.getByName(r52);     // Catch: UnknownHostException -> L28
        if (r4 == null) goto L30;
        String r42 = r4.getHostAddress();
        if (r42 == null) goto L30;
        if (r42.length() == 0) goto L30;
        if (r1.contains(r42) == true) goto L30;
        r1.add(r42);
    L28:
        e = move-exception;
        a.f182754c.log(Level.WARNING, "Exception in findDNSByReflection", e);
    L30:
        r3 = r3 + 1;
    L35:
        e = move-exception;
        a.f182754c.log(Level.WARNING, "Exception in findDNSByReflection", e);
        return null;
    L39:
        if (r1.size() <= 0) goto L41;
        return r1;
    L41:
        return null;
    }

    @Override // org.minidns.dnsserverlookup.d
    public boolean isAvailable() {
        if (this.d == null) goto L6;
        return true;
    L6:
        return false;
    }
}
