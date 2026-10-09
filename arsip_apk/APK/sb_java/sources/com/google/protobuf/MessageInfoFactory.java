package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> r1);

    MessageInfo messageInfoFor(Class<?> r1);
}
