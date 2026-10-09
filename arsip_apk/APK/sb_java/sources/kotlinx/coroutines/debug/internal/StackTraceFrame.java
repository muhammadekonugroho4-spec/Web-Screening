package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/c;Ljava/lang/StackTraceElement;)V", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/c;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "Ljava/lang/StackTraceElement;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackTraceFrame implements kotlin.coroutines.jvm.internal.c {
    private final kotlin.coroutines.jvm.internal.c callerFrame;
    private final StackTraceElement stackTraceElement;

    public StackTraceFrame(kotlin.coroutines.jvm.internal.c r1, StackTraceElement r2) {
        this.callerFrame = r1;
        this.stackTraceElement = r2;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
