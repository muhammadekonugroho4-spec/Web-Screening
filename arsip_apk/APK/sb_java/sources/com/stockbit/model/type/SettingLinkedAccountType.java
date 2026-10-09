package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/model/type/SettingLinkedAccountType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GOOGLE", "FACEBOOK", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SettingLinkedAccountType extends Enum<SettingLinkedAccountType> {
    public static final a Companion = null;
    public static final SettingLinkedAccountType FACEBOOK = null;
    public static final SettingLinkedAccountType GOOGLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SettingLinkedAccountType[] f122216a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122217b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GOOGLE = new SettingLinkedAccountType("GOOGLE", 0, "Google");
        FACEBOOK = new SettingLinkedAccountType("FACEBOOK", 1, "Facebook");
        SettingLinkedAccountType[] r02 = a();
        f122216a = r02;
        f122217b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SettingLinkedAccountType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SettingLinkedAccountType[] a() {
        return new SettingLinkedAccountType[]{GOOGLE, FACEBOOK};
    }

    public static kotlin.enums.a getEntries() {
        return f122217b;
    }

    public static SettingLinkedAccountType valueOf(String r1) {
        return (SettingLinkedAccountType) Enum.valueOf(SettingLinkedAccountType.class, r1);
    }

    public static SettingLinkedAccountType[] values() {
        return (SettingLinkedAccountType[]) f122216a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
