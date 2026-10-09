package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes6.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    static final Charset ISO_8859_1 = null;
    static final Charset US_ASCII = null;
    static final Charset UTF_8 = null;

    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean r1);

        boolean getBoolean(int r1);

        @Override // 
        ProtobufList<Boolean> mutableCopyWithCapacity(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default ProtobufList<Boolean> mutableCopyWithCapacity2(int r1) {
            return mutableCopyWithCapacity(r1);
        }

        @CanIgnoreReturnValue
        boolean setBoolean(int r1, boolean r2);
    }

    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double r1);

        double getDouble(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Double> mutableCopyWithCapacity(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default ProtobufList<Double> mutableCopyWithCapacity2(int r1) {
            return mutableCopyWithCapacity(r1);
        }

        @CanIgnoreReturnValue
        double setDouble(int r1, double r2);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int r1);
    }

    public interface EnumVerifier {
        boolean isInRange(int r1);
    }

    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float r1);

        float getFloat(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Float> mutableCopyWithCapacity(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default ProtobufList<Float> mutableCopyWithCapacity2(int r1) {
            return mutableCopyWithCapacity(r1);
        }

        @CanIgnoreReturnValue
        float setFloat(int r1, float r2);
    }

    public interface IntList extends ProtobufList<Integer> {
        void addInt(int r1);

        int getInt(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Integer> mutableCopyWithCapacity(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default ProtobufList<Integer> mutableCopyWithCapacity2(int r1) {
            return mutableCopyWithCapacity(r1);
        }

        @CanIgnoreReturnValue
        int setInt(int r1, int r2);
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        public interface Converter<F, T> {
            T convert(F r1);
        }

        public ListAdapter(List<F> r1, Converter<F, T> r2) {
            this.fromList = r1;
            this.converter = r2;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r3) {
            return (T) this.converter.convert(this.fromList.get(r3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public interface LongList extends ProtobufList<Long> {
        void addLong(long r1);

        long getLong(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        ProtobufList<Long> mutableCopyWithCapacity(int r1);

        @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ default ProtobufList<Long> mutableCopyWithCapacity2(int r1) {
            return mutableCopyWithCapacity(r1);
        }

        @CanIgnoreReturnValue
        long setLong(int r1, long r2);
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        public interface Converter<A, B> {
            A doBackward(B r1);

            B doForward(A r1);
        }

        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;
            final /* synthetic */ MapAdapter this$0;

            public EntryAdapter(MapAdapter r1, Map.Entry<K, RealValue> r2) {
                this.this$0 = r1;
                this.realEntry = r2;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object r4) {
                if (r4 != this) goto L6;
                return true;
            L6:
                if ((r4 instanceof Map.Entry) == true) goto L9;
                return false;
            L9:
                if (getKey().equals(((Map.Entry) r4).getKey()) == true) goto L11;
            L13:
                return false;
            L11:
                if (getValue().equals(getValue()) == false) goto L13;
                return true;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.access$000(this.this$0).doForward(this.realEntry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V r3) {
                Object r32 = this.realEntry.setValue(MapAdapter.access$000(this.this$0).doBackward(r3));
                if (r32 != null) goto L7;
                return null;
            L7:
                return (V) MapAdapter.access$000(this.this$0).doForward(r32);
            }
        }

        public class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;
            final /* synthetic */ MapAdapter this$0;

            public IteratorAdapter(MapAdapter r1, Iterator<Map.Entry<K, RealValue>> r2) {
                this.this$0 = r1;
                this.realIterator = r2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
                return next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.this$0, this.realIterator.next());
            }
        }

        public class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;
            final /* synthetic */ MapAdapter this$0;

            public SetAdapter(MapAdapter r1, Set<Map.Entry<K, RealValue>> r2) {
                this.this$0 = r1;
                this.realSet = r2;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.this$0, this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        public MapAdapter(Map<K, RealValue> r1, Converter<RealValue, V> r2) {
            this.realMap = r1;
            this.valueConverter = r2;
        }

        public static /* synthetic */ Converter access$000(MapAdapter r02) {
            return r02.valueConverter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> r1, final T r2) {
            return (Converter<Integer, T>) new AnonymousClass1(r1, r2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this, this.realMap.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object r2) {
            RealValue r22 = this.realMap.get(r2);
            if (r22 != null) goto L7;
            return null;
        L7:
            return this.valueConverter.doForward(r22);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K r3, V r4) {
            Object r32 = this.realMap.put(r3, this.valueConverter.doBackward(r4));
            if (r32 != null) goto L7;
            return null;
        L7:
            return (V) this.valueConverter.doForward(r32);
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int r1);
    }

    static {
        US_ASCII = Charset.forName("US-ASCII");
        UTF_8 = Charset.forName("UTF-8");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        byte[] r02 = new byte[0];
        EMPTY_BYTE_ARRAY = r02;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(r02);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(r02);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String r1) {
        return r1.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String r02) {
        return ByteBuffer.wrap(byteArrayDefaultValue(r02));
    }

    public static ByteString bytesDefaultValue(String r1) {
        return ByteString.copyFrom(r1.getBytes(ISO_8859_1));
    }

    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer r1) {
        ByteBuffer r12 = r1.duplicate();
        r12.clear();
        ByteBuffer r02 = ByteBuffer.allocate(r12.capacity());
        r02.put(r12);
        r02.clear();
        return r02;
    }

    public static boolean equals(List<byte[]> r4, List<byte[]> r5) {
        if (r4.size() == r5.size()) goto L5;
        return false;
    L5:
        int r02 = 0;
    L7:
        if (r02 >= r4.size()) goto L12;
        if (Arrays.equals(r4.get(r02), r5.get(r02)) == false) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer r2, ByteBuffer r3) {
        if (r2.capacity() == r3.capacity()) goto L6;
        return false;
    L6:
        ByteBuffer r22 = r2.duplicate();
        Java8Compatibility.clear(r22);
        ByteBuffer r32 = r3.duplicate();
        Java8Compatibility.clear(r32);
        return r22.equals(r32);
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> r4) {
        java.lang.reflect.Method r02 = r4.getMethod("getDefaultInstance", null);     // Catch: Exception -> L4
        return (T) r02.invoke(r02, null);
    L4:
        e = move-exception;
        throw new RuntimeException("Failed to get default instance for " + r4, e);
    }

    public static int hashBoolean(boolean r02) {
        if (r02 == false) goto L5;
        return 1231;
    L5:
        return 1237;
    }

    public static int hashCode(List<byte[]> r2) {
        Iterator<byte[]> r22 = r2.iterator();
        int r02 = 1;
    L4:
        if (r22.hasNext() == false) goto L6;
        r02 = (r02 * 31) + hashCode(r22.next());
        goto L4
    L6:
        return r02;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> r2) {
        Iterator<ByteBuffer> r22 = r2.iterator();
        int r02 = 1;
    L4:
        if (r22.hasNext() == false) goto L6;
        r02 = (r02 * 31) + hashCodeByteBuffer(r22.next());
        goto L4
    L6:
        return r02;
    }

    public static int hashEnum(EnumLite r02) {
        return r02.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> r2) {
        Iterator<? extends EnumLite> r22 = r2.iterator();
        int r02 = 1;
    L4:
        if (r22.hasNext() == false) goto L6;
        r02 = (r02 * 31) + hashEnum(r22.next());
        goto L4
    L6:
        return r02;
    }

    public static int hashLong(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    public static boolean isValidUtf8(ByteString r02) {
        return r02.isValidUtf8();
    }

    public static Object mergeMessage(Object r02, Object r1) {
        return ((MessageLite) r02).toBuilder().mergeFrom((MessageLite) r1).buildPartial();
    }

    public static int partialHash(int r2, byte[] r3, int r4, int r5) {
        int r02 = r4;
    L4:
        if (r02 >= (r4 + r5)) goto L6;
        r2 = (r2 * 31) + r3[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    public static String stringDefaultValue(String r2) {
        return new String(r2.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String r1) {
        return r1.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] r2) {
        return new String(r2, UTF_8);
    }

    public static <T> T checkNotNull(T r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1);
    }

    public static boolean isValidUtf8(byte[] r02) {
        return Utf8.isValidUtf8(r02);
    }

    public static int hashCode(byte[] r2) {
        return hashCode(r2, 0, r2.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer r6) {
        if (r6.hasArray() == false) goto L8;
        int r62 = partialHash(r6.capacity(), r6.array(), r6.arrayOffset(), r6.capacity());
        if (r62 != 0) goto L7;
        return 1;
    L7:
        return r62;
    L8:
        int r2 = 4096;
        if (r6.capacity() > 4096) goto L12;
        r2 = r6.capacity();
    L12:
        byte[] r02 = new byte[r2];
        ByteBuffer r3 = r6.duplicate();
        Java8Compatibility.clear(r3);
        int r63 = r6.capacity();
    L14:
        if (r3.remaining() <= 0) goto L20;
        if (r3.remaining() > r2) goto L18;
        int r4 = r3.remaining();
    L19:
        r3.get(r02, 0, r4);
        r63 = partialHash(r63, r02, 0, r4);
        goto L14
    L18:
        r4 = r2;
        goto L19
    L20:
        if (r63 != 0) goto L22;
        return 1;
    L22:
        return r63;
    }

    public static int hashCode(byte[] r02, int r1, int r2) {
        int r03 = partialHash(r2, r02, r1, r2);
        if (r03 != 0) goto L6;
        return 1;
    L6:
        return r03;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> r4, List<ByteBuffer> r5) {
        if (r4.size() == r5.size()) goto L5;
        return false;
    L5:
        int r02 = 0;
    L7:
        if (r02 >= r4.size()) goto L12;
        if (equalsByteBuffer(r4.get(r02), r5.get(r02)) == false) goto L10;
        r02 = r02 + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }
}
