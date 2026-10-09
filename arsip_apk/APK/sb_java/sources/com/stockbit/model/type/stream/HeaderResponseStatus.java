package com.stockbit.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/model/type/stream/HeaderResponseStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "EMPTY", "ERROR", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum HeaderResponseStatus extends Enum<HeaderResponseStatus> {
    public static final a Companion = null;
    public static final HeaderResponseStatus EMPTY = null;
    public static final HeaderResponseStatus ERROR = null;
    public static final HeaderResponseStatus SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HeaderResponseStatus[] f122245a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122246b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final HeaderResponseStatus a(boolean r1, boolean r2, boolean r3) {
            if (r1 == true) goto L4;
            if (r2 == true) goto L7;
            if (r3 == true) goto L10;
            return null;
        L10:
            return HeaderResponseStatus.ERROR;
        L7:
            return HeaderResponseStatus.EMPTY;
        L4:
            return HeaderResponseStatus.SUCCESS;
        }

        public final String b(HeaderResponseStatus r5) {
            HeaderResponseStatus[] r02 = HeaderResponseStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            HeaderResponseStatus r3 = r02[r2];
            if (r3 == r5) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L15;
            String r52 = r3.getValue();
            if (r52 == null) goto L15;
            return r52;
        L15:
            return HeaderResponseStatus.EMPTY.getValue();
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        SUCCESS = new HeaderResponseStatus("SUCCESS", 0, "HEADER_SUCCESS");
        EMPTY = new HeaderResponseStatus("EMPTY", 1, "HEADER_EMPTY");
        ERROR = new HeaderResponseStatus("ERROR", 2, "HEADER_ERROR");
        HeaderResponseStatus[] r02 = a();
        f122245a = r02;
        f122246b = b.a(r02);
        Companion = new a(null);
    }

    HeaderResponseStatus(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ HeaderResponseStatus[] a() {
        return new HeaderResponseStatus[]{SUCCESS, EMPTY, ERROR};
    }

    public static kotlin.enums.a getEntries() {
        return f122246b;
    }

    public static HeaderResponseStatus valueOf(String r1) {
        return (HeaderResponseStatus) Enum.valueOf(HeaderResponseStatus.class, r1);
    }

    public static HeaderResponseStatus[] values() {
        return (HeaderResponseStatus[]) f122245a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
