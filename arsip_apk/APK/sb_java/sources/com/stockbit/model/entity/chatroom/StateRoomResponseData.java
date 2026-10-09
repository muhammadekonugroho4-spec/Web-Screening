package com.stockbit.model.entity.chatroom;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/model/entity/chatroom/StateRoomResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "ROOM_STATE_UNSPECIFIED", "ROOM_STATE_ACCEPTED", "ROOM_STATE_INVITED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum StateRoomResponseData extends Enum<StateRoomResponseData> {
    public static final StateRoomResponseData ROOM_STATE_ACCEPTED = null;
    public static final StateRoomResponseData ROOM_STATE_INVITED = null;
    public static final StateRoomResponseData ROOM_STATE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StateRoomResponseData[] f122051a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122052b = null;

    static {
        ROOM_STATE_UNSPECIFIED = new StateRoomResponseData("ROOM_STATE_UNSPECIFIED", 0);
        ROOM_STATE_ACCEPTED = new StateRoomResponseData("ROOM_STATE_ACCEPTED", 1);
        ROOM_STATE_INVITED = new StateRoomResponseData("ROOM_STATE_INVITED", 2);
        StateRoomResponseData[] r02 = a();
        f122051a = r02;
        f122052b = b.a(r02);
    }

    StateRoomResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ StateRoomResponseData[] a() {
        return new StateRoomResponseData[]{ROOM_STATE_UNSPECIFIED, ROOM_STATE_ACCEPTED, ROOM_STATE_INVITED};
    }

    public static a getEntries() {
        return f122052b;
    }

    public static StateRoomResponseData valueOf(String r1) {
        return (StateRoomResponseData) Enum.valueOf(StateRoomResponseData.class, r1);
    }

    public static StateRoomResponseData[] values() {
        return (StateRoomResponseData[]) f122051a.clone();
    }
}
