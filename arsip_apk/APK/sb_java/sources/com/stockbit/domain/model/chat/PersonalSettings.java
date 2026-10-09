package com.stockbit.domain.model.chat;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/chat/PersonalSettings;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PERSONAL_SETTING_EVERYBODY", "PERSONAL_SETTING_NOBODY", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum PersonalSettings extends Enum<PersonalSettings> {
    public static final a Companion = null;
    public static final PersonalSettings PERSONAL_SETTING_EVERYBODY = null;
    public static final PersonalSettings PERSONAL_SETTING_NOBODY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PersonalSettings[] f81189a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f81190b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final PersonalSettings a(String r4) {
            Iterator<E> r02 = PersonalSettings.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((PersonalSettings) r1).getValue(), r4) == false) goto L4;
        L9:
            PersonalSettings r12 = (PersonalSettings) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PersonalSettings.PERSONAL_SETTING_EVERYBODY;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        PERSONAL_SETTING_EVERYBODY = new PersonalSettings("PERSONAL_SETTING_EVERYBODY", 0, "PERSONAL_SETTING_EVERYBODY");
        PERSONAL_SETTING_NOBODY = new PersonalSettings("PERSONAL_SETTING_NOBODY", 1, "PERSONAL_SETTING_NOBODY");
        PersonalSettings[] r02 = a();
        f81189a = r02;
        f81190b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PersonalSettings(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PersonalSettings[] a() {
        return new PersonalSettings[]{PERSONAL_SETTING_EVERYBODY, PERSONAL_SETTING_NOBODY};
    }

    public static kotlin.enums.a getEntries() {
        return f81190b;
    }

    public static PersonalSettings valueOf(String r1) {
        return (PersonalSettings) Enum.valueOf(PersonalSettings.class, r1);
    }

    public static PersonalSettings[] values() {
        return (PersonalSettings[]) f81189a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
