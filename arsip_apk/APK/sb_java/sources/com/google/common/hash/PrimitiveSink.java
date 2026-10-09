package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@CanIgnoreReturnValue
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public interface PrimitiveSink {
    PrimitiveSink putBoolean(boolean r1);

    PrimitiveSink putByte(byte r1);

    PrimitiveSink putBytes(ByteBuffer r1);

    PrimitiveSink putBytes(byte[] r1);

    PrimitiveSink putBytes(byte[] r1, int r2, int r3);

    PrimitiveSink putChar(char r1);

    PrimitiveSink putDouble(double r1);

    PrimitiveSink putFloat(float r1);

    PrimitiveSink putInt(int r1);

    PrimitiveSink putLong(long r1);

    PrimitiveSink putShort(short r1);

    PrimitiveSink putString(CharSequence r1, Charset r2);

    PrimitiveSink putUnencodedChars(CharSequence r1);
}
