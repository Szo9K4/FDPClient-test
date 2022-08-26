package net.ccbluex.liquidbounce.features.module.modules.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.ccbluex.liquidbounce.utils.render.EaseUtils;
import net.ccbluex.liquidbounce.value.BoolValue;
import net.ccbluex.liquidbounce.value.FloatValue;
import net.ccbluex.liquidbounce.value.IntegerValue;
import net.ccbluex.liquidbounce.value.ListValue;
import net.ccbluex.liquidbounce.value.Value;
import org.jetbrains.annotations.NotNull;

@ModuleInfo(
   name = "Animations",
   category = ModuleCategory.CLIENT,
   canEnable = false
)
@Metadata(
   mv = {1, 6, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010$\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0011\u0010.\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u00100\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\nR\u0011\u00102\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\nR\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\nR\u001a\u0010<\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00107\"\u0004\b>\u00109R\u000e\u0010?\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001bR\u0011\u0010B\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001fR\u0011\u0010D\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u001fR\u0011\u0010F\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u001f¨\u0006H"},
   d2 = {"Lnet/ccbluex/liquidbounce/features/module/modules/client/Animations;", "Lnet/ccbluex/liquidbounce/features/module/Module;", "()V", "anythingBlockValue", "Lnet/ccbluex/liquidbounce/value/BoolValue;", "getAnythingBlockValue", "()Lnet/ccbluex/liquidbounce/value/BoolValue;", "blockingModeValue", "Lnet/ccbluex/liquidbounce/value/ListValue;", "getBlockingModeValue", "()Lnet/ccbluex/liquidbounce/value/ListValue;", "flagRenderTabOverlay", "", "getFlagRenderTabOverlay", "()Z", "setFlagRenderTabOverlay", "(Z)V", "invEaseModeValue", "getInvEaseModeValue", "invEaseOrderModeValue", "getInvEaseOrderModeValue", "invModeValue", "getInvModeValue", "invTimeValue", "Lnet/ccbluex/liquidbounce/value/Value;", "", "getInvTimeValue", "()Lnet/ccbluex/liquidbounce/value/Value;", "itemPosXValue", "Lnet/ccbluex/liquidbounce/value/FloatValue;", "getItemPosXValue", "()Lnet/ccbluex/liquidbounce/value/FloatValue;", "itemPosYValue", "getItemPosYValue", "itemPosZValue", "getItemPosZValue", "itemScaleValue", "getItemScaleValue", "lastTabSync", "", "getLastTabSync", "()J", "setLastTabSync", "(J)V", "swingAnimValue", "getSwingAnimValue", "swingSpeedValue", "getSwingSpeedValue", "tabEaseModeValue", "getTabEaseModeValue", "tabEaseOrderModeValue", "getTabEaseOrderModeValue", "tabHopePercent", "", "getTabHopePercent", "()F", "setTabHopePercent", "(F)V", "tabModeValue", "getTabModeValue", "tabPercent", "getTabPercent", "setTabPercent", "tabShowPlayerSkinValue", "tabTimeValue", "getTabTimeValue", "translateXValue", "getTranslateXValue", "translateYValue", "getTranslateYValue", "translateZValue", "getTranslateZValue", "Hreith"}
)
public final class Animations extends Module {
   @NotNull
   public static final Animations INSTANCE = new Animations();
   @NotNull
   private static final ListValue blockingModeValue;
   @NotNull
   private static final ListValue invModeValue;
   @NotNull
   private static final ListValue invEaseModeValue;
   @NotNull
   private static final ListValue invEaseOrderModeValue;
   @NotNull
   private static final Value<Integer> invTimeValue;
   @NotNull
   private static final BoolValue tabShowPlayerSkinValue;
   @NotNull
   private static final ListValue tabModeValue;
   @NotNull
   private static final ListValue tabEaseModeValue;
   @NotNull
   private static final ListValue tabEaseOrderModeValue;
   @NotNull
   private static final Value<Integer> tabTimeValue;
   @NotNull
   private static final FloatValue translateXValue;
   @NotNull
   private static final FloatValue translateYValue;
   @NotNull
   private static final FloatValue translateZValue;
   @NotNull
   private static final FloatValue itemPosXValue;
   @NotNull
   private static final FloatValue itemPosYValue;
   @NotNull
   private static final FloatValue itemPosZValue;
   @NotNull
   private static final FloatValue itemScaleValue;
   @NotNull
   private static final BoolValue swingAnimValue;
   @NotNull
   private static final FloatValue swingSpeedValue;
   @NotNull
   private static final BoolValue anythingBlockValue;
   private static boolean flagRenderTabOverlay;
   private static float tabPercent;
   private static float tabHopePercent;
   private static long lastTabSync;

   private Animations() {
   }

   @NotNull
   public final ListValue getBlockingModeValue() {
      return blockingModeValue;
   }

   @NotNull
   public final ListValue getInvModeValue() {
      return invModeValue;
   }

   @NotNull
   public final ListValue getInvEaseModeValue() {
      return invEaseModeValue;
   }

   @NotNull
   public final ListValue getInvEaseOrderModeValue() {
      return invEaseOrderModeValue;
   }

   @NotNull
   public final Value<Integer> getInvTimeValue() {
      return invTimeValue;
   }

   @NotNull
   public final ListValue getTabModeValue() {
      return tabModeValue;
   }

   @NotNull
   public final ListValue getTabEaseModeValue() {
      return tabEaseModeValue;
   }

   @NotNull
   public final ListValue getTabEaseOrderModeValue() {
      return tabEaseOrderModeValue;
   }

   @NotNull
   public final Value<Integer> getTabTimeValue() {
      return tabTimeValue;
   }

   @NotNull
   public final FloatValue getTranslateXValue() {
      return translateXValue;
   }

   @NotNull
   public final FloatValue getTranslateYValue() {
      return translateYValue;
   }

   @NotNull
   public final FloatValue getTranslateZValue() {
      return translateZValue;
   }

   @NotNull
   public final FloatValue getItemPosXValue() {
      return itemPosXValue;
   }

   @NotNull
   public final FloatValue getItemPosYValue() {
      return itemPosYValue;
   }

   @NotNull
   public final FloatValue getItemPosZValue() {
      return itemPosZValue;
   }

   @NotNull
   public final FloatValue getItemScaleValue() {
      return itemScaleValue;
   }

   @NotNull
   public final BoolValue getSwingAnimValue() {
      return swingAnimValue;
   }

   @NotNull
   public final FloatValue getSwingSpeedValue() {
      return swingSpeedValue;
   }

   @NotNull
   public final BoolValue getAnythingBlockValue() {
      return anythingBlockValue;
   }

   public final boolean getFlagRenderTabOverlay() {
      return flagRenderTabOverlay && (Boolean)tabShowPlayerSkinValue.get();
   }

   public final void setFlagRenderTabOverlay(boolean var1) {
      flagRenderTabOverlay = var1;
   }

   public final float getTabPercent() {
      return tabPercent;
   }

   public final void setTabPercent(float var1) {
      tabPercent = var1;
   }

   public final float getTabHopePercent() {
      return tabHopePercent;
   }

   public final void setTabHopePercent(float var1) {
      tabHopePercent = var1;
   }

   public final long getLastTabSync() {
      return lastTabSync;
   }

   public final void setLastTabSync(long var1) {
      lastTabSync = var1;
   }

   static {
      String[] var0 = new String[]{"1.7", "Throw", "Spin", "Forward", "Old", "Dortware", "Dortware 2", "Cockless", "Shove", "Chill", "Smooth", "Butter", "Stab", "Small", "Wobble", "Chungus", "Bitch Slap", "Leaked", "Rise", "Flush", "Whack", "Big Whack", "Spinny", "Inwards", "Rhys", "Akrien", "Avatar", "ETB", "Exhibition", "Push", "Reverse", "Shield", "SigmaNew", "SigmaOld", "Slide", "SlideDown", "HSlide", "Swong", "VisionFX", "Swank", "Jello", "Rotate", "Liquid", "None"};
      blockingModeValue = new ListValue("BlockingMode", var0, "SlideDown");
      var0 = new String[]{"None", "Slide", "Zoom"};
      invModeValue = new ListValue("InvMode", var0, "Slide");
      invEaseModeValue = EaseUtils.INSTANCE.getEnumEasingList("InvEase");
      invEaseOrderModeValue = EaseUtils.INSTANCE.getEnumEasingOrderList("InvEaseOrder");
      invTimeValue = (new IntegerValue("InvTime", 500, 0, 1000)).displayable((Function0)null.INSTANCE);
      tabShowPlayerSkinValue = new BoolValue("TabShowPlayerSkin", false);
      var0 = new String[]{"None", "UpSlide", "DownSlide", "Zoom"};
      tabModeValue = new ListValue("TabMode", var0, "Zoom");
      tabEaseModeValue = EaseUtils.INSTANCE.getEnumEasingList("TabEase");
      tabEaseOrderModeValue = EaseUtils.INSTANCE.getEnumEasingOrderList("TabEaseOrder");
      tabTimeValue = (new IntegerValue("TabTime", 500, 0, 1000)).displayable((Function0)null.INSTANCE);
      translateXValue = new FloatValue("TranslateX", 0.0F, 0.0F, 1.5F);
      translateYValue = new FloatValue("TranslateY", 0.0F, 0.0F, 0.5F);
      translateZValue = new FloatValue("TranslateZ", 0.0F, 0.0F, -2.0F);
      itemPosXValue = new FloatValue("ItemPosX", 0.56F, -1.0F, 1.0F);
      itemPosYValue = new FloatValue("ItemPosY", -0.52F, -1.0F, 1.0F);
      itemPosZValue = new FloatValue("ItemPosZ", -0.71999997F, -1.0F, 1.0F);
      itemScaleValue = new FloatValue("ItemScale", 0.4F, 0.0F, 2.0F);
      swingAnimValue = new BoolValue("SwingAnim", false);
      swingSpeedValue = new FloatValue("SwingSpeed", 1.0F, 0.5F, 5.0F);
      anythingBlockValue = new BoolValue("AnythingBlock", false);
   }
}
