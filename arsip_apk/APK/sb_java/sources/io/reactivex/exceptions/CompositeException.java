package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public CompositeExceptionCausalChain() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class a {
        public a() {
        }

        public abstract void a(Object r1);
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final PrintStream f174459a;

        public b(PrintStream r1) {
            this.f174459a = r1;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        public void a(Object r2) {
            this.f174459a.println(r2);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final PrintWriter f174460a;

        public c(PrintWriter r1) {
            this.f174460a = r1;
        }

        @Override // io.reactivex.exceptions.CompositeException.a
        public void a(Object r2) {
            this.f174460a.println(r2);
        }
    }

    public CompositeException(Throwable... r2) {
        if (r2 != null) goto L4;
        List r22 = Collections.singletonList(new NullPointerException("exceptions was null"));
    L5:
        this(r22);
        return;
    L4:
        r22 = Arrays.asList(r2);
        goto L5
    }

    public final void a(StringBuilder r6, Throwable r7, String r8) {
        r6.append(r8);
        r6.append(r7);
        r6.append('\n');
        StackTraceElement[] r02 = r7.getStackTrace();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        StackTraceElement r3 = r02[r2];
        r6.append("\t\tat ");
        r6.append(r3);
        r6.append('\n');
        r2 = r2 + 1;
        goto L3
    L6:
        if (r7.getCause() == null) goto L10;
        r6.append("\tCaused by: ");
        a(r6, r7.getCause(), "");
        return;
    }

    public List b() {
        return this.exceptions;
    }

    public final List c(Throwable r3) {
        ArrayList r02 = new ArrayList();
        Throwable r1 = r3.getCause();
        if (r1 == null) goto L11;
        if (r1 == r3) goto L11;
    L6:
        r02.add(r1);
        Throwable r32 = r1.getCause();
        if (r32 == null) goto L11;
        if (r32 == r1) goto L11;
        r1 = r32;
    L11:
        return r02;
    }

    public Throwable d(Throwable r2) {
        Throwable r02 = r2.getCause();
        if (r02 == null) goto L12;
        if (r2 == r02) goto L12;
    L6:
        Throwable r22 = r02.getCause();
        if (r22 == null) goto L11;
        if (r22 == r02) goto L11;
        r02 = r22;
    L11:
        return r02;
    L12:
        return r2;
    }

    public final void e(a r8) {
        StringBuilder r02 = new StringBuilder(128);
        r02.append(this);
        r02.append('\n');
        StackTraceElement[] r2 = getStackTrace();
        int r3 = r2.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        StackTraceElement r5 = r2[r4];
        r02.append("\tat ");
        r02.append(r5);
        r02.append('\n');
        r4 = r4 + 1;
        goto L3
    L5:
        Iterator<Throwable> r1 = this.exceptions.iterator();
        int r32 = 1;
    L7:
        if (r1.hasNext() == false) goto L9;
        Throwable r42 = r1.next();
        r02.append("  ComposedException ");
        r02.append(r32);
        r02.append(" :\n");
        a(r02, r42, "\t");
        r32 = r32 + 1;
        goto L7
    L9:
        r8.a(r02.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        monitor-enter(this);
    L17:
        th = move-exception;
        throw th;
    L4:
        if (this.cause != null) goto L24;
        CompositeExceptionCausalChain r02 = new CompositeExceptionCausalChain();     // Catch: Throwable -> L17
        HashSet r1 = new HashSet();     // Catch: Throwable -> L17
        Iterator<Throwable> r2 = this.exceptions.iterator();     // Catch: Throwable -> L17
        Throwable r3 = r02;
    L7:
        if (r2.hasNext() == false) goto L23;
        Throwable r4 = r2.next();     // Catch: Throwable -> L17
        if (r1.contains(r4) == true) goto L7;
        r1.add(r4);     // Catch: Throwable -> L17
        Iterator r5 = c(r4).iterator();     // Catch: Throwable -> L17
    L13:
        if (r5.hasNext() == false) goto L30;
        Throwable r6 = (Throwable) r5.next();     // Catch: Throwable -> L17
        if (r1.contains(r6) == true) goto L16;
        r1.add(r6);     // Catch: Throwable -> L17
        goto L13
    L16:
        r4 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");     // Catch: Throwable -> L17
        goto L13
    L30:
        r3.initCause(r4);     // Catch: Throwable -> L29
    L22:
        r3 = d(r3);     // Catch: Throwable -> L17
        goto L7
    L23:
        this.cause = r02;     // Catch: Throwable -> L17
    L24:
        Throwable r03 = this.cause;     // Catch: Throwable -> L17
        monitor-exit(this);
        return r03;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream r2) {
        e(new b(r2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter r2) {
        e(new c(r2));
    }

    public CompositeException(Iterable r5) {
        LinkedHashSet r02 = new LinkedHashSet();
        ArrayList r1 = new ArrayList();
        if (r5 == null) goto L13;
        Iterator r52 = r5.iterator();
    L6:
        if (r52.hasNext() == false) goto L15;
        Throwable r2 = (Throwable) r52.next();
        if ((r2 instanceof CompositeException) == true) goto L9;
        if (r2 != null) goto L11;
        r02.add(new NullPointerException("Throwable was null!"));
        goto L6
    L11:
        r02.add(r2);
        goto L6
    L9:
        r02.addAll(((CompositeException) r2).b());
    L15:
        if (r02.isEmpty() == true) goto L19;
        r1.addAll(r02);
        List<Throwable> r53 = Collections.unmodifiableList(r1);
        this.exceptions = r53;
        this.message = r53.size() + " exceptions occurred. ";
        return;
    L19:
        throw new IllegalArgumentException("errors is empty");
    L13:
        r02.add(new NullPointerException("errors was null"));
        goto L15
    }
}
