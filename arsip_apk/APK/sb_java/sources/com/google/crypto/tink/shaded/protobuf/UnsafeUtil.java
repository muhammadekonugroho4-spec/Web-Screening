package com.google.crypto.tink.shaded.protobuf;

import com.google.firebase.perf.util.Constants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET = 0;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE = 0;
    private static final long BUFFER_ADDRESS_OFFSET = 0;
    private static final int BYTE_ARRAY_ALIGNMENT = 0;
    static final long BYTE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_BASE_OFFSET = 0;
    private static final long DOUBLE_ARRAY_INDEX_SCALE = 0;
    private static final long FLOAT_ARRAY_BASE_OFFSET = 0;
    private static final long FLOAT_ARRAY_INDEX_SCALE = 0;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
    private static final long INT_ARRAY_BASE_OFFSET = 0;
    private static final long INT_ARRAY_INDEX_SCALE = 0;
    private static final boolean IS_ANDROID_32 = false;
    private static final boolean IS_ANDROID_64 = false;
    static final boolean IS_BIG_ENDIAN = false;
    private static final long LONG_ARRAY_BASE_OFFSET = 0;
    private static final long LONG_ARRAY_INDEX_SCALE = 0;
    private static final MemoryAccessor MEMORY_ACCESSOR = null;
    private static final Class<?> MEMORY_CLASS = null;
    private static final long OBJECT_ARRAY_BASE_OFFSET = 0;
    private static final long OBJECT_ARRAY_INDEX_SCALE = 0;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = null;

    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        public Android32MemoryAccessor(Unsafe r1) {
            super(r1);
        }

        private static int smallAddress(long r02) {
            return (int) r02;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r1, byte[] r3, long r4, long r6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object r2, long r3) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L7;
            return UnsafeUtil.access$600(r2, r3);
        L7:
            return UnsafeUtil.access$700(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object r2, long r3) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L7;
            return UnsafeUtil.access$200(r2, r3);
        L7:
            return UnsafeUtil.access$300(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object r1, long r2) {
            return Double.longBitsToDouble(getLong(r1, r2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object r1, long r2) {
            return Float.intBitsToFloat(getInt(r1, r2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field r2) {
            return r2.get(null);
        L5:
            return null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object r2, long r3, boolean r5) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L6;
            UnsafeUtil.access$800(r2, r3, r5);
            return;
        L6:
            UnsafeUtil.access$900(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object r2, long r3, byte r5) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L6;
            UnsafeUtil.access$400(r2, r3, r5);
            return;
        L6:
            UnsafeUtil.access$500(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object r7, long r8, double r10) {
            putLong(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object r1, long r2, float r4) {
            putInt(r1, r2, Float.floatToIntBits(r4));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r1, int r3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r1, long r3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r1, long r2, long r4, long r6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r1, byte r3) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        public Android64MemoryAccessor(Unsafe r1) {
            super(r1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r1, byte[] r3, long r4, long r6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object r2, long r3) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L7;
            return UnsafeUtil.access$600(r2, r3);
        L7:
            return UnsafeUtil.access$700(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object r2, long r3) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L7;
            return UnsafeUtil.access$200(r2, r3);
        L7:
            return UnsafeUtil.access$300(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object r1, long r2) {
            return Double.longBitsToDouble(getLong(r1, r2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object r1, long r2) {
            return Float.intBitsToFloat(getInt(r1, r2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field r2) {
            return r2.get(null);
        L5:
            return null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object r2, long r3, boolean r5) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L6;
            UnsafeUtil.access$800(r2, r3, r5);
            return;
        L6:
            UnsafeUtil.access$900(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object r2, long r3, byte r5) {
            if (UnsafeUtil.IS_BIG_ENDIAN == false) goto L6;
            UnsafeUtil.access$400(r2, r3, r5);
            return;
        L6:
            UnsafeUtil.access$500(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object r7, long r8, double r10) {
            putLong(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object r1, long r2, float r4) {
            putInt(r1, r2, Float.floatToIntBits(r4));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r1, int r3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r1, long r3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r1, long r2, long r4, long r6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r1) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r1, byte r3) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe r1) {
            super(r1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long r10, byte[] r12, long r13, long r15) {
            this.unsafe.copyMemory(null, r10, r12, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + r13, r15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object r2, long r3) {
            return this.unsafe.getBoolean(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object r2, long r3) {
            return this.unsafe.getByte(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object r2, long r3) {
            return this.unsafe.getDouble(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object r2, long r3) {
            return this.unsafe.getFloat(r2, r3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long r2) {
            return this.unsafe.getInt(r2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long r2) {
            return this.unsafe.getLong(r2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field r4) {
            return getObject(this.unsafe.staticFieldBase(r4), this.unsafe.staticFieldOffset(r4));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object r2, long r3, boolean r5) {
            this.unsafe.putBoolean(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object r2, long r3, byte r5) {
            this.unsafe.putByte(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object r7, long r8, double r10) {
            this.unsafe.putDouble(r7, r8, r10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object r2, long r3, float r5) {
            this.unsafe.putFloat(r2, r3, r5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long r2, int r4) {
            this.unsafe.putInt(r2, r4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long r2, long r4) {
            this.unsafe.putLong(r2, r4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (super.supportsUnsafeArrayOperations() == true) goto L11;
            return false;
        L11:
            Class<?> r1 = this.unsafe.getClass();     // Catch: Throwable -> L8
            Class r4 = Long.TYPE;     // Catch: Throwable -> L8
            r1.getMethod("getByte", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putByte", new Class[]{Object.class, r4, Byte.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getBoolean", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putBoolean", new Class[]{Object.class, r4, Boolean.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getFloat", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putFloat", new Class[]{Object.class, r4, Float.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getDouble", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putDouble", new Class[]{Object.class, r4, Double.TYPE});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            UnsafeUtil.access$000(th);
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (super.supportsUnsafeByteBufferOperations() == true) goto L11;
            return false;
        L11:
            Class<?> r2 = this.unsafe.getClass();     // Catch: Throwable -> L8
            Class r5 = Long.TYPE;     // Catch: Throwable -> L8
            r2.getMethod("getByte", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putByte", new Class[]{r5, Byte.TYPE});     // Catch: Throwable -> L8
            r2.getMethod("getInt", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putInt", new Class[]{r5, Integer.TYPE});     // Catch: Throwable -> L8
            r2.getMethod("getLong", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putLong", new Class[]{r5, r5});     // Catch: Throwable -> L8
            r2.getMethod("copyMemory", new Class[]{r5, r5, r5});     // Catch: Throwable -> L8
            r2.getMethod("copyMemory", new Class[]{Object.class, r5, Object.class, r5, r5});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            UnsafeUtil.access$000(th);
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] r10, long r11, long r13, long r15) {
            this.unsafe.copyMemory(r10, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + r11, null, r13, r15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long r2) {
            return this.unsafe.getByte(r2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long r2, byte r4) {
            this.unsafe.putByte(r2, r4);
        }
    }

    public static abstract class MemoryAccessor {
        Unsafe unsafe;

        public MemoryAccessor(Unsafe r1) {
            this.unsafe = r1;
        }

        public final int arrayBaseOffset(Class<?> r2) {
            return this.unsafe.arrayBaseOffset(r2);
        }

        public final int arrayIndexScale(Class<?> r2) {
            return this.unsafe.arrayIndexScale(r2);
        }

        public abstract void copyMemory(long r1, byte[] r3, long r4, long r6);

        public abstract void copyMemory(byte[] r1, long r2, long r4, long r6);

        public abstract boolean getBoolean(Object r1, long r2);

        public abstract byte getByte(long r1);

        public abstract byte getByte(Object r1, long r2);

        public abstract double getDouble(Object r1, long r2);

        public abstract float getFloat(Object r1, long r2);

        public abstract int getInt(long r1);

        public final int getInt(Object r2, long r3) {
            return this.unsafe.getInt(r2, r3);
        }

        public abstract long getLong(long r1);

        public final long getLong(Object r2, long r3) {
            return this.unsafe.getLong(r2, r3);
        }

        public final Object getObject(Object r2, long r3) {
            return this.unsafe.getObject(r2, r3);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field r1);

        public final long objectFieldOffset(java.lang.reflect.Field r3) {
            return this.unsafe.objectFieldOffset(r3);
        }

        public abstract void putBoolean(Object r1, long r2, boolean r4);

        public abstract void putByte(long r1, byte r3);

        public abstract void putByte(Object r1, long r2, byte r4);

        public abstract void putDouble(Object r1, long r2, double r4);

        public abstract void putFloat(Object r1, long r2, float r4);

        public abstract void putInt(long r1, int r3);

        public final void putInt(Object r2, long r3, int r5) {
            this.unsafe.putInt(r2, r3, r5);
        }

        public abstract void putLong(long r1, long r3);

        public final void putLong(Object r7, long r8, long r10) {
            this.unsafe.putLong(r7, r8, r10);
        }

        public final void putObject(Object r2, long r3, Object r5) {
            this.unsafe.putObject(r2, r3, r5);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe r2 = this.unsafe;
            if (r2 != null) goto L11;
            return false;
        L11:
            Class<?> r22 = r2.getClass();     // Catch: Throwable -> L8
            r22.getMethod("objectFieldOffset", new Class[]{java.lang.reflect.Field.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L8
            Class r4 = Long.TYPE;     // Catch: Throwable -> L8
            r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L8
            r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L8
            r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            UnsafeUtil.access$000(th);
            return false;
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe r02 = this.unsafe;
            if (r02 != null) goto L13;
            return false;
        L13:
            Class<?> r03 = r02.getClass();     // Catch: Throwable -> L10
            r03.getMethod("objectFieldOffset", new Class[]{java.lang.reflect.Field.class});     // Catch: Throwable -> L10
            r03.getMethod("getLong", new Class[]{Object.class, Long.TYPE});     // Catch: Throwable -> L10
            if (UnsafeUtil.access$100() != null) goto L8;
            return false;
        L8:
            return true;
        L10:
            th = move-exception;
            UnsafeUtil.access$000(th);
            return false;
        }
    }

    static {
        UNSAFE = getUnsafe();
        MEMORY_CLASS = Android.getMemoryClass();
        IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
        IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
        MEMORY_ACCESSOR = getMemoryAccessor();
        HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
        HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();
        long r02 = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = r02;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (r02 & 7);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L5;
        boolean r03 = true;
    L6:
        IS_BIG_ENDIAN = r03;
        return;
    L5:
        r03 = false;
        goto L6
    }

    private UnsafeUtil() {
    }

    public static /* synthetic */ void access$000(Throwable r02) {
        logMissingMethod(r02);
    }

    public static /* synthetic */ java.lang.reflect.Field access$100() {
        return bufferAddressField();
    }

    public static /* synthetic */ byte access$200(Object r02, long r1) {
        return getByteBigEndian(r02, r1);
    }

    public static /* synthetic */ byte access$300(Object r02, long r1) {
        return getByteLittleEndian(r02, r1);
    }

    public static /* synthetic */ void access$400(Object r02, long r1, byte r3) {
        putByteBigEndian(r02, r1, r3);
    }

    public static /* synthetic */ void access$500(Object r02, long r1, byte r3) {
        putByteLittleEndian(r02, r1, r3);
    }

    public static /* synthetic */ boolean access$600(Object r02, long r1) {
        return getBooleanBigEndian(r02, r1);
    }

    public static /* synthetic */ boolean access$700(Object r02, long r1) {
        return getBooleanLittleEndian(r02, r1);
    }

    public static /* synthetic */ void access$800(Object r02, long r1, boolean r3) {
        putBooleanBigEndian(r02, r1, r3);
    }

    public static /* synthetic */ void access$900(Object r02, long r1, boolean r3) {
        putBooleanLittleEndian(r02, r1, r3);
    }

    public static long addressOffset(ByteBuffer r3) {
        return MEMORY_ACCESSOR.getLong(r3, BUFFER_ADDRESS_OFFSET);
    }

    public static <T> T allocateInstance(Class<T> r1) {
        return (T) UNSAFE.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    private static int arrayBaseOffset(Class<?> r1) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS == true) goto L5;
        return -1;
    L5:
        return MEMORY_ACCESSOR.arrayBaseOffset(r1);
    }

    private static int arrayIndexScale(Class<?> r1) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS == true) goto L5;
        return -1;
    L5:
        return MEMORY_ACCESSOR.arrayIndexScale(r1);
    }

    private static java.lang.reflect.Field bufferAddressField() {
        if (Android.isOnAndroidDevice() == false) goto L7;
        java.lang.reflect.Field r02 = field(Buffer.class, "effectiveDirectAddress");
        if (r02 == null) goto L7;
        return r02;
    L7:
        java.lang.reflect.Field r03 = field(Buffer.class, "address");
        if (r03 != null) goto L10;
        return null;
    L10:
        if (r03.getType() != Long.TYPE) goto L14;
        return r03;
    L14:
        return null;
    }

    public static void copyMemory(byte[] r8, long r9, long r11, long r13) {
        MEMORY_ACCESSOR.copyMemory(r8, r9, r11, r13);
    }

    public static boolean determineAndroidSupportByAddressSize(Class<?> r7) {
        if (Android.isOnAndroidDevice() == true) goto L9;
        return false;
    L9:
        Class<?> r1 = MEMORY_CLASS;     // Catch: Throwable -> L8
        Class r4 = Boolean.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("peekLong", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeLong", new Class[]{r7, Long.TYPE, r4});     // Catch: Throwable -> L8
        Class r5 = Integer.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("pokeInt", new Class[]{r7, r5, r4});     // Catch: Throwable -> L8
        r1.getMethod("peekInt", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeByte", new Class[]{r7, Byte.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("peekByte", new Class[]{r7});     // Catch: Throwable -> L8
        r1.getMethod("pokeByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        r1.getMethod("peekByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        return true;
    L8:
        return false;
    }

    private static java.lang.reflect.Field field(Class<?> r02, String r1) {
        return r02.getDeclaredField(r1);
    L4:
        return null;
    }

    private static long fieldOffset(java.lang.reflect.Field r2) {
        if (r2 == null) goto L8;
        MemoryAccessor r02 = MEMORY_ACCESSOR;
        if (r02 != null) goto L7;
        return -1;
    L7:
        return r02.objectFieldOffset(r2);
    L8:
        return -1;
    }

    private static int firstDifferingByteIndexNativeEndian(long r1, long r3) {
        if (IS_BIG_ENDIAN == false) goto L5;
        int r12 = Long.numberOfLeadingZeros(r1 ^ r3);
    L7:
        return r12 >> 3;
    L5:
        r12 = Long.numberOfTrailingZeros(r1 ^ r3);
        goto L7
    }

    public static boolean getBoolean(Object r1, long r2) {
        return MEMORY_ACCESSOR.getBoolean(r1, r2);
    }

    private static boolean getBooleanBigEndian(Object r02, long r1) {
        if (getByteBigEndian(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    private static boolean getBooleanLittleEndian(Object r02, long r1) {
        if (getByteLittleEndian(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static byte getByte(Object r1, long r2) {
        return MEMORY_ACCESSOR.getByte(r1, r2);
    }

    private static byte getByteBigEndian(Object r2, long r3) {
        return (byte) ((getInt(r2, (-4) & r3) >>> ((int) (((~r3) & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    private static byte getByteLittleEndian(Object r2, long r3) {
        return (byte) ((getInt(r2, (-4) & r3) >>> ((int) ((r3 & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    public static double getDouble(Object r1, long r2) {
        return MEMORY_ACCESSOR.getDouble(r1, r2);
    }

    public static float getFloat(Object r1, long r2) {
        return MEMORY_ACCESSOR.getFloat(r1, r2);
    }

    public static int getInt(Object r1, long r2) {
        return MEMORY_ACCESSOR.getInt(r1, r2);
    }

    public static long getLong(Object r1, long r2) {
        return MEMORY_ACCESSOR.getLong(r1, r2);
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe r02 = UNSAFE;
        if (r02 != null) goto L6;
        return null;
    L6:
        if (Android.isOnAndroidDevice() == false) goto L16;
        if (IS_ANDROID_64 == false) goto L12;
        return new Android64MemoryAccessor(r02);
    L12:
        if (IS_ANDROID_32 == true) goto L14;
        return null;
    L14:
        return new Android32MemoryAccessor(r02);
    L16:
        return new JvmMemoryAccessor(r02);
    }

    public static Object getObject(Object r1, long r2) {
        return MEMORY_ACCESSOR.getObject(r1, r2);
    }

    public static Object getStaticObject(java.lang.reflect.Field r1) {
        return MEMORY_ACCESSOR.getStaticObject(r1);
    }

    public static Unsafe getUnsafe() {
        return (Unsafe) AccessController.doPrivileged(new AnonymousClass1());
    L4:
        return null;
    }

    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    public static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    private static void logMissingMethod(Throwable r4) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + r4);
    }

    public static int mismatch(byte[] r10, int r11, byte[] r12, int r13, int r14) {
        if (r11 < 0) goto L34;
        if (r13 < 0) goto L34;
        if (r14 < 0) goto L34;
        if ((r11 + r14) > r10.length) goto L34;
        if ((r13 + r14) > r12.length) goto L34;
        int r1 = 0;
        if (HAS_UNSAFE_ARRAY_OPERATIONS == false) goto L26;
        int r02 = (BYTE_ARRAY_ALIGNMENT + r11) & 7;
    L12:
        if (r1 >= r14) goto L19;
        if ((r02 & 7) == 0) goto L19;
        if (r10[r11 + r1] != r12[r13 + r1]) goto L17;
        r1 = r1 + 1;
        r02 = r02 + 1;
        goto L12
    L17:
        return r1;
    L19:
        int r03 = ((r14 - r1) & (-8)) + r1;
    L20:
        if (r1 >= r03) goto L26;
        long r2 = BYTE_ARRAY_BASE_OFFSET;
        long r6 = r1;
        long r4 = getLong(r10, (r11 + r2) + r6);
        long r22 = getLong(r12, (r2 + r13) + r6);
        if (r4 != r22) goto L24;
        r1 = r1 + 8;
        goto L20
    L24:
        return r1 + firstDifferingByteIndexNativeEndian(r4, r22);
    L26:
        if (r1 >= r14) goto L31;
        if (r10[r11 + r1] != r12[r13 + r1]) goto L29;
        r1 = r1 + 1;
        goto L26
    L29:
        return r1;
    L31:
        return -1;
    L34:
        throw new IndexOutOfBoundsException();
    }

    public static long objectFieldOffset(java.lang.reflect.Field r2) {
        return MEMORY_ACCESSOR.objectFieldOffset(r2);
    }

    public static void putBoolean(Object r1, long r2, boolean r4) {
        MEMORY_ACCESSOR.putBoolean(r1, r2, r4);
    }

    private static void putBooleanBigEndian(Object r02, long r1, boolean r3) {
        putByteBigEndian(r02, r1, r3 ? 1 : 0);
    }

    private static void putBooleanLittleEndian(Object r02, long r1, boolean r3) {
        putByteLittleEndian(r02, r1, r3 ? 1 : 0);
    }

    public static void putByte(Object r1, long r2, byte r4) {
        MEMORY_ACCESSOR.putByte(r1, r2, r4);
    }

    private static void putByteBigEndian(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r2 = getInt(r4, r02);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(Constants.MAX_HOST_LENGTH << r52));
        putInt(r4, r02, ((255 & r7) << r52) | r22);
    }

    private static void putByteLittleEndian(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = getInt(r4, r02) & (~(Constants.MAX_HOST_LENGTH << r52));
        putInt(r4, r02, ((255 & r7) << r52) | r2);
    }

    public static void putDouble(Object r6, long r7, double r9) {
        MEMORY_ACCESSOR.putDouble(r6, r7, r9);
    }

    public static void putFloat(Object r1, long r2, float r4) {
        MEMORY_ACCESSOR.putFloat(r1, r2, r4);
    }

    public static void putInt(Object r1, long r2, int r4) {
        MEMORY_ACCESSOR.putInt(r1, r2, r4);
    }

    public static void putLong(Object r6, long r7, long r9) {
        MEMORY_ACCESSOR.putLong(r6, r7, r9);
    }

    public static void putObject(Object r1, long r2, Object r4) {
        MEMORY_ACCESSOR.putObject(r1, r2, r4);
    }

    private static boolean supportsUnsafeArrayOperations() {
        MemoryAccessor r02 = MEMORY_ACCESSOR;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        MemoryAccessor r02 = MEMORY_ACCESSOR;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.supportsUnsafeByteBufferOperations();
    }

    public static void copyMemory(long r8, byte[] r10, long r11, long r13) {
        MEMORY_ACCESSOR.copyMemory(r8, r10, r11, r13);
    }

    public static boolean getBoolean(boolean[] r5, long r6) {
        return MEMORY_ACCESSOR.getBoolean(r5, BOOLEAN_ARRAY_BASE_OFFSET + (r6 * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    public static byte getByte(byte[] r3, long r4) {
        return MEMORY_ACCESSOR.getByte(r3, BYTE_ARRAY_BASE_OFFSET + r4);
    }

    public static double getDouble(double[] r5, long r6) {
        return MEMORY_ACCESSOR.getDouble(r5, DOUBLE_ARRAY_BASE_OFFSET + (r6 * DOUBLE_ARRAY_INDEX_SCALE));
    }

    public static float getFloat(float[] r5, long r6) {
        return MEMORY_ACCESSOR.getFloat(r5, FLOAT_ARRAY_BASE_OFFSET + (r6 * FLOAT_ARRAY_INDEX_SCALE));
    }

    public static int getInt(int[] r5, long r6) {
        return MEMORY_ACCESSOR.getInt(r5, INT_ARRAY_BASE_OFFSET + (r6 * INT_ARRAY_INDEX_SCALE));
    }

    public static long getLong(long[] r5, long r6) {
        return MEMORY_ACCESSOR.getLong(r5, LONG_ARRAY_BASE_OFFSET + (r6 * LONG_ARRAY_INDEX_SCALE));
    }

    public static Object getObject(Object[] r5, long r6) {
        return MEMORY_ACCESSOR.getObject(r5, OBJECT_ARRAY_BASE_OFFSET + (r6 * OBJECT_ARRAY_INDEX_SCALE));
    }

    public static void putBoolean(boolean[] r5, long r6, boolean r8) {
        MEMORY_ACCESSOR.putBoolean(r5, BOOLEAN_ARRAY_BASE_OFFSET + (r6 * BOOLEAN_ARRAY_INDEX_SCALE), r8);
    }

    public static void putByte(byte[] r3, long r4, byte r6) {
        MEMORY_ACCESSOR.putByte(r3, BYTE_ARRAY_BASE_OFFSET + r4, r6);
    }

    public static void putDouble(double[] r6, long r7, double r9) {
        MEMORY_ACCESSOR.putDouble(r6, DOUBLE_ARRAY_BASE_OFFSET + (r7 * DOUBLE_ARRAY_INDEX_SCALE), r9);
    }

    public static void putFloat(float[] r5, long r6, float r8) {
        MEMORY_ACCESSOR.putFloat(r5, FLOAT_ARRAY_BASE_OFFSET + (r6 * FLOAT_ARRAY_INDEX_SCALE), r8);
    }

    public static void putInt(int[] r5, long r6, int r8) {
        MEMORY_ACCESSOR.putInt(r5, INT_ARRAY_BASE_OFFSET + (r6 * INT_ARRAY_INDEX_SCALE), r8);
    }

    public static void putLong(long[] r6, long r7, long r9) {
        MEMORY_ACCESSOR.putLong(r6, LONG_ARRAY_BASE_OFFSET + (r7 * LONG_ARRAY_INDEX_SCALE), r9);
    }

    public static void putObject(Object[] r5, long r6, Object r8) {
        MEMORY_ACCESSOR.putObject(r5, OBJECT_ARRAY_BASE_OFFSET + (r6 * OBJECT_ARRAY_INDEX_SCALE), r8);
    }

    public static void copyMemory(byte[] r02, long r1, byte[] r3, long r4, long r6) {
        System.arraycopy(r02, (int) r1, r3, (int) r4, (int) r6);
    }

    public static byte getByte(long r1) {
        return MEMORY_ACCESSOR.getByte(r1);
    }

    public static int getInt(long r1) {
        return MEMORY_ACCESSOR.getInt(r1);
    }

    public static long getLong(long r1) {
        return MEMORY_ACCESSOR.getLong(r1);
    }

    public static void putByte(long r1, byte r3) {
        MEMORY_ACCESSOR.putByte(r1, r3);
    }

    public static void putInt(long r1, int r3) {
        MEMORY_ACCESSOR.putInt(r1, r3);
    }

    public static void putLong(long r1, long r3) {
        MEMORY_ACCESSOR.putLong(r1, r3);
    }
}
