package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/stream/HeaderStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "EMPTY", "ERROR", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum HeaderStatus extends Enum<HeaderStatus> {
    public static final a Companion = null;
    public static final HeaderStatus EMPTY = null;
    public static final HeaderStatus ERROR = null;
    public static final HeaderStatus SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HeaderStatus[] f86459a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86460b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final HeaderStatus a(String r6) {
            p.l(r6, "value");
            HeaderStatus[] r02 = HeaderStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            HeaderStatus r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return HeaderStatus.EMPTY;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SUCCESS = new HeaderStatus("SUCCESS", 0, "HEADER_SUCCESS");
        EMPTY = new HeaderStatus("EMPTY", 1, "HEADER_EMPTY");
        ERROR = new HeaderStatus("ERROR", 2, "HEADER_ERROR");
        HeaderStatus[] r02 = a();
        f86459a = r02;
        f86460b = b.a(r02);
        Companion = new a(null);
    }

    HeaderStatus(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ HeaderStatus[] a() {
        return new HeaderStatus[]{SUCCESS, EMPTY, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f86460b;
    }

    public static HeaderStatus valueOf(String r1) {
        return (HeaderStatus) Enum.valueOf(HeaderStatus.class, r1);
    }

    public static HeaderStatus[] values() {
        return (HeaderStatus[]) f86459a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
