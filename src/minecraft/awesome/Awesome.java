package awesome;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		// Stub
	}
	public Awesome() {
		
	}

}
