package com.nineoldandroids.view;

import android.view.View;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.nineoldandroids.view.a$a, reason: collision with other inner class name */
    public static final class C0497a {
        public static void a(View r02, float r1) {
            r02.setTranslationX(r1);
        }

        public static void b(View r02, float r1) {
            r02.setTranslationY(r1);
        }

        public static void c(View r02, float r1) {
            r02.setX(r1);
        }
    }

    public static void a(View r1, float r2) {
        if (com.nineoldandroids.view.animation.a.f43617q == false) goto L6;
        com.nineoldandroids.view.animation.a.J(r1).D(r2);
        return;
    L6:
        C0497a.a(r1, r2);
    }

    public static void b(View r1, float r2) {
        if (com.nineoldandroids.view.animation.a.f43617q == false) goto L6;
        com.nineoldandroids.view.animation.a.J(r1).F(r2);
        return;
    L6:
        C0497a.b(r1, r2);
    }

    public static void c(View r1, float r2) {
        if (com.nineoldandroids.view.animation.a.f43617q == false) goto L6;
        com.nineoldandroids.view.animation.a.J(r1).G(r2);
        return;
    L6:
        C0497a.c(r1, r2);
    }
}
