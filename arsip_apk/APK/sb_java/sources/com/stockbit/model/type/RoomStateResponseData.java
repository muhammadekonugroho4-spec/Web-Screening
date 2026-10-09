package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/model/type/RoomStateResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "ROOM_STATE_UNSPECIFIED", "ROOM_STATE_INVITED", "ROOM_STATE_ACCEPTED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum RoomStateResponseData extends Enum<RoomStateResponseData> {
    public static final RoomStateResponseData ROOM_STATE_ACCEPTED = null;
    public static final RoomStateResponseData ROOM_STATE_INVITED = null;
    public static final RoomStateResponseData ROOM_STATE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RoomStateResponseData[] f122201a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122202b = null;

    static {
        ROOM_STATE_UNSPECIFIED = new RoomStateResponseData("ROOM_STATE_UNSPECIFIED", 0);
        ROOM_STATE_INVITED = new RoomStateResponseData("ROOM_STATE_INVITED", 1);
        ROOM_STATE_ACCEPTED = new RoomStateResponseData("ROOM_STATE_ACCEPTED", 2);
        RoomStateResponseData[] r02 = a();
        f122201a = r02;
        f122202b = kotlin.enums.b.a(r02);
    }

    RoomStateResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ RoomStateResponseData[] a() {
        return new RoomStateResponseData[]{ROOM_STATE_UNSPECIFIED, ROOM_STATE_INVITED, ROOM_STATE_ACCEPTED};
    }

    public static kotlin.enums.a getEntries() {
        return f122202b;
    }

    public static RoomStateResponseData valueOf(String r1) {
        return (RoomStateResponseData) Enum.valueOf(RoomStateResponseData.class, r1);
    }

    public static RoomStateResponseData[] values() {
        return (RoomStateResponseData[]) f122201a.clone();
    }
}
