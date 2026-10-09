package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class Finalizer implements Runnable {
    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f38365a = 0;
    private static final Constructor<Thread> bigThreadConstructor = null;
    private static final Field inheritableThreadLocals = null;
    private static final Logger logger = null;
    private final WeakReference<Class<?>> finalizableReferenceClassReference;
    private final PhantomReference<Object> frqReference;
    private final ReferenceQueue<Object> queue;

    static {
        logger = Logger.getLogger(Finalizer.class.getName());
        Constructor<Thread> r02 = getBigThreadConstructor();
        bigThreadConstructor = r02;
        if (r02 != null) goto L5;
        Field r03 = getInheritableThreadLocalsField();
    L6:
        inheritableThreadLocals = r03;
        return;
    L5:
        r03 = null;
        goto L6
    }

    private Finalizer(Class<?> r1, ReferenceQueue<Object> r2, PhantomReference<Object> r3) {
        this.queue = r2;
        this.finalizableReferenceClassReference = new WeakReference(r1);
        this.frqReference = r3;
    }

    private boolean cleanUp(Reference<?> r6) {
        Method r02 = getFinalizeReferentMethod();
        if (r02 != null) goto L5;
        return false;
    L5:
        r6.clear();
        if (r6 == this.frqReference) goto L7;
        r02.invoke(r6, null);     // Catch: Throwable -> L11
    L13:
        r6 = this.queue.poll();
        if (r6 != null) goto L5;
        return true;
    L11:
        th = move-exception;
        logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
        goto L13
    L7:
        return false;
    }

    private static Constructor<Thread> getBigThreadConstructor() {
        return Thread.class.getConstructor(new Class[]{ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE});
    L4:
        return null;
    }

    private Method getFinalizeReferentMethod() {
        Class<?> r02 = this.finalizableReferenceClassReference.get();
        if (r02 != null) goto L10;
        return null;
    L10:
        return r02.getMethod("finalizeReferent", null);
    L7:
        e = move-exception;
        throw new AssertionError(e);
    }

    private static Field getInheritableThreadLocalsField() {
        Field r02 = Thread.class.getDeclaredField("inheritableThreadLocals");     // Catch: Throwable -> L4
        r02.setAccessible(true);     // Catch: Throwable -> L4
        return r02;
    L4:
        logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
        return null;
    }

    public static void startFinalizer(Class<?> r4, ReferenceQueue<Object> r5, PhantomReference<Object> r6) {
        if (r4.getName().equals(FINALIZABLE_REFERENCE) == false) goto L24;
        Finalizer r02 = new Finalizer(r4, r5, r6);
        String r42 = Finalizer.class.getName();
        Constructor<Thread> r52 = bigThreadConstructor;
        if (r52 != null) goto L27;
    L11:
        Thread r53 = null;
    L12:
        if (r53 != null) goto L14;
        r53 = new Thread(null, r02, r42);
    L14:
        r53.setDaemon(true);
        Field r43 = inheritableThreadLocals;     // Catch: Throwable -> L19
        if (r43 == null) goto L21;
        r43.set(r53, null);     // Catch: Throwable -> L19
    L21:
        r53.start();
        return;
    L19:
        th = move-exception;
        logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th);
        goto L21
    L27:
        r53 = r52.newInstance(new Object[]{null, r02, r42, 0L, Boolean.FALSE});     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        logger.log(Level.INFO, "Failed to create a thread without inherited thread-local values", th);
        goto L11
    L24:
        throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
    }

    @Override // java.lang.Runnable
    public void run() {
    L6:
        if (cleanUp(this.queue.remove()) == true) goto L6;
    }
}
