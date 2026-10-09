package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.f;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f39604a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39605b = null;

    static {
        f39604a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        String[] r02 = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f39605b = r02;
        Arrays.sort(r02);
    }

    public static final void a(String r4, X509Certificate r5, boolean r6) {
        String[] r02 = d(r5);
        String[] r52 = f(r5);
        f.b("", "cn is : " + Arrays.toString(r02));
        f.b("", "san is : " + Arrays.toString(r52));
        b(r4, r02, r52, r6);
    }

    public static final void b(String r5, String[] r6, String[] r7, boolean r8) {
        LinkedList r02 = new LinkedList();
        if (r6 != null) goto L5;
    L9:
        if (r7 == null) goto L17;
        int r62 = r7.length;
        int r2 = 0;
    L11:
        if (r2 >= r62) goto L17;
        String r3 = r7[r2];
        if (r3 == null) goto L15;
        r02.add(r3);
    L15:
        r2 = r2 + 1;
    L17:
        if (r02.isEmpty() == true) goto L47;
        StringBuffer r63 = new StringBuffer();
        String r72 = r5.trim().toLowerCase(Locale.ENGLISH);
        Iterator r03 = r02.iterator();
        boolean r22 = false;
    L20:
        if (r03.hasNext() == false) goto L42;
        String r23 = ((String) r03.next()).toLowerCase(Locale.ENGLISH);
        r63.append(" <");
        r63.append(r23);
        r63.append('>');
        if (r03.hasNext() == false) goto L25;
        r63.append(" OR");
    L25:
        if (r23.startsWith("*.") == true) goto L27;
    L40:
        r22 = r72.equals(r23);
    L41:
        if (r22 == false) goto L20;
    L27:
        if (r23.indexOf(46, 2) == (-1)) goto L40;
        if (c(r23) == false) goto L40;
        if (g(r5) == true) goto L40;
        boolean r4 = r72.endsWith(r23.substring(1));
        if (r4 == false) goto L39;
        if (r8 == false) goto L39;
        if (e(r72) != e(r23)) goto L38;
        r22 = true;
        goto L41
    L38:
        r22 = false;
    L39:
        r22 = r4;
    L42:
        if (r22 == false) goto L45;
        return;
    L45:
        throw new SSLException("hostname in certificate didn't match: <" + r5 + "> !=" + r63);
    L47:
        throw new SSLException("Certificate for <" + r5 + "> doesn't contain CN or DNS subjectAlt");
    L5:
        if (r6.length <= 0) goto L9;
        String r64 = r6[0];
        if (r64 == null) goto L9;
        r02.add(r64);
        goto L9
    }

    public static boolean c(String r4) {
        int r02 = r4.length();
        if (r02 >= 7) goto L5;
    L13:
        return true;
    L5:
        if (r02 > 9) goto L13;
        int r03 = r02 - 3;
        if (r4.charAt(r03) != '.') goto L13;
        if (Arrays.binarySearch(f39605b, r4.substring(2, r03)) >= 0) goto L11;
        return true;
    L11:
        return false;
    }

    public static String[] d(X509Certificate r1) {
        List r12 = new b(r1.getSubjectX500Principal()).d("cn");
        if (r12.isEmpty() == true) goto L6;
        String[] r02 = new String[r12.size()];
        r12.toArray(r02);
        return r02;
    L6:
        return null;
    }

    public static int e(String r4) {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= r4.length()) goto L9;
        if (r4.charAt(r02) != '.') goto L8;
        r1 = r1 + 1;
    L8:
        r02 = r02 + 1;
        goto L4
    L9:
        return r1;
    }

    public static String[] f(X509Certificate r5) {
        LinkedList r02 = new LinkedList();
        Collection<List<?>> r52 = r5.getSubjectAlternativeNames();     // Catch: CertificateParsingException -> L5
    L7:
        if (r52 == null) goto L15;
        Iterator<List<?>> r53 = r52.iterator();
    L10:
        if (r53.hasNext() == false) goto L15;
        List<?> r2 = r53.next();
        if (((Integer) r2.get(0)).intValue() != 2) goto L10;
        r02.add((String) r2.get(1));
    L15:
        if (r02.isEmpty() == true) goto L18;
        String[] r54 = new String[r02.size()];
        r02.toArray(r54);
        return r54;
    L18:
        return null;
    L5:
        e = move-exception;
        f.c("", "Error parsing certificate.", e);
        r52 = null;
        goto L7
    }

    public static boolean g(String r1) {
        return f39604a.matcher(r1).matches();
    }
}
