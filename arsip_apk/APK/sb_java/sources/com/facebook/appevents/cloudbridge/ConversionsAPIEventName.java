package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/cloudbridge/ConversionsAPIEventName;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "UNLOCKED_ACHIEVEMENT", "ACTIVATED_APP", "ADDED_PAYMENT_INFO", "ADDED_TO_CART", "ADDED_TO_WISHLIST", "COMPLETED_REGISTRATION", "VIEWED_CONTENT", "INITIATED_CHECKOUT", "ACHIEVED_LEVEL", "PURCHASED", "RATED", "SEARCHED", "SPENT_CREDITS", "COMPLETED_TUTORIAL", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ConversionsAPIEventName extends Enum<ConversionsAPIEventName> {
    public static final ConversionsAPIEventName ACHIEVED_LEVEL = null;
    public static final ConversionsAPIEventName ACTIVATED_APP = null;
    public static final ConversionsAPIEventName ADDED_PAYMENT_INFO = null;
    public static final ConversionsAPIEventName ADDED_TO_CART = null;
    public static final ConversionsAPIEventName ADDED_TO_WISHLIST = null;
    public static final ConversionsAPIEventName COMPLETED_REGISTRATION = null;
    public static final ConversionsAPIEventName COMPLETED_TUTORIAL = null;
    public static final ConversionsAPIEventName INITIATED_CHECKOUT = null;
    public static final ConversionsAPIEventName PURCHASED = null;
    public static final ConversionsAPIEventName RATED = null;
    public static final ConversionsAPIEventName SEARCHED = null;
    public static final ConversionsAPIEventName SPENT_CREDITS = null;
    public static final ConversionsAPIEventName UNLOCKED_ACHIEVEMENT = null;
    public static final ConversionsAPIEventName VIEWED_CONTENT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ConversionsAPIEventName[] f35796a = null;
    private final String rawValue;

    static {
        UNLOCKED_ACHIEVEMENT = new ConversionsAPIEventName("UNLOCKED_ACHIEVEMENT", 0, "AchievementUnlocked");
        ACTIVATED_APP = new ConversionsAPIEventName("ACTIVATED_APP", 1, "ActivateApp");
        ADDED_PAYMENT_INFO = new ConversionsAPIEventName("ADDED_PAYMENT_INFO", 2, "AddPaymentInfo");
        ADDED_TO_CART = new ConversionsAPIEventName("ADDED_TO_CART", 3, "AddToCart");
        ADDED_TO_WISHLIST = new ConversionsAPIEventName("ADDED_TO_WISHLIST", 4, "AddToWishlist");
        COMPLETED_REGISTRATION = new ConversionsAPIEventName("COMPLETED_REGISTRATION", 5, "CompleteRegistration");
        VIEWED_CONTENT = new ConversionsAPIEventName("VIEWED_CONTENT", 6, "ViewContent");
        INITIATED_CHECKOUT = new ConversionsAPIEventName("INITIATED_CHECKOUT", 7, "InitiateCheckout");
        ACHIEVED_LEVEL = new ConversionsAPIEventName("ACHIEVED_LEVEL", 8, "LevelAchieved");
        PURCHASED = new ConversionsAPIEventName("PURCHASED", 9, "Purchase");
        RATED = new ConversionsAPIEventName("RATED", 10, "Rate");
        SEARCHED = new ConversionsAPIEventName("SEARCHED", 11, "Search");
        SPENT_CREDITS = new ConversionsAPIEventName("SPENT_CREDITS", 12, "SpentCredits");
        COMPLETED_TUTORIAL = new ConversionsAPIEventName("COMPLETED_TUTORIAL", 13, "TutorialCompletion");
        f35796a = a();
    }

    ConversionsAPIEventName(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ ConversionsAPIEventName[] a() {
        return new ConversionsAPIEventName[]{UNLOCKED_ACHIEVEMENT, ACTIVATED_APP, ADDED_PAYMENT_INFO, ADDED_TO_CART, ADDED_TO_WISHLIST, COMPLETED_REGISTRATION, VIEWED_CONTENT, INITIATED_CHECKOUT, ACHIEVED_LEVEL, PURCHASED, RATED, SEARCHED, SPENT_CREDITS, COMPLETED_TUTORIAL};
    }

    public static ConversionsAPIEventName valueOf(String r1) {
        return (ConversionsAPIEventName) Enum.valueOf(ConversionsAPIEventName.class, r1);
    }

    public static ConversionsAPIEventName[] values() {
        return (ConversionsAPIEventName[]) f35796a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
