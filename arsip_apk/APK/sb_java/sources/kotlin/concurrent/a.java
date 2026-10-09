package kotlin.concurrent;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: kotlin.concurrent.a$a, reason: collision with other inner class name */
    public static final class C1862a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.functions.a f177405a;

        public C1862a(kotlin.jvm.functions.a r1) {
            this.f177405a = r1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f177405a.invoke();
        }
    }

    public static final Thread a(boolean r1, boolean r2, ClassLoader r3, String r4, int r5, kotlin.jvm.functions.a r6) {
        p.l(r6, "block");
        C1862a r02 = new C1862a(r6);
        if (r2 == false) goto L5;
        r02.setDaemon(true);
    L5:
        if (r5 <= 0) goto L7;
        r02.setPriority(r5);
    L7:
        if (r4 == null) goto L9;
        r02.setName(r4);
    L9:
        if (r3 == null) goto L11;
        r02.setContextClassLoader(r3);
    L11:
        if (r1 == false) goto L13;
        r02.start();
    L13:
        return r02;
    }

    public static /* synthetic */ Thread b(boolean r1, boolean r2, ClassLoader r3, String r4, int r5, kotlin.jvm.functions.a r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r5 = -1;
    L17:
        int r62 = r5;
        String r52 = r4;
        ClassLoader r42 = r3;
        return a(r1, r2, r42, r52, r62, r6);
    }
}
