package awesome.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraftforge.client.MinecraftForgeClient;
import awesome.CommonProxy;
import awesome.EntityBunny;
import awesome.ModelBunny;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderBunny(new ModelBunny(), 0.5F));
		EntityRegistry.registerGlobalEntityID(EntityBunny.class, "yourMob", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
	}

}
