package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.security.AccessController;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final LittleEndianBytes byteArray = null;

    /* renamed from: com.google.common.hash.LittleEndianByteArray$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum JavaLittleEndianBytes extends Enum<JavaLittleEndianBytes> implements LittleEndianBytes {
        private static final /* synthetic */ JavaLittleEndianBytes[] $VALUES = null;
        public static final JavaLittleEndianBytes INSTANCE = null;

        private static /* synthetic */ JavaLittleEndianBytes[] $values() {
            return new JavaLittleEndianBytes[]{INSTANCE};
        }

        static {
            final String r1 = "INSTANCE";
            final int r2 = 0;
            INSTANCE = new AnonymousClass1(r1, r2);
            $VALUES = $values();
        }

        JavaLittleEndianBytes(String r1, int r2) {
        }

        public static JavaLittleEndianBytes valueOf(String r1) {
            return (JavaLittleEndianBytes) Enum.valueOf(JavaLittleEndianBytes.class, r1);
        }

        public static JavaLittleEndianBytes[] values() {
            return (JavaLittleEndianBytes[]) $VALUES.clone();
        }

        /* synthetic */ JavaLittleEndianBytes(String r1, int r2, AnonymousClass1 r3) {
            this(r1, r2);
        }
    }

    public interface LittleEndianBytes {
        long getLongLittleEndian(byte[] r1, int r2);

        void putLongLittleEndian(byte[] r1, int r2, long r3);
    }

    public enum UnsafeByteArray extends Enum<UnsafeByteArray> implements LittleEndianBytes {
        private static final /* synthetic */ UnsafeByteArray[] $VALUES = null;
        private static final int BYTE_ARRAY_BASE_OFFSET = 0;
        public static final UnsafeByteArray UNSAFE_BIG_ENDIAN = null;
        public static final UnsafeByteArray UNSAFE_LITTLE_ENDIAN = null;
        private static final Unsafe theUnsafe = null;

        private static /* synthetic */ UnsafeByteArray[] $values() {
            return new UnsafeByteArray[]{UNSAFE_LITTLE_ENDIAN, UNSAFE_BIG_ENDIAN};
        }

        static {
            final String r1 = "UNSAFE_LITTLE_ENDIAN";
            final int r2 = 0;
            UNSAFE_LITTLE_ENDIAN = new AnonymousClass1(r1, r2);
            final String r12 = "UNSAFE_BIG_ENDIAN";
            final int r22 = 1;
            UNSAFE_BIG_ENDIAN = new AnonymousClass2(r12, r22);
            $VALUES = $values();
            Unsafe r02 = getUnsafe();
            theUnsafe = r02;
            BYTE_ARRAY_BASE_OFFSET = r02.arrayBaseOffset(byte[].class);
            if (r02.arrayIndexScale(byte[].class) != 1) goto L6;
            return;
        L6:
            throw new AssertionError();
        }

        UnsafeByteArray(String r1, int r2) {
        }

        public static /* synthetic */ int access$100() {
            return BYTE_ARRAY_BASE_OFFSET;
        }

        public static /* synthetic */ Unsafe access$200() {
            return theUnsafe;
        }

        private static Unsafe getUnsafe() {
            return Unsafe.getUnsafe();
        L4:
            return (Unsafe) AccessController.doPrivileged(new AnonymousClass3());
        L6:
            e = move-exception;
            throw new RuntimeException("Could not initialize intrinsics", e.getCause());
        }

        public static UnsafeByteArray valueOf(String r1) {
            return (UnsafeByteArray) Enum.valueOf(UnsafeByteArray.class, r1);
        }

        public static UnsafeByteArray[] values() {
            return (UnsafeByteArray[]) $VALUES.clone();
        }

        /* synthetic */ UnsafeByteArray(String r1, int r2, AnonymousClass1 r3) {
            this(r1, r2);
        }
    }

    static {
        LittleEndianBytes r02 = JavaLittleEndianBytes.INSTANCE;
        if ("amd64".equals(System.getProperty("os.arch")) == true) goto L6;
    L12:
        goto L9
    L6:
        if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) == false) goto L8;
        r02 = UnsafeByteArray.UNSAFE_LITTLE_ENDIAN;     // Catch: Throwable -> L11
        goto L12
    L8:
        r02 = UnsafeByteArray.UNSAFE_BIG_ENDIAN;     // Catch: Throwable -> L11
    L9:
        byteArray = r02;
    }

    private LittleEndianByteArray() {
    }

    public static int load32(byte[] r2, int r3) {
        int r02 = ((r2[r3] & UnsignedBytes.MAX_VALUE) | ((r2[r3 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((r2[r3 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        return ((r2[r3 + 3] & UnsignedBytes.MAX_VALUE) << 24) | r02;
    }

    public static long load64(byte[] r1, int r2) {
        return byteArray.getLongLittleEndian(r1, r2);
    }

    public static long load64Safely(byte[] r7, int r8, int r9) {
        long r02 = 0;
        int r2 = 0;
    L3:
        if (r2 >= Math.min(r9, 8)) goto L5;
        r02 = r02 | ((r7[r8 + r2] & 255) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static void store64(byte[] r1, int r2, long r3) {
        byteArray.putLongLittleEndian(r1, r2, r3);
    }

    public static boolean usingUnsafe() {
        return byteArray instanceof UnsafeByteArray;
    }
}
