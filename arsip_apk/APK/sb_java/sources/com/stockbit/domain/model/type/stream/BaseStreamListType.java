package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/domain/model/type/stream/BaseStreamListType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HEADER", "STREAM", "ADVERT_BIBIT", "SUGGESTED_PEOPLE", "ADVERT_SECURITIES", "UNBOXING", "RESEARCH", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum BaseStreamListType extends Enum<BaseStreamListType> {
    public static final BaseStreamListType ADVERT_BIBIT = null;
    public static final BaseStreamListType ADVERT_SECURITIES = null;
    public static final a Companion = null;
    public static final BaseStreamListType HEADER = null;
    public static final BaseStreamListType RESEARCH = null;
    public static final BaseStreamListType STREAM = null;
    public static final BaseStreamListType SUGGESTED_PEOPLE = null;
    public static final BaseStreamListType UNBOXING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BaseStreamListType[] f86453a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86454b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final BaseStreamListType a(String r6) {
            p.l(r6, "value");
            BaseStreamListType[] r02 = BaseStreamListType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BaseStreamListType r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BaseStreamListType.STREAM;
        L8:
            r3 = null;
            goto L9
        }

        public final BaseStreamListType b(String r5, boolean r6) {
            p.l(r5, "value");
            if (r6 == true) goto L5;
            BaseStreamListType[] r62 = BaseStreamListType.values();
            int r02 = r62.length;
            int r1 = 0;
        L7:
            if (r1 >= r02) goto L12;
            BaseStreamListType r2 = r62[r1];
            if (p.g(r2.getValue(), r5) == true) goto L13;
            r1 = r1 + 1;
        L13:
            if (r2 == null) goto L15;
            return r2;
        L15:
            return BaseStreamListType.STREAM;
        L12:
            r2 = null;
            goto L13
        L5:
            return BaseStreamListType.RESEARCH;
        }

        public a() {
        }
    }

    static {
        HEADER = new BaseStreamListType("HEADER", 0, "STREAM_HEADER_SECTION");
        STREAM = new BaseStreamListType("STREAM", 1, "STREAM_MAIN_SECTION");
        ADVERT_BIBIT = new BaseStreamListType("ADVERT_BIBIT", 2, "STREAM_ADS_BIBIT_SECTION");
        SUGGESTED_PEOPLE = new BaseStreamListType("SUGGESTED_PEOPLE", 3, "STREAM_SUGGESTED_SECTION");
        ADVERT_SECURITIES = new BaseStreamListType("ADVERT_SECURITIES", 4, "STREAM_ADS_SECURITIES_SECTION");
        UNBOXING = new BaseStreamListType("UNBOXING", 5, "STREAM_UNBOXING_SECTION");
        RESEARCH = new BaseStreamListType("RESEARCH", 6, "STREAM_RESEARCH_SECTION");
        BaseStreamListType[] r02 = a();
        f86453a = r02;
        f86454b = b.a(r02);
        Companion = new a(null);
    }

    BaseStreamListType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ BaseStreamListType[] a() {
        return new BaseStreamListType[]{HEADER, STREAM, ADVERT_BIBIT, SUGGESTED_PEOPLE, ADVERT_SECURITIES, UNBOXING, RESEARCH};
    }

    public static kotlin.enums.a getEntries() {
        return f86454b;
    }

    public static BaseStreamListType valueOf(String r1) {
        return (BaseStreamListType) Enum.valueOf(BaseStreamListType.class, r1);
    }

    public static BaseStreamListType[] values() {
        return (BaseStreamListType[]) f86453a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
