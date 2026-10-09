package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$LayoutType extends Enum<LayoutProto$LayoutType> implements AbstractC3997u.a {
    public static final LayoutProto$LayoutType ANDROID_REMOTE_VIEWS = null;
    public static final int ANDROID_REMOTE_VIEWS_VALUE = 11;
    public static final LayoutProto$LayoutType BOX = null;
    public static final int BOX_VALUE = 3;
    public static final LayoutProto$LayoutType BUTTON = null;
    public static final int BUTTON_VALUE = 8;
    public static final LayoutProto$LayoutType CHECK_BOX = null;
    public static final int CHECK_BOX_VALUE = 7;
    public static final LayoutProto$LayoutType CIRCULAR_PROGRESS_INDICATOR = null;
    public static final int CIRCULAR_PROGRESS_INDICATOR_VALUE = 15;
    public static final LayoutProto$LayoutType COLUMN = null;
    public static final int COLUMN_VALUE = 2;
    public static final LayoutProto$LayoutType IMAGE = null;
    public static final int IMAGE_VALUE = 13;
    public static final LayoutProto$LayoutType LAZY_COLUMN = null;
    public static final int LAZY_COLUMN_VALUE = 5;
    public static final LayoutProto$LayoutType LAZY_VERTICAL_GRID = null;
    public static final int LAZY_VERTICAL_GRID_VALUE = 16;
    public static final LayoutProto$LayoutType LINEAR_PROGRESS_INDICATOR = null;
    public static final int LINEAR_PROGRESS_INDICATOR_VALUE = 14;
    public static final LayoutProto$LayoutType LIST_ITEM = null;
    public static final int LIST_ITEM_VALUE = 6;
    public static final LayoutProto$LayoutType RADIO_BUTTON = null;
    public static final int RADIO_BUTTON_VALUE = 19;
    public static final LayoutProto$LayoutType RADIO_COLUMN = null;
    public static final int RADIO_COLUMN_VALUE = 21;
    public static final LayoutProto$LayoutType RADIO_GROUP = null;
    public static final int RADIO_GROUP_VALUE = 18;
    public static final LayoutProto$LayoutType RADIO_ROW = null;
    public static final int RADIO_ROW_VALUE = 20;
    public static final LayoutProto$LayoutType REMOTE_VIEWS_ROOT = null;
    public static final int REMOTE_VIEWS_ROOT_VALUE = 12;
    public static final LayoutProto$LayoutType ROW = null;
    public static final int ROW_VALUE = 1;
    public static final LayoutProto$LayoutType SIZE_BOX = null;
    public static final int SIZE_BOX_VALUE = 22;
    public static final LayoutProto$LayoutType SPACER = null;
    public static final int SPACER_VALUE = 9;
    public static final LayoutProto$LayoutType SWITCH = null;
    public static final int SWITCH_VALUE = 10;
    public static final LayoutProto$LayoutType TEXT = null;
    public static final int TEXT_VALUE = 4;
    public static final LayoutProto$LayoutType UNKNOWN_TYPE = null;
    public static final int UNKNOWN_TYPE_VALUE = 0;
    public static final LayoutProto$LayoutType UNRECOGNIZED = null;
    public static final LayoutProto$LayoutType VERTICAL_GRID_ITEM = null;
    public static final int VERTICAL_GRID_ITEM_VALUE = 17;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24948a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$LayoutType[] f24949b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24950a = null;

        static {
            f24950a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$LayoutType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UNKNOWN_TYPE = new LayoutProto$LayoutType("UNKNOWN_TYPE", 0, 0);
        ROW = new LayoutProto$LayoutType("ROW", 1, 1);
        COLUMN = new LayoutProto$LayoutType("COLUMN", 2, 2);
        BOX = new LayoutProto$LayoutType("BOX", 3, 3);
        TEXT = new LayoutProto$LayoutType("TEXT", 4, 4);
        LAZY_COLUMN = new LayoutProto$LayoutType("LAZY_COLUMN", 5, 5);
        LIST_ITEM = new LayoutProto$LayoutType("LIST_ITEM", 6, 6);
        CHECK_BOX = new LayoutProto$LayoutType("CHECK_BOX", 7, 7);
        BUTTON = new LayoutProto$LayoutType("BUTTON", 8, 8);
        SPACER = new LayoutProto$LayoutType("SPACER", 9, 9);
        SWITCH = new LayoutProto$LayoutType("SWITCH", 10, 10);
        ANDROID_REMOTE_VIEWS = new LayoutProto$LayoutType("ANDROID_REMOTE_VIEWS", 11, 11);
        REMOTE_VIEWS_ROOT = new LayoutProto$LayoutType("REMOTE_VIEWS_ROOT", 12, 12);
        IMAGE = new LayoutProto$LayoutType("IMAGE", 13, 13);
        LINEAR_PROGRESS_INDICATOR = new LayoutProto$LayoutType("LINEAR_PROGRESS_INDICATOR", 14, 14);
        CIRCULAR_PROGRESS_INDICATOR = new LayoutProto$LayoutType("CIRCULAR_PROGRESS_INDICATOR", 15, 15);
        LAZY_VERTICAL_GRID = new LayoutProto$LayoutType("LAZY_VERTICAL_GRID", 16, 16);
        VERTICAL_GRID_ITEM = new LayoutProto$LayoutType("VERTICAL_GRID_ITEM", 17, 17);
        RADIO_GROUP = new LayoutProto$LayoutType("RADIO_GROUP", 18, 18);
        RADIO_BUTTON = new LayoutProto$LayoutType("RADIO_BUTTON", 19, 19);
        RADIO_ROW = new LayoutProto$LayoutType("RADIO_ROW", 20, 20);
        RADIO_COLUMN = new LayoutProto$LayoutType("RADIO_COLUMN", 21, 21);
        SIZE_BOX = new LayoutProto$LayoutType("SIZE_BOX", 22, 22);
        UNRECOGNIZED = new LayoutProto$LayoutType("UNRECOGNIZED", 23, -1);
        f24949b = a();
        f24948a = new a();
    }

    LayoutProto$LayoutType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$LayoutType[] a() {
        return new LayoutProto$LayoutType[]{UNKNOWN_TYPE, ROW, COLUMN, BOX, TEXT, LAZY_COLUMN, LIST_ITEM, CHECK_BOX, BUTTON, SPACER, SWITCH, ANDROID_REMOTE_VIEWS, REMOTE_VIEWS_ROOT, IMAGE, LINEAR_PROGRESS_INDICATOR, CIRCULAR_PROGRESS_INDICATOR, LAZY_VERTICAL_GRID, VERTICAL_GRID_ITEM, RADIO_GROUP, RADIO_BUTTON, RADIO_ROW, RADIO_COLUMN, SIZE_BOX, UNRECOGNIZED};
    }

    public static LayoutProto$LayoutType forNumber(int r02) {
        switch(r02) {
            case 0: goto L50;
            case 1: goto L48;
            case 2: goto L46;
            case 3: goto L44;
            case 4: goto L42;
            case 5: goto L40;
            case 6: goto L38;
            case 7: goto L36;
            case 8: goto L34;
            case 9: goto L32;
            case 10: goto L30;
            case 11: goto L28;
            case 12: goto L26;
            case 13: goto L24;
            case 14: goto L22;
            case 15: goto L20;
            case 16: goto L18;
            case 17: goto L16;
            case 18: goto L14;
            case 19: goto L12;
            case 20: goto L10;
            case 21: goto L8;
            case 22: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return SIZE_BOX;
    L8:
        return RADIO_COLUMN;
    L10:
        return RADIO_ROW;
    L12:
        return RADIO_BUTTON;
    L14:
        return RADIO_GROUP;
    L16:
        return VERTICAL_GRID_ITEM;
    L18:
        return LAZY_VERTICAL_GRID;
    L20:
        return CIRCULAR_PROGRESS_INDICATOR;
    L22:
        return LINEAR_PROGRESS_INDICATOR;
    L24:
        return IMAGE;
    L26:
        return REMOTE_VIEWS_ROOT;
    L28:
        return ANDROID_REMOTE_VIEWS;
    L30:
        return SWITCH;
    L32:
        return SPACER;
    L34:
        return BUTTON;
    L36:
        return CHECK_BOX;
    L38:
        return LIST_ITEM;
    L40:
        return LAZY_COLUMN;
    L42:
        return TEXT;
    L44:
        return BOX;
    L46:
        return COLUMN;
    L48:
        return ROW;
    L50:
        return UNKNOWN_TYPE;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24948a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24950a;
    }

    public static LayoutProto$LayoutType valueOf(String r1) {
        return (LayoutProto$LayoutType) Enum.valueOf(LayoutProto$LayoutType.class, r1);
    }

    public static LayoutProto$LayoutType[] values() {
        return (LayoutProto$LayoutType[]) f24949b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$LayoutType valueOf(int r02) {
        return forNumber(r02);
    }
}
