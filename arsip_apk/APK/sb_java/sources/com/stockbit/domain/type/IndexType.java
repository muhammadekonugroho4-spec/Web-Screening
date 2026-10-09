package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/type/IndexType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ISSI", "JII", "DBX", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum IndexType extends Enum<IndexType> {
    public static final a Companion = null;
    public static final IndexType DBX = null;
    public static final IndexType ISSI = null;
    public static final IndexType JII = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IndexType[] f87648a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87649b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ISSI = new IndexType("ISSI", 0, "ISSI");
        JII = new IndexType("JII", 1, "JII");
        DBX = new IndexType("DBX", 2, "DBX");
        IndexType[] r02 = a();
        f87648a = r02;
        f87649b = b.a(r02);
        Companion = new a(null);
    }

    IndexType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ IndexType[] a() {
        return new IndexType[]{ISSI, JII, DBX};
    }

    public static kotlin.enums.a getEntries() {
        return f87649b;
    }

    public static IndexType valueOf(String r1) {
        return (IndexType) Enum.valueOf(IndexType.class, r1);
    }

    public static IndexType[] values() {
        return (IndexType[]) f87648a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
