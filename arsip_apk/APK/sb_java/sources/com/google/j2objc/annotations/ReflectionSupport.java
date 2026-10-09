package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface ReflectionSupport {

    public enum Level extends Enum<Level> {
        private static final /* synthetic */ Level[] $VALUES = null;
        public static final Level FULL = null;
        public static final Level NATIVE_ONLY = null;

        static {
            Level r02 = new Level("NATIVE_ONLY", 0);
            NATIVE_ONLY = r02;
            Level r1 = new Level("FULL", 1);
            FULL = r1;
            $VALUES = new Level[]{r02, r1};
        }

        Level(String r1, int r2) {
        }

        public static Level valueOf(String r1) {
            return (Level) Enum.valueOf(Level.class, r1);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    Level value();
}
