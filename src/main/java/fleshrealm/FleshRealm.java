package fleshrealm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fleshrealm.common.registry.FRBlocks;
import fleshrealm.common.registry.FRItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FleshRealm.MOD_ID)
public class FleshRealm
{
	//This mod's id
	public static final String MOD_ID = "fleshrealm";
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public FleshRealm()
	{
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		FRBlocks.BLOCKS.register(modBus);
		FRItems.ITEMS.register(modBus);
	}
	
	/**
	 * Send a log message of type debug
	 * @param <D> Type of {@code message}
	 * @param domain Arbitrary string to differentiate where the call is from
	 * @param message The content to be printed
	 */
	public static <D> void debug(String domain, D message)
	{
		LOGGER.debug(String.format("[%s] %s", domain, (message == null ? "null" : message.toString()) ));
	}
	
	/**
	 * Send a log message of type info
	 * @param <I> Type of {@code message}
	 * @param domain Arbitrary string to differentiate where the call is from
	 * @param message The content to be printed
	 */
	public static <I> void info(String domain, I message)
	{
		LOGGER.info(String.format("[%s] %s", domain, (message == null ? "null" : message.toString()) ));
	}
	
	/**
	 * Send a log message of type warn
	 * @param <W> Type of {@code message}
	 * @param domain Arbitrary string to differentiate where the call is from
	 * @param message The content to be printed
	 */
	public static <W> void warn(String domain, W message)
	{
		LOGGER.warn(String.format("[%s] %s", domain, (message == null ? "null" : message.toString()) ));
	}
}
