package com.skydoves.balloon.compose;

/* loaded from: classes6.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ void a(b r1, int r2, int r3, int r4, Object r5) {
            if (r5 != null) goto L12;
            if ((r4 & 1) == 0) goto L7;
            r2 = 0;
        L7:
            if ((r4 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            r1.a(r2, r3);
            return;
        L12:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignBottom");
        }

        public static /* synthetic */ void b(b r1, int r2, int r3, int r4, Object r5) {
            if (r5 != null) goto L12;
            if ((r4 & 1) == 0) goto L7;
            r2 = 0;
        L7:
            if ((r4 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            r1.b(r2, r3);
            return;
        L12:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignTop");
        }
    }

    void a(int r1, int r2);

    void b(int r1, int r2);

    void dismiss();
}
