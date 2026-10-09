package com.stockbit.usecase.chat.model.room;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/RoomIdType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_ROOM_ID", "TYPE_USER_ID", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RoomIdType extends Enum<RoomIdType> {
    public static final RoomIdType TYPE_ROOM_ID = null;
    public static final RoomIdType TYPE_USER_ID = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RoomIdType[] f155601a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155602b = null;

    static {
        TYPE_ROOM_ID = new RoomIdType("TYPE_ROOM_ID", 0);
        TYPE_USER_ID = new RoomIdType("TYPE_USER_ID", 1);
        RoomIdType[] r02 = a();
        f155601a = r02;
        f155602b = b.a(r02);
    }

    RoomIdType(String r1, int r2) {
    }

    public static final /* synthetic */ RoomIdType[] a() {
        return new RoomIdType[]{TYPE_ROOM_ID, TYPE_USER_ID};
    }

    public static a getEntries() {
        return f155602b;
    }

    public static RoomIdType valueOf(String r1) {
        return (RoomIdType) Enum.valueOf(RoomIdType.class, r1);
    }

    public static RoomIdType[] values() {
        return (RoomIdType[]) f155601a.clone();
    }
}
