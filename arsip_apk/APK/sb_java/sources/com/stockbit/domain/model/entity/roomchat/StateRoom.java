package com.stockbit.domain.model.entity.roomchat;

import kotlin.Metadata;
import kotlin.e;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/entity/roomchat/StateRoom;", "", "<init>", "(Ljava/lang/String;I)V", "ROOM_STATE_UNSPECIFIED", "ROOM_STATE_ACCEPTED", "ROOM_STATE_INVITED", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum StateRoom extends Enum<StateRoom> {
    public static final a Companion = null;
    public static final StateRoom ROOM_STATE_ACCEPTED = null;
    public static final StateRoom ROOM_STATE_INVITED = null;
    public static final StateRoom ROOM_STATE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StateRoom[] f82845a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f82846b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ROOM_STATE_UNSPECIFIED = new StateRoom("ROOM_STATE_UNSPECIFIED", 0);
        ROOM_STATE_ACCEPTED = new StateRoom("ROOM_STATE_ACCEPTED", 1);
        ROOM_STATE_INVITED = new StateRoom("ROOM_STATE_INVITED", 2);
        StateRoom[] r02 = a();
        f82845a = r02;
        f82846b = b.a(r02);
        Companion = new a(null);
    }

    StateRoom(String r1, int r2) {
    }

    public static final /* synthetic */ StateRoom[] a() {
        return new StateRoom[]{ROOM_STATE_UNSPECIFIED, ROOM_STATE_ACCEPTED, ROOM_STATE_INVITED};
    }

    public static kotlin.enums.a getEntries() {
        return f82846b;
    }

    public static StateRoom valueOf(String r1) {
        return (StateRoom) Enum.valueOf(StateRoom.class, r1);
    }

    public static StateRoom[] values() {
        return (StateRoom[]) f82845a.clone();
    }
}
