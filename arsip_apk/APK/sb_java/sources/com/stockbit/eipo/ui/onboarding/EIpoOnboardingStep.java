package com.stockbit.eipo.ui.onboarding;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/eipo/ui/onboarding/EIpoOnboardingStep;", "", NotificationCompat.CATEGORY_PROGRESS, "", "<init>", "(Ljava/lang/String;II)V", "getProgress", "()I", "START", "ONE", "TWO", "THREE", "FOUR", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum EIpoOnboardingStep extends Enum<EIpoOnboardingStep> {
    public static final EIpoOnboardingStep FOUR = null;
    public static final EIpoOnboardingStep ONE = null;
    public static final EIpoOnboardingStep START = null;
    public static final EIpoOnboardingStep THREE = null;
    public static final EIpoOnboardingStep TWO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EIpoOnboardingStep[] f91146a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f91147b = null;
    private final int progress;

    static {
        START = new EIpoOnboardingStep("START", 0, 0);
        ONE = new EIpoOnboardingStep("ONE", 1, 10);
        TWO = new EIpoOnboardingStep("TWO", 2, 20);
        THREE = new EIpoOnboardingStep("THREE", 3, 30);
        FOUR = new EIpoOnboardingStep("FOUR", 4, 40);
        EIpoOnboardingStep[] r02 = a();
        f91146a = r02;
        f91147b = kotlin.enums.b.a(r02);
    }

    EIpoOnboardingStep(String r1, int r2, int r3) {
        this.progress = r3;
    }

    public static final /* synthetic */ EIpoOnboardingStep[] a() {
        return new EIpoOnboardingStep[]{START, ONE, TWO, THREE, FOUR};
    }

    public static kotlin.enums.a getEntries() {
        return f91147b;
    }

    public static EIpoOnboardingStep valueOf(String r1) {
        return (EIpoOnboardingStep) Enum.valueOf(EIpoOnboardingStep.class, r1);
    }

    public static EIpoOnboardingStep[] values() {
        return (EIpoOnboardingStep[]) f91146a.clone();
    }

    public final int getProgress() {
        return this.progress;
    }
}
