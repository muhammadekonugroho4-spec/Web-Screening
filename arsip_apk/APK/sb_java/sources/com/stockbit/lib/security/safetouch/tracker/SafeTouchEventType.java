package com.stockbit.lib.security.safetouch.tracker;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/lib/security/safetouch/tracker/SafeTouchEventType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SAFE", "UNSAFE", "SUSPICIOUS", "security_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SafeTouchEventType extends Enum<SafeTouchEventType> {
    public static final SafeTouchEventType SAFE = null;
    public static final SafeTouchEventType SUSPICIOUS = null;
    public static final SafeTouchEventType UNSAFE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SafeTouchEventType[] f120493a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120494b = null;
    private final String value;

    static {
        SAFE = new SafeTouchEventType("SAFE", 0, "safe");
        UNSAFE = new SafeTouchEventType("UNSAFE", 1, "unsafe");
        SUSPICIOUS = new SafeTouchEventType("SUSPICIOUS", 2, "suspicious");
        SafeTouchEventType[] r02 = a();
        f120493a = r02;
        f120494b = b.a(r02);
    }

    SafeTouchEventType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SafeTouchEventType[] a() {
        return new SafeTouchEventType[]{SAFE, UNSAFE, SUSPICIOUS};
    }

    public static kotlin.enums.a getEntries() {
        return f120494b;
    }

    public static SafeTouchEventType valueOf(String r1) {
        return (SafeTouchEventType) Enum.valueOf(SafeTouchEventType.class, r1);
    }

    public static SafeTouchEventType[] values() {
        return (SafeTouchEventType[]) f120493a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
