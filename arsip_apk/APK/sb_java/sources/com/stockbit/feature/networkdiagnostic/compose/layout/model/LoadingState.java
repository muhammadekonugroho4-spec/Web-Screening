package com.stockbit.feature.networkdiagnostic.compose.layout.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/feature/networkdiagnostic/compose/layout/model/LoadingState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INITIAL", "ANALYZING", "BAD", "GOOD", "NORMAL", "networkdiagnostic_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum LoadingState extends Enum<LoadingState> {
    public static final LoadingState ANALYZING = null;
    public static final LoadingState BAD = null;
    public static final LoadingState GOOD = null;
    public static final LoadingState INITIAL = null;
    public static final LoadingState NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoadingState[] f100443a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f100444b = null;
    private final String value;

    static {
        INITIAL = new LoadingState("INITIAL", 0, "Initial");
        ANALYZING = new LoadingState("ANALYZING", 1, "Analyzing");
        BAD = new LoadingState("BAD", 2, "Bad");
        GOOD = new LoadingState("GOOD", 3, "Good");
        NORMAL = new LoadingState("NORMAL", 4, "Normal");
        LoadingState[] r02 = a();
        f100443a = r02;
        f100444b = b.a(r02);
    }

    LoadingState(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ LoadingState[] a() {
        return new LoadingState[]{INITIAL, ANALYZING, BAD, GOOD, NORMAL};
    }

    public static a getEntries() {
        return f100444b;
    }

    public static LoadingState valueOf(String r1) {
        return (LoadingState) Enum.valueOf(LoadingState.class, r1);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) f100443a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
