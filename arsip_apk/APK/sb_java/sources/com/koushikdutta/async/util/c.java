package com.koushikdutta.async.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    public static String f41650i = "MD5";

    /* renamed from: j, reason: collision with root package name */
    public static MessageDigest f41651j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f41652a;

    /* renamed from: b, reason: collision with root package name */
    public Random f41653b;

    /* renamed from: c, reason: collision with root package name */
    public long f41654c;
    public d d;

    /* renamed from: e, reason: collision with root package name */
    public File f41655e;

    /* renamed from: f, reason: collision with root package name */
    public long f41656f;

    /* renamed from: g, reason: collision with root package name */
    public Comparator f41657g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41658h;

    public class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f41659a;

        public a(c r1) {
            this.f41659a = r1;
        }

        public int a(File r4, File r5) {
            long r02 = r4.lastModified();
            long r42 = r5.lastModified();
            if (r02 >= r42) goto L7;
            return -1;
        L7:
            if (r42 <= r02) goto L10;
            return 1;
        L10:
            return 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((File) r1, (File) r2);
        }
    }

    public class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f41660a;

        public b(c r1) {
            this.f41660a = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f41660a.l();
        }
    }

    /* renamed from: com.koushikdutta.async.util.c$c, reason: collision with other inner class name */
    public class C0461c {

        /* renamed from: a, reason: collision with root package name */
        public final long f41661a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f41662b;

        public C0461c(c r1, File r2) {
            this.f41662b = r1;
            this.f41661a = r2.length();
        }
    }

    public class d extends f {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c f41663i;

        public d(c r3) {
            this.f41663i = r3;
            super(r3.f41656f);
        }

        @Override // com.koushikdutta.async.util.f
        public /* bridge */ /* synthetic */ void b(boolean r1, Object r2, Object r3, Object r4) {
            k(r1, (String) r2, (C0461c) r3, (C0461c) r4);
        }

        @Override // com.koushikdutta.async.util.f
        public /* bridge */ /* synthetic */ long i(Object r1, Object r2) {
            return l((String) r1, (C0461c) r2);
        }

        public void k(boolean r1, String r2, C0461c r3, C0461c r4) {
            super.b(r1, r2, r3, r4);
            if (r4 == null) goto L6;
            return;
        L6:
            if (this.f41663i.f41658h == false) goto L8;
            return;
        L8:
            new File(this.f41663i.f41655e, r2).delete();
        }

        public long l(String r3, C0461c r4) {
            return Math.max(this.f41663i.f41654c, r4.f41661a);
        }
    }

    static {
        f41651j = MessageDigest.getInstance("MD5");     // Catch: NoSuchAlgorithmException -> L5
    L13:
        f41651j = (MessageDigest) f41651j.clone();     // Catch: CloneNotSupportedException -> L12
        return;
    L17:
        return;
    L5:
        e = move-exception;
        MessageDigest r1 = d();
        f41651j = r1;
        if (r1 != null) goto L13;
        throw new RuntimeException(e);
    }

    public c(File r3, long r4, boolean r6) {
        this.f41653b = new Random();
        this.f41654c = 4096;
        this.f41657g = new a(this);
        this.f41655e = r3;
        this.f41656f = r4;
        this.f41652a = r6;
        this.d = new d(this);
        r3.mkdirs();
        b();
    }

    public static MessageDigest d() {
        if ("MD5".equals(f41650i) == false) goto L14;
        Provider[] r02 = Security.getProviders();
        int r1 = r02.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L25;
        Iterator<Provider.Service> r3 = r02[r2].getServices().iterator();
    L8:
        if (r3.hasNext() == false) goto L13;
        String r4 = r3.next().getAlgorithm();
        f41650i = r4;
        MessageDigest r42 = MessageDigest.getInstance(r4);     // Catch: NoSuchAlgorithmException -> L16
        if (r42 == null) goto L8;
        return r42;
    L13:
        r2 = r2 + 1;
        goto L5
    L25:
        return null;
    L14:
        return null;
    }

    public static void n(File... r3) {
        if (r3 == null) goto L7;
        int r02 = r3.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L9;
        r3[r1].delete();
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public static synchronized String p(Object... r5) {
        monitor-enter(c.class);
        f41651j.reset();     // Catch: Throwable -> L7
        int r1 = r5.length;     // Catch: Throwable -> L7
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L9;
        Object r3 = r5[r2];     // Catch: Throwable -> L7
        f41651j.update(r3.toString().getBytes());     // Catch: Throwable -> L7
        r2 = r2 + 1;     // Catch: Throwable -> L7
        goto L5
    L9:
        String r52 = new BigInteger(1, f41651j.digest()).toString(16);     // Catch: Throwable -> L7
        monitor-exit(c.class);
        return r52;
    L7:
        th = move-exception;
        throw th;
    }

    public void a(String r6, File... r7) {
        o(r6);
        int r02 = 0;
    L4:
        if (r02 >= r7.length) goto L10;
        File r1 = r7[r02];
        File r2 = h(r6, r02);
        if (r1.renameTo(r2) == false) goto L7;
        m(r1.getName());
        this.d.e(i(r6, r02), new C0461c(this, r2));
        r02 = r02 + 1;
        goto L4
    L7:
        n(r7);
        m(r6);
        return;
    }

    public final void b() {
        if (this.f41652a == false) goto L6;
        new b(this).start();
        return;
    L6:
        l();
    }

    public boolean c(String r2) {
        return h(r2, 0).exists();
    }

    public FileInputStream e(String r3) {
        return new FileInputStream(q(h(r3, 0)));
    }

    public FileInputStream[] f(String r8, int r9) {
        FileInputStream[] r2 = new FileInputStream[r9];
        int r3 = 0;
    L3:
        if (r3 >= r9) goto L12;
        r2[r3] = new FileInputStream(q(h(r8, r3)));     // Catch: IOException -> L6
        r3 = r3 + 1;
    L6:
        e = move-exception;
        int r4 = 0;
    L8:
        if (r4 >= r9) goto L10;
        g.a(new Closeable[]{r2[r4]});
        r4 = r4 + 1;
        goto L8
    L10:
        m(r8);
        throw e;
    L12:
        return r2;
    }

    public File g(String r2) {
        return q(h(r2, 0));
    }

    public File h(String r3, int r4) {
        return new File(this.f41655e, i(r3, r4));
    }

    public String i(String r2, int r3) {
        return r2 + "." + r3;
    }

    public File j() {
    L2:
        File r02 = new File(this.f41655e, new BigInteger(128, this.f41653b).toString(16));
        if (r02.exists() == true) goto L2;
        return r02;
    }

    public File[] k(int r4) {
        File[] r02 = new File[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L5;
        r02[r1] = j();
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    public void l() {
        this.f41658h = true;
        File[] r1 = this.f41655e.listFiles();     // Catch: Throwable -> L12
        if (r1 != null) goto L7;
        this.f41658h = false;
        return;
    L7:
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L12
        Collections.addAll(r2, r1);     // Catch: Throwable -> L12
        Collections.sort(r2, this.f41657g);     // Catch: Throwable -> L12
        Iterator r12 = r2.iterator();     // Catch: Throwable -> L12
    L8:
        if (r12.hasNext() == false) goto L14;
        File r22 = (File) r12.next();     // Catch: Throwable -> L12
        String r3 = r22.getName();     // Catch: Throwable -> L12
        C0461c r4 = new C0461c(this, r22);     // Catch: Throwable -> L12
        this.d.e(r3, r4);     // Catch: Throwable -> L12
        this.d.c(r3);     // Catch: Throwable -> L12
        goto L8
    L14:
        this.f41658h = false;
        return;
    L12:
        th = move-exception;
        this.f41658h = false;
        throw th;
    }

    public void m(String r4) {
        int r02 = 0;
    L4:
        if (this.d.f(i(r4, r02)) == null) goto L6;
        r02 = r02 + 1;
        goto L4
    L6:
        o(r4);
    }

    public void o(String r4) {
        int r02 = 0;
    L3:
        File r1 = h(r4, r02);
        if (r1.exists() == false) goto L6;
        r1.delete();
        r02 = r02 + 1;
        goto L3
    }

    public File q(File r3) {
        this.d.c(r3.getName());
        r3.setLastModified(System.currentTimeMillis());
        return r3;
    }
}
