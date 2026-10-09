package com.stockbit.usecase.chat.model.chat.room;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/room/ReceiverType;", "", "<init>", "(Ljava/lang/String;I)V", "RECEIVER_TYPE_UNSPECIFIED", "RECEIVER_TYPE_USER", "RECEIVER_TYPE_ROOM", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ReceiverType extends Enum<ReceiverType> {
    public static final a Companion = null;
    public static final ReceiverType RECEIVER_TYPE_ROOM = null;
    public static final ReceiverType RECEIVER_TYPE_UNSPECIFIED = null;
    public static final ReceiverType RECEIVER_TYPE_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ReceiverType[] f155497a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155498b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ReceiverType a(String r6) {
            ReceiverType[] r02 = ReceiverType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            ReceiverType r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return ReceiverType.RECEIVER_TYPE_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        RECEIVER_TYPE_UNSPECIFIED = new ReceiverType("RECEIVER_TYPE_UNSPECIFIED", 0);
        RECEIVER_TYPE_USER = new ReceiverType("RECEIVER_TYPE_USER", 1);
        RECEIVER_TYPE_ROOM = new ReceiverType("RECEIVER_TYPE_ROOM", 2);
        ReceiverType[] r02 = a();
        f155497a = r02;
        f155498b = b.a(r02);
        Companion = new a(null);
    }

    ReceiverType(String r1, int r2) {
    }

    public static final /* synthetic */ ReceiverType[] a() {
        return new ReceiverType[]{RECEIVER_TYPE_UNSPECIFIED, RECEIVER_TYPE_USER, RECEIVER_TYPE_ROOM};
    }

    public static kotlin.enums.a getEntries() {
        return f155498b;
    }

    public static ReceiverType valueOf(String r1) {
        return (ReceiverType) Enum.valueOf(ReceiverType.class, r1);
    }

    public static ReceiverType[] values() {
        return (ReceiverType[]) f155497a.clone();
    }
}
