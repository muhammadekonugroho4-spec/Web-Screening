package org.minidns.util;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f182901a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f182902b = null;

    static {
        f182901a = Pattern.compile("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");
        f182902b = Pattern.compile("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))");
    }

    public static Inet4Address a(CharSequence r1) {
        InetAddress r12 = InetAddress.getByName(r1.toString());     // Catch: UnknownHostException -> L9
        if ((r12 instanceof Inet4Address) == false) goto L8;
        return (Inet4Address) r12;
    L8:
        throw new IllegalArgumentException();
    L9:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static Inet6Address b(CharSequence r1) {
        InetAddress r12 = InetAddress.getByName(r1.toString());     // Catch: UnknownHostException -> L9
        if ((r12 instanceof Inet6Address) == false) goto L8;
        return (Inet6Address) r12;
    L8:
        throw new IllegalArgumentException();
    L9:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    public static boolean c(CharSequence r1) {
        if (e(r1) == false) goto L5;
        return true;
    L5:
        if (d(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static boolean d(CharSequence r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return f182901a.matcher(r1).matches();
    }

    public static boolean e(CharSequence r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return f182902b.matcher(r1).matches();
    }
}
