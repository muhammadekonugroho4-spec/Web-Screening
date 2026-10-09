package com.stockbit.usecase.liveness.model.type;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/liveness/model/type/LivenessRejectionUIType;", "", "<init>", "(Ljava/lang/String;I)V", "LIVENESS_REASON_TYPE_RETRY_EXCEEDED", "LIVENESS_REASON_TYPE_NOT_PASSED", "LIVENESS_REASON_TYPE_UNSPECIFIED", "Companion", "usecase-liveness"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum LivenessRejectionUIType extends Enum<LivenessRejectionUIType> {
    public static final a Companion = null;
    public static final LivenessRejectionUIType LIVENESS_REASON_TYPE_NOT_PASSED = null;
    public static final LivenessRejectionUIType LIVENESS_REASON_TYPE_RETRY_EXCEEDED = null;
    public static final LivenessRejectionUIType LIVENESS_REASON_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LivenessRejectionUIType[] f158232a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158233b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final LivenessRejectionUIType a(String r4) {
            p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
            Iterator<E> r02 = LivenessRejectionUIType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((LivenessRejectionUIType) r1).name(), r4) == false) goto L4;
        L9:
            LivenessRejectionUIType r12 = (LivenessRejectionUIType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return LivenessRejectionUIType.LIVENESS_REASON_TYPE_UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        LIVENESS_REASON_TYPE_RETRY_EXCEEDED = new LivenessRejectionUIType("LIVENESS_REASON_TYPE_RETRY_EXCEEDED", 0);
        LIVENESS_REASON_TYPE_NOT_PASSED = new LivenessRejectionUIType("LIVENESS_REASON_TYPE_NOT_PASSED", 1);
        LIVENESS_REASON_TYPE_UNSPECIFIED = new LivenessRejectionUIType("LIVENESS_REASON_TYPE_UNSPECIFIED", 2);
        LivenessRejectionUIType[] r02 = a();
        f158232a = r02;
        f158233b = b.a(r02);
        Companion = new a(null);
    }

    LivenessRejectionUIType(String r1, int r2) {
    }

    public static final /* synthetic */ LivenessRejectionUIType[] a() {
        return new LivenessRejectionUIType[]{LIVENESS_REASON_TYPE_RETRY_EXCEEDED, LIVENESS_REASON_TYPE_NOT_PASSED, LIVENESS_REASON_TYPE_UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f158233b;
    }

    public static LivenessRejectionUIType valueOf(String r1) {
        return (LivenessRejectionUIType) Enum.valueOf(LivenessRejectionUIType.class, r1);
    }

    public static LivenessRejectionUIType[] values() {
        return (LivenessRejectionUIType[]) f158232a.clone();
    }
}
