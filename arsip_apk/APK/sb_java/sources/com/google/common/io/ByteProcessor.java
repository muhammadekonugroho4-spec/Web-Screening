package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.IOException;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement it normally")
/* loaded from: classes5.dex */
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] r1, int r2, int r3) throws IOException;
}
