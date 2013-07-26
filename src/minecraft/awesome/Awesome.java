package awesome;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Awesome", name="Awesome", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Awesome {

	@Instance("Awesome")
	public static Awesome instance;
	
	@SidedProxy(clientSide="awesome.client.ClientProxy", serverSide="awesome.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// Stub edit voor olaf zodat hij weer kan pullen
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		proxy.registerRenderers();
		EntityRegistry.registerModEntity(EntityBunny.class, "Bunny", 2, this, 80, 3, true);
		EntityRegistry.addSpawn(EntityBunny.class, 5, 2, 6, EnumCreatureType.creature, BiomeGenBase.plains);
        LanguageRegistry.instance().addStringLocalization("entity.instance.bunny.bunny", "Bunny");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		// Stub
	}
	public Awesome() {
		
	}

}
