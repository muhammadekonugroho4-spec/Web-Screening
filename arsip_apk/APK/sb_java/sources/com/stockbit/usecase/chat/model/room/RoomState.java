package com.stockbit.usecase.chat.model.room;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/RoomState;", "", "<init>", "(Ljava/lang/String;I)V", "ROOM_STATE_UNSPECIFIED", "ROOM_STATE_INVITED", "ROOM_STATE_ACCEPTED", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RoomState extends Enum<RoomState> {
    public static final a Companion = null;
    public static final RoomState ROOM_STATE_ACCEPTED = null;
    public static final RoomState ROOM_STATE_INVITED = null;
    public static final RoomState ROOM_STATE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RoomState[] f155603a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155604b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final RoomState a(String r1) {
            if (r1 != null) goto L8;
            r1 = "";
        L8:
            return RoomState.valueOf(r1);
        L7:
            return RoomState.ROOM_STATE_UNSPECIFIED;
        }

        public a() {
        }
    }

    static {
        ROOM_STATE_UNSPECIFIED = new RoomState("ROOM_STATE_UNSPECIFIED", 0);
        ROOM_STATE_INVITED = new RoomState("ROOM_STATE_INVITED", 1);
        ROOM_STATE_ACCEPTED = new RoomState("ROOM_STATE_ACCEPTED", 2);
        RoomState[] r02 = a();
        f155603a = r02;
        f155604b = b.a(r02);
        Companion = new a(null);
    }

    RoomState(String r1, int r2) {
    }

    public static final /* synthetic */ RoomState[] a() {
        return new RoomState[]{ROOM_STATE_UNSPECIFIED, ROOM_STATE_INVITED, ROOM_STATE_ACCEPTED};
    }

    public static kotlin.enums.a getEntries() {
        return f155604b;
    }

    public static RoomState valueOf(String r1) {
        return (RoomState) Enum.valueOf(RoomState.class, r1);
    }

    public static RoomState[] values() {
        return (RoomState[]) f155603a.clone();
    }
}
