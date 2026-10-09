package com.stockbit.usecase.otp.model;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/otp/model/OtpTimerConfiguration;", "Ljava/io/Serializable;", "toleranceInterval", "", "rateLimit", "<init>", "(JJ)V", "getToleranceInterval", "()J", "getRateLimit", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "usecase-otp"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OtpTimerConfiguration implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f158945a = null;

    @SerializedName("rate_limit")
    private final long rateLimit;

    @SerializedName("tolerance_interval")
    private final long toleranceInterval;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f158945a = new a(null);
    }

    public OtpTimerConfiguration() {
        long r1 = 0;
        long r3 = 0;
        this(r1, r3, 3, null);
    }

    public final long a() {
        return this.rateLimit;
    }

    public final long b() {
        return this.toleranceInterval;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof OtpTimerConfiguration) == true) goto L8;
        return false;
    L8:
        OtpTimerConfiguration r82 = (OtpTimerConfiguration) r8;
        if (this.toleranceInterval == r82.toleranceInterval) goto L12;
        return false;
    L12:
        if (this.rateLimit == r82.rateLimit) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.toleranceInterval) * 31) + Long.hashCode(this.rateLimit);
    }

    public String toString() {
        return "OtpTimerConfiguration(toleranceInterval=" + this.toleranceInterval + ", rateLimit=" + this.rateLimit + ")";
    }

    public OtpTimerConfiguration(long r1, long r3) {
        this.toleranceInterval = r1;
        this.rateLimit = r3;
    }

    public /* synthetic */ OtpTimerConfiguration(long r1, long r3, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = 120000;
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = Constants.ONE_MIN_IN_MILLIS;
    L8:
        this(r1, r3);
    }
}
