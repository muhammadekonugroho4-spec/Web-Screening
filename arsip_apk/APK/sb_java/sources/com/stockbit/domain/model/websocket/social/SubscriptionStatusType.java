package com.stockbit.domain.model.websocket.social;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/websocket/social/SubscriptionStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "STATUS_SUBSCRIBED", "STATUS_UNSUBSCRIBED", "UNRECOGNIZED", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SubscriptionStatusType extends Enum<SubscriptionStatusType> {
    public static final a Companion = null;
    public static final SubscriptionStatusType STATUS_SUBSCRIBED = null;
    public static final SubscriptionStatusType STATUS_UNSPECIFIED = null;
    public static final SubscriptionStatusType STATUS_UNSUBSCRIBED = null;
    public static final SubscriptionStatusType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SubscriptionStatusType[] f87284a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87285b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STATUS_UNSPECIFIED = new SubscriptionStatusType("STATUS_UNSPECIFIED", 0);
        STATUS_SUBSCRIBED = new SubscriptionStatusType("STATUS_SUBSCRIBED", 1);
        STATUS_UNSUBSCRIBED = new SubscriptionStatusType("STATUS_UNSUBSCRIBED", 2);
        UNRECOGNIZED = new SubscriptionStatusType("UNRECOGNIZED", 3);
        SubscriptionStatusType[] r02 = a();
        f87284a = r02;
        f87285b = b.a(r02);
        Companion = new a(null);
    }

    SubscriptionStatusType(String r1, int r2) {
    }

    public static final /* synthetic */ SubscriptionStatusType[] a() {
        return new SubscriptionStatusType[]{STATUS_UNSPECIFIED, STATUS_SUBSCRIBED, STATUS_UNSUBSCRIBED, UNRECOGNIZED};
    }

    public static kotlin.enums.a getEntries() {
        return f87285b;
    }

    public static SubscriptionStatusType valueOf(String r1) {
        return (SubscriptionStatusType) Enum.valueOf(SubscriptionStatusType.class, r1);
    }

    public static SubscriptionStatusType[] values() {
        return (SubscriptionStatusType[]) f87284a.clone();
    }
}
