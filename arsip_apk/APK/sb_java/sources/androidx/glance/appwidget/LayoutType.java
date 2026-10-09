package androidx.glance.appwidget;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Landroidx/glance/appwidget/LayoutType;", "", "(Ljava/lang/String;I)V", "Row", "Column", "Box", "Text", "List", "CheckBox", "CheckBoxBackport", "Button", "Frame", "LinearProgressIndicator", "CircularProgressIndicator", "VerticalGridOneColumn", "VerticalGridTwoColumns", "VerticalGridThreeColumns", "VerticalGridFourColumns", "VerticalGridFiveColumns", "VerticalGridAutoFit", "Swtch", "SwtchBackport", "ImageCrop", "ImageFit", "ImageFillBounds", "ImageCropDecorative", "ImageFitDecorative", "ImageFillBoundsDecorative", "RadioButton", "RadioButtonBackport", "RadioRow", "RadioColumn", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LayoutType extends Enum<LayoutType> {
    public static final LayoutType Box = null;
    public static final LayoutType Button = null;
    public static final LayoutType CheckBox = null;
    public static final LayoutType CheckBoxBackport = null;
    public static final LayoutType CircularProgressIndicator = null;
    public static final LayoutType Column = null;
    public static final LayoutType Frame = null;
    public static final LayoutType ImageCrop = null;
    public static final LayoutType ImageCropDecorative = null;
    public static final LayoutType ImageFillBounds = null;
    public static final LayoutType ImageFillBoundsDecorative = null;
    public static final LayoutType ImageFit = null;
    public static final LayoutType ImageFitDecorative = null;
    public static final LayoutType LinearProgressIndicator = null;
    public static final LayoutType List = null;
    public static final LayoutType RadioButton = null;
    public static final LayoutType RadioButtonBackport = null;
    public static final LayoutType RadioColumn = null;
    public static final LayoutType RadioRow = null;
    public static final LayoutType Row = null;
    public static final LayoutType Swtch = null;
    public static final LayoutType SwtchBackport = null;
    public static final LayoutType Text = null;
    public static final LayoutType VerticalGridAutoFit = null;
    public static final LayoutType VerticalGridFiveColumns = null;
    public static final LayoutType VerticalGridFourColumns = null;
    public static final LayoutType VerticalGridOneColumn = null;
    public static final LayoutType VerticalGridThreeColumns = null;
    public static final LayoutType VerticalGridTwoColumns = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LayoutType[] f24845a = null;

    static {
        Row = new LayoutType("Row", 0);
        Column = new LayoutType("Column", 1);
        Box = new LayoutType("Box", 2);
        Text = new LayoutType("Text", 3);
        List = new LayoutType("List", 4);
        CheckBox = new LayoutType("CheckBox", 5);
        CheckBoxBackport = new LayoutType("CheckBoxBackport", 6);
        Button = new LayoutType("Button", 7);
        Frame = new LayoutType("Frame", 8);
        LinearProgressIndicator = new LayoutType("LinearProgressIndicator", 9);
        CircularProgressIndicator = new LayoutType("CircularProgressIndicator", 10);
        VerticalGridOneColumn = new LayoutType("VerticalGridOneColumn", 11);
        VerticalGridTwoColumns = new LayoutType("VerticalGridTwoColumns", 12);
        VerticalGridThreeColumns = new LayoutType("VerticalGridThreeColumns", 13);
        VerticalGridFourColumns = new LayoutType("VerticalGridFourColumns", 14);
        VerticalGridFiveColumns = new LayoutType("VerticalGridFiveColumns", 15);
        VerticalGridAutoFit = new LayoutType("VerticalGridAutoFit", 16);
        Swtch = new LayoutType("Swtch", 17);
        SwtchBackport = new LayoutType("SwtchBackport", 18);
        ImageCrop = new LayoutType("ImageCrop", 19);
        ImageFit = new LayoutType("ImageFit", 20);
        ImageFillBounds = new LayoutType("ImageFillBounds", 21);
        ImageCropDecorative = new LayoutType("ImageCropDecorative", 22);
        ImageFitDecorative = new LayoutType("ImageFitDecorative", 23);
        ImageFillBoundsDecorative = new LayoutType("ImageFillBoundsDecorative", 24);
        RadioButton = new LayoutType("RadioButton", 25);
        RadioButtonBackport = new LayoutType("RadioButtonBackport", 26);
        RadioRow = new LayoutType("RadioRow", 27);
        RadioColumn = new LayoutType("RadioColumn", 28);
        f24845a = a();
    }

    LayoutType(String r1, int r2) {
    }

    public static final /* synthetic */ LayoutType[] a() {
        return new LayoutType[]{Row, Column, Box, Text, List, CheckBox, CheckBoxBackport, Button, Frame, LinearProgressIndicator, CircularProgressIndicator, VerticalGridOneColumn, VerticalGridTwoColumns, VerticalGridThreeColumns, VerticalGridFourColumns, VerticalGridFiveColumns, VerticalGridAutoFit, Swtch, SwtchBackport, ImageCrop, ImageFit, ImageFillBounds, ImageCropDecorative, ImageFitDecorative, ImageFillBoundsDecorative, RadioButton, RadioButtonBackport, RadioRow, RadioColumn};
    }

    public static LayoutType valueOf(String r1) {
        return (LayoutType) Enum.valueOf(LayoutType.class, r1);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) f24845a.clone();
    }
}
