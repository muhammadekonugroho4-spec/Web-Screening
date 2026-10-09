package com.stockbit.domain.model.type;

import androidx.core.app.NotificationCompat;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/type/HistoryStatusType;", "", "value", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getStatus", "Initial", "Success", "Failed", "Pending", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum HistoryStatusType extends Enum<HistoryStatusType> {
    public static final a Companion = null;
    public static final HistoryStatusType Failed = null;
    public static final HistoryStatusType Initial = null;
    public static final HistoryStatusType Pending = null;
    public static final HistoryStatusType Success = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HistoryStatusType[] f86195a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86196b = null;
    private final String status;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        Initial = new HistoryStatusType("Initial", 0, "0", "Pending");
        Success = new HistoryStatusType("Success", 1, "2", "Success");
        Failed = new HistoryStatusType("Failed", 2, "6", "Failed");
        Pending = new HistoryStatusType("Pending", 3, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A, "Pending");
        HistoryStatusType[] r02 = a();
        f86195a = r02;
        f86196b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    HistoryStatusType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.status = r4;
    }

    public static final /* synthetic */ HistoryStatusType[] a() {
        return new HistoryStatusType[]{Initial, Success, Failed, Pending};
    }

    public static kotlin.enums.a getEntries() {
        return f86196b;
    }

    public static HistoryStatusType valueOf(String r1) {
        return (HistoryStatusType) Enum.valueOf(HistoryStatusType.class, r1);
    }

    public static HistoryStatusType[] values() {
        return (HistoryStatusType[]) f86195a.clone();
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getValue() {
        return this.value;
    }
}
