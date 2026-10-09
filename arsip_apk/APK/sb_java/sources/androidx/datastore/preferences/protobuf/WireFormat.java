package androidx.datastore.preferences.protobuf;

/* loaded from: classes4.dex */
public abstract class WireFormat {

    /* renamed from: a, reason: collision with root package name */
    public static final int f23773a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f23774b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f23775c = 0;
    public static final int d = 0;

    public enum FieldType extends Enum<FieldType> {
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

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ FieldType[] f23776a = null;
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
            f23776a = new FieldType[]{r02, r1, r2, r7, r9, r12, r14, r15, r4, r32, r63, r84, r04, r17, r05, r22, r06, r104};
        }

        /* synthetic */ FieldType(String r1, int r2, JavaType r3, int r4, a r5) {
            this(r1, r2, r3, r4);
        }

        public static FieldType valueOf(String r1) {
            return (FieldType) Enum.valueOf(FieldType.class, r1);
        }

        public static FieldType[] values() {
            return (FieldType[]) f23776a.clone();
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

    public enum JavaType extends Enum<JavaType> {
        public static final JavaType BOOLEAN = null;
        public static final JavaType BYTE_STRING = null;
        public static final JavaType DOUBLE = null;
        public static final JavaType ENUM = null;
        public static final JavaType FLOAT = null;
        public static final JavaType INT = null;
        public static final JavaType LONG = null;
        public static final JavaType MESSAGE = null;
        public static final JavaType STRING = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ JavaType[] f23777a = null;
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
            JavaType r6 = new JavaType("BYTE_STRING", 6, ByteString.f23710a);
            BYTE_STRING = r6;
            JavaType r7 = new JavaType("ENUM", 7, null);
            ENUM = r7;
            JavaType r8 = new JavaType("MESSAGE", 8, null);
            MESSAGE = r8;
            f23777a = new JavaType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
        }

        JavaType(String r1, int r2, Object r3) {
            this.defaultDefault = r3;
        }

        public static JavaType valueOf(String r1) {
            return (JavaType) Enum.valueOf(JavaType.class, r1);
        }

        public static JavaType[] values() {
            return (JavaType[]) f23777a.clone();
        }
    }

    public static /* synthetic */ class a {
    }

    static {
        f23773a = c(1, 3);
        f23774b = c(1, 4);
        f23775c = c(2, 0);
        d = c(3, 2);
    }

    public static int a(int r02) {
        return r02 >>> 3;
    }

    public static int b(int r02) {
        return r02 & 7;
    }

    public static int c(int r02, int r1) {
        return (r02 << 3) | r1;
    }
}
