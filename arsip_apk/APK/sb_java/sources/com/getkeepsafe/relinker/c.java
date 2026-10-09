package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.b;
import com.getkeepsafe.relinker.elf.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f37333a;

    /* renamed from: b, reason: collision with root package name */
    public final b.InterfaceC0389b f37334b;

    /* renamed from: c, reason: collision with root package name */
    public final b.a f37335c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37336e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37337a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f37338b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f37339c;
        public final /* synthetic */ c d;

        public a(c r1, Context r2, String r3, String r4, b.c r5) {
            this.d = r1;
            this.f37337a = r2;
            this.f37338b = r3;
            this.f37339c = r4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.a(this.d, this.f37337a, this.f37338b, this.f37339c);     // Catch: MissingLibraryException -> L5 UnsatisfiedLinkError -> L6
            throw null;
        L9:
            throw null;
        L10:
            throw null;
        L5:
            throw null;
        L6:
            throw null;
        }
    }

    public class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37340a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f37341b;

        public b(c r1, String r2) {
            this.f37341b = r1;
            this.f37340a = r2;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File r1, String r2) {
            return r2.startsWith(this.f37340a);
        }
    }

    public c() {
        this(new d(), new com.getkeepsafe.relinker.a());
    }

    public static /* synthetic */ void a(c r02, Context r1, String r2, String r3) {
        r02.g(r1, r2, r3);
    }

    public void b(Context r5, String r6, String r7) {
        File r02 = c(r5);
        File r52 = d(r5, r6, r7);
        File[] r62 = r02.listFiles(new b(this, this.f37334b.e(r6)));
        if (r62 == null) goto L13;
        int r72 = r62.length;
        int r03 = 0;
    L6:
        if (r03 >= r72) goto L17;
        File r1 = r62[r03];
        if (this.d == false) goto L10;
    L11:
        r1.delete();
    L12:
        r03 = r03 + 1;
        goto L6
    L10:
        if (r1.getAbsolutePath().equals(r52.getAbsolutePath()) == true) goto L12;
    L17:
        return;
    }

    public File c(Context r3) {
        return r3.getDir("lib", 0);
    }

    public File d(Context r3, String r4, String r5) {
        String r42 = this.f37334b.e(r4);
        if (e.a(r5) == false) goto L7;
        return new File(c(r3), r42);
    L7:
        return new File(c(r3), r42 + "." + r5);
    }

    public void e(Context r2, String r3) {
        f(r2, r3, null, null);
    }

    public void f(Context r8, String r9, String r10, b.c r11) {
        if (r8 == null) goto L14;
        if (e.a(r9) == true) goto L12;
        i("Beginning load of %s...", new Object[]{r9});
        if (r11 != null) goto L9;
        g(r8, r9, r10);
        return;
    L9:
        new Thread(new a(this, r8, r9, r10, r11)).start();
        return;
    L12:
        throw new IllegalArgumentException("Given library is either null or empty");
    L14:
        throw new IllegalArgumentException("Given context is null");
    }

    public final void g(Context r9, String r10, String r11) {
        if (this.f37333a.contains(r10) == true) goto L5;
    L44:
        this.f37334b.d(r10);     // Catch: UnsatisfiedLinkError -> L10
        this.f37333a.add(r10);     // Catch: UnsatisfiedLinkError -> L10
        i("%s (%s) was loaded normally!", new Object[]{r10, r11});     // Catch: UnsatisfiedLinkError -> L10
        return;
    L10:
        e = move-exception;
        i("Loading the library normally failed: %s", new Object[]{Log.getStackTraceString(e)});
        i("%s (%s) was not loaded normally, re-linking...", new Object[]{r10, r11});
        File r6 = d(r9, r10, r11);
        if (r6.exists() == false) goto L18;
        if (this.d == true) goto L18;
        c r7 = this;
        Context r3 = r9;
    L46:
        if (r7.f37336e == false) goto L37;
        i r1 = new i(r6);     // Catch: Throwable -> L32
        List r92 = r1.i();     // Catch: Throwable -> L30
        r1.close();     // Catch: IOException -> L39
        Iterator r93 = r92.iterator();     // Catch: IOException -> L39
    L28:
        if (r93.hasNext() == false) goto L37;
        e(r3, r7.f37334b.a((String) r93.next()));     // Catch: IOException -> L39
    L30:
        th = th;
    L31:
        Throwable r94 = th;
        if (r1 == null) goto L48;
        r1.close();     // Catch: IOException -> L39
        throw r94;     // Catch: IOException -> L39
    L48:
        throw r94;     // Catch: IOException -> L39
    L32:
        th = th;
        r1 = null;
    L37:
        r7.f37334b.c(r6.getAbsolutePath());
        r7.f37333a.add(r10);
        i("%s (%s) was re-linked!", new Object[]{r10, r11});
        return;
    L18:
        if (this.d == false) goto L20;
        i("Forcing a re-link of %s (%s)...", new Object[]{r10, r11});
    L20:
        b(r9, r10, r11);
        r7 = this;
        r3 = r9;
        this.f37335c.a(r3, this.f37334b.b(), this.f37334b.e(r10), r6, r7);
        goto L46
    L5:
        if (this.d == true) goto L44;
        i("%s already loaded previously!", new Object[]{r10});
    }

    public void h(String r1) {
    }

    public void i(String r2, Object... r3) {
        h(String.format(Locale.US, r2, r3));
    }

    public c(b.InterfaceC0389b r2, b.a r3) {
        this.f37333a = new HashSet();
        if (r2 == null) goto L10;
        if (r3 == null) goto L8;
        this.f37334b = r2;
        this.f37335c = r3;
        return;
    L8:
        throw new IllegalArgumentException("Cannot pass null library installer");
    L10:
        throw new IllegalArgumentException("Cannot pass null library loader");
    }
}
