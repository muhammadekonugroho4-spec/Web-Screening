package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes4.dex */
public class a implements b.a {

    /* renamed from: com.getkeepsafe.relinker.a$a, reason: collision with other inner class name */
    public static class C0388a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f37331a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f37332b;

        public C0388a(ZipFile r1, ZipEntry r2) {
            this.f37331a = r1;
            this.f37332b = r2;
        }
    }

    public a() {
    }

    @Override // com.getkeepsafe.relinker.b.a
    public void a(Context r9, String[] r10, String r11, File r12, c r13) {
        C0388a r02 = null;
        Closeable r03 = null;
        C0388a r1 = d(r9, r10, r11, r13);     // Catch: Throwable -> L54
        if (r1 == null) goto L74;
        int r102 = 0;
    L6:
        int r2 = r102 + 1;
        if (r102 >= 5) goto L43;
        r13.i("Found %s! Extracting...", new Object[]{r11});     // Catch: Throwable -> L14
        if (r12.exists() == false) goto L12;
    L78:
        InputStream r103 = r1.f37331a.getInputStream(r1.f37332b);     // Catch: Throwable -> L34 IOException -> L36 FileNotFoundException -> L37
        FileOutputStream r3 = new FileOutputStream(r12);     // Catch: Throwable -> L30 IOException -> L32 FileNotFoundException -> L33
    L80:
        long r4 = c(r103, r3);     // Catch: Throwable -> L28 IOException -> L61 FileNotFoundException -> L62
        r3.getFD().sync();     // Catch: Throwable -> L28 IOException -> L61 FileNotFoundException -> L62
    L20:
        if (r4 == r12.length()) goto L23;
        b(r103);     // Catch: Throwable -> L14
    L22:
        b(r3);     // Catch: Throwable -> L14
        goto L42
    L23:
        b(r103);     // Catch: Throwable -> L14
        b(r3);     // Catch: Throwable -> L14
        r12.setReadable(true, false);     // Catch: Throwable -> L14
        r12.setExecutable(true, false);     // Catch: Throwable -> L14
        r12.setWritable(true);     // Catch: Throwable -> L14
        ZipFile r92 = r1.f37331a;     // Catch: IOException -> L60
        if (r92 == null) goto L47;
    L26:
        r92.close();     // Catch: IOException -> L60
        return;
    L47:
        return;
    L28:
        th = th;
    L29:
        r03 = r103;
    L38:
        b(r03);     // Catch: Throwable -> L14
        b(r3);     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L41:
        b(r103);     // Catch: Throwable -> L14
    L40:
        b(r103);     // Catch: Throwable -> L14
    L33:
        r3 = null;
    L32:
        r3 = null;
    L30:
        th = th;
        r3 = null;
        goto L29
    L37:
        r103 = null;
        r3 = null;
    L36:
        r103 = null;
        r3 = null;
    L34:
        th = th;
        r3 = null;
        goto L38
    L12:
        if (r12.createNewFile() == true) goto L78;
    L42:
        r102 = r2;
        goto L6
    L43:
        r13.h("FATAL! Couldn't extract the library from the APK!");     // Catch: Throwable -> L14
        r92 = r1.f37331a;     // Catch: IOException -> L60
        if (r92 != null) goto L26;
        return;
    L88:
        return;
    L74:
        String[] r93 = e(r9, r11);     // Catch: Throwable -> L14 Exception -> L50
    L53:
        throw new MissingLibraryException(r11, r10, r93);     // Catch: Throwable -> L14
    L50:
        e = move-exception;
        r93 = new String[]{e.toString()};     // Catch: Throwable -> L14
    L14:
        th = th;
        r02 = r1;
    L55:
        if (r02 != null) goto L67;
    L59:
        throw th;
    L67:
        ZipFile r104 = r02.f37331a;     // Catch: IOException -> L64
        if (r104 == null) goto L59;
        r104.close();     // Catch: IOException -> L64
    L54:
        th = th;
        goto L55
    }

    public final void b(Closeable r1) {
        if (r1 == null) goto L8;
        r1.close();     // Catch: IOException -> L5
        return;
    L9:
        return;
    }

    public final long c(InputStream r6, OutputStream r7) {
        byte[] r02 = new byte[4096];
        long r1 = 0;
    L3:
        int r3 = r6.read(r02);
        if (r3 == (-1)) goto L5;
        r7.write(r02, 0, r3);
        r1 = r1 + r3;
        goto L3
    L5:
        r7.flush();
        return r1;
    }

    public final C0388a d(Context r17, String[] r18, String r19, c r20) {
        String[] r1 = f(r17);
        int r2 = r1.length;
        int r4 = 0;
    L3:
        ZipFile r5 = null;
        if (r4 >= r2) goto L27;
        String r6 = r1[r4];
        int r7 = 0;
    L6:
        int r8 = r7 + 1;
        if (r7 >= 5) goto L11;
        r5 = new ZipFile(new File(r6), 1);     // Catch: IOException -> L10
    L10:
        r7 = r8;
    L11:
        if (r5 == null) goto L26;
        int r72 = 0;
    L14:
        int r82 = r72 + 1;
        if (r72 >= 5) goto L29;
        int r73 = r18.length;
        int r10 = 0;
    L17:
        if (r10 >= r73) goto L23;
        String r11 = r18[r10];
        StringBuilder r12 = new StringBuilder();
        r12.append("lib");
        char r13 = File.separatorChar;
        r12.append(r13);
        r12.append(r11);
        r12.append(r13);
        r12.append(r19);
        String r122 = r12.toString();
        r20.i("Looking for %s in APK %s...", new Object[]{r122, r6});
        ZipEntry r123 = r5.getEntry(r122);
        if (r123 != null) goto L21;
        r10 = r10 + 1;
        goto L17
    L21:
        return new C0388a(r5, r123);
    L23:
        r72 = r82;
        goto L14
    L29:
        r5.close();     // Catch: IOException -> L28
    L26:
        r4 = r4 + 1;
        goto L3
    L27:
        return null;
    }

    public final String[] e(Context r8, String r9) {
        StringBuilder r02 = new StringBuilder();
        r02.append("lib");
        char r1 = File.separatorChar;
        r02.append(r1);
        r02.append("([^\\");
        r02.append(r1);
        r02.append("]*)");
        r02.append(r1);
        r02.append(r9);
        Pattern r92 = Pattern.compile(r02.toString());
        HashSet r03 = new HashSet();
        String[] r82 = f(r8);
        int r12 = r82.length;
        int r2 = 0;
    L3:
        if (r2 >= r12) goto L14;
        Enumeration<? extends ZipEntry> r4 = new ZipFile(new File(r82[r2]), 1).entries();
    L8:
        if (r4.hasMoreElements() == false) goto L12;
        Matcher r5 = r92.matcher(r4.nextElement().getName());
        if (r5.matches() == false) goto L8;
        r03.add(r5.group(1));
    L12:
        r2 = r2 + 1;
        goto L3
    L14:
        return (String[]) r03.toArray(new String[r03.size()]);
    }

    public final String[] f(Context r5) {
        ApplicationInfo r52 = r5.getApplicationInfo();
        String[] r02 = r52.splitSourceDirs;
        if (r02 == null) goto L9;
        if (r02.length == 0) goto L9;
        String[] r1 = new String[r02.length + 1];
        r1[0] = r52.sourceDir;
        System.arraycopy(r02, 0, r1, 1, r02.length);
        return r1;
    L9:
        return new String[]{r52.sourceDir};
    }
}
