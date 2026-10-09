package org.slf4j.helpers;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static b f183038a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f183039b = false;

    public static /* synthetic */ class a {
    }

    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }

        public /* synthetic */ b(a r1) {
            this();
        }
    }

    static {
    }

    public static Class a() {
        b r02 = b();
        if (r02 != null) goto L6;
        return null;
    L6:
        Class[] r03 = r02.getClassContext();
        String r1 = d.class.getName();
        int r2 = 0;
    L8:
        if (r2 >= r03.length) goto L14;
        if (r1.equals(r03[r2].getName()) == true) goto L14;
        r2 = r2 + 1;
    L14:
        if (r2 >= r03.length) goto L20;
        int r22 = r2 + 2;
        if (r22 >= r03.length) goto L20;
        return r03[r22];
    L20:
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    public static b b() {
        b r02 = f183038a;
        if (r02 == null) goto L6;
        return r02;
    L6:
        if (f183039b == false) goto L9;
        return null;
    L9:
        b r03 = e();
        f183038a = r03;
        f183039b = true;
        return r03;
    }

    public static final void c(String r3) {
        System.err.println("SLF4J: " + r3);
    }

    public static final void d(String r1, Throwable r2) {
        System.err.println(r1);
        System.err.println("Reported exception:");
        r2.printStackTrace();
    }

    public static b e() {
        return new b(null);
    L5:
        return null;
    }

    public static boolean f(String r1) {
        String r12 = g(r1);
        if (r12 != null) goto L7;
        return false;
    L7:
        return r12.equalsIgnoreCase("true");
    }

    public static String g(String r1) {
        if (r1 == null) goto L8;
        return System.getProperty(r1);
    L5:
        return null;
    L8:
        throw new IllegalArgumentException("null input");
    }
}
