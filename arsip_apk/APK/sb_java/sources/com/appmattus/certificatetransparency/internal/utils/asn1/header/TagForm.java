package com.appmattus.certificatetransparency.internal.utils.asn1.header;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/utils/asn1/header/TagForm;", "", "<init>", "(Ljava/lang/String;I)V", "Primitive", "Constructed", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum TagForm extends Enum<TagForm> {
    public static final TagForm Constructed = null;
    public static final TagForm Primitive = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TagForm[] f32152a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f32153b = null;

    static {
        Primitive = new TagForm("Primitive", 0);
        Constructed = new TagForm("Constructed", 1);
        TagForm[] r02 = a();
        f32152a = r02;
        f32153b = kotlin.enums.b.a(r02);
    }

    TagForm(String r1, int r2) {
    }

    public static final /* synthetic */ TagForm[] a() {
        return new TagForm[]{Primitive, Constructed};
    }

    public static kotlin.enums.a getEntries() {
        return f32153b;
    }

    public static TagForm valueOf(String r1) {
        return (TagForm) Enum.valueOf(TagForm.class, r1);
    }

    public static TagForm[] values() {
        return (TagForm[]) f32152a.clone();
    }
}
