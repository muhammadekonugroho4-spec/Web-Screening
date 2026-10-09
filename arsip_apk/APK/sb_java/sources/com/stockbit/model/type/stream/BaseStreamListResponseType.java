package com.stockbit.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/model/type/stream/BaseStreamListResponseType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HEADER", "STREAM", "ADVERT_BIBIT", "SUGGESTED_PEOPLE", "ADVERT_SECURITIES", "UNBOXING", "RESEARCH", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum BaseStreamListResponseType extends Enum<BaseStreamListResponseType> {
    public static final BaseStreamListResponseType ADVERT_BIBIT = null;
    public static final BaseStreamListResponseType ADVERT_SECURITIES = null;
    public static final a Companion = null;
    public static final BaseStreamListResponseType HEADER = null;
    public static final BaseStreamListResponseType RESEARCH = null;
    public static final BaseStreamListResponseType STREAM = null;
    public static final BaseStreamListResponseType SUGGESTED_PEOPLE = null;
    public static final BaseStreamListResponseType UNBOXING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BaseStreamListResponseType[] f122241a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122242b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final String a(BaseStreamListResponseType r5) {
            p.l(r5, "type");
            BaseStreamListResponseType[] r02 = BaseStreamListResponseType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BaseStreamListResponseType r3 = r02[r2];
            if (r3 == r5) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L15;
            String r52 = r3.getValue();
            if (r52 == null) goto L15;
            return r52;
        L15:
            return BaseStreamListResponseType.STREAM.getValue();
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        HEADER = new BaseStreamListResponseType("HEADER", 0, "STREAM_HEADER_SECTION");
        STREAM = new BaseStreamListResponseType("STREAM", 1, "STREAM_MAIN_SECTION");
        ADVERT_BIBIT = new BaseStreamListResponseType("ADVERT_BIBIT", 2, "STREAM_ADS_BIBIT_SECTION");
        SUGGESTED_PEOPLE = new BaseStreamListResponseType("SUGGESTED_PEOPLE", 3, "STREAM_SUGGESTED_SECTION");
        ADVERT_SECURITIES = new BaseStreamListResponseType("ADVERT_SECURITIES", 4, "STREAM_ADS_SECURITIES_SECTION");
        UNBOXING = new BaseStreamListResponseType("UNBOXING", 5, "STREAM_UNBOXING_SECTION");
        RESEARCH = new BaseStreamListResponseType("RESEARCH", 6, "STREAM_RESEARCH_SECTION");
        BaseStreamListResponseType[] r02 = a();
        f122241a = r02;
        f122242b = b.a(r02);
        Companion = new a(null);
    }

    BaseStreamListResponseType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BaseStreamListResponseType[] a() {
        return new BaseStreamListResponseType[]{HEADER, STREAM, ADVERT_BIBIT, SUGGESTED_PEOPLE, ADVERT_SECURITIES, UNBOXING, RESEARCH};
    }

    public static kotlin.enums.a getEntries() {
        return f122242b;
    }

    public static BaseStreamListResponseType valueOf(String r1) {
        return (BaseStreamListResponseType) Enum.valueOf(BaseStreamListResponseType.class, r1);
    }

    public static BaseStreamListResponseType[] values() {
        return (BaseStreamListResponseType[]) f122241a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
