package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/stream/StreamDeleteType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_POST", "MULTIPLE_POST", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamDeleteType extends Enum<StreamDeleteType> {
    public static final a Companion = null;
    public static final StreamDeleteType MULTIPLE_POST = null;
    public static final StreamDeleteType SINGLE_POST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamDeleteType[] f86477a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86478b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final StreamDeleteType a(Integer r7) {
            StreamDeleteType[] r02 = StreamDeleteType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            StreamDeleteType r3 = r02[r2];
            int r4 = r3.ordinal();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
            return r3;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            return null;
        }

        public a() {
        }
    }

    static {
        SINGLE_POST = new StreamDeleteType("SINGLE_POST", 0);
        MULTIPLE_POST = new StreamDeleteType("MULTIPLE_POST", 1);
        StreamDeleteType[] r02 = a();
        f86477a = r02;
        f86478b = b.a(r02);
        Companion = new a(null);
    }

    StreamDeleteType(String r1, int r2) {
    }

    public static final /* synthetic */ StreamDeleteType[] a() {
        return new StreamDeleteType[]{SINGLE_POST, MULTIPLE_POST};
    }

    public static kotlin.enums.a getEntries() {
        return f86478b;
    }

    public static StreamDeleteType valueOf(String r1) {
        return (StreamDeleteType) Enum.valueOf(StreamDeleteType.class, r1);
    }

    public static StreamDeleteType[] values() {
        return (StreamDeleteType[]) f86477a.clone();
    }
}
