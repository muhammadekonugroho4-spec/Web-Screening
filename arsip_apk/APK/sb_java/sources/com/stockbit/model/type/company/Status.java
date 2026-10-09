package com.stockbit.model.type.company;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/model/type/company/Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTIVE", DebugCoroutineInfoImplKt.SUSPENDED, "DELISTED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum Status extends Enum<Status> {
    public static final Status ACTIVE = null;
    public static final Status DELISTED = null;
    public static final Status SUSPENDED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Status[] f122233a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122234b = null;
    private final String value;

    static {
        ACTIVE = new Status("ACTIVE", 0, "STATUS_ACTIVE");
        SUSPENDED = new Status(DebugCoroutineInfoImplKt.SUSPENDED, 1, "STATUS_SUSPENDED");
        DELISTED = new Status("DELISTED", 2, "STATUS_DELISTED");
        Status[] r02 = a();
        f122233a = r02;
        f122234b = b.a(r02);
    }

    Status(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ Status[] a() {
        return new Status[]{ACTIVE, SUSPENDED, DELISTED};
    }

    public static a getEntries() {
        return f122234b;
    }

    public static Status valueOf(String r1) {
        return (Status) Enum.valueOf(Status.class, r1);
    }

    public static Status[] values() {
        return (Status[]) f122233a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
