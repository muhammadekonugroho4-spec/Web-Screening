package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/ConversionsAPISection;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "USER_DATA", "APP_DATA", "CUSTOM_DATA", "CUSTOM_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ConversionsAPISection extends Enum<ConversionsAPISection> {
    public static final ConversionsAPISection APP_DATA = null;
    public static final ConversionsAPISection CUSTOM_DATA = null;
    public static final ConversionsAPISection CUSTOM_EVENTS = null;
    public static final ConversionsAPISection USER_DATA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ConversionsAPISection[] f35797a = null;
    private final String rawValue;

    static {
        USER_DATA = new ConversionsAPISection("USER_DATA", 0, "user_data");
        APP_DATA = new ConversionsAPISection("APP_DATA", 1, "app_data");
        CUSTOM_DATA = new ConversionsAPISection("CUSTOM_DATA", 2, "custom_data");
        CUSTOM_EVENTS = new ConversionsAPISection("CUSTOM_EVENTS", 3, "custom_events");
        f35797a = a();
    }

    ConversionsAPISection(String r1, int r2, String r3) {
        this.rawValue = r3;
    }

    public static final /* synthetic */ ConversionsAPISection[] a() {
        return new ConversionsAPISection[]{USER_DATA, APP_DATA, CUSTOM_DATA, CUSTOM_EVENTS};
    }

    public static ConversionsAPISection valueOf(String r1) {
        return (ConversionsAPISection) Enum.valueOf(ConversionsAPISection.class, r1);
    }

    public static ConversionsAPISection[] values() {
        return (ConversionsAPISection[]) f35797a.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
