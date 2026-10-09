package org.koin.core.logger;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/logger/Level;", "", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum Level extends Enum<Level> {
    public static final Level DEBUG = null;
    public static final Level ERROR = null;
    public static final Level INFO = null;
    public static final Level NONE = null;
    public static final Level WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Level[] f182580a = null;

    static {
        DEBUG = new Level("DEBUG", 0);
        INFO = new Level("INFO", 1);
        WARNING = new Level("WARNING", 2);
        ERROR = new Level("ERROR", 3);
        NONE = new Level("NONE", 4);
        f182580a = a();
    }

    Level(String r1, int r2) {
    }

    public static final /* synthetic */ Level[] a() {
        return new Level[]{DEBUG, INFO, WARNING, ERROR, NONE};
    }

    public static Level valueOf(String r1) {
        return (Level) Enum.valueOf(Level.class, r1);
    }

    public static Level[] values() {
        return (Level[]) f182580a.clone();
    }
}
