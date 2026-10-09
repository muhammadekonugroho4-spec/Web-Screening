package io.sentry.android.core.internal.util;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class r {
    public static String a(String r8) {
        ByteBuffer r82 = ByteBuffer.wrap(new BigInteger("10" + r8, 16).toByteArray());     // Catch: Throwable -> L4
        r82.get();     // Catch: Throwable -> L4
        return String.format("%08x-%04x-%04x-%04x-%04x%08x", new Object[]{Integer.valueOf(r82.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(r82.getShort()), Short.valueOf(r82.getShort()), Short.valueOf(r82.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(r82.getShort()), Integer.valueOf(r82.getInt())});
    L4:
        return null;
    }
}
