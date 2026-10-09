package com.stockbit.stream.ui.delete;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/stream/ui/delete/StreamDeletePickerType;", "", "<init>", "(Ljava/lang/String;I)V", "DELETE_TYPE", "DELETE_REASON", "DELETE_DURATION", "stream_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum StreamDeletePickerType extends Enum<StreamDeletePickerType> {
    public static final StreamDeletePickerType DELETE_DURATION = null;
    public static final StreamDeletePickerType DELETE_REASON = null;
    public static final StreamDeletePickerType DELETE_TYPE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamDeletePickerType[] f142711a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f142712b = null;

    static {
        DELETE_TYPE = new StreamDeletePickerType("DELETE_TYPE", 0);
        DELETE_REASON = new StreamDeletePickerType("DELETE_REASON", 1);
        DELETE_DURATION = new StreamDeletePickerType("DELETE_DURATION", 2);
        StreamDeletePickerType[] r02 = a();
        f142711a = r02;
        f142712b = kotlin.enums.b.a(r02);
    }

    StreamDeletePickerType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamDeletePickerType[] a() {
        return new StreamDeletePickerType[]{DELETE_TYPE, DELETE_REASON, DELETE_DURATION};
    }

    public static kotlin.enums.a getEntries() {
        return f142712b;
    }

    public static StreamDeletePickerType valueOf(String r1) {
        return (StreamDeletePickerType) Enum.valueOf(StreamDeletePickerType.class, r1);
    }

    public static StreamDeletePickerType[] values() {
        return (StreamDeletePickerType[]) f142711a.clone();
    }
}
