package aurilux.gunpowderplot.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = GunpowderPlot.MOD_ID, name = "Gunpowder Plot", version = GunpowderPlot.MOD_VERSION)
public class GunpowderPlot {
    public static final String MOD_ID = "GunpowderPlot";
    public static final String MOD_VERSION = "1.0.0";
    public static final Logger logger = LogManager.getLogger(MOD_ID.toUpperCase());
    public static final SimpleNetworkWrapper network = new SimpleNetworkWrapper(MOD_ID);
    public static final CreativeTabs creativeTab = new CreativeTabs("xthuoth") {
        @Override
        public Item getTabIconItem() {
            return Items.gunpowder;
        }
    };
}