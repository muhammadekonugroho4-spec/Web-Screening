package com.stockbit.discoverfriend.contract;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/discoverfriend/contract/DiscoverFriendState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_EMPTY", "STATE_NOT_FOUND", "STATE_LOADING", "STATE_DATA", "discoverfriend-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum DiscoverFriendState extends Enum<DiscoverFriendState> {
    public static final DiscoverFriendState STATE_DATA = null;
    public static final DiscoverFriendState STATE_EMPTY = null;
    public static final DiscoverFriendState STATE_LOADING = null;
    public static final DiscoverFriendState STATE_NOT_FOUND = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DiscoverFriendState[] f80229a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80230b = null;
    private final int value;

    static {
        STATE_EMPTY = new DiscoverFriendState("STATE_EMPTY", 0, 0);
        STATE_NOT_FOUND = new DiscoverFriendState("STATE_NOT_FOUND", 1, 1);
        STATE_LOADING = new DiscoverFriendState("STATE_LOADING", 2, 2);
        STATE_DATA = new DiscoverFriendState("STATE_DATA", 3, 3);
        DiscoverFriendState[] r02 = a();
        f80229a = r02;
        f80230b = b.a(r02);
    }

    DiscoverFriendState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ DiscoverFriendState[] a() {
        return new DiscoverFriendState[]{STATE_EMPTY, STATE_NOT_FOUND, STATE_LOADING, STATE_DATA};
    }

    public static kotlin.enums.a getEntries() {
        return f80230b;
    }

    public static DiscoverFriendState valueOf(String r1) {
        return (DiscoverFriendState) Enum.valueOf(DiscoverFriendState.class, r1);
    }

    public static DiscoverFriendState[] values() {
        return (DiscoverFriendState[]) f80229a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
