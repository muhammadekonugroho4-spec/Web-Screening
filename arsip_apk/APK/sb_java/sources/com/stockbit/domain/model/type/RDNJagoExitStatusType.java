package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/RDNJagoExitStatusType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "QUIT", "FAILED", "SUCCESS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum RDNJagoExitStatusType extends Enum<RDNJagoExitStatusType> {
    public static final RDNJagoExitStatusType FAILED = null;
    public static final RDNJagoExitStatusType QUIT = null;
    public static final RDNJagoExitStatusType SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RDNJagoExitStatusType[] f86226a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86227b = null;
    private final String value;

    static {
        QUIT = new RDNJagoExitStatusType("QUIT", 0, "status=quit");
        FAILED = new RDNJagoExitStatusType("FAILED", 1, "status=failed");
        SUCCESS = new RDNJagoExitStatusType("SUCCESS", 2, "status=success");
        RDNJagoExitStatusType[] r02 = a();
        f86226a = r02;
        f86227b = kotlin.enums.b.a(r02);
    }

    RDNJagoExitStatusType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ RDNJagoExitStatusType[] a() {
        return new RDNJagoExitStatusType[]{QUIT, FAILED, SUCCESS};
    }

    public static kotlin.enums.a getEntries() {
        return f86227b;
    }

    public static RDNJagoExitStatusType valueOf(String r1) {
        return (RDNJagoExitStatusType) Enum.valueOf(RDNJagoExitStatusType.class, r1);
    }

    public static RDNJagoExitStatusType[] values() {
        return (RDNJagoExitStatusType[]) f86226a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
