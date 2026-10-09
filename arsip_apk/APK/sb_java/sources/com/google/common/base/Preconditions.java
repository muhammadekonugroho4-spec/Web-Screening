package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int r1, int r2, String r3) {
        if (r1 < 0) goto L4;
        if (r2 >= 0) goto L7;
        StringBuilder r32 = new StringBuilder(26);
        r32.append("negative size: ");
        r32.append(r2);
        throw new IllegalArgumentException(r32.toString());
    L7:
        return Strings.lenientFormat("%s (%s) must be less than size (%s)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)});
    L4:
        return Strings.lenientFormat("%s (%s) must not be negative", new Object[]{r3, Integer.valueOf(r1)});
    }

    private static String badPositionIndex(int r1, int r2, String r3) {
        if (r1 < 0) goto L4;
        if (r2 >= 0) goto L7;
        StringBuilder r32 = new StringBuilder(26);
        r32.append("negative size: ");
        r32.append(r2);
        throw new IllegalArgumentException(r32.toString());
    L7:
        return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", new Object[]{r3, Integer.valueOf(r1), Integer.valueOf(r2)});
    L4:
        return Strings.lenientFormat("%s (%s) must not be negative", new Object[]{r3, Integer.valueOf(r1)});
    }

    private static String badPositionIndexes(int r02, int r1, int r2) {
        if (r02 < 0) goto L13;
        if (r02 > r2) goto L13;
        if (r1 < 0) goto L11;
        if (r1 > r2) goto L11;
        return Strings.lenientFormat("end index (%s) must not be less than start index (%s)", new Object[]{Integer.valueOf(r1), Integer.valueOf(r02)});
    L11:
        return badPositionIndex(r1, r2, "end index");
    L13:
        return badPositionIndex(r02, r2, "start index");
    }

    public static void checkArgument(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException();
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int r1, int r2) {
        return checkElementIndex(r1, r2, FirebaseAnalytics.Param.INDEX);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02) {
        r02.getClass();
        return r02;
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int r1, int r2) {
        return checkPositionIndex(r1, r2, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndexes(int r1, int r2, int r3) {
        if (r1 < 0) goto L7;
        if (r2 < r1) goto L7;
        if (r2 > r3) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(badPositionIndexes(r1, r2, r3));
    }

    public static void checkState(boolean r02) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException();
    }

    public static void checkArgument(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(String.valueOf(r1));
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int r1, int r2, String r3) {
        if (r1 < 0) goto L6;
        if (r1 >= r2) goto L6;
        return r1;
    L6:
        throw new IndexOutOfBoundsException(badElementIndex(r1, r2, r3));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, Object r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(String.valueOf(r1));
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int r1, int r2, String r3) {
        if (r1 < 0) goto L6;
        if (r1 > r2) goto L6;
        return r1;
    L6:
        throw new IndexOutOfBoundsException(badPositionIndex(r1, r2, r3));
    }

    public static void checkState(boolean r02, Object r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(String.valueOf(r1));
    }

    public static void checkArgument(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, r2));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object... r2) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, r2));
    }

    public static void checkState(boolean r02, String r1, Object... r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, r2));
    }

    public static void checkArgument(boolean r02, String r1, char r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, char r2) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2)}));
    }

    public static void checkState(boolean r02, String r1, char r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2)}));
    }

    public static void checkArgument(boolean r02, String r1, int r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, int r2) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2)}));
    }

    public static void checkState(boolean r02, String r1, int r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2)}));
    }

    public static void checkArgument(boolean r02, String r1, long r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, long r2) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2)}));
    }

    public static void checkState(boolean r02, String r1, long r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2)}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2}));
    }

    public static void checkState(boolean r02, String r1, Object r2) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2}));
    }

    public static void checkArgument(boolean r02, String r1, char r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Character.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, char r2, char r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Character.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, char r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Character.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, char r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Integer.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, char r2, int r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Integer.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, char r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Integer.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, char r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Long.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, char r2, long r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Long.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, char r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), Long.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, char r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), r3}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, char r2, Object r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), r3}));
    }

    public static void checkState(boolean r02, String r1, char r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Character.valueOf(r2), r3}));
    }

    public static void checkArgument(boolean r02, String r1, int r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Character.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, int r2, char r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Character.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, int r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Character.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, int r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Integer.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, int r2, int r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Integer.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, int r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Integer.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, int r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Long.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, int r2, long r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Long.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, int r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), Long.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, int r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), r3}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, int r2, Object r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), r3}));
    }

    public static void checkState(boolean r02, String r1, int r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Integer.valueOf(r2), r3}));
    }

    public static void checkArgument(boolean r02, String r1, long r2, char r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Character.valueOf(r4)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, long r2, char r4) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Character.valueOf(r4)}));
    }

    public static void checkState(boolean r02, String r1, long r2, char r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Character.valueOf(r4)}));
    }

    public static void checkArgument(boolean r02, String r1, long r2, int r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Integer.valueOf(r4)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, long r2, int r4) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Integer.valueOf(r4)}));
    }

    public static void checkState(boolean r02, String r1, long r2, int r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Integer.valueOf(r4)}));
    }

    public static void checkArgument(boolean r02, String r1, long r2, long r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Long.valueOf(r4)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, long r2, long r4) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Long.valueOf(r4)}));
    }

    public static void checkState(boolean r02, String r1, long r2, long r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), Long.valueOf(r4)}));
    }

    public static void checkArgument(boolean r02, String r1, long r2, Object r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), r4}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, long r2, Object r4) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), r4}));
    }

    public static void checkState(boolean r02, String r1, long r2, Object r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{Long.valueOf(r2), r4}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, Character.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, char r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, Character.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, Object r2, char r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, Character.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, Integer.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, int r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, Integer.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, Object r2, int r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, Integer.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, Long.valueOf(r3)}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, long r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, Long.valueOf(r3)}));
    }

    public static void checkState(boolean r02, String r1, Object r2, long r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, Long.valueOf(r3)}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, r3}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, Object r3) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, r3}));
    }

    public static void checkState(boolean r02, String r1, Object r2, Object r3) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, r3}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, Object r3, Object r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, Object r3, Object r4) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4}));
    }

    public static void checkState(boolean r02, String r1, Object r2, Object r3, Object r4) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4}));
    }

    public static void checkArgument(boolean r02, String r1, Object r2, Object r3, Object r4, Object r5) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4, r5}));
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T r02, String r1, Object r2, Object r3, Object r4, Object r5) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4, r5}));
    }

    public static void checkState(boolean r02, String r1, Object r2, Object r3, Object r4, Object r5) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(Strings.lenientFormat(r1, new Object[]{r2, r3, r4, r5}));
    }
}
