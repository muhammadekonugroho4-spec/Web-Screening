package io.reactivex.exceptions;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(Throwable r1) {
        if ((r1 instanceof VirtualMachineError) == true) goto L14;
        if ((r1 instanceof ThreadDeath) == true) goto L12;
        if ((r1 instanceof LinkageError) == true) goto L10;
        return;
    L10:
        throw ((LinkageError) r1);
    L12:
        throw ((ThreadDeath) r1);
    L14:
        throw ((VirtualMachineError) r1);
    }
}
