package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class GlideException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f32655a = null;
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private com.bumptech.glide.load.c key;

    public static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f32656a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32657b;

        public a(Appendable r2) {
            this.f32657b = true;
            this.f32656a = r2;
        }

        public final CharSequence a(CharSequence r1) {
            if (r1 != null) goto L5;
            return "";
        L5:
            return r1;
        }

        @Override // java.lang.Appendable
        public Appendable append(char r4) {
            boolean r1 = false;
            if (this.f32657b == false) goto L6;
            this.f32657b = false;
            this.f32656a.append("  ");
        L6:
            if (r4 != '\n') goto L8;
            r1 = true;
        L8:
            this.f32657b = r1;
            this.f32656a.append(r4);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence r3) {
            CharSequence r32 = a(r3);
            return append(r32, 0, r32.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence r4, int r5, int r6) {
            CharSequence r42 = a(r4);
            boolean r1 = false;
            if (this.f32657b == false) goto L6;
            this.f32657b = false;
            this.f32656a.append("  ");
        L6:
            if (r42.length() > 0) goto L8;
        L10:
            this.f32657b = r1;
            this.f32656a.append(r42, r5, r6);
            return this;
        L8:
            if (r42.charAt(r6 - 1) != '\n') goto L10;
            r1 = true;
            goto L10
        }
    }

    static {
        f32655a = new StackTraceElement[0];
    }

    public GlideException(String r2) {
        this(r2, Collections.EMPTY_LIST);
    }

    public static void b(List r02, Appendable r1) {
        c(r02, r1);     // Catch: IOException -> L4
        return;
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public static void c(List r5, Appendable r6) {
        int r02 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L9;
        int r3 = r1 + 1;
        r6.append("Cause (").append(String.valueOf(r3)).append(" of ").append(String.valueOf(r02)).append("): ");
        Throwable r12 = (Throwable) r5.get(r1);
        if ((r12 instanceof GlideException) == false) goto L7;
        ((GlideException) r12).h(r6);
    L8:
        r1 = r3;
        goto L3
    L7:
        d(r12, r6);
        goto L8
    }

    public static void d(Throwable r1, Appendable r2) {
        r2.append(r1.getClass().toString()).append(": ").append(r1.getMessage()).append('\n');     // Catch: IOException -> L4
        return;
    L5:
        throw new RuntimeException(r1);
    }

    public final void a(Throwable r2, List r3) {
        if ((r2 instanceof GlideException) == false) goto L9;
        Iterator r22 = ((GlideException) r2).e().iterator();
    L6:
        if (r22.hasNext() == false) goto L8;
        a((Throwable) r22.next(), r3);
        goto L6
    L8:
        return;
    L9:
        r3.add(r2);
    }

    public List e() {
        return this.causes;
    }

    public List f() {
        ArrayList r02 = new ArrayList();
        a(this, r02);
        return r02;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String r7) {
        List r02 = f();
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        StringBuilder r3 = new StringBuilder();
        r3.append("Root cause (");
        int r4 = r2 + 1;
        r3.append(r4);
        r3.append(" of ");
        r3.append(r1);
        r3.append(")");
        Log.i(r7, r3.toString(), (Throwable) r02.get(r2));
        r2 = r4;
        goto L3
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder r02 = new StringBuilder(71);
        r02.append(this.detailMessage);
        String r2 = "";
        if (this.dataClass == null) goto L5;
        String r1 = ", " + this.dataClass;
    L6:
        r02.append(r1);
        if (this.dataSource == null) goto L9;
        String r12 = ", " + this.dataSource;
    L10:
        r02.append(r12);
        if (this.key == null) goto L13;
        r2 = ", " + this.key;
    L13:
        r02.append(r2);
        List r13 = f();
        if (r13.isEmpty() == false) goto L18;
        return r02.toString();
    L18:
        if (r13.size() != 1) goto L20;
        r02.append("\nThere was 1 root cause:");
    L21:
        Iterator r14 = r13.iterator();
    L23:
        if (r14.hasNext() == false) goto L25;
        Throwable r22 = (Throwable) r14.next();
        r02.append('\n');
        r02.append(r22.getClass().getName());
        r02.append('(');
        r02.append(r22.getMessage());
        r02.append(')');
        goto L23
    L25:
        r02.append("\n call GlideException#logRootCauses(String) for more detail");
        return r02.toString();
    L20:
        r02.append("\nThere were ");
        r02.append(r13.size());
        r02.append(" root causes:");
        goto L21
    L9:
        r12 = "";
        goto L10
    L5:
        r1 = "";
        goto L6
    }

    public final void h(Appendable r3) {
        d(this, r3);
        b(e(), new a(r3));
    }

    public void i(com.bumptech.glide.load.c r2, DataSource r3) {
        j(r2, r3, null);
    }

    public void j(com.bumptech.glide.load.c r1, DataSource r2, Class r3) {
        this.key = r1;
        this.dataSource = r2;
        this.dataClass = r3;
    }

    public void k(Exception r1) {
        this.exception = r1;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String r1, Throwable r2) {
        this(r1, Collections.singletonList(r2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream r1) {
        h(r1);
    }

    public GlideException(String r1, List r2) {
        this.detailMessage = r1;
        setStackTrace(f32655a);
        this.causes = r2;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter r1) {
        h(r1);
    }
}
