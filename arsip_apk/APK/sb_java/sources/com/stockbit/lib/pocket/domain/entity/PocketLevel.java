package com.stockbit.lib.pocket.domain.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/lib/pocket/domain/entity/PocketLevel;", "", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Ljava/lang/String;II)V", "getLevel", "()I", "LEVEL_SYSTEM", "LEVEL_USER", "Companion", "pocket"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum PocketLevel extends Enum<PocketLevel> {
    public static final a Companion = null;
    public static final PocketLevel LEVEL_SYSTEM = null;
    public static final PocketLevel LEVEL_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PocketLevel[] f120339a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120340b = null;
    private final int level;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        LEVEL_SYSTEM = new PocketLevel("LEVEL_SYSTEM", 0, 0);
        LEVEL_USER = new PocketLevel("LEVEL_USER", 1, 1);
        PocketLevel[] r02 = a();
        f120339a = r02;
        f120340b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PocketLevel(String r1, int r2, int r3) {
        this.level = r3;
    }

    public static final /* synthetic */ PocketLevel[] a() {
        return new PocketLevel[]{LEVEL_SYSTEM, LEVEL_USER};
    }

    public static kotlin.enums.a getEntries() {
        return f120340b;
    }

    public static PocketLevel valueOf(String r1) {
        return (PocketLevel) Enum.valueOf(PocketLevel.class, r1);
    }

    public static PocketLevel[] values() {
        return (PocketLevel[]) f120339a.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}
