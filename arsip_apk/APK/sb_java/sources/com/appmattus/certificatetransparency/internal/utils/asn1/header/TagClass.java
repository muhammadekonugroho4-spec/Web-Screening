package com.appmattus.certificatetransparency.internal.utils.asn1.header;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/utils/asn1/header/TagClass;", "", "<init>", "(Ljava/lang/String;I)V", "Universal", "Application", "ContextSpecific", "Private", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum TagClass extends Enum<TagClass> {
    public static final TagClass Application = null;
    public static final TagClass ContextSpecific = null;
    public static final TagClass Private = null;
    public static final TagClass Universal = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TagClass[] f32150a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32151b = null;

    static {
        Universal = new TagClass("Universal", 0);
        Application = new TagClass("Application", 1);
        ContextSpecific = new TagClass("ContextSpecific", 2);
        Private = new TagClass("Private", 3);
        TagClass[] r02 = a();
        f32150a = r02;
        f32151b = kotlin.enums.b.a(r02);
    }

    TagClass(String r1, int r2) {
    }

    public static final /* synthetic */ TagClass[] a() {
        return new TagClass[]{Universal, Application, ContextSpecific, Private};
    }

    public static kotlin.enums.a getEntries() {
        return f32151b;
    }

    public static TagClass valueOf(String r1) {
        return (TagClass) Enum.valueOf(TagClass.class, r1);
    }

    public static TagClass[] values() {
        return (TagClass[]) f32150a.clone();
    }
}
