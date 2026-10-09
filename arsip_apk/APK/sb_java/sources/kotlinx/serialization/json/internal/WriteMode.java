package kotlinx.serialization.json.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\bB\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0084\b¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0084\b¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "begin", "", "end", "<init>", "(Ljava/lang/String;ICC)V", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum WriteMode extends Enum<WriteMode> {
    public static final WriteMode LIST = null;
    public static final WriteMode MAP = null;
    public static final WriteMode OBJ = null;
    public static final WriteMode POLY_OBJ = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WriteMode[] f180846a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f180847b = null;
    public final char begin;
    public final char end;

    static {
        OBJ = new WriteMode("OBJ", 0, '{', '}');
        LIST = new WriteMode("LIST", 1, '[', ']');
        MAP = new WriteMode("MAP", 2, '{', '}');
        POLY_OBJ = new WriteMode("POLY_OBJ", 3, '[', ']');
        WriteMode[] r02 = a();
        f180846a = r02;
        f180847b = kotlin.enums.b.a(r02);
    }

    WriteMode(String r1, int r2, char r3, char r4) {
        this.begin = r3;
        this.end = r4;
    }

    public static final /* synthetic */ WriteMode[] a() {
        return new WriteMode[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    public static kotlin.enums.a getEntries() {
        return f180847b;
    }

    public static WriteMode valueOf(String r1) {
        return (WriteMode) Enum.valueOf(WriteMode.class, r1);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f180846a.clone();
    }
}
