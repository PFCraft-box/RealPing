package cn.box;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Load.MODID, version = Load.VERSION,clientSideOnly = true)
public class Load
{
    public static final String MODID = "RealPing";
    public static final String VERSION = "1.0";
    public static Time time = new Time();

    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        ClientCommandHandler.instance.registerCommand(new Command());
        MinecraftForge.EVENT_BUS.register(new ClientChatReceivedHandler());
    }

}
