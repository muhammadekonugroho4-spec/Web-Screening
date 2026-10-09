package androidx.navigation.serialization;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/navigation/serialization/InternalType;", "", "<init>", "(Ljava/lang/String;I)V", "INT", "INT_NULLABLE", "BOOL", "BOOL_NULLABLE", "DOUBLE", "DOUBLE_NULLABLE", "FLOAT", "FLOAT_NULLABLE", "LONG", "LONG_NULLABLE", "STRING", "STRING_NULLABLE", "INT_ARRAY", "BOOL_ARRAY", "DOUBLE_ARRAY", "FLOAT_ARRAY", "LONG_ARRAY", "ARRAY", "LIST", "ENUM", "ENUM_NULLABLE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
enum InternalType extends Enum<InternalType> {
    public static final InternalType ARRAY = null;
    public static final InternalType BOOL = null;
    public static final InternalType BOOL_ARRAY = null;
    public static final InternalType BOOL_NULLABLE = null;
    public static final InternalType DOUBLE = null;
    public static final InternalType DOUBLE_ARRAY = null;
    public static final InternalType DOUBLE_NULLABLE = null;
    public static final InternalType ENUM = null;
    public static final InternalType ENUM_NULLABLE = null;
    public static final InternalType FLOAT = null;
    public static final InternalType FLOAT_ARRAY = null;
    public static final InternalType FLOAT_NULLABLE = null;
    public static final InternalType INT = null;
    public static final InternalType INT_ARRAY = null;
    public static final InternalType INT_NULLABLE = null;
    public static final InternalType LIST = null;
    public static final InternalType LONG = null;
    public static final InternalType LONG_ARRAY = null;
    public static final InternalType LONG_NULLABLE = null;
    public static final InternalType STRING = null;
    public static final InternalType STRING_NULLABLE = null;
    public static final InternalType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InternalType[] f26416a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f26417b = null;

    static {
        INT = new InternalType("INT", 0);
        INT_NULLABLE = new InternalType("INT_NULLABLE", 1);
        BOOL = new InternalType("BOOL", 2);
        BOOL_NULLABLE = new InternalType("BOOL_NULLABLE", 3);
        DOUBLE = new InternalType("DOUBLE", 4);
        DOUBLE_NULLABLE = new InternalType("DOUBLE_NULLABLE", 5);
        FLOAT = new InternalType("FLOAT", 6);
        FLOAT_NULLABLE = new InternalType("FLOAT_NULLABLE", 7);
        LONG = new InternalType("LONG", 8);
        LONG_NULLABLE = new InternalType("LONG_NULLABLE", 9);
        STRING = new InternalType("STRING", 10);
        STRING_NULLABLE = new InternalType("STRING_NULLABLE", 11);
        INT_ARRAY = new InternalType("INT_ARRAY", 12);
        BOOL_ARRAY = new InternalType("BOOL_ARRAY", 13);
        DOUBLE_ARRAY = new InternalType("DOUBLE_ARRAY", 14);
        FLOAT_ARRAY = new InternalType("FLOAT_ARRAY", 15);
        LONG_ARRAY = new InternalType("LONG_ARRAY", 16);
        ARRAY = new InternalType("ARRAY", 17);
        LIST = new InternalType("LIST", 18);
        ENUM = new InternalType("ENUM", 19);
        ENUM_NULLABLE = new InternalType("ENUM_NULLABLE", 20);
        UNKNOWN = new InternalType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 21);
        InternalType[] r02 = a();
        f26416a = r02;
        f26417b = kotlin.enums.b.a(r02);
    }

    InternalType(String r1, int r2) {
    }

    public static final /* synthetic */ InternalType[] a() {
        return new InternalType[]{INT, INT_NULLABLE, BOOL, BOOL_NULLABLE, DOUBLE, DOUBLE_NULLABLE, FLOAT, FLOAT_NULLABLE, LONG, LONG_NULLABLE, STRING, STRING_NULLABLE, INT_ARRAY, BOOL_ARRAY, DOUBLE_ARRAY, FLOAT_ARRAY, LONG_ARRAY, ARRAY, LIST, ENUM, ENUM_NULLABLE, UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f26417b;
    }

    public static InternalType valueOf(String r1) {
        return (InternalType) Enum.valueOf(InternalType.class, r1);
    }

    public static InternalType[] values() {
        return (InternalType[]) f26416a.clone();
    }
}
