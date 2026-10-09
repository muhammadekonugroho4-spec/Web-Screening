package com.stockbit.domain.model.mapper.stream;

import com.stockbit.model.entity.AnnouncementResponseData;

/* loaded from: classes8.dex */
public final class a implements com.stockbit.domain.model.mapper.base.a {
    public a() {
    }

    @Override // com.stockbit.domain.model.mapper.base.a
    public /* bridge */ /* synthetic */ Object a(Object r1) {
        return b((AnnouncementResponseData) r1);
    }

    public com.stockbit.domain.model.entity.stream.a b(AnnouncementResponseData r11) {
        if (r11 != null) goto L6;
        return null;
    L6:
        return new com.stockbit.domain.model.entity.stream.a(String.valueOf(r11.e()), r11.b(), r11.g(), r11.c(), r11.i(), r11.a(), r11.h(), r11.f(), r11.d());
    }
}
