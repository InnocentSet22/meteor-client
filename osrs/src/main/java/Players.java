import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Players")
public class Players {
   @ObfuscatedName("un")
   static int field1095;
   @ObfuscatedName("aw")
   @Export("activityFlags")
   static byte[] activityFlags = new byte[2048];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Liu;"
   )
   @Export("playerMovementSpeeds")
   static MoveSpeed[] playerMovementSpeeds = new MoveSpeed[2048];
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "[Lsg;"
   )
   @Export("cachedAppearanceBuffer")
   static Buffer[] cachedAppearanceBuffer = new Buffer[2048];
   @ObfuscatedName("ab")
   @Export("Players_count")
   static int Players_count = 0;
   @ObfuscatedName("aq")
   @Export("Players_indices")
   static int[] Players_indices = new int[2048];
   @ObfuscatedName("al")
   @Export("Players_emptyIdxCount")
   static int Players_emptyIdxCount = 0;
   @ObfuscatedName("at")
   @Export("Players_emptyIndices")
   static int[] Players_emptyIndices = new int[2048];
   @ObfuscatedName("aa")
   @Export("Players_regions")
   static int[] Players_regions = new int[2048];
   @ObfuscatedName("ay")
   @Export("Players_orientations")
   static int[] Players_orientations = new int[2048];
   @ObfuscatedName("ao")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices = new int[2048];
   @ObfuscatedName("ax")
   @Export("Players_pendingUpdateCount")
   static int Players_pendingUpdateCount = 0;
   @ObfuscatedName("ai")
   @Export("Players_pendingUpdateIndices")
   static int[] Players_pendingUpdateIndices = new int[2048];
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static Buffer field1094 = new Buffer(new byte[5000]);
   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "[Ltq;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;
   @ObfuscatedName("rx")
   @ObfuscatedSignature(
      descriptor = "Lqt;"
   )
   @Export("varclan")
   static class429 varclan;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1943998514"
   )
   @Export("loadWorlds")
   static boolean loadWorlds() {
      try {
         if (class11.World_request == null) {
            class11.World_request = class14.urlRequester.request(new URL(GrandExchangeOffer.field3530));
         } else if (class11.World_request.isDone()) {
            byte[] var0 = class11.World_request.getResponse();
            Buffer var1 = new Buffer(var0);
            var1.readInt();
            World.World_count = var1.readUnsignedShort();
            class31.World_worlds = new World[World.World_count];

            World var3;
            for(int var2 = 0; var2 < World.World_count; var3.index = var2++) {
               var3 = class31.World_worlds[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.properties = var1.readInt();
               var3.host = var1.readStringCp1252NullTerminated();
               var3.activity = var1.readStringCp1252NullTerminated();
               var3.location = var1.readUnsignedByte();
               var3.population = var1.readShort();
            }

            class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
            class11.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class11.World_request = null;
      }

      return false;
   }
}
