package com.clevertap.android.sdk.inapp.evaluation;

import com.midtrans.sdk.corekit.models.ExpiryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/LimitType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "a", "Ever", "Session", "Seconds", "Minutes", "Hours", "Days", "Weeks", "OnEvery", "OnExactly", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LimitType extends Enum<LimitType> {
    public static final a Companion = null;
    public static final LimitType Days = null;
    public static final LimitType Ever = null;
    public static final LimitType Hours = null;
    public static final LimitType Minutes = null;
    public static final LimitType OnEvery = null;
    public static final LimitType OnExactly = null;
    public static final LimitType Seconds = null;
    public static final LimitType Session = null;
    public static final LimitType Weeks = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LimitType[] f34149a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f34150b = null;
    private final String type;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final LimitType a(String r6) {
            p.l(r6, "type");
            LimitType[] r02 = LimitType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            LimitType r3 = r02[r2];
            if (p.g(r3.getType(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return LimitType.Ever;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        Ever = new LimitType("Ever", 0, "ever");
        Session = new LimitType("Session", 1, "session");
        Seconds = new LimitType("Seconds", 2, "seconds");
        Minutes = new LimitType("Minutes", 3, ExpiryModel.UNIT_MINUTE);
        Hours = new LimitType("Hours", 4, ExpiryModel.UNIT_HOUR);
        Days = new LimitType("Days", 5, ExpiryModel.UNIT_DAY);
        Weeks = new LimitType("Weeks", 6, "weeks");
        OnEvery = new LimitType("OnEvery", 7, "onEvery");
        OnExactly = new LimitType("OnExactly", 8, "onExactly");
        LimitType[] r02 = a();
        f34149a = r02;
        f34150b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    LimitType(String r1, int r2, String r3) {
        this.type = r3;
    }

    public static final /* synthetic */ LimitType[] a() {
        return new LimitType[]{Ever, Session, Seconds, Minutes, Hours, Days, Weeks, OnEvery, OnExactly};
    }

    public static kotlin.enums.a getEntries() {
        return f34150b;
    }

    public static LimitType valueOf(String r1) {
        return (LimitType) Enum.valueOf(LimitType.class, r1);
    }

    public static LimitType[] values() {
        return (LimitType[]) f34149a.clone();
    }

    public final String getType() {
        return this.type;
    }
}
