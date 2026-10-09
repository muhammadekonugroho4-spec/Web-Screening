package com.stockbit.model.entity.chatroom;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/model/entity/chatroom/TypeRoomResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "ROOM_TYPE_UNSPECIFIED", "ROOM_TYPE_PERSONAL", "ROOM_TYPE_GROUP", "ROOM_TYPE_HEADER", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum TypeRoomResponseData extends Enum<TypeRoomResponseData> {
    public static final TypeRoomResponseData ROOM_TYPE_GROUP = null;
    public static final TypeRoomResponseData ROOM_TYPE_HEADER = null;
    public static final TypeRoomResponseData ROOM_TYPE_PERSONAL = null;
    public static final TypeRoomResponseData ROOM_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TypeRoomResponseData[] f122053a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122054b = null;

    static {
        ROOM_TYPE_UNSPECIFIED = new TypeRoomResponseData("ROOM_TYPE_UNSPECIFIED", 0);
        ROOM_TYPE_PERSONAL = new TypeRoomResponseData("ROOM_TYPE_PERSONAL", 1);
        ROOM_TYPE_GROUP = new TypeRoomResponseData("ROOM_TYPE_GROUP", 2);
        ROOM_TYPE_HEADER = new TypeRoomResponseData("ROOM_TYPE_HEADER", 3);
        TypeRoomResponseData[] r02 = a();
        f122053a = r02;
        f122054b = b.a(r02);
    }

    TypeRoomResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ TypeRoomResponseData[] a() {
        return new TypeRoomResponseData[]{ROOM_TYPE_UNSPECIFIED, ROOM_TYPE_PERSONAL, ROOM_TYPE_GROUP, ROOM_TYPE_HEADER};
    }

    public static a getEntries() {
        return f122054b;
    }

    public static TypeRoomResponseData valueOf(String r1) {
        return (TypeRoomResponseData) Enum.valueOf(TypeRoomResponseData.class, r1);
    }

    public static TypeRoomResponseData[] values() {
        return (TypeRoomResponseData[]) f122053a.clone();
    }
}
