package com.stockbit.domain.model.openingaccount;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/domain/model/openingaccount/OAProgressStatusType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "DEFAULT", "ACCEPTED", "REJECTED", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum OAProgressStatusType extends Enum<OAProgressStatusType> {
    public static final OAProgressStatusType ACCEPTED = null;
    public static final a Companion = null;
    public static final OAProgressStatusType DEFAULT = null;
    public static final OAProgressStatusType REJECTED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OAProgressStatusType[] f84516a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84517b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final OAProgressStatusType a(Integer r7) {
            OAProgressStatusType[] r02 = OAProgressStatusType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            OAProgressStatusType r3 = r02[r2];
            int r4 = OAProgressStatusType.access$getValue$p(r3);
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return OAProgressStatusType.DEFAULT;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        DEFAULT = new OAProgressStatusType("DEFAULT", 0, 0);
        ACCEPTED = new OAProgressStatusType("ACCEPTED", 1, 1);
        REJECTED = new OAProgressStatusType("REJECTED", 2, 2);
        OAProgressStatusType[] r02 = a();
        f84516a = r02;
        f84517b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OAProgressStatusType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OAProgressStatusType[] a() {
        return new OAProgressStatusType[]{DEFAULT, ACCEPTED, REJECTED};
    }

    public static final /* synthetic */ int access$getValue$p(OAProgressStatusType r02) {
        return r02.value;
    }

    public static kotlin.enums.a getEntries() {
        return f84517b;
    }

    public static OAProgressStatusType valueOf(String r1) {
        return (OAProgressStatusType) Enum.valueOf(OAProgressStatusType.class, r1);
    }

    public static OAProgressStatusType[] values() {
        return (OAProgressStatusType[]) f84516a.clone();
    }
}
