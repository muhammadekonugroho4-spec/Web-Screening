package com.google.j2objc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface LoopTranslation {

    public enum LoopStyle extends Enum<LoopStyle> {
        private static final /* synthetic */ LoopStyle[] $VALUES = null;
        public static final LoopStyle FAST_ENUMERATION = null;
        public static final LoopStyle JAVA_ITERATOR = null;

        static {
            LoopStyle r02 = new LoopStyle("JAVA_ITERATOR", 0);
            JAVA_ITERATOR = r02;
            LoopStyle r1 = new LoopStyle("FAST_ENUMERATION", 1);
            FAST_ENUMERATION = r1;
            $VALUES = new LoopStyle[]{r02, r1};
        }

        LoopStyle(String r1, int r2) {
        }

        public static LoopStyle valueOf(String r1) {
            return (LoopStyle) Enum.valueOf(LoopStyle.class, r1);
        }

        public static LoopStyle[] values() {
            return (LoopStyle[]) $VALUES.clone();
        }
    }

    LoopStyle value();
}
