package net.ragnars.cyanleaf.handler;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.ragnars.cyanleaf.reference.Reference;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by new pc on 12/03/2017.
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
