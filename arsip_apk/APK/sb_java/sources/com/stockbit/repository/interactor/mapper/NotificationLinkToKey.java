package com.stockbit.repository.interactor.mapper;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/repository/interactor/mapper/NotificationLinkToKey;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DirectionStream", "DirectionTipping", "DirectionUser", "DirectionPriceAlert", "DirectionNewUser", "DirectionRequestBadge", "Companion", "repository-notification-interactor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum NotificationLinkToKey extends Enum<NotificationLinkToKey> {
    public static final a Companion = null;
    public static final NotificationLinkToKey DirectionNewUser = null;
    public static final NotificationLinkToKey DirectionPriceAlert = null;
    public static final NotificationLinkToKey DirectionRequestBadge = null;
    public static final NotificationLinkToKey DirectionStream = null;
    public static final NotificationLinkToKey DirectionTipping = null;
    public static final NotificationLinkToKey DirectionUser = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NotificationLinkToKey[] f130162a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f130163b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final NotificationLinkToKey a(Integer r7) {
            NotificationLinkToKey[] r02 = NotificationLinkToKey.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            NotificationLinkToKey r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
            return r3;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            return null;
        }

        public a() {
        }
    }

    static {
        DirectionStream = new NotificationLinkToKey("DirectionStream", 0, 1);
        DirectionTipping = new NotificationLinkToKey("DirectionTipping", 1, 2);
        DirectionUser = new NotificationLinkToKey("DirectionUser", 2, 3);
        DirectionPriceAlert = new NotificationLinkToKey("DirectionPriceAlert", 3, 4);
        DirectionNewUser = new NotificationLinkToKey("DirectionNewUser", 4, 19);
        DirectionRequestBadge = new NotificationLinkToKey("DirectionRequestBadge", 5, 24);
        NotificationLinkToKey[] r02 = a();
        f130162a = r02;
        f130163b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    NotificationLinkToKey(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ NotificationLinkToKey[] a() {
        return new NotificationLinkToKey[]{DirectionStream, DirectionTipping, DirectionUser, DirectionPriceAlert, DirectionNewUser, DirectionRequestBadge};
    }

    public static kotlin.enums.a getEntries() {
        return f130163b;
    }

    public static NotificationLinkToKey valueOf(String r1) {
        return (NotificationLinkToKey) Enum.valueOf(NotificationLinkToKey.class, r1);
    }

    public static NotificationLinkToKey[] values() {
        return (NotificationLinkToKey[]) f130162a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
