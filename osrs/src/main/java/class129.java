import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class129 implements class119 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1728364522"
   )
   static int method762() {
      return ++Messages.Messages_count - 1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "23"
   )
   static void method763(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }
}
