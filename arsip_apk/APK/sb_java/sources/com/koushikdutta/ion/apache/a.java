package com.koushikdutta.ion.apache;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes6.dex */
public abstract class a implements X509HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f41719a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f41720b = null;

    static {
        f41719a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        String[] r02 = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f41720b = r02;
        Arrays.sort(r02);
    }

    public a() {
    }

    public static boolean a(String r4) {
        int r02 = r4.length();
        if (r02 >= 7) goto L5;
    L13:
        return true;
    L5:
        if (r02 > 9) goto L13;
        int r03 = r02 - 3;
        if (r4.charAt(r03) != '.') goto L13;
        if (Arrays.binarySearch(f41720b, r4.substring(2, r03)) >= 0) goto L11;
        return true;
    L11:
        return false;
    }

    public static int b(String r4) {
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

    public static String[] c(X509Certificate r1) {
        List r12 = new b(r1.getSubjectX500Principal()).b("cn");
        if (r12.isEmpty() == true) goto L6;
        String[] r02 = new String[r12.size()];
        r12.toArray(r02);
        return r02;
    L6:
        return null;
    }

    public static String[] d(X509Certificate r5) {
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
        Logger.getLogger(a.class.getName()).log(Level.FINE, "Error parsing certificate.", e);
        r52 = null;
        goto L7
    }

    public static boolean e(String r1) {
        return f41719a.matcher(r1).matches();
    }

    public final void f(String r6, String[] r7, String[] r8, boolean r9) {
        LinkedList r02 = new LinkedList();
        if (r7 != null) goto L5;
    L9:
        if (r8 == null) goto L17;
        int r72 = r8.length;
        int r2 = 0;
    L11:
        if (r2 >= r72) goto L17;
        String r3 = r8[r2];
        if (r3 == null) goto L15;
        r02.add(r3);
    L15:
        r2 = r2 + 1;
    L17:
        if (r02.isEmpty() == true) goto L48;
        StringBuffer r73 = new StringBuffer();
        String r82 = r6.trim().toLowerCase(Locale.ENGLISH);
        Iterator r03 = r02.iterator();
        boolean r22 = false;
    L20:
        if (r03.hasNext() == false) goto L43;
        String r23 = ((String) r03.next()).toLowerCase(Locale.ENGLISH);
        r73.append(" <");
        r73.append(r23);
        r73.append('>');
        if (r03.hasNext() == false) goto L25;
        r73.append(" OR");
    L25:
        if (r23.startsWith("*.") == true) goto L27;
    L41:
        r22 = r82.equals(r23);
    L42:
        if (r22 == false) goto L20;
    L27:
        if (r23.indexOf(46, 2) == (-1)) goto L41;
        if (a(r23) == false) goto L41;
        if (e(r6) == true) goto L41;
        boolean r32 = true;
        boolean r4 = r82.endsWith(r23.substring(1));
        if (r4 == false) goto L40;
        if (r9 == false) goto L40;
        if (b(r82) == b(r23)) goto L39;
        r32 = false;
    L39:
        r22 = r32;
    L40:
        r22 = r4;
    L43:
        if (r22 == false) goto L46;
        return;
    L46:
        throw new SSLException("hostname in certificate didn't match: <" + r6 + "> !=" + r73);
    L48:
        throw new SSLException("Certificate for <" + r6 + "> doesn't contain CN or DNS subjectAlt");
    L5:
        if (r7.length <= 0) goto L9;
        String r74 = r7[0];
        if (r74 == null) goto L9;
        r02.add(r74);
        goto L9
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String r2, SSLSocket r3) {
        if (r2 == null) goto L6;
        verify(r2, (X509Certificate) r3.getSession().getPeerCertificates()[0]);
        return;
    L6:
        throw new NullPointerException("host to verify is null");
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier, javax.net.ssl.HostnameVerifier
    public final boolean verify(String r2, SSLSession r3) {
        verify(r2, (X509Certificate) r3.getPeerCertificates()[0]);     // Catch: SSLException -> L6
        return true;
    L6:
        return false;
    }

    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
    public final void verify(String r2, X509Certificate r3) {
        verify(r2, c(r3), d(r3));
    }
}
