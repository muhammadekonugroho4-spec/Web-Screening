package com.stockbit.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/model/type/stream/StreamSubResponseType;", "", "<init>", "(Ljava/lang/String;I)V", "REPORT", "DEFAULT", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum StreamSubResponseType extends Enum<StreamSubResponseType> {
    public static final StreamSubResponseType DEFAULT = null;
    public static final StreamSubResponseType REPORT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamSubResponseType[] f122247a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122248b = null;

    static {
        REPORT = new StreamSubResponseType("REPORT", 0);
        DEFAULT = new StreamSubResponseType("DEFAULT", 1);
        StreamSubResponseType[] r02 = a();
        f122247a = r02;
        f122248b = b.a(r02);
    }

    StreamSubResponseType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamSubResponseType[] a() {
        return new StreamSubResponseType[]{REPORT, DEFAULT};
    }

    public static a getEntries() {
        return f122248b;
    }

    public static StreamSubResponseType valueOf(String r1) {
        return (StreamSubResponseType) Enum.valueOf(StreamSubResponseType.class, r1);
    }

    public static StreamSubResponseType[] values() {
        return (StreamSubResponseType[]) f122247a.clone();
    }
}
