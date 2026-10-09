package com.stockbit.eipo.ui.compose.story.components;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/eipo/ui/compose/story/components/RiveStepperAnimation;", "", "animationName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnimationName", "()Ljava/lang/String;", "ACTIVE", "COMPLETED", "UNCONFIRMED", "PENDING", "INACTIVE", "LAST_STAGE_INACTIVE", "IPO", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
enum RiveStepperAnimation extends Enum<RiveStepperAnimation> {
    public static final RiveStepperAnimation ACTIVE = null;
    public static final RiveStepperAnimation COMPLETED = null;
    public static final RiveStepperAnimation INACTIVE = null;
    public static final RiveStepperAnimation IPO = null;
    public static final RiveStepperAnimation LAST_STAGE_INACTIVE = null;
    public static final RiveStepperAnimation PENDING = null;
    public static final RiveStepperAnimation UNCONFIRMED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RiveStepperAnimation[] f90604a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f90605b = null;
    private final String animationName;

    static {
        ACTIVE = new RiveStepperAnimation("ACTIVE", 0, "Active");
        COMPLETED = new RiveStepperAnimation("COMPLETED", 1, "Completed");
        UNCONFIRMED = new RiveStepperAnimation("UNCONFIRMED", 2, "Unconfirmed");
        PENDING = new RiveStepperAnimation("PENDING", 3, "Pending");
        INACTIVE = new RiveStepperAnimation("INACTIVE", 4, "InActive");
        LAST_STAGE_INACTIVE = new RiveStepperAnimation("LAST_STAGE_INACTIVE", 5, "LastStageInActive");
        IPO = new RiveStepperAnimation("IPO", 6, "IPO");
        RiveStepperAnimation[] r02 = a();
        f90604a = r02;
        f90605b = kotlin.enums.b.a(r02);
    }

    RiveStepperAnimation(String r1, int r2, String r3) {
        this.animationName = r3;
    }

    public static final /* synthetic */ RiveStepperAnimation[] a() {
        return new RiveStepperAnimation[]{ACTIVE, COMPLETED, UNCONFIRMED, PENDING, INACTIVE, LAST_STAGE_INACTIVE, IPO};
    }

    public static kotlin.enums.a getEntries() {
        return f90605b;
    }

    public static RiveStepperAnimation valueOf(String r1) {
        return (RiveStepperAnimation) Enum.valueOf(RiveStepperAnimation.class, r1);
    }

    public static RiveStepperAnimation[] values() {
        return (RiveStepperAnimation[]) f90604a.clone();
    }

    public final String getAnimationName() {
        return this.animationName;
    }
}
