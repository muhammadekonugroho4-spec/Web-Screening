package com.stockbit.usecase.chat.model.message;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/message/BulkRespondMessageRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_UNSPECIFIED", "ACTION_ACCEPT", "ACTION_REJECT", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum BulkRespondMessageRequestType extends Enum<BulkRespondMessageRequestType> {
    public static final BulkRespondMessageRequestType ACTION_ACCEPT = null;
    public static final BulkRespondMessageRequestType ACTION_REJECT = null;
    public static final BulkRespondMessageRequestType ACTION_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BulkRespondMessageRequestType[] f155561a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155562b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ACTION_UNSPECIFIED = new BulkRespondMessageRequestType("ACTION_UNSPECIFIED", 0);
        ACTION_ACCEPT = new BulkRespondMessageRequestType("ACTION_ACCEPT", 1);
        ACTION_REJECT = new BulkRespondMessageRequestType("ACTION_REJECT", 2);
        BulkRespondMessageRequestType[] r02 = a();
        f155561a = r02;
        f155562b = b.a(r02);
        Companion = new a(null);
    }

    BulkRespondMessageRequestType(String r1, int r2) {
    }

    public static final /* synthetic */ BulkRespondMessageRequestType[] a() {
        return new BulkRespondMessageRequestType[]{ACTION_UNSPECIFIED, ACTION_ACCEPT, ACTION_REJECT};
    }

    public static kotlin.enums.a getEntries() {
        return f155562b;
    }

    public static BulkRespondMessageRequestType valueOf(String r1) {
        return (BulkRespondMessageRequestType) Enum.valueOf(BulkRespondMessageRequestType.class, r1);
    }

    public static BulkRespondMessageRequestType[] values() {
        return (BulkRespondMessageRequestType[]) f155561a.clone();
    }
}
