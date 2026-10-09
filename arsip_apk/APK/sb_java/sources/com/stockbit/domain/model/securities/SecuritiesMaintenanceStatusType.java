package com.stockbit.domain.model.securities;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/securities/SecuritiesMaintenanceStatusType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STATUS_UNSPECIFIED", "STATUS_NOT_MAINTENANCE", "STATUS_MAINTENANCE", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SecuritiesMaintenanceStatusType extends Enum<SecuritiesMaintenanceStatusType> {
    public static final a Companion = null;
    public static final SecuritiesMaintenanceStatusType STATUS_MAINTENANCE = null;
    public static final SecuritiesMaintenanceStatusType STATUS_NOT_MAINTENANCE = null;
    public static final SecuritiesMaintenanceStatusType STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SecuritiesMaintenanceStatusType[] f84999a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f85000b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final SecuritiesMaintenanceStatusType a(String r4) {
            kotlin.jvm.internal.p.l(r4, "value");
            Iterator<E> r02 = SecuritiesMaintenanceStatusType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((SecuritiesMaintenanceStatusType) r1).getValue(), r4) == false) goto L4;
        L9:
            SecuritiesMaintenanceStatusType r12 = (SecuritiesMaintenanceStatusType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return SecuritiesMaintenanceStatusType.STATUS_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        STATUS_UNSPECIFIED = new SecuritiesMaintenanceStatusType("STATUS_UNSPECIFIED", 0, "STATUS_UNSPECIFIED");
        STATUS_NOT_MAINTENANCE = new SecuritiesMaintenanceStatusType("STATUS_NOT_MAINTENANCE", 1, "STATUS_NOT_MAINTENANCE");
        STATUS_MAINTENANCE = new SecuritiesMaintenanceStatusType("STATUS_MAINTENANCE", 2, "STATUS_MAINTENANCE");
        SecuritiesMaintenanceStatusType[] r02 = a();
        f84999a = r02;
        f85000b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SecuritiesMaintenanceStatusType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SecuritiesMaintenanceStatusType[] a() {
        return new SecuritiesMaintenanceStatusType[]{STATUS_UNSPECIFIED, STATUS_NOT_MAINTENANCE, STATUS_MAINTENANCE};
    }

    public static kotlin.enums.a getEntries() {
        return f85000b;
    }

    public static SecuritiesMaintenanceStatusType valueOf(String r1) {
        return (SecuritiesMaintenanceStatusType) Enum.valueOf(SecuritiesMaintenanceStatusType.class, r1);
    }

    public static SecuritiesMaintenanceStatusType[] values() {
        return (SecuritiesMaintenanceStatusType[]) f84999a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
