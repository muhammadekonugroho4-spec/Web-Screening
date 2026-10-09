package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> r2) {
        this(r2, null);
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.DecoderFactory
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (this.bitmapConfig != null) goto L7;
        return this.clazz.newInstance();
    L7:
        return this.clazz.getConstructor(new Class[]{Bitmap.Config.class}).newInstance(new Object[]{this.bitmapConfig});
    }

    public CompatDecoderFactory(Class<? extends T> r1, Bitmap.Config r2) {
        this.clazz = r1;
        this.bitmapConfig = r2;
    }
}
