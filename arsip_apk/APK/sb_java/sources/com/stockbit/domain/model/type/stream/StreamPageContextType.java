package com.stockbit.domain.model.type.stream;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/stream/StreamPageContextType;", "", "string", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "COMPANY", "PROFILE", "STREAM", "DEEP_LINK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StreamPageContextType extends Enum<StreamPageContextType> {
    public static final StreamPageContextType COMPANY = null;
    public static final StreamPageContextType DEEP_LINK = null;
    public static final StreamPageContextType PROFILE = null;
    public static final StreamPageContextType STREAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StreamPageContextType[] f86485a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86486b = null;
    private final String string;

    static {
        COMPANY = new StreamPageContextType("COMPANY", 0, "company.conversation");
        PROFILE = new StreamPageContextType("PROFILE", 1, "profile.conversation");
        STREAM = new StreamPageContextType("STREAM", 2, "stream.convesation");
        DEEP_LINK = new StreamPageContextType("DEEP_LINK", 3, "deep_link.conversation");
        StreamPageContextType[] r02 = a();
        f86485a = r02;
        f86486b = b.a(r02);
    }

    StreamPageContextType(String r1, int r2, String r3) {
        this.string = r3;
    }

    public static final /* synthetic */ StreamPageContextType[] a() {
        return new StreamPageContextType[]{COMPANY, PROFILE, STREAM, DEEP_LINK};
    }

    public static kotlin.enums.a getEntries() {
        return f86486b;
    }

    public static StreamPageContextType valueOf(String r1) {
        return (StreamPageContextType) Enum.valueOf(StreamPageContextType.class, r1);
    }

    public static StreamPageContextType[] values() {
        return (StreamPageContextType[]) f86485a.clone();
    }

    public final String getString() {
        return this.string;
    }
}
