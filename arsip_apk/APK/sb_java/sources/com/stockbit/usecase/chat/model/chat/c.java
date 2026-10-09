package com.stockbit.usecase.chat.model.chat;

import com.stockbit.usecase.chat.model.chat.room.RoomStateType;

/* loaded from: classes2.dex */
public interface c extends i {
    f a();

    boolean b();

    int c();

    boolean d();

    default boolean e() {
        if (getState() != RoomStateType.ROOM_STATE_INVITED) goto L6;
        return true;
    L6:
        return false;
    }

    boolean f();

    RoomStateType getState();

    boolean h();
}
