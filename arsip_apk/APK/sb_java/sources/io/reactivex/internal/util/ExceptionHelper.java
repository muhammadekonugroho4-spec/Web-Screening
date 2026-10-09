package io.reactivex.internal.util;

import androidx.camera.view.i;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class ExceptionHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f174623a = null;

    public static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        f174623a = new Termination();
    }

    public static boolean a(AtomicReference r3, Throwable r4) {
    L2:
        Throwable r02 = (Throwable) r3.get();
        if (r02 == f174623a) goto L4;
        if (r02 != null) goto L8;
        Throwable r1 = r4;
    L10:
        if (i.a(r3, r02, r1) == false) goto L2;
        return true;
    L8:
        r1 = new CompositeException(new Throwable[]{r02, r4});
        goto L10
    L4:
        return false;
    }

    public static Throwable b(AtomicReference r2) {
        Throwable r02 = (Throwable) r2.get();
        Throwable r1 = f174623a;
        if (r02 != r1) goto L5;
        return r02;
    L5:
        return (Throwable) r2.getAndSet(r1);
    }

    public static Exception c(Throwable r1) {
        if ((r1 instanceof Exception) == true) goto L5;
        throw r1;
    L5:
        return (Exception) r1;
    }

    public static RuntimeException d(Throwable r1) {
        if ((r1 instanceof Error) == true) goto L11;
        if ((r1 instanceof RuntimeException) == false) goto L9;
        return (RuntimeException) r1;
    L9:
        return new RuntimeException(r1);
    L11:
        throw ((Error) r1);
    }
}
