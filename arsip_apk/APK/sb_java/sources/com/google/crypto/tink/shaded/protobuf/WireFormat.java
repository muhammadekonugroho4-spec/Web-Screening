package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = 0;
    static final int MESSAGE_SET_ITEM_TAG = 0;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = 0;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = 0;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
            int[] r02 = new int[FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = r02;
            r02[FieldType.DOUBLE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L22
        L62:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FLOAT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L23
        L46:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT64.ordinal()] = 3;     // Catch: NoSuchFieldError -> L24
        L58:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT64.ordinal()] = 4;     // Catch: NoSuchFieldError -> L25
        L64:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.INT32.ordinal()] = 5;     // Catch: NoSuchFieldError -> L26
        L48:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED64.ordinal()] = 6;     // Catch: NoSuchFieldError -> L27
        L52:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.FIXED32.ordinal()] = 7;     // Catch: NoSuchFieldError -> L28
        L74:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BOOL.ordinal()] = 8;     // Catch: NoSuchFieldError -> L29
        L42:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.BYTES.ordinal()] = 9;     // Catch: NoSuchFieldError -> L30
        L68:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.UINT32.ordinal()] = 10;     // Catch: NoSuchFieldError -> L31
        L70:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED32.ordinal()] = 11;     // Catch: NoSuchFieldError -> L32
        L54:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SFIXED64.ordinal()] = 12;     // Catch: NoSuchFieldError -> L33
        L60:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT32.ordinal()] = 13;     // Catch: NoSuchFieldError -> L34
        L44:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.SINT64.ordinal()] = 14;     // Catch: NoSuchFieldError -> L35
        L50:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.STRING.ordinal()] = 15;     // Catch: NoSuchFieldError -> L36
        L72:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.GROUP.ordinal()] = 16;     // Catch: NoSuchFieldError -> L37
        L40:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.MESSAGE.ordinal()] = 17;     // Catch: NoSuchFieldError -> L38
        L66:
            $SwitchMap$com$google$protobuf$WireFormat$FieldType[FieldType.ENUM.ordinal()] = 18;     // Catch: NoSuchFieldError -> L39
            return;
        }
    }

    public enum FieldType extends java.lang.Enum<FieldType> {
        private static final /* synthetic */ FieldType[] $VALUES = null;
        public static final FieldType BOOL = null;
        public static final FieldType BYTES = null;
        public static final FieldType DOUBLE = null;
        public static final FieldType ENUM = null;
        public static final FieldType FIXED32 = null;
        public static final FieldType FIXED64 = null;
        public static final FieldType FLOAT = null;
        public static final FieldType GROUP = null;
        public static final FieldType INT32 = null;
        public static final FieldType INT64 = null;
        public static final FieldType MESSAGE = null;
        public static final FieldType SFIXED32 = null;
        public static final FieldType SFIXED64 = null;
        public static final FieldType SINT32 = null;
        public static final FieldType SINT64 = null;
        public static final FieldType STRING = null;
        public static final FieldType UINT32 = null;
        public static final FieldType UINT64 = null;
        private final JavaType javaType;
        private final int wireType;

        static {
            FieldType r02 = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            DOUBLE = r02;
            FieldType r1 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            FLOAT = r1;
            JavaType r5 = JavaType.LONG;
            final int r8 = 2;
            FieldType r2 = new FieldType("INT64", 2, r5, 0);
            INT64 = r2;
            final int r10 = 3;
            FieldType r7 = new FieldType("UINT64", 3, r5, 0);
            UINT64 = r7;
            JavaType r11 = JavaType.INT;
            FieldType r9 = new FieldType("INT32", 4, r11, 0);
            INT32 = r9;
            FieldType r12 = new FieldType("FIXED64", 5, r5, 1);
            FIXED64 = r12;
            FieldType r14 = new FieldType("FIXED32", 6, r11, 5);
            FIXED32 = r14;
            FieldType r15 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            BOOL = r15;
            final int r6 = 8;
            final JavaType r13 = JavaType.STRING;
            final String r3 = "STRING";
            FieldType r4 = new AnonymousClass1(r3, r6, r13, r8);
            STRING = r4;
            final JavaType r132 = JavaType.MESSAGE;
            final String r62 = "GROUP";
            final int r82 = 9;
            FieldType r32 = new AnonymousClass2(r62, r82, r132, r10);
            GROUP = r32;
            final String r83 = "MESSAGE";
            final int r102 = 10;
            final int r03 = 2;
            FieldType r63 = new AnonymousClass3(r83, r102, r132, r03);
            MESSAGE = r63;
            final int r133 = 11;
            final JavaType r103 = JavaType.BYTE_STRING;
            final String r16 = "BYTES";
            FieldType r84 = new AnonymousClass4(r16, r133, r103, r03);
            BYTES = r84;
            FieldType r04 = new FieldType("UINT32", 12, r11, 0);
            UINT32 = r04;
            FieldType r17 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            ENUM = r17;
            FieldType r05 = new FieldType("SFIXED32", 14, r11, 5);
            SFIXED32 = r05;
            FieldType r22 = new FieldType("SFIXED64", 15, r5, 1);
            SFIXED64 = r22;
            FieldType r06 = new FieldType("SINT32", 16, r11, 0);
            SINT32 = r06;
            FieldType r104 = new FieldType("SINT64", 17, r5, 0);
            SINT64 = r104;
            $VALUES = new FieldType[]{r02, r1, r2, r7, r9, r12, r14, r15, r4, r32, r63, r84, r04, r17, r05, r22, r06, r104};
        }

        /* synthetic */ FieldType(String r1, int r2, JavaType r3, int r4, AnonymousClass1 r5) {
            this(r1, r2, r3, r4);
        }

        public static FieldType valueOf(String r1) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, r1);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        FieldType(String r1, int r2, JavaType r3, int r4) {
            this.javaType = r3;
            this.wireType = r4;
        }
    }

    public enum JavaType extends java.lang.Enum<JavaType> {
        private static final /* synthetic */ JavaType[] $VALUES = null;
        public static final JavaType BOOLEAN = null;
        public static final JavaType BYTE_STRING = null;
        public static final JavaType DOUBLE = null;
        public static final JavaType ENUM = null;
        public static final JavaType FLOAT = null;
        public static final JavaType INT = null;
        public static final JavaType LONG = null;
        public static final JavaType MESSAGE = null;
        public static final JavaType STRING = null;
        private final Object defaultDefault;

        static {
            JavaType r02 = new JavaType("INT", 0, 0);
            INT = r02;
            JavaType r1 = new JavaType("LONG", 1, 0L);
            LONG = r1;
            JavaType r2 = new JavaType("FLOAT", 2, Float.valueOf(0.0f));
            FLOAT = r2;
            JavaType r3 = new JavaType("DOUBLE", 3, Double.valueOf(0.0d));
            DOUBLE = r3;
            JavaType r4 = new JavaType("BOOLEAN", 4, Boolean.FALSE);
            BOOLEAN = r4;
            JavaType r5 = new JavaType("STRING", 5, "");
            STRING = r5;
            JavaType r6 = new JavaType("BYTE_STRING", 6, ByteString.EMPTY);
            BYTE_STRING = r6;
            JavaType r7 = new JavaType("ENUM", 7, null);
            ENUM = r7;
            JavaType r8 = new JavaType("MESSAGE", 8, null);
            MESSAGE = r8;
            $VALUES = new JavaType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
        }

        JavaType(String r1, int r2, Object r3) {
            this.defaultDefault = r3;
        }

        public static JavaType valueOf(String r1) {
            return (JavaType) java.lang.Enum.valueOf(JavaType.class, r1);
        }

        public static JavaType[] values() {
            return (JavaType[]) $VALUES.clone();
        }

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public enum Utf8Validation extends java.lang.Enum<Utf8Validation> {
        private static final /* synthetic */ Utf8Validation[] $VALUES = null;
        public static final Utf8Validation LAZY = null;
        public static final Utf8Validation LOOSE = null;
        public static final Utf8Validation STRICT = null;

        static {
            final String r1 = "LOOSE";
            final int r2 = 0;
            Utf8Validation r02 = new AnonymousClass1(r1, r2);
            LOOSE = r02;
            final String r3 = "STRICT";
            final int r4 = 1;
            Utf8Validation r12 = new AnonymousClass2(r3, r4);
            STRICT = r12;
            final String r5 = "LAZY";
            final int r6 = 2;
            Utf8Validation r32 = new AnonymousClass3(r5, r6);
            LAZY = r32;
            $VALUES = new Utf8Validation[]{r02, r12, r32};
        }

        Utf8Validation(String r1, int r2) {
        }

        public static Utf8Validation valueOf(String r1) {
            return (Utf8Validation) java.lang.Enum.valueOf(Utf8Validation.class, r1);
        }

        public static Utf8Validation[] values() {
            return (Utf8Validation[]) $VALUES.clone();
        }

        public abstract Object readString(CodedInputStream r1) throws IOException;

        /* synthetic */ Utf8Validation(String r1, int r2, AnonymousClass1 r3) {
            this(r1, r2);
        }
    }

    static {
        MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
        MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
        MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
        MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);
    }

    private WireFormat() {
    }

    public static int getTagFieldNumber(int r02) {
        return r02 >>> 3;
    }

    public static int getTagWireType(int r02) {
        return r02 & 7;
    }

    public static int makeTag(int r02, int r1) {
        return (r02 << 3) | r1;
    }

    public static Object readPrimitiveField(CodedInputStream r1, FieldType r2, Utf8Validation r3) throws IOException {
        switch(AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[r2.ordinal()]) {
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L33;
            case 6: goto L31;
            case 7: goto L29;
            case 8: goto L27;
            case 9: goto L25;
            case 10: goto L23;
            case 11: goto L21;
            case 12: goto L19;
            case 13: goto L17;
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            case 17: goto L9;
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    L7:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
    L9:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
    L11:
        throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
    L13:
        return r3.readString(r1);
    L15:
        return Long.valueOf(r1.readSInt64());
    L17:
        return Integer.valueOf(r1.readSInt32());
    L19:
        return Long.valueOf(r1.readSFixed64());
    L21:
        return Integer.valueOf(r1.readSFixed32());
    L23:
        return Integer.valueOf(r1.readUInt32());
    L25:
        return r1.readBytes();
    L27:
        return Boolean.valueOf(r1.readBool());
    L29:
        return Integer.valueOf(r1.readFixed32());
    L31:
        return Long.valueOf(r1.readFixed64());
    L33:
        return Integer.valueOf(r1.readInt32());
    L35:
        return Long.valueOf(r1.readUInt64());
    L37:
        return Long.valueOf(r1.readInt64());
    L39:
        return Float.valueOf(r1.readFloat());
    L41:
        return Double.valueOf(r1.readDouble());
    }
}
