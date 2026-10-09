package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes5.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = null;

    static {
        instance = new ArgbEvaluatorCompat();
    }

    public ArgbEvaluatorCompat() {
    }

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Integer evaluate(float r1, Integer r2, Integer r3) {
        return evaluate2(r1, r2, r3);
    }

    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public Integer evaluate2(float r12, Integer r13, Integer r14) {
        int r132 = r13.intValue();
        float r02 = ((r132 >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r2 = ((r132 >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r3 = ((r132 >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        int r142 = r14.intValue();
        float r4 = ((r142 >> 24) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r5 = ((r142 >> 16) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r6 = ((r142 >> 8) & Constants.MAX_HOST_LENGTH) / 255.0f;
        float r22 = (float) Math.pow(r2, 2.2d);
        float r32 = (float) Math.pow(r3, 2.2d);
        float r133 = (float) Math.pow((r132 & Constants.MAX_HOST_LENGTH) / 255.0f, 2.2d);
        float r52 = (float) Math.pow(r5, 2.2d);
        float r03 = r02 + ((r4 - r02) * r12);
        float r33 = r32 + ((((float) Math.pow(r6, 2.2d)) - r32) * r12);
        float r134 = r133 + (r12 * (((float) Math.pow((r142 & Constants.MAX_HOST_LENGTH) / 255.0f, 2.2d)) - r133));
        float r122 = ((float) Math.pow(r22 + ((r52 - r22) * r12), 0.45454545454545453d)) * 255.0f;
        float r143 = ((float) Math.pow(r33, 0.45454545454545453d)) * 255.0f;
        float r135 = ((float) Math.pow(r134, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf((((Math.round(r122) << 16) | (Math.round(r03 * 255.0f) << 24)) | (Math.round(r143) << 8)) | Math.round(r135));
    }
}
