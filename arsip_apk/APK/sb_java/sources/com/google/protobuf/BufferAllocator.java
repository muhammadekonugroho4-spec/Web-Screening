package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = null;

    static {
        UNPOOLED = new AnonymousClass1();
    }

    public BufferAllocator() {
    }

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int r1);

    public abstract AllocatedBuffer allocateHeapBuffer(int r1);
}
