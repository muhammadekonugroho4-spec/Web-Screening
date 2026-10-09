package com.stockbit.alert.ui.detail.bottomsheet;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stockbit/alert/ui/detail/bottomsheet/AlertSound;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "audioResId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getAudioResId", "()I", "S1", "S2", "S3", "S4", "S5", "alert_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum AlertSound extends Enum<AlertSound> {
    public static final AlertSound S1 = null;
    public static final AlertSound S2 = null;
    public static final AlertSound S3 = null;
    public static final AlertSound S4 = null;
    public static final AlertSound S5 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertSound[] f44973a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f44974b = null;
    private final int audioResId;
    private final String label;

    static {
        S1 = new AlertSound("S1", 0, "Chime", com.stockbit.alert.h.f44691a);
        S2 = new AlertSound("S2", 1, "Rise", com.stockbit.alert.h.f44692b);
        S3 = new AlertSound("S3", 2, "Opportunity", com.stockbit.alert.h.f44693c);
        S4 = new AlertSound("S4", 3, "Drop", com.stockbit.alert.h.d);
        S5 = new AlertSound("S5", 4, "Reward", com.stockbit.alert.h.f44694e);
        AlertSound[] r02 = a();
        f44973a = r02;
        f44974b = kotlin.enums.b.a(r02);
    }

    AlertSound(String r1, int r2, String r3, int r4) {
        this.label = r3;
        this.audioResId = r4;
    }

    public static final /* synthetic */ AlertSound[] a() {
        return new AlertSound[]{S1, S2, S3, S4, S5};
    }

    public static kotlin.enums.a getEntries() {
        return f44974b;
    }

    public static AlertSound valueOf(String r1) {
        return (AlertSound) Enum.valueOf(AlertSound.class, r1);
    }

    public static AlertSound[] values() {
        return (AlertSound[]) f44973a.clone();
    }

    public final int getAudioResId() {
        return this.audioResId;
    }

    public final String getLabel() {
        return this.label;
    }
}
