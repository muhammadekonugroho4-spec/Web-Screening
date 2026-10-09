package com.stockbit.domains.usecase.notificationdiagnostic.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domains/usecase/notificationdiagnostic/model/NotificationDiagnosticType;", "", "<init>", "(Ljava/lang/String;I)V", "DEVICE_NOTIFICATION", "APP_NOTIFICATION", "GOOGLE_PLAY_SERVICE_AVAILABILITY", "FCM_TOKEN_VERIFICATION", "PUSH_NOTIFICATION_TEST", "usecase-notification-diagnostic"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum NotificationDiagnosticType extends Enum<NotificationDiagnosticType> {
    public static final NotificationDiagnosticType APP_NOTIFICATION = null;
    public static final NotificationDiagnosticType DEVICE_NOTIFICATION = null;
    public static final NotificationDiagnosticType FCM_TOKEN_VERIFICATION = null;
    public static final NotificationDiagnosticType GOOGLE_PLAY_SERVICE_AVAILABILITY = null;
    public static final NotificationDiagnosticType PUSH_NOTIFICATION_TEST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NotificationDiagnosticType[] f88332a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f88333b = null;

    static {
        DEVICE_NOTIFICATION = new NotificationDiagnosticType("DEVICE_NOTIFICATION", 0);
        APP_NOTIFICATION = new NotificationDiagnosticType("APP_NOTIFICATION", 1);
        GOOGLE_PLAY_SERVICE_AVAILABILITY = new NotificationDiagnosticType("GOOGLE_PLAY_SERVICE_AVAILABILITY", 2);
        FCM_TOKEN_VERIFICATION = new NotificationDiagnosticType("FCM_TOKEN_VERIFICATION", 3);
        PUSH_NOTIFICATION_TEST = new NotificationDiagnosticType("PUSH_NOTIFICATION_TEST", 4);
        NotificationDiagnosticType[] r02 = a();
        f88332a = r02;
        f88333b = b.a(r02);
    }

    NotificationDiagnosticType(String r1, int r2) {
    }

    public static final /* synthetic */ NotificationDiagnosticType[] a() {
        return new NotificationDiagnosticType[]{DEVICE_NOTIFICATION, APP_NOTIFICATION, GOOGLE_PLAY_SERVICE_AVAILABILITY, FCM_TOKEN_VERIFICATION, PUSH_NOTIFICATION_TEST};
    }

    public static a getEntries() {
        return f88333b;
    }

    public static NotificationDiagnosticType valueOf(String r1) {
        return (NotificationDiagnosticType) Enum.valueOf(NotificationDiagnosticType.class, r1);
    }

    public static NotificationDiagnosticType[] values() {
        return (NotificationDiagnosticType[]) f88332a.clone();
    }
}
